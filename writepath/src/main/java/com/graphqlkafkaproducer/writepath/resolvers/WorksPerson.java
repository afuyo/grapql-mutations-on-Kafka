
package com.graphqlkafkaproducer.writepath.resolvers;


//import com.graphqlkafkaproducer.writepath.models.*;
//import com.graphqlkafkaproducer.writepath.models.util.DataFetchersDelegateMutation;
import com.graphqlkafkaproducer.writepath.mappings.*;
import com.graphqlkafkaproducer.writepath.models2.ChildOrganization;
import com.graphqlkafkaproducer.writepath.models2.Party;
import com.graphqlkafkaproducer.writepath.models2.PartyName;
import com.graphqlkafkaproducer.writepath.models2.Person;
import com.graphqlkafkaproducer.writepath.models2.Types.*;
import com.graphqlkafkaproducer.writepath.models2.Types.PartyNameCreateWithoutPersonInput;
import com.graphqlkafkaproducer.writepath.models2.Types.ChildOrganizationCreateWithoutPartyNameInput;
import com.graphqlkafkaproducer.writepath.models2.Types.PartyCreateInput;
import com.graphqlkafkaproducer.writepath.models2.Types.PersonCreateInput;
import com.graphqlkafkaproducer.writepath.models2.Types.PartyNameCreateInput;
import com.graphqlkafkaproducer.writepath.models2.Types.PartyCreateWithoutPartyNameInput;
import com.graphqlkafkaproducer.writepath.models2.Types.PersonCreateWithoutPartyNameInput;
import com.graphqlkafkaproducer.writepath.models2.Types2.HashMapWrapper;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

//runs on paryt Schema

//@Component
public class WorksPerson implements GraphQLMutationResolver
    //    , DataFetchersDelegateMutation

