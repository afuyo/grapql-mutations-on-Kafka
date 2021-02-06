package com.graphqlkafkaproducer.writepath.codegen;

import com.google.common.io.CharSink;
import com.graphqlkafkaproducer.writepath.models2.Types;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.*;

public class UtilTestGenerator {
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

        Field[] inputFields = inputObject.getDeclaredFields();


        StringBuilder utilMappingTest = new StringBuilder();
        StringBuilder inputMappingTest = new StringBuilder();



        utilMappingTest.append("package com.graphqlkafkaproducer.writepath;\n");
        utilMappingTest.append("\n");
        utilMappingTest.append("import com.graphqlkafkaproducer.writepath.mappings.*;\n");
        utilMappingTest.append("import com.graphqlkafkaproducer.writepath.models2."+targetType+";\n");
        utilMappingTest.append("import com.graphqlkafkaproducer.writepath.models2.Types2.*;\n");
        utilMappingTest.append("import com.graphqlkafkaproducer.writepath.models2.Types.*;\n");
        utilMappingTest.append("import org.junit.Test;\n");
        utilMappingTest.append("import org.slf4j.Logger;\n");
        utilMappingTest.append("import org.slf4j.LoggerFactory;\n");
        utilMappingTest.append("import java.util.HashMap;\n");
        utilMappingTest.append("import java.util.Map;\n");
        utilMappingTest.append("import static org.junit.Assert.assertEquals;\n");
        utilMappingTest.append("public class "+inputType+"UtilTest {\n");
        utilMappingTest.append("\n");
        utilMappingTest.append("@Test\n");
        utilMappingTest.append("public void toTargetTest()\n");
        utilMappingTest.append("{\n");
        utilMappingTest.append("Map<String,Object> hashMap = new HashMap<>();\n");
        utilMappingTest.append("hashMap.put(\"id\",\"123\");\n");
        utilMappingTest.append(" hashMap.put(\"txMetaAccessFilter\", 5);\n");
        utilMappingTest.append(" hashMap.put(\"txMetaChange\",\"metaChange\");\n");
        utilMappingTest.append("HashMapWrapper hashMapWrapper = new HashMapWrapper();\n");
        utilMappingTest.append(" hashMapWrapper.setMeta(hashMap);\n");
        utilMappingTest.append(inputType+" mapped = Mapper"+inputType+"Util.MAPPER.toTarget(hashMapWrapper);\n");
        utilMappingTest.append("assertEquals(\"123\",mapped.getId());\n");
        utilMappingTest.append("assertEquals(java.util.Optional.of(5), java.util.Optional.ofNullable(mapped.getTxMetaAccessFilter()));\n");
        utilMappingTest.append("assertEquals(\"metaChange\",mapped.getTxMetaChange());\n");
        utilMappingTest.append("                   }\n");
        utilMappingTest.append("        }\n");




        inputMappingTest.append("package com.graphqlkafkaproducer.writepath;\n");
        inputMappingTest.append("\n");
        inputMappingTest.append("import com.graphqlkafkaproducer.writepath.mappings.*;\n");
        inputMappingTest.append("import com.graphqlkafkaproducer.writepath.models2."+targetType+";\n");
        inputMappingTest.append("import com.graphqlkafkaproducer.writepath.models2.Types2.*;\n");
        inputMappingTest.append("import com.graphqlkafkaproducer.writepath.models2.Types.*;\n");
        inputMappingTest.append("import org.junit.Test;\n");
        inputMappingTest.append("import org.slf4j.Logger;\n");
        inputMappingTest.append("import org.slf4j.LoggerFactory;\n");
        inputMappingTest.append("import java.util.HashMap;\n");
        inputMappingTest.append("import java.util.Map;\n");
        inputMappingTest.append("import static org.junit.Assert.assertEquals;\n");
        inputMappingTest.append("public class "+inputType+"Test {\n");
        inputMappingTest.append("\n");
        inputMappingTest.append("@Test\n");
        inputMappingTest.append("public void toTargetTest()\n");
        inputMappingTest.append("{\n");
        inputMappingTest.append(inputType+" input = new "+inputType+"();\n");
        inputMappingTest.append("input.setId(\"123\");\n");
        inputMappingTest.append(targetType+" mapped = Mapper"+inputType+".MAPPER.toTarget(input);\n");
        inputMappingTest.append("assertEquals(\"123\",mapped.getId());\n");
        inputMappingTest.append("       }\n");
        inputMappingTest.append("   }\n");



        Map<String,StringBuilder> files = new HashMap<>();

        files.put("src/test/java/com/graphqlkafkaproducer/writepath/"+inputType+"UtilTest.java",utilMappingTest);
        files.put("src/test/java/com/graphqlkafkaproducer/writepath/"+inputType+"Test.java",inputMappingTest);


        files.forEach((k,v)->{
            try {
                Reader initialReader = new StringReader(v.toString());
                File targetFile = new File(k);
                System.out.println(k);
                com.google.common.io.Files.touch(targetFile);
                CharSink charSink = com.google.common.io.Files
                        .asCharSink(targetFile, Charset.defaultCharset());
                charSink.writeFrom(initialReader);
                initialReader.close();
            } catch (IOException e)
            {
                System.out.println(e.toString());
            }

        });


        }); //inputObjects ArrayList

    }
}
