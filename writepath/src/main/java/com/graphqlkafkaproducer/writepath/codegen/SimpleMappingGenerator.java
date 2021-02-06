package com.graphqlkafkaproducer.writepath.codegen;

import com.google.common.io.CharSink;
import com.graphqlkafkaproducer.writepath.models2.Types;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.*;

public class SimpleMappingGenerator {
    private static final Logger logger = LoggerFactory.getLogger(SimpleMappingGenerator.class);

    public static void main(String[] args) throws IOException {


        List<Class> inputObjects = new ArrayList<>();
        inputObjects.add(Types.PersonCreateInput.class);
        inputObjects.add(Types.ChildOrganizationCreateInput.class);
        inputObjects.add(Types.PartyNameCreateInput.class);
        inputObjects.add(Types.PartyCreateInput.class);

        inputObjects.forEach(inputObject->{


        String utilName =  inputObject.getName();
        final  String utilClassNameConstant = "Util"+utilName.substring(utilName.indexOf("$")+1);
        String inputType = utilName.substring(utilName.indexOf("$")+1);
        String targetType = inputType.substring(0,inputType.indexOf("Create"));
        System.out.println(inputObject.getName());
        Field[] inputFields = inputObject.getDeclaredFields();



        StringBuilder inputMapping = new StringBuilder();
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



        }); //inputObjects ArrayList

    }


}
