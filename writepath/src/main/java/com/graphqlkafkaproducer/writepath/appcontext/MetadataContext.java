package com.graphqlkafkaproducer.writepath.appcontext;

import com.graphqlkafkaproducer.writepath.models2.Types;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Configuration
public class MetadataContext {

    @Bean(name="inputObjects")
    public Map<String,Class> inputObjects(){
        Map<String,Class> inputObjects = new HashMap<>();
        inputObjects.put("Person", Types.PersonCreateInput.class);
        inputObjects.put("Party",Types.PartyCreateInput.class);
        inputObjects.put("PartyName",Types.PartyNameCreateInput.class);
        inputObjects.put("ChildOrganization",Types.ChildOrganizationCreateInput.class);
        return inputObjects;
    }
/*
    @Bean(name="fkRelations")
    public Map<String, List<String>> fkRelatiions(){


        Map<String,List<String>> fkRelations = new HashMap<>();
        fkRelations.put("PersonCreateInput",Stream.of("Party").collect(Collectors.toList()));
       fkRelations.put("ChildOrganizationCreateInput", Stream.of("Party","PartyName").collect(Collectors.toList()));
        fkRelations.put("PartyNameCreateInput",Stream.of("Person","Party").collect(Collectors.toList()));
        fkRelations.put("PartyCreateInput",Stream.of("Empty").collect(Collectors.toList()));
        return fkRelations;
    }

    @Bean(name="manyRelations")
    public Map<String,List<String>> manyRelations()
    {

        Map<String,List<String>> manyRelations = new HashMap<>();

        manyRelations.put("PersonCreateInput",Stream.of("PartyName").collect(Collectors.toList()));
        manyRelations.put("PartyCreateInput",Stream.of("Person","PartyName","ChildOrganization").collect(Collectors.toList()));
        manyRelations.put("PartyNameCreateInput",Stream.of("ChildOrganization").collect(Collectors.toList()));
        manyRelations.put("ChildOrganizationCreateInput",Stream.of("Empty").collect(Collectors.toList()));

        return manyRelations;
    }*/

    @Bean(name="manyToOne")
    public Map<String, List<String>> manyToOne(){


        Map<String,List<String>> fkRelations = new HashMap<>();
        fkRelations.put("PersonCreateInput",Stream.of("Party").collect(Collectors.toList()));
        fkRelations.put("ChildOrganizationCreateInput", Stream.of("Party","PartyName").collect(Collectors.toList()));
        fkRelations.put("PartyNameCreateInput",Stream.of("Person","Party").collect(Collectors.toList()));
        fkRelations.put("PartyCreateInput",Stream.of("Empty").collect(Collectors.toList()));
        return fkRelations;
    }

    @Bean(name="agreementManyToOne")
    public Map<String, List<String>> agreementManyToOne(){


        Map<String,List<String>> fkRelations = new HashMap<>();
        fkRelations.put("CoverageCreateInput", Stream.of("InsuredObject","InsuranceAgreement").collect(Collectors.toList()));
        fkRelations.put("InsuredObjectCreateInput",Stream.of("InsuranceAgreement").collect(Collectors.toList()));
        fkRelations.put("InsuranceAgreementCreateInput",Stream.of("Empty").collect(Collectors.toList()));
        return fkRelations;
    }

    @Bean(name="oneToMany")
    public Map<String,List<String>> oneToMany()
    {

        Map<String,List<String>> manyRelations = new HashMap<>();

        manyRelations.put("PersonCreateInput",Stream.of("PartyName").collect(Collectors.toList()));
        manyRelations.put("PartyCreateInput",Stream.of("Person","PartyName","ChildOrganization").collect(Collectors.toList()));
        manyRelations.put("PartyNameCreateInput",Stream.of("ChildOrganization").collect(Collectors.toList()));
        manyRelations.put("ChildOrganizationCreateInput",Stream.of("Empty").collect(Collectors.toList()));

        return manyRelations;
    }

    @Bean(name="agreementOneToMany")
    public Map<String,List<String>> agreementOneToMany()
    {

        Map<String,List<String>> manyRelations = new HashMap<>();

        manyRelations.put("InsuranceAgreementCreateInput",Stream.of("Coverage","InsuranceAgreement").collect(Collectors.toList()));
        manyRelations.put("CoverageCreateInput",Stream.of("Empty").collect(Collectors.toList()));
        manyRelations.put("InsuredObjectCreateInput",Stream.of("Coverage").collect(Collectors.toList()));


        return manyRelations;
    }
}
