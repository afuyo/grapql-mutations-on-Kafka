package com.graphqlkafkaproducer.writepath.codegen;

import com.google.common.io.CharSink;
import com.graphqlkafkaproducer.writepath.models2.Types;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SimpleMappingTestGenerator {
    private static final Logger logger = LoggerFactory.getLogger(SimpleMappingTestGenerator.class);

    public static void main(String[] args) throws IOException {

        /**
         * METADATA DATA DICTIONARY
         */
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

        Field[] inputFields = inputObject.getDeclaredFields();


        StringBuilder inputMappingTest = new StringBuilder();


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
                logger.error(e.toString());
            }

        });


        }); //inputObjects ArrayList

    }
}
