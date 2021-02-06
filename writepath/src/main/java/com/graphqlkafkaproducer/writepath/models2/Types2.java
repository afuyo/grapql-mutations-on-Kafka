package com.graphqlkafkaproducer.writepath.models2;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

public class Types2 {

   // @Getter
   // @Setter
/*
    public static class Person {
        String id;
        String birthDateTime;
        String bloodTypeCode;
        Boolean deathIndicator;
        String ethnicityCode;
        String genderCode;
        String maritalStatusCode;
        String missingDateTime;
        Boolean missingIndicator;
        String partyKey;
        String primaryLanguageLanguageKey;
        String txGlobalGenderCode;
        String txPrimaryKey;
        String txMetaSourceKey;
        String txMetaStartEventTime;
        String txMetaLoadTime;
        String txMetaSource;
        String txMetaCorrection;
        String  txMetaChange;
        Integer txMetaAccessFilter;

        public Person(){}
    }
*/

/*   public  static class Person {
        String id;
         String       birthDateTime;
        String bloodTypeCode;
        Boolean deathIndicator;
       String  ethnicityCode;
        String genderCode;
       String maritalStatusCode;
        String missingDateTime;
       Boolean missingIndicator;
       String   partyKey;
       String primaryLanguageLanguageKey;
        String txGlobalGenderCode;
        String txPrimaryKey;
        String txMetaSourceKey;
        String txMetaStartEventTime;
        String txMetaLoadTime;
        String txMetaSource;
        String txMetaCorrection;
        String txMetaChange;
        Integer txMetaAccessFilter;
        Party Party;
        String PartyId;
        List<PartyName> PartyName;

       // PartyId: String
        public Person(){

        }
    }
    @Getter
    @Setter
   public static class Party {
        String id;
         String basicDataCompleteCode;
        String creationDateTime;
        String informationModelObjectKind;
        String partyKey;
        String partyKind;
        String typeName;
        String txGlobalTypeName;
        String txTypeCode;
        String txPrimaryKey;
        String txMetaSourceKey;
        String txMetaStartEventTime;
        String txMetaLoadTime;
        String txMetaSource;
        String txMetaCorrection;
        String txMetaChange;
        Integer txMetaAccessFilter;
       List <Person> Person;
       List<PartyName> PartyName;
       List<ChildOrganization> ChildOrganization;

       public Party(){}
    }
    @Getter
     @Setter
    public static class ChildOrganization {
        String id;
        String      basicDataCompleteCode;
        String basingPartyRoleInRelationshipSpecificationSpecificationKey;
        String creationDateTime;
       String description;
       String informationModelObjectKind;
       String namePartyNameKey;
       String partyRoleInRelationshipKind;
        String partyRoleKind;
        String playerRoleRoleKey;
        String playingPartyPartyKey;
        String roleKey;
        String roleKind;
        String rolePlayerPeriodStart;
        String rolePlayerPeriodEnd;
        String typeName;
        String txGlobalTypeName;
        String txTypeCode;
        String txPrimaryKey;
        String txMetaSourceKey;
        String txMetaStartEventTime;
        String txMetaLoadTime;
        String txMetaSource;
        String txMetaCorrection;
        String txMetaChange;
        Integer txMetaAccessFilter;
        Party Party;
        String PartyId;
        PartyName PartyName;
       String  PartyNameId;
        public ChildOrganization(){}
    }
    @Getter
    @Setter
    public static class PartyName {
        String id;
        String basicDataCompleteCode;
        String creationDateTime;
        Boolean defaultIndicator;
        String description;
        String effectivePeriodStart;
        String effectivePeriodEnd;
        String fullName;
        String givenName;
        String informationModelObjectKind;
        String middleName;
        String ownerPartyKey;
        String partyNameKey;
        String partyNameKind;
        String prefixTitleCode;
        String suffix;
        String surname;
        String typeName;
        String usageCode;
        String utilizedLanguageLanguageKey;
        String txGlobalTypeName;
        String txTypeCode;
        String txPrimaryKey;
        String txMetaSourceKey;
        String txMetaStartEventTime;
        String  txMetaLoadTime;
        String  txMetaSource;
        String  txMetaCorrection;
        String  txMetaChange;
        Integer txMetaAccessFilter;
        List<ChildOrganization> ChildOrganization;
        Person Person;
        String PersonId;
        Party Party;
        String PartyId;
        String CompanyId;
        String OrganizationUnitId;
        public PartyName(){}
    }*/
    @Getter
    @Setter
     public  static class HashMapWrapper
     {
         Map<String,Object> meta;

         public HashMapWrapper() {
         }

         public HashMapWrapper(Map<String, Object> meta) {
             this.meta = meta;
         }
     }

}