{
    private static final Logger logger = LoggerFactory.getLogger(GraphQLMutationResolver.class);

    private static final String CHILDORGANIZATIONTOPIC= "childOrganization";
    private static final String PARTYTOPIC= "party";
    private static final String PARTYNAMETOPIC = "partyName";
    private static final String PERSONTOPIC = "person";

    @Autowired
    private KafkaTemplate<String, com.graphqlkafkaproducer.writepath.models2.ChildOrganization> kafkaTemplateChildOrganization;

    @Autowired
    private KafkaTemplate<String, Person> kafkaTemplatePerson;

    @Autowired
    private KafkaTemplate<String, Party> kafkaTemplateParty;

    @Autowired
    private KafkaTemplate<String, PartyName> kafkaTemplatePartyName;

    @Resource(name="manyToOne")
    private Map<String,List<String>> manyToOne;

    @Resource(name="oneToMany")
    private Map<String,List<String>> oneToMany;

  /* Person createOnePerson(PersonCreateInput input ,DataFetchingEnvironment env )
    {
       Person mappedPerson = MapperPersonCreateInput.MAPPER.toTarget(input);
        Map<String,List<Object>> resultMap = new HashMap<>();

        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            manyRelations.get("PersonCreateInput").forEach(x->{
                List<Object> resultList= new ArrayList<>();
                Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                    Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                    switch(x)
                    {
                        case "PartyName":
                            hashMap.stream().forEach(h -> {
                                HashMapWrapper wrapper = new HashMapWrapper(h);
                                PartyNameCreateWithoutPersonInput  mappedPartyNameCreateWithoutPersonInput = MapperPartyNameCreateWithoutPersonInputUtil.MAPPER.toTarget(wrapper);
                                PartyName mappedPartyName = MapperPartyNameCreateWithoutPersonInput.MAPPER.toTarget(mappedPartyNameCreateWithoutPersonInput);
                                resultList.add(mappedPartyName);
                            });
                            resultMap.put(x,resultList);
                            break;
                        default:
                            break;
                    }
                }
            });
        });

//###################################################################

        Map<String,Object> mappedObjects = new HashMap<>();

        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            fkRelations.get("PersonCreateInput").forEach(x->{
                Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                    HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                    HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                    switch(x)
                    {
                        case "Party":
                            PartyCreateWithoutPersonInput mappedPartyCreateWithoutPersonInput=  MapperPartyCreateWithoutPersonInputUtil.MAPPER.toTarget(wrapper);
                            Party mappedParty = MapperPartyCreateWithoutPersonInput.MAPPER.toTarget(mappedPartyCreateWithoutPersonInput);
                            mappedObjects.put("Party",mappedParty);
                            break;
                        default:
                            break;
                    }
                }
            });
        });


        mappedPerson.setPartyName(resultMap.getOrDefault("PartyName",new ArrayList<>()).stream().map(e->(PartyName)e).collect(Collectors.toList()));
        mappedPerson.setParty((Party)mappedObjects.get("Party"));
        kafkaTemplatePerson.send(PERSONTOPIC,mappedPerson.getId(),mappedPerson);
        return mappedPerson;


    }



    ChildOrganization createOneChildOrganization(ChildOrganizationCreateInput input, DataFetchingEnvironment env)
    {

        ChildOrganization mappedChildOrganization = MapperChildOrganizationCreateInput.MAPPER.toTarget(input);

        //###################################################################

        Map<String,Object> mappedObjects = new HashMap<>();

        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            fkRelations.get("ChildOrganizationCreateInput").forEach(x->{
                Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                    HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                    HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                    switch(x)
                    {
                        case "Party":
                            PartyCreateWithoutChildOrganizationInput mappedPartyCreateWithoutChildOrganizationInput=  MapperPartyCreateWithoutChildOrganizationInputUtil.MAPPER.toTarget(wrapper);
                            Party mappedParty = MapperPartyCreateWithoutChildOrganizationInput.MAPPER.toTarget(mappedPartyCreateWithoutChildOrganizationInput);
                            mappedObjects.put("Party",mappedParty);
                            break;
                        case "PartyName":
                            PartyNameCreateWithoutChildOrganizationInput mappedPartyNameCreateWithoutChildOrganizationInput=  MapperPartyNameCreateWithoutChildOrganizationInputUtil.MAPPER.toTarget(wrapper);
                            PartyName mappedPartyName = MapperPartyNameCreateWithoutChildOrganizationInput.MAPPER.toTarget(mappedPartyNameCreateWithoutChildOrganizationInput);
                            mappedObjects.put("PartyName",mappedPartyName);
                            break;
                        default:
                            break;
                    }
                }
            });
        });



        Party mappedParty = (Party)mappedObjects.get("Party");
        mappedChildOrganization.setPartyName((PartyName) mappedObjects.get("PartyName"));
        mappedChildOrganization.setParty(mappedParty);
        kafkaTemplateChild.send(CHILDORGANIZATIONTOPIC,String.valueOf(mappedChildOrganization.getId()),mappedChildOrganization);

       return mappedChildOrganization;


    }
    Party createOneParty(PartyCreateInput input, DataFetchingEnvironment env )
    {
       Party mappedParty = MapperPartyCreateInput.MAPPER.toTarget(input);


        Map<String,List<Object>> resultMap = new HashMap<>();
        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());

            manyRelations.get("PartyCreateInput").forEach(x->{
                List<Object> resultList= new ArrayList<>();
                Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                    Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                    switch(x)
                    {
                        case "Person":
                            hashMap.stream().forEach(h -> {
                                HashMapWrapper wrapper = new HashMapWrapper(h);
                                PersonCreateWithoutPartyInput  mappedPersonCreateWithoutPartyInput = MapperPersonCreateWithoutPartyInputUtil.MAPPER.toTarget(wrapper);
                                Person mappedPerson = MapperPersonCreateWithoutPartyInput.MAPPER.toTarget(mappedPersonCreateWithoutPartyInput);
                                resultList.add(mappedPerson);
                            });
                            resultMap.put(x,resultList);
                            break;
                        case "PartyName":
                            hashMap.stream().forEach(h -> {
                                HashMapWrapper wrapper = new HashMapWrapper(h);
                              PartyNameCreateWithoutPartyInput  mappedPartyNameCreateWithoutPartyInput = MapperPartyNameCreateWithoutPartyInputUtil.MAPPER.toTarget(wrapper);
                                PartyName mappedPartyName = MapperPartyNameCreateWithoutPartyInput.MAPPER.toTarget(mappedPartyNameCreateWithoutPartyInput);
                                resultList.add(mappedPartyName);
                            });
                            resultMap.put(x,resultList);
                            break;
                        case "ChildOrganization":
                            hashMap.stream().forEach(h -> {
                               HashMapWrapper wrapper = new HashMapWrapper(h);
                                ChildOrganizationCreateWithoutPartyInput  mappedChildOrganizationCreateWithoutPartyInput = MapperChildOrganizationCreateWithoutPartyInputUtil.MAPPER.toTarget(wrapper);
                                ChildOrganization mappedChildOrganization = MapperChildOrganizationCreateWithoutPartyInput.MAPPER.toTarget(mappedChildOrganizationCreateWithoutPartyInput);
                                resultList.add(mappedChildOrganization);
                            });
                            resultMap.put(x,resultList);
                            break;
                        default:
                            break;
                    }
                }
            });
        });


       // kafkaTemplateParty.send(PARTYTOPIC,mappedParty.getId(),mappedParty);
        mappedParty.setPerson(resultMap.getOrDefault("Person",new ArrayList<>()).stream().map(e->(Person)e).collect(Collectors.toList()));
        mappedParty.setPartyName(resultMap.getOrDefault("PartyName",new ArrayList<>()).stream().map(e->(PartyName)e).collect(Collectors.toList()));
        mappedParty.setChildOrganization(resultMap.getOrDefault("ChildOrganization",new ArrayList<>()).stream().map(e->(ChildOrganization)e).collect(Collectors.toList()));
        kafkaTemplateParty.send(PARTYTOPIC,mappedParty.getId(),mappedParty);
        return mappedParty;


    }
    PartyName createOnePartyName(PartyNameCreateInput input, DataFetchingEnvironment env)
    {

       PartyName mappedPartyName = MapperPartyNameCreateInput.MAPPER.toTarget(input);
        Map<String,List<Object>> resultMap = new HashMap<>();


//######################MANY####################################################3
        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            manyRelations.get("PartyNameCreateInput").forEach(x->{
                List<Object> resultList= new ArrayList<>();
                Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                    Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                    switch(x)
                    {
                        case "ChildOrganization":
                            hashMap.stream().forEach(h -> {
                                HashMapWrapper wrapper = new HashMapWrapper(h);
                                ChildOrganizationCreateWithoutPartyNameInput  mappedChildOrganizationCreateWithoutPartyNameInput = MapperChildOrganizationCreateWithoutPartyNameInputUtil.MAPPER.toTarget(wrapper);
                                ChildOrganization mappedChildOrganization = MapperChildOrganizationCreateWithoutPartyNameInput.MAPPER.toTarget(mappedChildOrganizationCreateWithoutPartyNameInput);
                                resultList.add(mappedChildOrganization);
                            });
                            resultMap.put(x,resultList);
                            break;
                        default:
                            break;
                    }
                }
            });
        });

//########################One###########################################

        Map<String,Object> mappedObjects = new HashMap<>();

        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            fkRelations.get("PartyNameCreateInput").forEach(x->{
                Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                    HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                    HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                    switch(x)
                    {
                        case "Person":
                            PersonCreateWithoutPartyNameInput mappedPersonCreateWithoutPartyNameInput=  MapperPersonCreateWithoutPartyNameInputUtil.MAPPER.toTarget(wrapper);
                            Person mappedPerson = MapperPersonCreateWithoutPartyNameInput.MAPPER.toTarget(mappedPersonCreateWithoutPartyNameInput);
                            mappedObjects.put("Person",mappedPerson);
                            break;
                        case "Party":
                            PartyCreateWithoutPartyNameInput mappedPartyCreateWithoutPartyNameInput=  MapperPartyCreateWithoutPartyNameInputUtil.MAPPER.toTarget(wrapper);
                            Party mappedParty = MapperPartyCreateWithoutPartyNameInput.MAPPER.toTarget(mappedPartyCreateWithoutPartyNameInput);
                            mappedObjects.put("Party",mappedParty);
                            break;
                        default:
                            break;
                    }
                }
            });
        });
//###################################################################

        //kafkaTemplatePartyName.send(PARTYNAMETOPIC,mappedPartyName.getId(),mappedPartyName);
        mappedPartyName.setChildOrganization(resultMap.get("ChildOrganization").stream()
                .map(e->(ChildOrganization)e)
                //.forEach(e->kafkaTemplateChild.send(CHILDORGANIZATIONTOPIC,e.getId(),e))
                .collect(Collectors.toList()));
        mappedPartyName.setParty((Party)mappedObjects.get("Party"));
        mappedPartyName.setPerson((Person)mappedObjects.get("Person"));
        kafkaTemplatePartyName.send(PARTYNAMETOPIC,mappedPartyName.getId(),mappedPartyName);
        return mappedPartyName;


    }
*/
  /*  @Override
    public Person createOnePerson(DataFetchingEnvironment dataFetchingEnvironment, PersonCreateInput data) {
        return null;
    }

    @Override
    public ChildOrganization createOneChildOrganization(DataFetchingEnvironment dataFetchingEnvironment, ChildOrganizationCreateInput data) {
        return null;
    }

    @Override
    public Party createOneParty(DataFetchingEnvironment dataFetchingEnvironment, PartyCreateInput data) {
        return null;
    }

    @Override
    public PartyName createOnePartyName(DataFetchingEnvironment dataFetchingEnvironment, PartyNameCreateInput data) {
        return null;
    }*/
  /*Party createOneParty(PartyCreateInput input, DataFetchingEnvironment env) {
      Party mappedParty = MapperPartyCreateInput.MAPPER.toTarget(input);

      Map<String,List<Object>> resultMap = new HashMap<>();


      env.getArguments().entrySet().forEach(e->{
          Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
          manyRelations.get("PartyCreateInput").forEach(x->{
              List<Object> resultList= new ArrayList<>();
              Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
              if(!empty){
                  Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                  Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                  switch(x)
                  {
                      case "Person":
                          hashMap.stream().forEach(h -> {
                              HashMapWrapper wrapper = new HashMapWrapper(h);
                              PersonCreateWithoutPartyInput  mappedPersonCreateWithoutPartyInput = MapperPersonCreateWithoutPartyInputUtil.MAPPER.toTarget(wrapper);
                              Person mappedPerson = MapperPersonCreateWithoutPartyInput.MAPPER.toTarget(mappedPersonCreateWithoutPartyInput);
                              resultList.add(mappedPerson);
                          });
                          resultMap.put(x,resultList);
                          break;
                      case "PartyName":
                          hashMap.stream().forEach(h -> {
                              HashMapWrapper wrapper = new HashMapWrapper(h);
                              PartyNameCreateWithoutPartyInput  mappedPartyNameCreateWithoutPartyInput = MapperPartyNameCreateWithoutPartyInputUtil.MAPPER.toTarget(wrapper);
                              PartyName mappedPartyName = MapperPartyNameCreateWithoutPartyInput.MAPPER.toTarget(mappedPartyNameCreateWithoutPartyInput);
                              resultList.add(mappedPartyName);
                          });
                          resultMap.put(x,resultList);
                          break;
                      case "ChildOrganization":
                          hashMap.stream().forEach(h -> {
                              HashMapWrapper wrapper = new HashMapWrapper(h);
                              ChildOrganizationCreateWithoutPartyInput  mappedChildOrganizationCreateWithoutPartyInput = MapperChildOrganizationCreateWithoutPartyInputUtil.MAPPER.toTarget(wrapper);
                              ChildOrganization mappedChildOrganization = MapperChildOrganizationCreateWithoutPartyInput.MAPPER.toTarget(mappedChildOrganizationCreateWithoutPartyInput);
                              resultList.add(mappedChildOrganization);
                          });
                          resultMap.put(x,resultList);
                          break;
                      default:
                          break;
                  }
              }
          });
      });


      Map<String,Object> mappedObjects = new HashMap<>();

      env.getArguments().entrySet().forEach(e->{
          Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
          fkRelations.get("PartyCreateInput").forEach(x->{
              Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
              if(!empty){
                  Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                  HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                  HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                  switch(x)
                  {
                      default:
                          break;
                  }
              }
          });
      });

      mappedParty.setPerson(resultMap.getOrDefault("Person",new ArrayList<>()).stream().map(e->(Person)e).collect(Collectors.toList()));
      mappedParty.setPartyName(resultMap.getOrDefault("PartyName",new ArrayList<>()).stream().map(e->(PartyName)e).collect(Collectors.toList()));
      mappedParty.setChildOrganization(resultMap.getOrDefault("ChildOrganization",new ArrayList<>()).stream().map(e->(ChildOrganization)e).collect(Collectors.toList()));

      kafkaTemplateParty.send(PARTYTOPIC,mappedParty.getId(),mappedParty);return mappedParty;

  }

    PartyName createOnePartyName(PartyNameCreateInput input, DataFetchingEnvironment env) {
        PartyName mappedPartyName = MapperPartyNameCreateInput.MAPPER.toTarget(input);

        Map<String,List<Object>> resultMap = new HashMap<>();


        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            manyRelations.get("PartyNameCreateInput").forEach(x->{
                List<Object> resultList= new ArrayList<>();
                Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                    Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                    switch(x)
                    {
                        case "ChildOrganization":
                            hashMap.stream().forEach(h -> {
                                HashMapWrapper wrapper = new HashMapWrapper(h);
                                ChildOrganizationCreateWithoutPartyNameInput  mappedChildOrganizationCreateWithoutPartyNameInput = MapperChildOrganizationCreateWithoutPartyNameInputUtil.MAPPER.toTarget(wrapper);
                                ChildOrganization mappedChildOrganization = MapperChildOrganizationCreateWithoutPartyNameInput.MAPPER.toTarget(mappedChildOrganizationCreateWithoutPartyNameInput);
                                resultList.add(mappedChildOrganization);
                            });
                            resultMap.put(x,resultList);
                            break;
                        default:
                            break;
                    }
                }
            });
        });


        Map<String,Object> mappedObjects = new HashMap<>();

        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            fkRelations.get("PartyNameCreateInput").forEach(x->{
                Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                    HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                    HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                    switch(x)
                    {
                        case "Person":
                            PersonCreateWithoutPartyNameInput mappedPersonCreateWithoutPartyNameInput=  MapperPersonCreateWithoutPartyNameInputUtil.MAPPER.toTarget(wrapper);
                            Person mappedPerson = MapperPersonCreateWithoutPartyNameInput.MAPPER.toTarget(mappedPersonCreateWithoutPartyNameInput);
                            mappedObjects.put("Person",mappedPerson);
                            break;
                        case "Party":
                            PartyCreateWithoutPartyNameInput mappedPartyCreateWithoutPartyNameInput=  MapperPartyCreateWithoutPartyNameInputUtil.MAPPER.toTarget(wrapper);
                            Party mappedParty = MapperPartyCreateWithoutPartyNameInput.MAPPER.toTarget(mappedPartyCreateWithoutPartyNameInput);
                            mappedObjects.put("Party",mappedParty);
                            break;
                        default:
                            break;
                    }
                }
            });
        });

        mappedPartyName.setChildOrganization(resultMap.getOrDefault("ChildOrganization",new ArrayList<>()).stream().map(e->(ChildOrganization)e).collect(Collectors.toList()));
        mappedPartyName.setPerson((Person)mappedObjects.get("Person"));
        mappedPartyName.setParty((Party)mappedObjects.get("Party"));

        kafkaTemplatePartyName.send(PARTYNAMETOPIC,mappedPartyName.getId(),mappedPartyName);return mappedPartyName;

    }

    ChildOrganization createOneChildOrganization(ChildOrganizationCreateInput input, DataFetchingEnvironment env) {
        ChildOrganization mappedChildOrganization = MapperChildOrganizationCreateInput.MAPPER.toTarget(input);

        Map<String,List<Object>> resultMap = new HashMap<>();


        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            manyRelations.get("ChildOrganizationCreateInput").forEach(x->{
                List<Object> resultList= new ArrayList<>();
                Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                    Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                    switch(x)
                    {
                        default:
                            break;
                    }
                }
            });
        });


        Map<String,Object> mappedObjects = new HashMap<>();

        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            fkRelations.get("ChildOrganizationCreateInput").forEach(x->{
                Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                    HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                    HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                    switch(x)
                    {
                        case "Party":
                            PartyCreateWithoutChildOrganizationInput mappedPartyCreateWithoutChildOrganizationInput=  MapperPartyCreateWithoutChildOrganizationInputUtil.MAPPER.toTarget(wrapper);
                            Party mappedParty = MapperPartyCreateWithoutChildOrganizationInput.MAPPER.toTarget(mappedPartyCreateWithoutChildOrganizationInput);
                            mappedObjects.put("Party",mappedParty);
                            break;
                        case "PartyName":
                            PartyNameCreateWithoutChildOrganizationInput mappedPartyNameCreateWithoutChildOrganizationInput=  MapperPartyNameCreateWithoutChildOrganizationInputUtil.MAPPER.toTarget(wrapper);
                            PartyName mappedPartyName = MapperPartyNameCreateWithoutChildOrganizationInput.MAPPER.toTarget(mappedPartyNameCreateWithoutChildOrganizationInput);
                            mappedObjects.put("PartyName",mappedPartyName);
                            break;
                        default:
                            break;
                    }
                }
            });
        });

        mappedChildOrganization.setParty((Party)mappedObjects.get("Party"));
        mappedChildOrganization.setPartyName((PartyName)mappedObjects.get("PartyName"));

        kafkaTemplateChildOrganization.send(CHILDORGANIZATIONTOPIC,mappedChildOrganization.getId(),mappedChildOrganization);return mappedChildOrganization;

    }

    Person createOnePerson(PersonCreateInput input, DataFetchingEnvironment env) {
        Person mappedPerson = MapperPersonCreateInput.MAPPER.toTarget(input);

        Map<String,List<Object>> resultMap = new HashMap<>();


        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            manyRelations.get("PersonCreateInput").forEach(x->{
                List<Object> resultList= new ArrayList<>();
                Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                    Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                    switch(x)
                    {
                        case "PartyName":
                            hashMap.stream().forEach(h -> {
                                HashMapWrapper wrapper = new HashMapWrapper(h);
                                PartyNameCreateWithoutPersonInput  mappedPartyNameCreateWithoutPersonInput = MapperPartyNameCreateWithoutPersonInputUtil.MAPPER.toTarget(wrapper);
                                PartyName mappedPartyName = MapperPartyNameCreateWithoutPersonInput.MAPPER.toTarget(mappedPartyNameCreateWithoutPersonInput);
                                resultList.add(mappedPartyName);
                            });
                            resultMap.put(x,resultList);
                            break;
                        default:
                            break;
                    }
                }
            });
        });


        Map<String,Object> mappedObjects = new HashMap<>();

        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            fkRelations.get("PersonCreateInput").forEach(x->{
                Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                    HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                    HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                    switch(x)
                    {
                        case "Party":
                            PartyCreateWithoutPersonInput mappedPartyCreateWithoutPersonInput=  MapperPartyCreateWithoutPersonInputUtil.MAPPER.toTarget(wrapper);
                            Party mappedParty = MapperPartyCreateWithoutPersonInput.MAPPER.toTarget(mappedPartyCreateWithoutPersonInput);
                            mappedObjects.put("Party",mappedParty);
                            break;
                        default:
                            break;
                    }
                }
            });
        });

        mappedPerson.setPartyName(resultMap.getOrDefault("PartyName",new ArrayList<>()).stream().map(e->(PartyName)e).collect(Collectors.toList()));
        mappedPerson.setParty((Party)mappedObjects.get("Party"));

        kafkaTemplatePerson.send(PERSONTOPIC,mappedPerson.getId(),mappedPerson);return mappedPerson;

    }
*/
 /* Party createOneParty(PartyCreateInput input, DataFetchingEnvironment env) {
      Party mappedParty = MapperPartyCreateInput.MAPPER.toTarget(input);

      Map<String,List<Object>> resultMap = new HashMap<>();


      env.getArguments().entrySet().forEach(e->{
          Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
          oneToMany.get("PartyCreateInput").forEach(x->{
              List<Object> resultList= new ArrayList<>();
              Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
              if(!empty){
                  Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                  Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                  switch(x)
                  {
                      case "Person":
                          hashMap.stream().forEach(h -> {
                              HashMapWrapper wrapper = new HashMapWrapper(h);
                              PersonCreateWithoutPartyInput  mappedPersonCreateWithoutPartyInput = MapperPersonCreateWithoutPartyInputUtil.MAPPER.toTarget(wrapper);
                              Person mappedPerson = MapperPersonCreateWithoutPartyInput.MAPPER.toTarget(mappedPersonCreateWithoutPartyInput);
                              resultList.add(mappedPerson);
                          });
                          resultMap.put(x,resultList);
                          break;
                      case "PartyName":
                          hashMap.stream().forEach(h -> {
                              HashMapWrapper wrapper = new HashMapWrapper(h);
                              PartyNameCreateWithoutPartyInput  mappedPartyNameCreateWithoutPartyInput = MapperPartyNameCreateWithoutPartyInputUtil.MAPPER.toTarget(wrapper);
                              PartyName mappedPartyName = MapperPartyNameCreateWithoutPartyInput.MAPPER.toTarget(mappedPartyNameCreateWithoutPartyInput);
                              resultList.add(mappedPartyName);
                          });
                          resultMap.put(x,resultList);
                          break;
                      case "ChildOrganization":
                          hashMap.stream().forEach(h -> {
                              HashMapWrapper wrapper = new HashMapWrapper(h);
                              ChildOrganizationCreateWithoutPartyInput  mappedChildOrganizationCreateWithoutPartyInput = MapperChildOrganizationCreateWithoutPartyInputUtil.MAPPER.toTarget(wrapper);
                              ChildOrganization mappedChildOrganization = MapperChildOrganizationCreateWithoutPartyInput.MAPPER.toTarget(mappedChildOrganizationCreateWithoutPartyInput);
                              resultList.add(mappedChildOrganization);
                          });
                          resultMap.put(x,resultList);
                          break;
                      default:
                          break;
                  }
              }
          });
      });


      Map<String,Object> mappedObjects = new HashMap<>();

      env.getArguments().entrySet().forEach(e->{
          Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
          manyToOne.get("PartyCreateInput").forEach(x->{
              Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
              if(!empty){
                  Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                  HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                  HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                  switch(x)
                  {
                      default:
                          break;
                  }
              }
          });
      });

      mappedParty.setPerson(resultMap.getOrDefault("Person",new ArrayList<>()).stream().map(e->(Person)e).collect(Collectors.toList()));
      mappedParty.setPartyName(resultMap.getOrDefault("PartyName",new ArrayList<>()).stream().map(e->(PartyName)e).collect(Collectors.toList()));
      mappedParty.setChildOrganization(resultMap.getOrDefault("ChildOrganization",new ArrayList<>()).stream().map(e->(ChildOrganization)e).collect(Collectors.toList()));

      kafkaTemplateParty.send(PARTYTOPIC,mappedParty.getId(),mappedParty);return mappedParty;

  }

    PartyName createOnePartyName(PartyNameCreateInput input, DataFetchingEnvironment env) {
        PartyName mappedPartyName = MapperPartyNameCreateInput.MAPPER.toTarget(input);

        Map<String,List<Object>> resultMap = new HashMap<>();


        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            oneToMany.get("PartyNameCreateInput").forEach(x->{
                List<Object> resultList= new ArrayList<>();
                Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                    Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                    switch(x)
                    {
                        case "ChildOrganization":
                            hashMap.stream().forEach(h -> {
                                HashMapWrapper wrapper = new HashMapWrapper(h);
                                ChildOrganizationCreateWithoutPartyNameInput  mappedChildOrganizationCreateWithoutPartyNameInput = MapperChildOrganizationCreateWithoutPartyNameInputUtil.MAPPER.toTarget(wrapper);
                                ChildOrganization mappedChildOrganization = MapperChildOrganizationCreateWithoutPartyNameInput.MAPPER.toTarget(mappedChildOrganizationCreateWithoutPartyNameInput);
                                resultList.add(mappedChildOrganization);
                            });
                            resultMap.put(x,resultList);
                            break;
                        default:
                            break;
                    }
                }
            });
        });


        Map<String,Object> mappedObjects = new HashMap<>();

        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            manyToOne.get("PartyNameCreateInput").forEach(x->{
                Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                    HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                    HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                    switch(x)
                    {
                        case "Person":
                            PersonCreateWithoutPartyNameInput mappedPersonCreateWithoutPartyNameInput=  MapperPersonCreateWithoutPartyNameInputUtil.MAPPER.toTarget(wrapper);
                            Person mappedPerson = MapperPersonCreateWithoutPartyNameInput.MAPPER.toTarget(mappedPersonCreateWithoutPartyNameInput);
                            mappedObjects.put("Person",mappedPerson);
                            break;
                        case "Party":
                            PartyCreateWithoutPartyNameInput mappedPartyCreateWithoutPartyNameInput=  MapperPartyCreateWithoutPartyNameInputUtil.MAPPER.toTarget(wrapper);
                            Party mappedParty = MapperPartyCreateWithoutPartyNameInput.MAPPER.toTarget(mappedPartyCreateWithoutPartyNameInput);
                            mappedObjects.put("Party",mappedParty);
                            break;
                        default:
                            break;
                    }
                }
            });
        });

        mappedPartyName.setChildOrganization(resultMap.getOrDefault("ChildOrganization",new ArrayList<>()).stream().map(e->(ChildOrganization)e).collect(Collectors.toList()));
        mappedPartyName.setPerson((Person)mappedObjects.get("Person"));
        mappedPartyName.setParty((Party)mappedObjects.get("Party"));

        kafkaTemplatePartyName.send(PARTYNAMETOPIC,mappedPartyName.getId(),mappedPartyName);return mappedPartyName;

    }

    Person createOnePerson(PersonCreateInput input, DataFetchingEnvironment env) {
        Person mappedPerson = MapperPersonCreateInput.MAPPER.toTarget(input);

        Map<String,List<Object>> resultMap = new HashMap<>();


        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            oneToMany.get("PersonCreateInput").forEach(x->{
                List<Object> resultList= new ArrayList<>();
                Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                    Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                    switch(x)
                    {
                        case "PartyName":
                            hashMap.stream().forEach(h -> {
                                HashMapWrapper wrapper = new HashMapWrapper(h);
                                PartyNameCreateWithoutPersonInput  mappedPartyNameCreateWithoutPersonInput = MapperPartyNameCreateWithoutPersonInputUtil.MAPPER.toTarget(wrapper);
                                PartyName mappedPartyName = MapperPartyNameCreateWithoutPersonInput.MAPPER.toTarget(mappedPartyNameCreateWithoutPersonInput);
                                resultList.add(mappedPartyName);
                            });
                            resultMap.put(x,resultList);
                            break;
                        default:
                            break;
                    }
                }
            });
        });


        Map<String,Object> mappedObjects = new HashMap<>();

        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            manyToOne.get("PersonCreateInput").forEach(x->{
                Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                    HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                    HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                    switch(x)
                    {
                        case "Party":
                            PartyCreateWithoutPersonInput mappedPartyCreateWithoutPersonInput=  MapperPartyCreateWithoutPersonInputUtil.MAPPER.toTarget(wrapper);
                            Party mappedParty = MapperPartyCreateWithoutPersonInput.MAPPER.toTarget(mappedPartyCreateWithoutPersonInput);
                            mappedObjects.put("Party",mappedParty);
                            break;
                        default:
                            break;
                    }
                }
            });
        });

        mappedPerson.setPartyName(resultMap.getOrDefault("PartyName",new ArrayList<>()).stream().map(e->(PartyName)e).collect(Collectors.toList()));
        mappedPerson.setParty((Party)mappedObjects.get("Party"));

        kafkaTemplatePerson.send(PERSONTOPIC,mappedPerson.getId(),mappedPerson);return mappedPerson;

    }*/

    Party createOneParty(PartyCreateInput input, DataFetchingEnvironment env) {
      Party mappedParty = MapperPartyCreateInput.MAPPER.toTarget(input);

      Map<String,List<Object>> resultMap = new HashMap<>();


      env.getArguments().entrySet().forEach(e->{
          Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
          oneToMany.get("PartyCreateInput").forEach(x->{
              List<Object> resultList= new ArrayList<>();
              Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
              if(!empty){
                  Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                  Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                  switch(x)
                  {
                      case "Person":
                          hashMap.stream().forEach(h -> {
                              HashMapWrapper wrapper = new HashMapWrapper(h);
                              PersonCreateWithoutPartyInput  mappedPersonCreateWithoutPartyInput = MapperPersonCreateWithoutPartyInputUtil.MAPPER.toTarget(wrapper);
                              Person mappedPerson = MapperPersonCreateWithoutPartyInput.MAPPER.toTarget(mappedPersonCreateWithoutPartyInput);
                              resultList.add(mappedPerson);
                          });
                          resultMap.put(x,resultList);
                          break;
                      case "PartyName":
                          hashMap.stream().forEach(h -> {
                              HashMapWrapper wrapper = new HashMapWrapper(h);
                              PartyNameCreateWithoutPartyInput  mappedPartyNameCreateWithoutPartyInput = MapperPartyNameCreateWithoutPartyInputUtil.MAPPER.toTarget(wrapper);
                              PartyName mappedPartyName = MapperPartyNameCreateWithoutPartyInput.MAPPER.toTarget(mappedPartyNameCreateWithoutPartyInput);
                              resultList.add(mappedPartyName);
                          });
                          resultMap.put(x,resultList);
                          break;
                      case "ChildOrganization":
                          hashMap.stream().forEach(h -> {
                              HashMapWrapper wrapper = new HashMapWrapper(h);
                              ChildOrganizationCreateWithoutPartyInput  mappedChildOrganizationCreateWithoutPartyInput = MapperChildOrganizationCreateWithoutPartyInputUtil.MAPPER.toTarget(wrapper);
                              ChildOrganization mappedChildOrganization = MapperChildOrganizationCreateWithoutPartyInput.MAPPER.toTarget(mappedChildOrganizationCreateWithoutPartyInput);
                              resultList.add(mappedChildOrganization);
                          });
                          resultMap.put(x,resultList);
                          break;
                      default:
                          break;
                  }
              }
          });
      });


      Map<String,Object> mappedObjects = new HashMap<>();

      env.getArguments().entrySet().forEach(e->{
          Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
          manyToOne.get("PartyCreateInput").forEach(x->{
              Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
              if(!empty){
                  Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                  HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                  HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                  switch(x)
                  {
                      default:
                          break;
                  }
              }
          });
      });

      mappedParty.setPerson(resultMap.getOrDefault("Person",new ArrayList<>()).stream().map(e->(Person)e).collect(Collectors.toList()));
      mappedParty.setPartyName(resultMap.getOrDefault("PartyName",new ArrayList<>()).stream().map(e->(PartyName)e).collect(Collectors.toList()));
      mappedParty.setChildOrganization(resultMap.getOrDefault("ChildOrganization",new ArrayList<>()).stream().map(e->(ChildOrganization)e).collect(Collectors.toList()));

      kafkaTemplateParty.send(PARTYTOPIC,mappedParty.getId(),mappedParty);return mappedParty;

  }

    PartyName createOnePartyName(PartyNameCreateInput input, DataFetchingEnvironment env) {
        PartyName mappedPartyName = MapperPartyNameCreateInput.MAPPER.toTarget(input);

        Map<String,List<Object>> resultMap = new HashMap<>();


        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            oneToMany.get("PartyNameCreateInput").forEach(x->{
                List<Object> resultList= new ArrayList<>();
                Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                    Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                    switch(x)
                    {
                        case "ChildOrganization":
                            hashMap.stream().forEach(h -> {
                                HashMapWrapper wrapper = new HashMapWrapper(h);
                                ChildOrganizationCreateWithoutPartyNameInput  mappedChildOrganizationCreateWithoutPartyNameInput = MapperChildOrganizationCreateWithoutPartyNameInputUtil.MAPPER.toTarget(wrapper);
                                ChildOrganization mappedChildOrganization = MapperChildOrganizationCreateWithoutPartyNameInput.MAPPER.toTarget(mappedChildOrganizationCreateWithoutPartyNameInput);
                                resultList.add(mappedChildOrganization);
                            });
                            resultMap.put(x,resultList);
                            break;
                        default:
                            break;
                    }
                }
            });
        });


        Map<String,Object> mappedObjects = new HashMap<>();

        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            manyToOne.get("PartyNameCreateInput").forEach(x->{
                Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                    HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                    HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                    switch(x)
                    {
                        case "Person":
                            PersonCreateWithoutPartyNameInput mappedPersonCreateWithoutPartyNameInput=  MapperPersonCreateWithoutPartyNameInputUtil.MAPPER.toTarget(wrapper);
                            Person mappedPerson = MapperPersonCreateWithoutPartyNameInput.MAPPER.toTarget(mappedPersonCreateWithoutPartyNameInput);
                            mappedObjects.put("Person",mappedPerson);
                            break;
                        case "Party":
                            PartyCreateWithoutPartyNameInput mappedPartyCreateWithoutPartyNameInput=  MapperPartyCreateWithoutPartyNameInputUtil.MAPPER.toTarget(wrapper);
                            Party mappedParty = MapperPartyCreateWithoutPartyNameInput.MAPPER.toTarget(mappedPartyCreateWithoutPartyNameInput);
                            mappedObjects.put("Party",mappedParty);
                            break;
                        default:
                            break;
                    }
                }
            });
        });

        mappedPartyName.setChildOrganization(resultMap.getOrDefault("ChildOrganization",new ArrayList<>()).stream().map(e->(ChildOrganization)e).collect(Collectors.toList()));
        mappedPartyName.setPerson((Person)mappedObjects.get("Person"));
        mappedPartyName.setParty((Party)mappedObjects.get("Party"));

        kafkaTemplatePartyName.send(PARTYNAMETOPIC,mappedPartyName.getId(),mappedPartyName);return mappedPartyName;

    }

    ChildOrganization createOneChildOrganization(ChildOrganizationCreateInput input, DataFetchingEnvironment env) {
        ChildOrganization mappedChildOrganization = MapperChildOrganizationCreateInput.MAPPER.toTarget(input);

        Map<String,List<Object>> resultMap = new HashMap<>();


        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            oneToMany.get("ChildOrganizationCreateInput").forEach(x->{
                List<Object> resultList= new ArrayList<>();
                Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                    Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                    switch(x)
                    {
                        default:
                            break;
                    }
                }
            });
        });


        Map<String,Object> mappedObjects = new HashMap<>();

        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            manyToOne.get("ChildOrganizationCreateInput").forEach(x->{
                Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                    HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                    HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                    switch(x)
                    {
                        case "Party":
                            PartyCreateWithoutChildOrganizationInput mappedPartyCreateWithoutChildOrganizationInput=  MapperPartyCreateWithoutChildOrganizationInputUtil.MAPPER.toTarget(wrapper);
                            Party mappedParty = MapperPartyCreateWithoutChildOrganizationInput.MAPPER.toTarget(mappedPartyCreateWithoutChildOrganizationInput);
                            mappedObjects.put("Party",mappedParty);
                            break;
                        case "PartyName":
                            PartyNameCreateWithoutChildOrganizationInput mappedPartyNameCreateWithoutChildOrganizationInput=  MapperPartyNameCreateWithoutChildOrganizationInputUtil.MAPPER.toTarget(wrapper);
                            PartyName mappedPartyName = MapperPartyNameCreateWithoutChildOrganizationInput.MAPPER.toTarget(mappedPartyNameCreateWithoutChildOrganizationInput);
                            mappedObjects.put("PartyName",mappedPartyName);
                            break;
                        default:
                            break;
                    }
                }
            });
        });

        mappedChildOrganization.setParty((Party)mappedObjects.get("Party"));
        mappedChildOrganization.setPartyName((PartyName)mappedObjects.get("PartyName"));

        kafkaTemplateChildOrganization.send(CHILDORGANIZATIONTOPIC,mappedChildOrganization.getId(),mappedChildOrganization);return mappedChildOrganization;

    }

    Person createOnePerson(PersonCreateInput input, DataFetchingEnvironment env) {
        Person mappedPerson = MapperPersonCreateInput.MAPPER.toTarget(input);

        Map<String,List<Object>> resultMap = new HashMap<>();


        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            oneToMany.get("PersonCreateInput").forEach(x->{
                List<Object> resultList= new ArrayList<>();
                Boolean empty = optMap.get().getOrDefault(x,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createManyMap = (Map<String, Object>) optMap.get().get(x);
                    Collection<HashMap<String, Object>> hashMap = (Collection<HashMap<String, Object>>) createManyMap.get("create");
                    switch(x)
                    {
                        case "PartyName":
                            hashMap.stream().forEach(h -> {
                                HashMapWrapper wrapper = new HashMapWrapper(h);
                                PartyNameCreateWithoutPersonInput  mappedPartyNameCreateWithoutPersonInput = MapperPartyNameCreateWithoutPersonInputUtil.MAPPER.toTarget(wrapper);
                                PartyName mappedPartyName = MapperPartyNameCreateWithoutPersonInput.MAPPER.toTarget(mappedPartyNameCreateWithoutPersonInput);
                                resultList.add(mappedPartyName);
                            });
                            resultMap.put(x,resultList);
                            break;
                        default:
                            break;
                    }
                }
            });
        });


        Map<String,Object> mappedObjects = new HashMap<>();

        env.getArguments().entrySet().forEach(e->{
            Optional<Map<String,Object>> optMap = Optional.of((Map<String, Object>)e.getValue());
            manyToOne.get("PersonCreateInput").forEach(x->{
                Boolean empty = optMap.get().getOrDefault(x ,"Empty").equals("Empty");
                if(!empty){
                    Map<String, Object> createOneMap = (Map<String, Object>) optMap.get().get(x);
                    HashMap<String, Object> hashMap =  (HashMap<String, Object> )createOneMap.get("create");
                    HashMapWrapper wrapper = new HashMapWrapper(hashMap);
                    switch(x)
                    {
                        case "Party":
                            PartyCreateWithoutPersonInput mappedPartyCreateWithoutPersonInput=  MapperPartyCreateWithoutPersonInputUtil.MAPPER.toTarget(wrapper);
                            Party mappedParty = MapperPartyCreateWithoutPersonInput.MAPPER.toTarget(mappedPartyCreateWithoutPersonInput);
                            mappedObjects.put("Party",mappedParty);
                            break;
                        default:
                            break;
                    }
                }
            });
        });

        mappedPerson.setPartyName(resultMap.getOrDefault("PartyName",new ArrayList<>()).stream().map(e->(PartyName)e).collect(Collectors.toList()));
        mappedPerson.setParty((Party)mappedObjects.get("Party"));

        kafkaTemplatePerson.send(PERSONTOPIC,mappedPerson.getId(),mappedPerson);return mappedPerson;

    }

}


