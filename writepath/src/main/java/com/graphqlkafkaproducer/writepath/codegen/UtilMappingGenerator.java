package com.graphqlkafkaproducer.writepath.codegen;

import com.google.common.io.CharSink;
import com.graphqlkafkaproducer.writepath.models2.Types;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.*;

public class UtilMappingGenerator {
    private static final Logger logger = LoggerFactory.getLogger(UtilMappingGenerator.class);
    public static void main(String[] args) throws IOException {




        List<Class> inputObjects = new ArrayList<>();
        inputObjects.add(Types.ChildOrganizationCreateWithoutPartyNameInput.class);
        inputObjects.add(Types.ChildOrganizationCreateWithoutPartyInput.class);
        inputObjects.add(Types.PartyNameCreateWithoutPersonInput.class);
        inputObjects.add(Types.PartyNameCreateWithoutChildOrganizationInput.class);
        inputObjects.add(Types.PartyNameCreateWithoutPartyInput.class);
        inputObjects.add(Types.PersonCreateWithoutPartyNameInput.class);
        inputObjects.add(Types.PersonCreateWithoutPartyInput.class);
        inputObjects.add(Types.PartyCreateWithoutChildOrganizationInput.class);
        inputObjects.add(Types.PartyCreateWithoutPartyNameInput.class);
        inputObjects.add(Types.PartyCreateWithoutPersonInput.class);



        inputObjects.forEach(inputObject->{






        String utilName =  inputObject.getName();

        final  String utilClassNameConstant = "Util"+utilName.substring(utilName.indexOf("$")+1);
        String inputType = utilName.substring(utilName.indexOf("$")+1);
        String targetType = inputType.substring(0,inputType.indexOf("Create"));
        System.out.println(inputObject.getName());
        Field[] inputFields = inputObject.getDeclaredFields();

        StringBuilder util = new StringBuilder();
        StringBuilder mappings = new StringBuilder();
        StringBuilder inputMapping = new StringBuilder();

        util.append("package com.graphqlkafkaproducer.writepath.mappings;\n");
        util.append("\n");
        util.append("\n");
       util.append("import org.mapstruct.Qualifier;\n");
       util.append("import java.lang.annotation.ElementType;\n");
       util.append("import java.lang.annotation.Retention;\n");
       util.append("import java.lang.annotation.RetentionPolicy;\n");
       util.append("import java.lang.annotation.Target;\n");
       util.append("import java.util.Map;\n");
       util.append("public class "+ utilClassNameConstant+" {\n");

        Arrays.stream(inputFields).sequential().forEach(e->
        {
           util.append("@Qualifier\n");
           util.append("@Target(ElementType.METHOD)\n");
           util.append("@Retention(RetentionPolicy.SOURCE)\n");
           util.append("public @interface "+ StringUtils.capitalize(e.getName())+" {\n");
           util.append("}\n");


        });


        util.append("\n"); //method not found solution?
        Arrays.stream(inputFields).sequential().forEach(e->
        {
            String dataType= e.getType().getName();
            String fieldName = e.getName();
            String lowerCaseFieldName = Character.toLowerCase(e.getName().charAt(0))+e.getName().substring(1);
            String capitalizedFieldName = StringUtils.capitalize(fieldName);
            if(dataType.contains("java.lang."))
            {
            dataType= dataType.substring(dataType.lastIndexOf(".")+1);
            util.append("@"+capitalizedFieldName+"\n");
            }
            else
            {
                //not java object. It is an Acord Class
                dataType= e.getName();
                //need to add utilClassNameConstant to at least Acord type.
                // else compiler complains and can't find the method.
                util.append("@"+utilClassNameConstant+"."+capitalizedFieldName+"\n");
            }

           ;


            util.append("public "+dataType+" "+ lowerCaseFieldName+"(Map<String, Object> in) {\n");
            util.append("return ("+dataType+")in.get(\""+fieldName+"\");\n");
            util.append("}\n");

        });
       util.append("}\n");

        mappings.append("package com.graphqlkafkaproducer.writepath.mappings;\n");
        mappings.append("\n");
        mappings.append("\n");
        mappings.append("import com.graphqlkafkaproducer.writepath.models2.Types."+inputType+";\n");
        mappings.append("import com.graphqlkafkaproducer.writepath.models2.Types2.HashMapWrapper;\n");
        mappings.append("import org.mapstruct.Mapper;\n");
        mappings.append("import org.mapstruct.Mapping;\n");
        mappings.append("import org.mapstruct.Mappings;\n");
        mappings.append("import org.mapstruct.factory.Mappers;\n");
        mappings.append("@Mapper(uses= "+utilClassNameConstant+".class)\n");
        mappings.append("public interface Mapper"+inputType+"Util {\n");
        mappings.append("\n");
        mappings.append("Mapper"+inputType+"Util MAPPER = Mappers.getMapper(Mapper"+inputType+"Util.class);\n" );
        mappings.append("@Mappings( {\n");
        Arrays.stream(inputFields).sequential().forEach(e->
        {
            String lowerCaseFieldName = Character.toLowerCase(e.getName().charAt(0))+e.getName().substring(1);
            if(e.getType().getName().contains("java.lang")) {
                mappings.append("@Mapping(source = \"meta\", target = \"" + lowerCaseFieldName + "\", qualifiedBy = " + utilClassNameConstant + "." + StringUtils.capitalize(e.getName()) + ".class ),\n");
            } else
                mappings.append("@Mapping(target=\" "+lowerCaseFieldName+"\" , ignore= true ),\n");


        });
        mappings.append("})\n");
        mappings.append(inputType+" toTarget(HashMapWrapper source);\n");
        mappings.append("}");


        inputMapping.append("package com.graphqlkafkaproducer.writepath.mappings;\n");
        inputMapping.append("\n");
        inputMapping.append("\n");
        inputMapping.append("import com.graphqlkafkaproducer.writepath.models2.Types."+inputType+";\n");
        inputMapping.append("import com.graphqlkafkaproducer.writepath.models2."+targetType+";\n");
        inputMapping.append("import org.mapstruct.Mapper;\n");
        inputMapping.append("import org.mapstruct.Mapping;\n");
        inputMapping.append("import org.mapstruct.Mappings;\n");
        inputMapping.append("import org.mapstruct.factory.Mappers;\n");
        inputMapping.append("@Mapper\n");
        inputMapping.append("public interface Mapper"+inputType+" {\n");
        inputMapping.append("Mapper"+inputType+" MAPPER = Mappers.getMapper(Mapper"+inputType+".class);\n" );
        inputMapping.append("@Mappings( {\n");
        Arrays.stream(inputFields).sequential().forEach(e->{
            String dataType= e.getType().getName();
            String fieldName = e.getName();
            String lowerCaseFieldName = Character.toLowerCase(e.getName().charAt(0))+e.getName().substring(1);
            String capitalizedFieldName = StringUtils.capitalize(fieldName);
           if(!dataType.contains("java.lang"))
           {
               inputMapping.append("@Mapping(target=\" "+lowerCaseFieldName+"\" , ignore= true ),\n");
           }
        });
        inputMapping.append("})\n");
        inputMapping.append(targetType+" toTarget("+inputType+" source);\n");
        inputMapping.append("}") ;


        Map<String,StringBuilder> files = new HashMap<>();

        files.put("src/main/java/com/graphqlkafkaproducer/writepath/mappings/"+utilClassNameConstant+".java",util);
        files.put("src/main/java/com/graphqlkafkaproducer/writepath/mappings/"+"Mapper"+inputType+"Util.java",mappings);
        files.put("src/main/java/com/graphqlkafkaproducer/writepath/mappings/Mapper"+inputType+".java",inputMapping);

        files.forEach((k,v)->{
            try {
                Reader initialReader = new StringReader(v.toString());
                File targetFile = new File(k);
                com.google.common.io.Files.touch(targetFile);
                CharSink charSink = com.google.common.io.Files
                        .asCharSink(targetFile, Charset.defaultCharset());
                charSink.writeFrom(initialReader);
                initialReader.close();
            } catch (IOException e)
            {
               logger.error(e.toString());
            }

        });


        });

    }


}
