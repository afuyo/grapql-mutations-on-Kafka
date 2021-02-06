package com.graphqlkafkaproducer.writepath.codegen;

import com.graphqlkafkaproducer.writepath.models2.Types;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UtilCreateBodyGeneratorAllBckp {

    private static final Logger logger = LoggerFactory.getLogger(UtilCreateBodyGeneratorAllBckp.class);

    public static String getLowerCaseField(String fieldName)
    {
        return  Character.toLowerCase(fieldName.charAt(0))+fieldName.substring(1);
    }
  //  @Resource(name="inputObjects")
  //  private static Map<String,Class> inputObjects;

    public static void main(String[] args) throws IllegalAccessException{






        Map<String,Class> inputObjects = new HashMap<>();
        inputObjects.put("Person",Types.PersonCreateInput.class);
        inputObjects.put("Party",Types.PartyCreateInput.class);
        inputObjects.put("PartyName",Types.PartyNameCreateInput.class);
     //   inputObjects.put("ChildOrganization",Types.ChildOrganizationCreateInput.class);



/*        StringBuilder body = new StringBuilder();
        StringBuilder mappings = new StringBuilder();
        StringBuilder header = new StringBuilder();
        StringBuilder body2 = new StringBuilder();
        StringBuilder footer = new StringBuilder();*/


        inputObjects.forEach((k,v)->{
            ArrayList<String> manyMappings = new ArrayList<>();
            ArrayList<String> oneMappings = new ArrayList<>();
            StringBuilder body = new StringBuilder();
            StringBuilder mappings = new StringBuilder();
            StringBuilder header = new StringBuilder();
            StringBuilder body2 = new StringBuilder();
            StringBuilder footer = new StringBuilder();

             Class inputObject = v;
            String utilName =  inputObject.getName();
            String utilClassNameConstant = utilName.substring(utilName.indexOf("$")+1);

            Field[] inputFields = inputObject.getDeclaredFields();

        header.append(k+" createOne"+k+"("+utilClassNameConstant+" input, DataFetchingEnvironment env) {\n");
        header.append(k+" mapped"+k+" = Mapper"+utilClassNameConstant+".MAPPER.toTarget(input);\n");
        header.append("\n");
        header.append("     Map<String,List<Object>> resultMap = new HashMap<>();\n");
        header.append("\n");
        footer.append("kafkaTemplate"+k+".send("+k.toUpperCase()+"TOPIC,mapped"+k+".getId(),mapped"+k+");");
        footer.append("return mapped"+k+";\n");
        footer.append("\n");
        footer.append("}\n");
        body.append("env.getArguments().entrySet().forEach(e->{\n");
        body.append("    Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());\n");
        body.append( "   manyRelations.get(\""+utilClassNameConstant+"\").forEach(x->{\n");
        body.append("            List<Object> resultList= new ArrayList<>();\n");
        body.append("    Boolean empty = optMap.get().getOrDefault(x,\"Empty\").equals(\"Empty\");\n");
        body.append("    if(!empty){\n");
        body.append("        Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);\n");
        body.append("        Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get(\"create\");\n");
        body.append("           switch(x)\n");
        body.append("           {\n");


     //   body2.append("//###################################################################\n");
        body2.append("\n");
        body2.append("  Map<String,Object> mappedObjects = new HashMap<>();\n");
        body2.append("\n");
        body2.append("env.getArguments().entrySet().forEach(e->{\n");
        body2.append("    Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());\n");
        body2.append( "   fkRelations.get(\""+utilClassNameConstant+"\").forEach(x->{\n");
        body2.append("    Boolean empty = optMap.get().getOrDefault(x ,\"Empty\").equals(\"Empty\");\n");
        body2.append("    if(!empty){\n");
        body2.append("              Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);\n");
        body2.append("              HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get(\"create\");\n");
        body2.append("              HashMapWrapper wrapper = new HashMapWrapper(hashMap);\n");
        body2.append("                  switch(x)\n");
        body2.append("                      {\n");


        Arrays.stream(inputFields).sequential().forEach(e->
        {

            if(!e.getType().getName().contains("java.lang"))
            {

                Class cl = e.getType();
                Field[] innerFields = cl.getDeclaredFields();
                String toTargetName = e.getName();

               Arrays.stream( cl.getDeclaredFields() ).sequential().forEach(x->{

                   if(x.getType().getName().contains("Iterable"))
                   {
                       String listName = getLowerCaseField(e.getName()) + "List";



                       //TODO createWithouName is present in signature variable of x. how to acces it?
                       String createWithoutName =  e.getType().getName().substring(utilName.indexOf("$")+1)
                               .replace("Many","");

                       switch(x.getName())
                       {
                           case "create":

                               manyMappings.add("mapped"+k+".set"+toTargetName+"(resultMap.getOrDefault(\""+toTargetName+"\",new ArrayList<>()).stream().map(e->("+toTargetName+")e).collect(Collectors.toList()));\n");
                               body.append("      case \""+toTargetName+"\":\n");

                               body.append("                hashMap.stream().forEach(h -> {\n");
                               body.append("                    HashMapWrapper wrapper = new HashMapWrapper(h);\n");
                               body.append("                    "+createWithoutName+"  mapped"+createWithoutName+" = Mapper"+createWithoutName+"Util.MAPPER.toTarget(wrapper);\n");
                               body.append("                    "+toTargetName+" mapped"+toTargetName+" = Mapper"+createWithoutName+".MAPPER.toTarget(mapped"+createWithoutName+");\n");
                               body.append("                    resultList.add(mapped"+toTargetName+");\n" );
                               body.append("                       });\n");
                               body.append("                    resultMap.put(x,resultList);\n");
                               body.append("                    break;\n");

                               break;
                           case "connect":

                               break;
                           default:

                       }
                   }

       else {
                       String listName = getLowerCaseField(e.getName()) + "List";

                       //TODO createWithouName is present in signature variable of x. how to acces it?
                       String createWithoutName =  e.getType().getName().substring(utilName.indexOf("$")+1)
                               .replace("One","");

                       switch(x.getName())
                       {
                           case "create":
                               oneMappings.add("mapped"+k+".set"+toTargetName+"(("+toTargetName+")mappedObjects.get(\""+toTargetName+"\"));\n");
                            body2.append("      case \""+toTargetName+"\":\n");
                            body2.append("      "+createWithoutName+" mapped"+createWithoutName+"=  Mapper"+createWithoutName+"Util.MAPPER.toTarget(wrapper);\n");
                            body2.append("         "+toTargetName+" mapped"+toTargetName+" = Mapper"+createWithoutName+".MAPPER.toTarget(mapped"+createWithoutName+");\n");
                            body2.append("      mappedObjects.put(\""+toTargetName+"\",mapped"+toTargetName+");\n");
                            body2.append("      break; \n");
                               break;
                           case "connect":
                               break;
                           default:

                       }

        }

               });

            }

        });
      /*  mappedPerson.setPartyName(resultMap.getOrDefault("PartyName",new ArrayList<>()).stream().map(e->(PartyName)e).collect(Collectors.toList()));
        mappedPerson.setParty((Party)mappedObjects.get("Party"));*/

        body.append("       default: \n");
        body.append("           break;\n");
        body.append("           }\n");
        body.append("                }\n");
        body.append("        });\n");
        body.append("        });\n");


       body2.append("default: \n");
       body2.append("break;\n");

       body2.append("}\n");
       body2.append("           }\n");
       body2.append("       });\n");

        body2.append("  });\n");

      //  body2.append("//###################################################################\n");
            manyMappings.forEach(mappings::append);
            oneMappings.forEach(mappings::append);
            System.out.println(header);
            System.out.println(body);
            System.out.println(body2);
            System.out.println(mappings);
            System.out.println(footer);
        });
     /*   manyMappings.forEach(mappings::append);
        oneMappings.forEach(mappings::append);
        System.out.println(header);
        System.out.println(body);
        System.out.println(body2);
        System.out.println(mappings);
        System.out.println(footer);
*/


    }
}
