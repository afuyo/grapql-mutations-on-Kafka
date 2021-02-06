package com.graphqlkafkaproducer.writepath.models2;


import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Types {

    public enum ChildOrganizationDistinctFieldEnum {
        id,
        basicDataCompleteCode,
        basingPartyRoleInRelationshipSpecificationSpecificationKey,
        creationDateTime,
        description,
        informationModelObjectKind,
        namePartyNameKey,
        partyRoleInRelationshipKind,
        partyRoleKind,
        playerRoleRoleKey,
        playingPartyPartyKey,
        roleKey,
        roleKind,
        rolePlayerPeriodStart,
        rolePlayerPeriodEnd,
        typeName,
        txGlobalTypeName,
        txTypeCode,
        txPrimaryKey,
        txMetaSourceKey,
        txMetaStartEventTime,
        txMetaLoadTime,
        txMetaSource,
        txMetaCorrection,
        txMetaChange,
        txMetaAccessFilter,
        PartyId,
        PartyNameId

    }

    public enum PartyDistinctFieldEnum {
        id,
        basicDataCompleteCode,
        creationDateTime,
        informationModelObjectKind,
        partyKey,
        partyKind,
        typeName,
        txGlobalTypeName,
        txTypeCode,
        txPrimaryKey,
        txMetaSourceKey,
        txMetaStartEventTime,
        txMetaLoadTime,
        txMetaSource,
        txMetaCorrection,
        txMetaChange,
        txMetaAccessFilter

    }

    public enum PartyNameDistinctFieldEnum {
        id,
        basicDataCompleteCode,
        creationDateTime,
        defaultIndicator,
        description,
        effectivePeriodStart,
        effectivePeriodEnd,
        fullName,
        givenName,
        informationModelObjectKind,
        middleName,
        ownerPartyKey,
        partyNameKey,
        partyNameKind,
        prefixTitleCode,
        suffix,
        surname,
        typeName,
        usageCode,
        utilizedLanguageLanguageKey,
        txGlobalTypeName,
        txTypeCode,
        txPrimaryKey,
        txMetaSourceKey,
        txMetaStartEventTime,
        txMetaLoadTime,
        txMetaSource,
        txMetaCorrection,
        txMetaChange,
        txMetaAccessFilter,
        PersonId,
        PartyId,
        CompanyId,
        OrganizationUnitId

    }

    public enum PersonDistinctFieldEnum {
        id,
        birthDateTime,
        bloodTypeCode,
        deathIndicator,
        ethnicityCode,
        genderCode,
        maritalStatusCode,
        missingDateTime,
        missingIndicator,
        partyKey,
        primaryLanguageLanguageKey,
        txGlobalGenderCode,
        txPrimaryKey,
        txMetaSourceKey,
        txMetaStartEventTime,
        txMetaLoadTime,
        txMetaSource,
        txMetaCorrection,
        txMetaChange,
        txMetaAccessFilter,
        PartyId

    }

    public enum SortOrder {
        asc,
        desc

    }

    public static class ChildOrganizationWhereInput {
        private Iterable<ChildOrganizationWhereInput> AND;
        private Iterable<ChildOrganizationWhereInput> OR;
        private Iterable<ChildOrganizationWhereInput> NOT;
        private StringFilterInput id;
        private StringNullableFilterInput basicDataCompleteCode;
        private StringNullableFilterInput basingPartyRoleInRelationshipSpecificationSpecificationKey;
        private StringNullableFilterInput creationDateTime;
        private StringNullableFilterInput description;
        private StringNullableFilterInput informationModelObjectKind;
        private StringNullableFilterInput namePartyNameKey;
        private StringNullableFilterInput partyRoleInRelationshipKind;
        private StringNullableFilterInput partyRoleKind;
        private StringNullableFilterInput playerRoleRoleKey;
        private StringNullableFilterInput playingPartyPartyKey;
        private StringNullableFilterInput roleKey;
        private StringNullableFilterInput roleKind;
        private StringNullableFilterInput rolePlayerPeriodStart;
        private StringNullableFilterInput rolePlayerPeriodEnd;
        private StringNullableFilterInput typeName;
        private StringNullableFilterInput txGlobalTypeName;
        private StringNullableFilterInput txTypeCode;
        private StringNullableFilterInput txPrimaryKey;
        private StringNullableFilterInput txMetaSourceKey;
        private StringNullableFilterInput txMetaStartEventTime;
        private StringNullableFilterInput txMetaLoadTime;
        private StringNullableFilterInput txMetaSource;
        private StringNullableFilterInput txMetaCorrection;
        private StringNullableFilterInput txMetaChange;
        private IntNullableFilterInput txMetaAccessFilter;
        private PartyWhereInput Party;
        private StringNullableFilterInput PartyId;
        private PartyNameWhereInput PartyName;
        private StringNullableFilterInput PartyNameId;

        public ChildOrganizationWhereInput() {}

        public Iterable<ChildOrganizationWhereInput> getAnd() { return this.AND; }
        public Iterable<ChildOrganizationWhereInput> getOr() { return this.OR; }
        public Iterable<ChildOrganizationWhereInput> getNot() { return this.NOT; }
        public StringFilterInput getId() { return this.id; }
        public StringNullableFilterInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public StringNullableFilterInput getBasingPartyRoleInRelationshipSpecificationSpecificationKey() { return this.basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public StringNullableFilterInput getCreationDateTime() { return this.creationDateTime; }
        public StringNullableFilterInput getDescription() { return this.description; }
        public StringNullableFilterInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public StringNullableFilterInput getNamePartyNameKey() { return this.namePartyNameKey; }
        public StringNullableFilterInput getPartyRoleInRelationshipKind() { return this.partyRoleInRelationshipKind; }
        public StringNullableFilterInput getPartyRoleKind() { return this.partyRoleKind; }
        public StringNullableFilterInput getPlayerRoleRoleKey() { return this.playerRoleRoleKey; }
        public StringNullableFilterInput getPlayingPartyPartyKey() { return this.playingPartyPartyKey; }
        public StringNullableFilterInput getRoleKey() { return this.roleKey; }
        public StringNullableFilterInput getRoleKind() { return this.roleKind; }
        public StringNullableFilterInput getRolePlayerPeriodStart() { return this.rolePlayerPeriodStart; }
        public StringNullableFilterInput getRolePlayerPeriodEnd() { return this.rolePlayerPeriodEnd; }
        public StringNullableFilterInput getTypeName() { return this.typeName; }
        public StringNullableFilterInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public StringNullableFilterInput getTxTypeCode() { return this.txTypeCode; }
        public StringNullableFilterInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public StringNullableFilterInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public StringNullableFilterInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public StringNullableFilterInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public StringNullableFilterInput getTxMetaSource() { return this.txMetaSource; }
        public StringNullableFilterInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public StringNullableFilterInput getTxMetaChange() { return this.txMetaChange; }
        public IntNullableFilterInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyWhereInput getParty() { return this.Party; }
        public StringNullableFilterInput getPartyId() { return this.PartyId; }
        public PartyNameWhereInput getPartyName() { return this.PartyName; }
        public StringNullableFilterInput getPartyNameId() { return this.PartyNameId; }
        public void setAnd(Iterable<ChildOrganizationWhereInput> AND) { this.AND = AND; }
        public void setOr(Iterable<ChildOrganizationWhereInput> OR) { this.OR = OR; }
        public void setNot(Iterable<ChildOrganizationWhereInput> NOT) { this.NOT = NOT; }
        public void setId(StringFilterInput id) { this.id = id; }
        public void setBasicDataCompleteCode(StringNullableFilterInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setBasingPartyRoleInRelationshipSpecificationSpecificationKey(StringNullableFilterInput basingPartyRoleInRelationshipSpecificationSpecificationKey) { this.basingPartyRoleInRelationshipSpecificationSpecificationKey = basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public void setCreationDateTime(StringNullableFilterInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDescription(StringNullableFilterInput description) { this.description = description; }
        public void setInformationModelObjectKind(StringNullableFilterInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setNamePartyNameKey(StringNullableFilterInput namePartyNameKey) { this.namePartyNameKey = namePartyNameKey; }
        public void setPartyRoleInRelationshipKind(StringNullableFilterInput partyRoleInRelationshipKind) { this.partyRoleInRelationshipKind = partyRoleInRelationshipKind; }
        public void setPartyRoleKind(StringNullableFilterInput partyRoleKind) { this.partyRoleKind = partyRoleKind; }
        public void setPlayerRoleRoleKey(StringNullableFilterInput playerRoleRoleKey) { this.playerRoleRoleKey = playerRoleRoleKey; }
        public void setPlayingPartyPartyKey(StringNullableFilterInput playingPartyPartyKey) { this.playingPartyPartyKey = playingPartyPartyKey; }
        public void setRoleKey(StringNullableFilterInput roleKey) { this.roleKey = roleKey; }
        public void setRoleKind(StringNullableFilterInput roleKind) { this.roleKind = roleKind; }
        public void setRolePlayerPeriodStart(StringNullableFilterInput rolePlayerPeriodStart) { this.rolePlayerPeriodStart = rolePlayerPeriodStart; }
        public void setRolePlayerPeriodEnd(StringNullableFilterInput rolePlayerPeriodEnd) { this.rolePlayerPeriodEnd = rolePlayerPeriodEnd; }
        public void setTypeName(StringNullableFilterInput typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(StringNullableFilterInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(StringNullableFilterInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(StringNullableFilterInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(StringNullableFilterInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(StringNullableFilterInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(StringNullableFilterInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(StringNullableFilterInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(StringNullableFilterInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(StringNullableFilterInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(IntNullableFilterInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setParty(PartyWhereInput Party) { this.Party = Party; }
        public void setPartyId(StringNullableFilterInput PartyId) { this.PartyId = PartyId; }
        public void setPartyName(PartyNameWhereInput PartyName) { this.PartyName = PartyName; }
        public void setPartyNameId(StringNullableFilterInput PartyNameId) { this.PartyNameId = PartyNameId; }
    }
    public static class ChildOrganizationOrderByInput {
        private SortOrder id;
        private SortOrder basicDataCompleteCode;
        private SortOrder basingPartyRoleInRelationshipSpecificationSpecificationKey;
        private SortOrder creationDateTime;
        private SortOrder description;
        private SortOrder informationModelObjectKind;
        private SortOrder namePartyNameKey;
        private SortOrder partyRoleInRelationshipKind;
        private SortOrder partyRoleKind;
        private SortOrder playerRoleRoleKey;
        private SortOrder playingPartyPartyKey;
        private SortOrder roleKey;
        private SortOrder roleKind;
        private SortOrder rolePlayerPeriodStart;
        private SortOrder rolePlayerPeriodEnd;
        private SortOrder typeName;
        private SortOrder txGlobalTypeName;
        private SortOrder txTypeCode;
        private SortOrder txPrimaryKey;
        private SortOrder txMetaSourceKey;
        private SortOrder txMetaStartEventTime;
        private SortOrder txMetaLoadTime;
        private SortOrder txMetaSource;
        private SortOrder txMetaCorrection;
        private SortOrder txMetaChange;
        private SortOrder txMetaAccessFilter;
        private SortOrder PartyId;
        private SortOrder PartyNameId;

        public ChildOrganizationOrderByInput() {}

        public SortOrder getId() { return this.id; }
        public SortOrder getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public SortOrder getBasingPartyRoleInRelationshipSpecificationSpecificationKey() { return this.basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public SortOrder getCreationDateTime() { return this.creationDateTime; }
        public SortOrder getDescription() { return this.description; }
        public SortOrder getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public SortOrder getNamePartyNameKey() { return this.namePartyNameKey; }
        public SortOrder getPartyRoleInRelationshipKind() { return this.partyRoleInRelationshipKind; }
        public SortOrder getPartyRoleKind() { return this.partyRoleKind; }
        public SortOrder getPlayerRoleRoleKey() { return this.playerRoleRoleKey; }
        public SortOrder getPlayingPartyPartyKey() { return this.playingPartyPartyKey; }
        public SortOrder getRoleKey() { return this.roleKey; }
        public SortOrder getRoleKind() { return this.roleKind; }
        public SortOrder getRolePlayerPeriodStart() { return this.rolePlayerPeriodStart; }
        public SortOrder getRolePlayerPeriodEnd() { return this.rolePlayerPeriodEnd; }
        public SortOrder getTypeName() { return this.typeName; }
        public SortOrder getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public SortOrder getTxTypeCode() { return this.txTypeCode; }
        public SortOrder getTxPrimaryKey() { return this.txPrimaryKey; }
        public SortOrder getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public SortOrder getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public SortOrder getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public SortOrder getTxMetaSource() { return this.txMetaSource; }
        public SortOrder getTxMetaCorrection() { return this.txMetaCorrection; }
        public SortOrder getTxMetaChange() { return this.txMetaChange; }
        public SortOrder getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public SortOrder getPartyId() { return this.PartyId; }
        public SortOrder getPartyNameId() { return this.PartyNameId; }
        public void setId(SortOrder id) { this.id = id; }
        public void setBasicDataCompleteCode(SortOrder basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setBasingPartyRoleInRelationshipSpecificationSpecificationKey(SortOrder basingPartyRoleInRelationshipSpecificationSpecificationKey) { this.basingPartyRoleInRelationshipSpecificationSpecificationKey = basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public void setCreationDateTime(SortOrder creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDescription(SortOrder description) { this.description = description; }
        public void setInformationModelObjectKind(SortOrder informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setNamePartyNameKey(SortOrder namePartyNameKey) { this.namePartyNameKey = namePartyNameKey; }
        public void setPartyRoleInRelationshipKind(SortOrder partyRoleInRelationshipKind) { this.partyRoleInRelationshipKind = partyRoleInRelationshipKind; }
        public void setPartyRoleKind(SortOrder partyRoleKind) { this.partyRoleKind = partyRoleKind; }
        public void setPlayerRoleRoleKey(SortOrder playerRoleRoleKey) { this.playerRoleRoleKey = playerRoleRoleKey; }
        public void setPlayingPartyPartyKey(SortOrder playingPartyPartyKey) { this.playingPartyPartyKey = playingPartyPartyKey; }
        public void setRoleKey(SortOrder roleKey) { this.roleKey = roleKey; }
        public void setRoleKind(SortOrder roleKind) { this.roleKind = roleKind; }
        public void setRolePlayerPeriodStart(SortOrder rolePlayerPeriodStart) { this.rolePlayerPeriodStart = rolePlayerPeriodStart; }
        public void setRolePlayerPeriodEnd(SortOrder rolePlayerPeriodEnd) { this.rolePlayerPeriodEnd = rolePlayerPeriodEnd; }
        public void setTypeName(SortOrder typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(SortOrder txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(SortOrder txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(SortOrder txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(SortOrder txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(SortOrder txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(SortOrder txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(SortOrder txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(SortOrder txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(SortOrder txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(SortOrder txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPartyId(SortOrder PartyId) { this.PartyId = PartyId; }
        public void setPartyNameId(SortOrder PartyNameId) { this.PartyNameId = PartyNameId; }
    }
    public static class ChildOrganizationWhereUniqueInput {
        private String id;
        private String txPrimaryKey;

        public ChildOrganizationWhereUniqueInput() {}

        public String getId() { return this.id; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public void setId(String id) { this.id = id; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
    }
    public static class PartyWhereInput {
        private Iterable<PartyWhereInput> AND;
        private Iterable<PartyWhereInput> OR;
        private Iterable<PartyWhereInput> NOT;
        private StringFilterInput id;
        private StringNullableFilterInput basicDataCompleteCode;
        private StringNullableFilterInput creationDateTime;
        private StringNullableFilterInput informationModelObjectKind;
        private StringNullableFilterInput partyKey;
        private StringNullableFilterInput partyKind;
        private StringNullableFilterInput typeName;
        private StringNullableFilterInput txGlobalTypeName;
        private StringNullableFilterInput txTypeCode;
        private StringNullableFilterInput txPrimaryKey;
        private StringNullableFilterInput txMetaSourceKey;
        private StringNullableFilterInput txMetaStartEventTime;
        private StringNullableFilterInput txMetaLoadTime;
        private StringNullableFilterInput txMetaSource;
        private StringNullableFilterInput txMetaCorrection;
        private StringNullableFilterInput txMetaChange;
        private IntNullableFilterInput txMetaAccessFilter;
        private PersonListRelationFilterInput Person;
        private PartyNameListRelationFilterInput PartyName;
        private ChildOrganizationListRelationFilterInput ChildOrganization;

        public PartyWhereInput() {}

        public Iterable<PartyWhereInput> getAnd() { return this.AND; }
        public Iterable<PartyWhereInput> getOr() { return this.OR; }
        public Iterable<PartyWhereInput> getNot() { return this.NOT; }
        public StringFilterInput getId() { return this.id; }
        public StringNullableFilterInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public StringNullableFilterInput getCreationDateTime() { return this.creationDateTime; }
        public StringNullableFilterInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public StringNullableFilterInput getPartyKey() { return this.partyKey; }
        public StringNullableFilterInput getPartyKind() { return this.partyKind; }
        public StringNullableFilterInput getTypeName() { return this.typeName; }
        public StringNullableFilterInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public StringNullableFilterInput getTxTypeCode() { return this.txTypeCode; }
        public StringNullableFilterInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public StringNullableFilterInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public StringNullableFilterInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public StringNullableFilterInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public StringNullableFilterInput getTxMetaSource() { return this.txMetaSource; }
        public StringNullableFilterInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public StringNullableFilterInput getTxMetaChange() { return this.txMetaChange; }
        public IntNullableFilterInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PersonListRelationFilterInput getPerson() { return this.Person; }
        public PartyNameListRelationFilterInput getPartyName() { return this.PartyName; }
        public ChildOrganizationListRelationFilterInput getChildOrganization() { return this.ChildOrganization; }
        public void setAnd(Iterable<PartyWhereInput> AND) { this.AND = AND; }
        public void setOr(Iterable<PartyWhereInput> OR) { this.OR = OR; }
        public void setNot(Iterable<PartyWhereInput> NOT) { this.NOT = NOT; }
        public void setId(StringFilterInput id) { this.id = id; }
        public void setBasicDataCompleteCode(StringNullableFilterInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(StringNullableFilterInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setInformationModelObjectKind(StringNullableFilterInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setPartyKey(StringNullableFilterInput partyKey) { this.partyKey = partyKey; }
        public void setPartyKind(StringNullableFilterInput partyKind) { this.partyKind = partyKind; }
        public void setTypeName(StringNullableFilterInput typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(StringNullableFilterInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(StringNullableFilterInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(StringNullableFilterInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(StringNullableFilterInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(StringNullableFilterInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(StringNullableFilterInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(StringNullableFilterInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(StringNullableFilterInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(StringNullableFilterInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(IntNullableFilterInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPerson(PersonListRelationFilterInput Person) { this.Person = Person; }
        public void setPartyName(PartyNameListRelationFilterInput PartyName) { this.PartyName = PartyName; }
        public void setChildOrganization(ChildOrganizationListRelationFilterInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
    }
    public static class PartyOrderByInput {
        private SortOrder id;
        private SortOrder basicDataCompleteCode;
        private SortOrder creationDateTime;
        private SortOrder informationModelObjectKind;
        private SortOrder partyKey;
        private SortOrder partyKind;
        private SortOrder typeName;
        private SortOrder txGlobalTypeName;
        private SortOrder txTypeCode;
        private SortOrder txPrimaryKey;
        private SortOrder txMetaSourceKey;
        private SortOrder txMetaStartEventTime;
        private SortOrder txMetaLoadTime;
        private SortOrder txMetaSource;
        private SortOrder txMetaCorrection;
        private SortOrder txMetaChange;
        private SortOrder txMetaAccessFilter;

        public PartyOrderByInput() {}

        public SortOrder getId() { return this.id; }
        public SortOrder getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public SortOrder getCreationDateTime() { return this.creationDateTime; }
        public SortOrder getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public SortOrder getPartyKey() { return this.partyKey; }
        public SortOrder getPartyKind() { return this.partyKind; }
        public SortOrder getTypeName() { return this.typeName; }
        public SortOrder getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public SortOrder getTxTypeCode() { return this.txTypeCode; }
        public SortOrder getTxPrimaryKey() { return this.txPrimaryKey; }
        public SortOrder getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public SortOrder getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public SortOrder getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public SortOrder getTxMetaSource() { return this.txMetaSource; }
        public SortOrder getTxMetaCorrection() { return this.txMetaCorrection; }
        public SortOrder getTxMetaChange() { return this.txMetaChange; }
        public SortOrder getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public void setId(SortOrder id) { this.id = id; }
        public void setBasicDataCompleteCode(SortOrder basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(SortOrder creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setInformationModelObjectKind(SortOrder informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setPartyKey(SortOrder partyKey) { this.partyKey = partyKey; }
        public void setPartyKind(SortOrder partyKind) { this.partyKind = partyKind; }
        public void setTypeName(SortOrder typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(SortOrder txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(SortOrder txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(SortOrder txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(SortOrder txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(SortOrder txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(SortOrder txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(SortOrder txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(SortOrder txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(SortOrder txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(SortOrder txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
    }
    public static class PartyWhereUniqueInput {
        private String id;
        private String txPrimaryKey;

        public PartyWhereUniqueInput() {}

        public String getId() { return this.id; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public void setId(String id) { this.id = id; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
    }
    public static class PartyNameWhereInput {
        private Iterable<PartyNameWhereInput> AND;
        private Iterable<PartyNameWhereInput> OR;
        private Iterable<PartyNameWhereInput> NOT;
        private StringFilterInput id;
        private StringNullableFilterInput basicDataCompleteCode;
        private StringNullableFilterInput creationDateTime;
        private BoolNullableFilterInput defaultIndicator;
        private StringNullableFilterInput description;
        private StringNullableFilterInput effectivePeriodStart;
        private StringNullableFilterInput effectivePeriodEnd;
        private StringNullableFilterInput fullName;
        private StringNullableFilterInput givenName;
        private StringNullableFilterInput informationModelObjectKind;
        private StringNullableFilterInput middleName;
        private StringNullableFilterInput ownerPartyKey;
        private StringNullableFilterInput partyNameKey;
        private StringNullableFilterInput partyNameKind;
        private StringNullableFilterInput prefixTitleCode;
        private StringNullableFilterInput suffix;
        private StringNullableFilterInput surname;
        private StringNullableFilterInput typeName;
        private StringNullableFilterInput usageCode;
        private StringNullableFilterInput utilizedLanguageLanguageKey;
        private StringNullableFilterInput txGlobalTypeName;
        private StringNullableFilterInput txTypeCode;
        private StringNullableFilterInput txPrimaryKey;
        private StringNullableFilterInput txMetaSourceKey;
        private StringNullableFilterInput txMetaStartEventTime;
        private StringNullableFilterInput txMetaLoadTime;
        private StringNullableFilterInput txMetaSource;
        private StringNullableFilterInput txMetaCorrection;
        private StringNullableFilterInput txMetaChange;
        private IntNullableFilterInput txMetaAccessFilter;
        private ChildOrganizationListRelationFilterInput ChildOrganization;
        private PersonWhereInput Person;
        private StringNullableFilterInput PersonId;
        private PartyWhereInput Party;
        private StringNullableFilterInput PartyId;
        private StringNullableFilterInput CompanyId;
        private StringNullableFilterInput OrganizationUnitId;

        public PartyNameWhereInput() {}

        public Iterable<PartyNameWhereInput> getAnd() { return this.AND; }
        public Iterable<PartyNameWhereInput> getOr() { return this.OR; }
        public Iterable<PartyNameWhereInput> getNot() { return this.NOT; }
        public StringFilterInput getId() { return this.id; }
        public StringNullableFilterInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public StringNullableFilterInput getCreationDateTime() { return this.creationDateTime; }
        public BoolNullableFilterInput getDefaultIndicator() { return this.defaultIndicator; }
        public StringNullableFilterInput getDescription() { return this.description; }
        public StringNullableFilterInput getEffectivePeriodStart() { return this.effectivePeriodStart; }
        public StringNullableFilterInput getEffectivePeriodEnd() { return this.effectivePeriodEnd; }
        public StringNullableFilterInput getFullName() { return this.fullName; }
        public StringNullableFilterInput getGivenName() { return this.givenName; }
        public StringNullableFilterInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public StringNullableFilterInput getMiddleName() { return this.middleName; }
        public StringNullableFilterInput getOwnerPartyKey() { return this.ownerPartyKey; }
        public StringNullableFilterInput getPartyNameKey() { return this.partyNameKey; }
        public StringNullableFilterInput getPartyNameKind() { return this.partyNameKind; }
        public StringNullableFilterInput getPrefixTitleCode() { return this.prefixTitleCode; }
        public StringNullableFilterInput getSuffix() { return this.suffix; }
        public StringNullableFilterInput getSurname() { return this.surname; }
        public StringNullableFilterInput getTypeName() { return this.typeName; }
        public StringNullableFilterInput getUsageCode() { return this.usageCode; }
        public StringNullableFilterInput getUtilizedLanguageLanguageKey() { return this.utilizedLanguageLanguageKey; }
        public StringNullableFilterInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public StringNullableFilterInput getTxTypeCode() { return this.txTypeCode; }
        public StringNullableFilterInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public StringNullableFilterInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public StringNullableFilterInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public StringNullableFilterInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public StringNullableFilterInput getTxMetaSource() { return this.txMetaSource; }
        public StringNullableFilterInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public StringNullableFilterInput getTxMetaChange() { return this.txMetaChange; }
        public IntNullableFilterInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public ChildOrganizationListRelationFilterInput getChildOrganization() { return this.ChildOrganization; }
        public PersonWhereInput getPerson() { return this.Person; }
        public StringNullableFilterInput getPersonId() { return this.PersonId; }
        public PartyWhereInput getParty() { return this.Party; }
        public StringNullableFilterInput getPartyId() { return this.PartyId; }
        public StringNullableFilterInput getCompanyId() { return this.CompanyId; }
        public StringNullableFilterInput getOrganizationUnitId() { return this.OrganizationUnitId; }
        public void setAnd(Iterable<PartyNameWhereInput> AND) { this.AND = AND; }
        public void setOr(Iterable<PartyNameWhereInput> OR) { this.OR = OR; }
        public void setNot(Iterable<PartyNameWhereInput> NOT) { this.NOT = NOT; }
        public void setId(StringFilterInput id) { this.id = id; }
        public void setBasicDataCompleteCode(StringNullableFilterInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(StringNullableFilterInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDefaultIndicator(BoolNullableFilterInput defaultIndicator) { this.defaultIndicator = defaultIndicator; }
        public void setDescription(StringNullableFilterInput description) { this.description = description; }
        public void setEffectivePeriodStart(StringNullableFilterInput effectivePeriodStart) { this.effectivePeriodStart = effectivePeriodStart; }
        public void setEffectivePeriodEnd(StringNullableFilterInput effectivePeriodEnd) { this.effectivePeriodEnd = effectivePeriodEnd; }
        public void setFullName(StringNullableFilterInput fullName) { this.fullName = fullName; }
        public void setGivenName(StringNullableFilterInput givenName) { this.givenName = givenName; }
        public void setInformationModelObjectKind(StringNullableFilterInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setMiddleName(StringNullableFilterInput middleName) { this.middleName = middleName; }
        public void setOwnerPartyKey(StringNullableFilterInput ownerPartyKey) { this.ownerPartyKey = ownerPartyKey; }
        public void setPartyNameKey(StringNullableFilterInput partyNameKey) { this.partyNameKey = partyNameKey; }
        public void setPartyNameKind(StringNullableFilterInput partyNameKind) { this.partyNameKind = partyNameKind; }
        public void setPrefixTitleCode(StringNullableFilterInput prefixTitleCode) { this.prefixTitleCode = prefixTitleCode; }
        public void setSuffix(StringNullableFilterInput suffix) { this.suffix = suffix; }
        public void setSurname(StringNullableFilterInput surname) { this.surname = surname; }
        public void setTypeName(StringNullableFilterInput typeName) { this.typeName = typeName; }
        public void setUsageCode(StringNullableFilterInput usageCode) { this.usageCode = usageCode; }
        public void setUtilizedLanguageLanguageKey(StringNullableFilterInput utilizedLanguageLanguageKey) { this.utilizedLanguageLanguageKey = utilizedLanguageLanguageKey; }
        public void setTxGlobalTypeName(StringNullableFilterInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(StringNullableFilterInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(StringNullableFilterInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(StringNullableFilterInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(StringNullableFilterInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(StringNullableFilterInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(StringNullableFilterInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(StringNullableFilterInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(StringNullableFilterInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(IntNullableFilterInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setChildOrganization(ChildOrganizationListRelationFilterInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
        public void setPerson(PersonWhereInput Person) { this.Person = Person; }
        public void setPersonId(StringNullableFilterInput PersonId) { this.PersonId = PersonId; }
        public void setParty(PartyWhereInput Party) { this.Party = Party; }
        public void setPartyId(StringNullableFilterInput PartyId) { this.PartyId = PartyId; }
        public void setCompanyId(StringNullableFilterInput CompanyId) { this.CompanyId = CompanyId; }
        public void setOrganizationUnitId(StringNullableFilterInput OrganizationUnitId) { this.OrganizationUnitId = OrganizationUnitId; }
    }
    public static class PartyNameOrderByInput {
        private SortOrder id;
        private SortOrder basicDataCompleteCode;
        private SortOrder creationDateTime;
        private SortOrder defaultIndicator;
        private SortOrder description;
        private SortOrder effectivePeriodStart;
        private SortOrder effectivePeriodEnd;
        private SortOrder fullName;
        private SortOrder givenName;
        private SortOrder informationModelObjectKind;
        private SortOrder middleName;
        private SortOrder ownerPartyKey;
        private SortOrder partyNameKey;
        private SortOrder partyNameKind;
        private SortOrder prefixTitleCode;
        private SortOrder suffix;
        private SortOrder surname;
        private SortOrder typeName;
        private SortOrder usageCode;
        private SortOrder utilizedLanguageLanguageKey;
        private SortOrder txGlobalTypeName;
        private SortOrder txTypeCode;
        private SortOrder txPrimaryKey;
        private SortOrder txMetaSourceKey;
        private SortOrder txMetaStartEventTime;
        private SortOrder txMetaLoadTime;
        private SortOrder txMetaSource;
        private SortOrder txMetaCorrection;
        private SortOrder txMetaChange;
        private SortOrder txMetaAccessFilter;
        private SortOrder PersonId;
        private SortOrder PartyId;
        private SortOrder CompanyId;
        private SortOrder OrganizationUnitId;

        public PartyNameOrderByInput() {}

        public SortOrder getId() { return this.id; }
        public SortOrder getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public SortOrder getCreationDateTime() { return this.creationDateTime; }
        public SortOrder getDefaultIndicator() { return this.defaultIndicator; }
        public SortOrder getDescription() { return this.description; }
        public SortOrder getEffectivePeriodStart() { return this.effectivePeriodStart; }
        public SortOrder getEffectivePeriodEnd() { return this.effectivePeriodEnd; }
        public SortOrder getFullName() { return this.fullName; }
        public SortOrder getGivenName() { return this.givenName; }
        public SortOrder getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public SortOrder getMiddleName() { return this.middleName; }
        public SortOrder getOwnerPartyKey() { return this.ownerPartyKey; }
        public SortOrder getPartyNameKey() { return this.partyNameKey; }
        public SortOrder getPartyNameKind() { return this.partyNameKind; }
        public SortOrder getPrefixTitleCode() { return this.prefixTitleCode; }
        public SortOrder getSuffix() { return this.suffix; }
        public SortOrder getSurname() { return this.surname; }
        public SortOrder getTypeName() { return this.typeName; }
        public SortOrder getUsageCode() { return this.usageCode; }
        public SortOrder getUtilizedLanguageLanguageKey() { return this.utilizedLanguageLanguageKey; }
        public SortOrder getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public SortOrder getTxTypeCode() { return this.txTypeCode; }
        public SortOrder getTxPrimaryKey() { return this.txPrimaryKey; }
        public SortOrder getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public SortOrder getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public SortOrder getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public SortOrder getTxMetaSource() { return this.txMetaSource; }
        public SortOrder getTxMetaCorrection() { return this.txMetaCorrection; }
        public SortOrder getTxMetaChange() { return this.txMetaChange; }
        public SortOrder getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public SortOrder getPersonId() { return this.PersonId; }
        public SortOrder getPartyId() { return this.PartyId; }
        public SortOrder getCompanyId() { return this.CompanyId; }
        public SortOrder getOrganizationUnitId() { return this.OrganizationUnitId; }
        public void setId(SortOrder id) { this.id = id; }
        public void setBasicDataCompleteCode(SortOrder basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(SortOrder creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDefaultIndicator(SortOrder defaultIndicator) { this.defaultIndicator = defaultIndicator; }
        public void setDescription(SortOrder description) { this.description = description; }
        public void setEffectivePeriodStart(SortOrder effectivePeriodStart) { this.effectivePeriodStart = effectivePeriodStart; }
        public void setEffectivePeriodEnd(SortOrder effectivePeriodEnd) { this.effectivePeriodEnd = effectivePeriodEnd; }
        public void setFullName(SortOrder fullName) { this.fullName = fullName; }
        public void setGivenName(SortOrder givenName) { this.givenName = givenName; }
        public void setInformationModelObjectKind(SortOrder informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setMiddleName(SortOrder middleName) { this.middleName = middleName; }
        public void setOwnerPartyKey(SortOrder ownerPartyKey) { this.ownerPartyKey = ownerPartyKey; }
        public void setPartyNameKey(SortOrder partyNameKey) { this.partyNameKey = partyNameKey; }
        public void setPartyNameKind(SortOrder partyNameKind) { this.partyNameKind = partyNameKind; }
        public void setPrefixTitleCode(SortOrder prefixTitleCode) { this.prefixTitleCode = prefixTitleCode; }
        public void setSuffix(SortOrder suffix) { this.suffix = suffix; }
        public void setSurname(SortOrder surname) { this.surname = surname; }
        public void setTypeName(SortOrder typeName) { this.typeName = typeName; }
        public void setUsageCode(SortOrder usageCode) { this.usageCode = usageCode; }
        public void setUtilizedLanguageLanguageKey(SortOrder utilizedLanguageLanguageKey) { this.utilizedLanguageLanguageKey = utilizedLanguageLanguageKey; }
        public void setTxGlobalTypeName(SortOrder txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(SortOrder txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(SortOrder txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(SortOrder txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(SortOrder txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(SortOrder txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(SortOrder txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(SortOrder txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(SortOrder txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(SortOrder txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPersonId(SortOrder PersonId) { this.PersonId = PersonId; }
        public void setPartyId(SortOrder PartyId) { this.PartyId = PartyId; }
        public void setCompanyId(SortOrder CompanyId) { this.CompanyId = CompanyId; }
        public void setOrganizationUnitId(SortOrder OrganizationUnitId) { this.OrganizationUnitId = OrganizationUnitId; }
    }
    public static class PartyNameWhereUniqueInput {
        private String id;
        private String txPrimaryKey;

        public PartyNameWhereUniqueInput() {}

        public String getId() { return this.id; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public void setId(String id) { this.id = id; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
    }
    public static class PersonWhereInput {
        private Iterable<PersonWhereInput> AND;
        private Iterable<PersonWhereInput> OR;
        private Iterable<PersonWhereInput> NOT;
        private StringFilterInput id;
        private StringNullableFilterInput birthDateTime;
        private StringNullableFilterInput bloodTypeCode;
        private BoolNullableFilterInput deathIndicator;
        private StringNullableFilterInput ethnicityCode;
        private StringNullableFilterInput genderCode;
        private StringNullableFilterInput maritalStatusCode;
        private StringNullableFilterInput missingDateTime;
        private BoolNullableFilterInput missingIndicator;
        private StringNullableFilterInput partyKey;
        private StringNullableFilterInput primaryLanguageLanguageKey;
        private StringNullableFilterInput txGlobalGenderCode;
        private StringNullableFilterInput txPrimaryKey;
        private StringNullableFilterInput txMetaSourceKey;
        private StringNullableFilterInput txMetaStartEventTime;
        private StringNullableFilterInput txMetaLoadTime;
        private StringNullableFilterInput txMetaSource;
        private StringNullableFilterInput txMetaCorrection;
        private StringNullableFilterInput txMetaChange;
        private IntNullableFilterInput txMetaAccessFilter;
        private PartyNameListRelationFilterInput PartyName;
        private PartyWhereInput Party;
        private StringNullableFilterInput PartyId;

        public PersonWhereInput() {}

        public Iterable<PersonWhereInput> getAnd() { return this.AND; }
        public Iterable<PersonWhereInput> getOr() { return this.OR; }
        public Iterable<PersonWhereInput> getNot() { return this.NOT; }
        public StringFilterInput getId() { return this.id; }
        public StringNullableFilterInput getBirthDateTime() { return this.birthDateTime; }
        public StringNullableFilterInput getBloodTypeCode() { return this.bloodTypeCode; }
        public BoolNullableFilterInput getDeathIndicator() { return this.deathIndicator; }
        public StringNullableFilterInput getEthnicityCode() { return this.ethnicityCode; }
        public StringNullableFilterInput getGenderCode() { return this.genderCode; }
        public StringNullableFilterInput getMaritalStatusCode() { return this.maritalStatusCode; }
        public StringNullableFilterInput getMissingDateTime() { return this.missingDateTime; }
        public BoolNullableFilterInput getMissingIndicator() { return this.missingIndicator; }
        public StringNullableFilterInput getPartyKey() { return this.partyKey; }
        public StringNullableFilterInput getPrimaryLanguageLanguageKey() { return this.primaryLanguageLanguageKey; }
        public StringNullableFilterInput getTxGlobalGenderCode() { return this.txGlobalGenderCode; }
        public StringNullableFilterInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public StringNullableFilterInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public StringNullableFilterInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public StringNullableFilterInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public StringNullableFilterInput getTxMetaSource() { return this.txMetaSource; }
        public StringNullableFilterInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public StringNullableFilterInput getTxMetaChange() { return this.txMetaChange; }
        public IntNullableFilterInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyNameListRelationFilterInput getPartyName() { return this.PartyName; }
        public PartyWhereInput getParty() { return this.Party; }
        public StringNullableFilterInput getPartyId() { return this.PartyId; }
        public void setAnd(Iterable<PersonWhereInput> AND) { this.AND = AND; }
        public void setOr(Iterable<PersonWhereInput> OR) { this.OR = OR; }
        public void setNot(Iterable<PersonWhereInput> NOT) { this.NOT = NOT; }
        public void setId(StringFilterInput id) { this.id = id; }
        public void setBirthDateTime(StringNullableFilterInput birthDateTime) { this.birthDateTime = birthDateTime; }
        public void setBloodTypeCode(StringNullableFilterInput bloodTypeCode) { this.bloodTypeCode = bloodTypeCode; }
        public void setDeathIndicator(BoolNullableFilterInput deathIndicator) { this.deathIndicator = deathIndicator; }
        public void setEthnicityCode(StringNullableFilterInput ethnicityCode) { this.ethnicityCode = ethnicityCode; }
        public void setGenderCode(StringNullableFilterInput genderCode) { this.genderCode = genderCode; }
        public void setMaritalStatusCode(StringNullableFilterInput maritalStatusCode) { this.maritalStatusCode = maritalStatusCode; }
        public void setMissingDateTime(StringNullableFilterInput missingDateTime) { this.missingDateTime = missingDateTime; }
        public void setMissingIndicator(BoolNullableFilterInput missingIndicator) { this.missingIndicator = missingIndicator; }
        public void setPartyKey(StringNullableFilterInput partyKey) { this.partyKey = partyKey; }
        public void setPrimaryLanguageLanguageKey(StringNullableFilterInput primaryLanguageLanguageKey) { this.primaryLanguageLanguageKey = primaryLanguageLanguageKey; }
        public void setTxGlobalGenderCode(StringNullableFilterInput txGlobalGenderCode) { this.txGlobalGenderCode = txGlobalGenderCode; }
        public void setTxPrimaryKey(StringNullableFilterInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(StringNullableFilterInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(StringNullableFilterInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(StringNullableFilterInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(StringNullableFilterInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(StringNullableFilterInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(StringNullableFilterInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(IntNullableFilterInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPartyName(PartyNameListRelationFilterInput PartyName) { this.PartyName = PartyName; }
        public void setParty(PartyWhereInput Party) { this.Party = Party; }
        public void setPartyId(StringNullableFilterInput PartyId) { this.PartyId = PartyId; }
    }
    public static class PersonOrderByInput {
        private SortOrder id;
        private SortOrder birthDateTime;
        private SortOrder bloodTypeCode;
        private SortOrder deathIndicator;
        private SortOrder ethnicityCode;
        private SortOrder genderCode;
        private SortOrder maritalStatusCode;
        private SortOrder missingDateTime;
        private SortOrder missingIndicator;
        private SortOrder partyKey;
        private SortOrder primaryLanguageLanguageKey;
        private SortOrder txGlobalGenderCode;
        private SortOrder txPrimaryKey;
        private SortOrder txMetaSourceKey;
        private SortOrder txMetaStartEventTime;
        private SortOrder txMetaLoadTime;
        private SortOrder txMetaSource;
        private SortOrder txMetaCorrection;
        private SortOrder txMetaChange;
        private SortOrder txMetaAccessFilter;
        private SortOrder PartyId;

        public PersonOrderByInput() {}

        public SortOrder getId() { return this.id; }
        public SortOrder getBirthDateTime() { return this.birthDateTime; }
        public SortOrder getBloodTypeCode() { return this.bloodTypeCode; }
        public SortOrder getDeathIndicator() { return this.deathIndicator; }
        public SortOrder getEthnicityCode() { return this.ethnicityCode; }
        public SortOrder getGenderCode() { return this.genderCode; }
        public SortOrder getMaritalStatusCode() { return this.maritalStatusCode; }
        public SortOrder getMissingDateTime() { return this.missingDateTime; }
        public SortOrder getMissingIndicator() { return this.missingIndicator; }
        public SortOrder getPartyKey() { return this.partyKey; }
        public SortOrder getPrimaryLanguageLanguageKey() { return this.primaryLanguageLanguageKey; }
        public SortOrder getTxGlobalGenderCode() { return this.txGlobalGenderCode; }
        public SortOrder getTxPrimaryKey() { return this.txPrimaryKey; }
        public SortOrder getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public SortOrder getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public SortOrder getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public SortOrder getTxMetaSource() { return this.txMetaSource; }
        public SortOrder getTxMetaCorrection() { return this.txMetaCorrection; }
        public SortOrder getTxMetaChange() { return this.txMetaChange; }
        public SortOrder getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public SortOrder getPartyId() { return this.PartyId; }
        public void setId(SortOrder id) { this.id = id; }
        public void setBirthDateTime(SortOrder birthDateTime) { this.birthDateTime = birthDateTime; }
        public void setBloodTypeCode(SortOrder bloodTypeCode) { this.bloodTypeCode = bloodTypeCode; }
        public void setDeathIndicator(SortOrder deathIndicator) { this.deathIndicator = deathIndicator; }
        public void setEthnicityCode(SortOrder ethnicityCode) { this.ethnicityCode = ethnicityCode; }
        public void setGenderCode(SortOrder genderCode) { this.genderCode = genderCode; }
        public void setMaritalStatusCode(SortOrder maritalStatusCode) { this.maritalStatusCode = maritalStatusCode; }
        public void setMissingDateTime(SortOrder missingDateTime) { this.missingDateTime = missingDateTime; }
        public void setMissingIndicator(SortOrder missingIndicator) { this.missingIndicator = missingIndicator; }
        public void setPartyKey(SortOrder partyKey) { this.partyKey = partyKey; }
        public void setPrimaryLanguageLanguageKey(SortOrder primaryLanguageLanguageKey) { this.primaryLanguageLanguageKey = primaryLanguageLanguageKey; }
        public void setTxGlobalGenderCode(SortOrder txGlobalGenderCode) { this.txGlobalGenderCode = txGlobalGenderCode; }
        public void setTxPrimaryKey(SortOrder txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(SortOrder txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(SortOrder txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(SortOrder txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(SortOrder txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(SortOrder txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(SortOrder txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(SortOrder txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPartyId(SortOrder PartyId) { this.PartyId = PartyId; }
    }
    public static class PersonWhereUniqueInput {
        private String id;
        private String txPrimaryKey;

        public PersonWhereUniqueInput() {}

        public String getId() { return this.id; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public void setId(String id) { this.id = id; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
    }
    public static class ChildOrganizationCreateInput {
        private String id;
        private String basicDataCompleteCode;
        private String basingPartyRoleInRelationshipSpecificationSpecificationKey;
        private String creationDateTime;
        private String description;
        private String informationModelObjectKind;
        private String namePartyNameKey;
        private String partyRoleInRelationshipKind;
        private String partyRoleKind;
        private String playerRoleRoleKey;
        private String playingPartyPartyKey;
        private String roleKey;
        private String roleKind;
        private String rolePlayerPeriodStart;
        private String rolePlayerPeriodEnd;
        private String typeName;
        private String txGlobalTypeName;
        private String txTypeCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private PartyCreateOneWithoutChildOrganizationInput Party;
        private PartyNameCreateOneWithoutChildOrganizationInput PartyName;

        public ChildOrganizationCreateInput() {}

        public String getId() { return this.id; }
        public String getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public String getBasingPartyRoleInRelationshipSpecificationSpecificationKey() { return this.basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public String getCreationDateTime() { return this.creationDateTime; }
        public String getDescription() { return this.description; }
        public String getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public String getNamePartyNameKey() { return this.namePartyNameKey; }
        public String getPartyRoleInRelationshipKind() { return this.partyRoleInRelationshipKind; }
        public String getPartyRoleKind() { return this.partyRoleKind; }
        public String getPlayerRoleRoleKey() { return this.playerRoleRoleKey; }
        public String getPlayingPartyPartyKey() { return this.playingPartyPartyKey; }
        public String getRoleKey() { return this.roleKey; }
        public String getRoleKind() { return this.roleKind; }
        public String getRolePlayerPeriodStart() { return this.rolePlayerPeriodStart; }
        public String getRolePlayerPeriodEnd() { return this.rolePlayerPeriodEnd; }
        public String getTypeName() { return this.typeName; }
        public String getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public String getTxTypeCode() { return this.txTypeCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyCreateOneWithoutChildOrganizationInput getParty() { return this.Party; }
        public PartyNameCreateOneWithoutChildOrganizationInput getPartyName() { return this.PartyName; }
        public void setId(String id) { this.id = id; }
        public void setBasicDataCompleteCode(String basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setBasingPartyRoleInRelationshipSpecificationSpecificationKey(String basingPartyRoleInRelationshipSpecificationSpecificationKey) { this.basingPartyRoleInRelationshipSpecificationSpecificationKey = basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public void setCreationDateTime(String creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDescription(String description) { this.description = description; }
        public void setInformationModelObjectKind(String informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setNamePartyNameKey(String namePartyNameKey) { this.namePartyNameKey = namePartyNameKey; }
        public void setPartyRoleInRelationshipKind(String partyRoleInRelationshipKind) { this.partyRoleInRelationshipKind = partyRoleInRelationshipKind; }
        public void setPartyRoleKind(String partyRoleKind) { this.partyRoleKind = partyRoleKind; }
        public void setPlayerRoleRoleKey(String playerRoleRoleKey) { this.playerRoleRoleKey = playerRoleRoleKey; }
        public void setPlayingPartyPartyKey(String playingPartyPartyKey) { this.playingPartyPartyKey = playingPartyPartyKey; }
        public void setRoleKey(String roleKey) { this.roleKey = roleKey; }
        public void setRoleKind(String roleKind) { this.roleKind = roleKind; }
        public void setRolePlayerPeriodStart(String rolePlayerPeriodStart) { this.rolePlayerPeriodStart = rolePlayerPeriodStart; }
        public void setRolePlayerPeriodEnd(String rolePlayerPeriodEnd) { this.rolePlayerPeriodEnd = rolePlayerPeriodEnd; }
        public void setTypeName(String typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(String txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(String txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setParty(PartyCreateOneWithoutChildOrganizationInput Party) { this.Party = Party; }
        public void setPartyName(PartyNameCreateOneWithoutChildOrganizationInput PartyName) { this.PartyName = PartyName; }
    }
    public static class ChildOrganizationUpdateInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput basingPartyRoleInRelationshipSpecificationSpecificationKey;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableStringFieldUpdateOperationsInput description;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput namePartyNameKey;
        private NullableStringFieldUpdateOperationsInput partyRoleInRelationshipKind;
        private NullableStringFieldUpdateOperationsInput partyRoleKind;
        private NullableStringFieldUpdateOperationsInput playerRoleRoleKey;
        private NullableStringFieldUpdateOperationsInput playingPartyPartyKey;
        private NullableStringFieldUpdateOperationsInput roleKey;
        private NullableStringFieldUpdateOperationsInput roleKind;
        private NullableStringFieldUpdateOperationsInput rolePlayerPeriodStart;
        private NullableStringFieldUpdateOperationsInput rolePlayerPeriodEnd;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private PartyUpdateOneWithoutChildOrganizationInput Party;
        private PartyNameUpdateOneWithoutChildOrganizationInput PartyName;

        public ChildOrganizationUpdateInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getBasingPartyRoleInRelationshipSpecificationSpecificationKey() { return this.basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableStringFieldUpdateOperationsInput getDescription() { return this.description; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getNamePartyNameKey() { return this.namePartyNameKey; }
        public NullableStringFieldUpdateOperationsInput getPartyRoleInRelationshipKind() { return this.partyRoleInRelationshipKind; }
        public NullableStringFieldUpdateOperationsInput getPartyRoleKind() { return this.partyRoleKind; }
        public NullableStringFieldUpdateOperationsInput getPlayerRoleRoleKey() { return this.playerRoleRoleKey; }
        public NullableStringFieldUpdateOperationsInput getPlayingPartyPartyKey() { return this.playingPartyPartyKey; }
        public NullableStringFieldUpdateOperationsInput getRoleKey() { return this.roleKey; }
        public NullableStringFieldUpdateOperationsInput getRoleKind() { return this.roleKind; }
        public NullableStringFieldUpdateOperationsInput getRolePlayerPeriodStart() { return this.rolePlayerPeriodStart; }
        public NullableStringFieldUpdateOperationsInput getRolePlayerPeriodEnd() { return this.rolePlayerPeriodEnd; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyUpdateOneWithoutChildOrganizationInput getParty() { return this.Party; }
        public PartyNameUpdateOneWithoutChildOrganizationInput getPartyName() { return this.PartyName; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setBasingPartyRoleInRelationshipSpecificationSpecificationKey(NullableStringFieldUpdateOperationsInput basingPartyRoleInRelationshipSpecificationSpecificationKey) { this.basingPartyRoleInRelationshipSpecificationSpecificationKey = basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDescription(NullableStringFieldUpdateOperationsInput description) { this.description = description; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setNamePartyNameKey(NullableStringFieldUpdateOperationsInput namePartyNameKey) { this.namePartyNameKey = namePartyNameKey; }
        public void setPartyRoleInRelationshipKind(NullableStringFieldUpdateOperationsInput partyRoleInRelationshipKind) { this.partyRoleInRelationshipKind = partyRoleInRelationshipKind; }
        public void setPartyRoleKind(NullableStringFieldUpdateOperationsInput partyRoleKind) { this.partyRoleKind = partyRoleKind; }
        public void setPlayerRoleRoleKey(NullableStringFieldUpdateOperationsInput playerRoleRoleKey) { this.playerRoleRoleKey = playerRoleRoleKey; }
        public void setPlayingPartyPartyKey(NullableStringFieldUpdateOperationsInput playingPartyPartyKey) { this.playingPartyPartyKey = playingPartyPartyKey; }
        public void setRoleKey(NullableStringFieldUpdateOperationsInput roleKey) { this.roleKey = roleKey; }
        public void setRoleKind(NullableStringFieldUpdateOperationsInput roleKind) { this.roleKind = roleKind; }
        public void setRolePlayerPeriodStart(NullableStringFieldUpdateOperationsInput rolePlayerPeriodStart) { this.rolePlayerPeriodStart = rolePlayerPeriodStart; }
        public void setRolePlayerPeriodEnd(NullableStringFieldUpdateOperationsInput rolePlayerPeriodEnd) { this.rolePlayerPeriodEnd = rolePlayerPeriodEnd; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setParty(PartyUpdateOneWithoutChildOrganizationInput Party) { this.Party = Party; }
        public void setPartyName(PartyNameUpdateOneWithoutChildOrganizationInput PartyName) { this.PartyName = PartyName; }
    }
    public static class ChildOrganizationUpdateManyMutationInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput basingPartyRoleInRelationshipSpecificationSpecificationKey;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableStringFieldUpdateOperationsInput description;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput namePartyNameKey;
        private NullableStringFieldUpdateOperationsInput partyRoleInRelationshipKind;
        private NullableStringFieldUpdateOperationsInput partyRoleKind;
        private NullableStringFieldUpdateOperationsInput playerRoleRoleKey;
        private NullableStringFieldUpdateOperationsInput playingPartyPartyKey;
        private NullableStringFieldUpdateOperationsInput roleKey;
        private NullableStringFieldUpdateOperationsInput roleKind;
        private NullableStringFieldUpdateOperationsInput rolePlayerPeriodStart;
        private NullableStringFieldUpdateOperationsInput rolePlayerPeriodEnd;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;

        public ChildOrganizationUpdateManyMutationInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getBasingPartyRoleInRelationshipSpecificationSpecificationKey() { return this.basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableStringFieldUpdateOperationsInput getDescription() { return this.description; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getNamePartyNameKey() { return this.namePartyNameKey; }
        public NullableStringFieldUpdateOperationsInput getPartyRoleInRelationshipKind() { return this.partyRoleInRelationshipKind; }
        public NullableStringFieldUpdateOperationsInput getPartyRoleKind() { return this.partyRoleKind; }
        public NullableStringFieldUpdateOperationsInput getPlayerRoleRoleKey() { return this.playerRoleRoleKey; }
        public NullableStringFieldUpdateOperationsInput getPlayingPartyPartyKey() { return this.playingPartyPartyKey; }
        public NullableStringFieldUpdateOperationsInput getRoleKey() { return this.roleKey; }
        public NullableStringFieldUpdateOperationsInput getRoleKind() { return this.roleKind; }
        public NullableStringFieldUpdateOperationsInput getRolePlayerPeriodStart() { return this.rolePlayerPeriodStart; }
        public NullableStringFieldUpdateOperationsInput getRolePlayerPeriodEnd() { return this.rolePlayerPeriodEnd; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setBasingPartyRoleInRelationshipSpecificationSpecificationKey(NullableStringFieldUpdateOperationsInput basingPartyRoleInRelationshipSpecificationSpecificationKey) { this.basingPartyRoleInRelationshipSpecificationSpecificationKey = basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDescription(NullableStringFieldUpdateOperationsInput description) { this.description = description; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setNamePartyNameKey(NullableStringFieldUpdateOperationsInput namePartyNameKey) { this.namePartyNameKey = namePartyNameKey; }
        public void setPartyRoleInRelationshipKind(NullableStringFieldUpdateOperationsInput partyRoleInRelationshipKind) { this.partyRoleInRelationshipKind = partyRoleInRelationshipKind; }
        public void setPartyRoleKind(NullableStringFieldUpdateOperationsInput partyRoleKind) { this.partyRoleKind = partyRoleKind; }
        public void setPlayerRoleRoleKey(NullableStringFieldUpdateOperationsInput playerRoleRoleKey) { this.playerRoleRoleKey = playerRoleRoleKey; }
        public void setPlayingPartyPartyKey(NullableStringFieldUpdateOperationsInput playingPartyPartyKey) { this.playingPartyPartyKey = playingPartyPartyKey; }
        public void setRoleKey(NullableStringFieldUpdateOperationsInput roleKey) { this.roleKey = roleKey; }
        public void setRoleKind(NullableStringFieldUpdateOperationsInput roleKind) { this.roleKind = roleKind; }
        public void setRolePlayerPeriodStart(NullableStringFieldUpdateOperationsInput rolePlayerPeriodStart) { this.rolePlayerPeriodStart = rolePlayerPeriodStart; }
        public void setRolePlayerPeriodEnd(NullableStringFieldUpdateOperationsInput rolePlayerPeriodEnd) { this.rolePlayerPeriodEnd = rolePlayerPeriodEnd; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
    }
    public static class PartyCreateInput {
        private String id;
        private String basicDataCompleteCode;
        private String creationDateTime;
        private String informationModelObjectKind;
        private String partyKey;
        private String partyKind;
        private String typeName;
        private String txGlobalTypeName;
        private String txTypeCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private PersonCreateManyWithoutPartyInput Person;
        private PartyNameCreateManyWithoutPartyInput PartyName;
        private ChildOrganizationCreateManyWithoutPartyInput ChildOrganization;

        public PartyCreateInput() {}

        public String getId() { return this.id; }
        public String getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public String getCreationDateTime() { return this.creationDateTime; }
        public String getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public String getPartyKey() { return this.partyKey; }
        public String getPartyKind() { return this.partyKind; }
        public String getTypeName() { return this.typeName; }
        public String getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public String getTxTypeCode() { return this.txTypeCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PersonCreateManyWithoutPartyInput getPerson() { return this.Person; }
        public PartyNameCreateManyWithoutPartyInput getPartyName() { return this.PartyName; }
        public ChildOrganizationCreateManyWithoutPartyInput getChildOrganization() { return this.ChildOrganization; }
        public void setId(String id) { this.id = id; }
        public void setBasicDataCompleteCode(String basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(String creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setInformationModelObjectKind(String informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setPartyKey(String partyKey) { this.partyKey = partyKey; }
        public void setPartyKind(String partyKind) { this.partyKind = partyKind; }
        public void setTypeName(String typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(String txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(String txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPerson(PersonCreateManyWithoutPartyInput Person) { this.Person = Person; }
        public void setPartyName(PartyNameCreateManyWithoutPartyInput PartyName) { this.PartyName = PartyName; }
        public void setChildOrganization(ChildOrganizationCreateManyWithoutPartyInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
    }
    public static class PartyUpdateInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput partyKey;
        private NullableStringFieldUpdateOperationsInput partyKind;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private PersonUpdateManyWithoutPartyInput Person;
        private PartyNameUpdateManyWithoutPartyInput PartyName;
        private ChildOrganizationUpdateManyWithoutPartyInput ChildOrganization;

        public PartyUpdateInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getPartyKey() { return this.partyKey; }
        public NullableStringFieldUpdateOperationsInput getPartyKind() { return this.partyKind; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PersonUpdateManyWithoutPartyInput getPerson() { return this.Person; }
        public PartyNameUpdateManyWithoutPartyInput getPartyName() { return this.PartyName; }
        public ChildOrganizationUpdateManyWithoutPartyInput getChildOrganization() { return this.ChildOrganization; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setPartyKey(NullableStringFieldUpdateOperationsInput partyKey) { this.partyKey = partyKey; }
        public void setPartyKind(NullableStringFieldUpdateOperationsInput partyKind) { this.partyKind = partyKind; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPerson(PersonUpdateManyWithoutPartyInput Person) { this.Person = Person; }
        public void setPartyName(PartyNameUpdateManyWithoutPartyInput PartyName) { this.PartyName = PartyName; }
        public void setChildOrganization(ChildOrganizationUpdateManyWithoutPartyInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
    }
    public static class PartyUpdateManyMutationInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput partyKey;
        private NullableStringFieldUpdateOperationsInput partyKind;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;

        public PartyUpdateManyMutationInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getPartyKey() { return this.partyKey; }
        public NullableStringFieldUpdateOperationsInput getPartyKind() { return this.partyKind; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setPartyKey(NullableStringFieldUpdateOperationsInput partyKey) { this.partyKey = partyKey; }
        public void setPartyKind(NullableStringFieldUpdateOperationsInput partyKind) { this.partyKind = partyKind; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
    }
    public static class PartyNameCreateInput {
        private String id;
        private String basicDataCompleteCode;
        private String creationDateTime;
        private Boolean defaultIndicator;
        private String description;
        private String effectivePeriodStart;
        private String effectivePeriodEnd;
        private String fullName;
        private String givenName;
        private String informationModelObjectKind;
        private String middleName;
        private String ownerPartyKey;
        private String partyNameKey;
        private String partyNameKind;
        private String prefixTitleCode;
        private String suffix;
        private String surname;
        private String typeName;
        private String usageCode;
        private String utilizedLanguageLanguageKey;
        private String txGlobalTypeName;
        private String txTypeCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private String CompanyId;
        private String OrganizationUnitId;
        private ChildOrganizationCreateManyWithoutPartyNameInput ChildOrganization;
        private PersonCreateOneWithoutPartyNameInput Person;
        private PartyCreateOneWithoutPartyNameInput Party;

        public PartyNameCreateInput() {}

        public String getId() { return this.id; }
        public String getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public String getCreationDateTime() { return this.creationDateTime; }
        public Boolean getDefaultIndicator() { return this.defaultIndicator; }
        public String getDescription() { return this.description; }
        public String getEffectivePeriodStart() { return this.effectivePeriodStart; }
        public String getEffectivePeriodEnd() { return this.effectivePeriodEnd; }
        public String getFullName() { return this.fullName; }
        public String getGivenName() { return this.givenName; }
        public String getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public String getMiddleName() { return this.middleName; }
        public String getOwnerPartyKey() { return this.ownerPartyKey; }
        public String getPartyNameKey() { return this.partyNameKey; }
        public String getPartyNameKind() { return this.partyNameKind; }
        public String getPrefixTitleCode() { return this.prefixTitleCode; }
        public String getSuffix() { return this.suffix; }
        public String getSurname() { return this.surname; }
        public String getTypeName() { return this.typeName; }
        public String getUsageCode() { return this.usageCode; }
        public String getUtilizedLanguageLanguageKey() { return this.utilizedLanguageLanguageKey; }
        public String getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public String getTxTypeCode() { return this.txTypeCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public String getCompanyId() { return this.CompanyId; }
        public String getOrganizationUnitId() { return this.OrganizationUnitId; }
        public ChildOrganizationCreateManyWithoutPartyNameInput getChildOrganization() { return this.ChildOrganization; }
        public PersonCreateOneWithoutPartyNameInput getPerson() { return this.Person; }
        public PartyCreateOneWithoutPartyNameInput getParty() { return this.Party; }
        public void setId(String id) { this.id = id; }
        public void setBasicDataCompleteCode(String basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(String creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDefaultIndicator(Boolean defaultIndicator) { this.defaultIndicator = defaultIndicator; }
        public void setDescription(String description) { this.description = description; }
        public void setEffectivePeriodStart(String effectivePeriodStart) { this.effectivePeriodStart = effectivePeriodStart; }
        public void setEffectivePeriodEnd(String effectivePeriodEnd) { this.effectivePeriodEnd = effectivePeriodEnd; }
        public void setFullName(String fullName) { this.fullName = fullName; }
        public void setGivenName(String givenName) { this.givenName = givenName; }
        public void setInformationModelObjectKind(String informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setMiddleName(String middleName) { this.middleName = middleName; }
        public void setOwnerPartyKey(String ownerPartyKey) { this.ownerPartyKey = ownerPartyKey; }
        public void setPartyNameKey(String partyNameKey) { this.partyNameKey = partyNameKey; }
        public void setPartyNameKind(String partyNameKind) { this.partyNameKind = partyNameKind; }
        public void setPrefixTitleCode(String prefixTitleCode) { this.prefixTitleCode = prefixTitleCode; }
        public void setSuffix(String suffix) { this.suffix = suffix; }
        public void setSurname(String surname) { this.surname = surname; }
        public void setTypeName(String typeName) { this.typeName = typeName; }
        public void setUsageCode(String usageCode) { this.usageCode = usageCode; }
        public void setUtilizedLanguageLanguageKey(String utilizedLanguageLanguageKey) { this.utilizedLanguageLanguageKey = utilizedLanguageLanguageKey; }
        public void setTxGlobalTypeName(String txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(String txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setCompanyId(String CompanyId) { this.CompanyId = CompanyId; }
        public void setOrganizationUnitId(String OrganizationUnitId) { this.OrganizationUnitId = OrganizationUnitId; }
        public void setChildOrganization(ChildOrganizationCreateManyWithoutPartyNameInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
        public void setPerson(PersonCreateOneWithoutPartyNameInput Person) { this.Person = Person; }
        public void setParty(PartyCreateOneWithoutPartyNameInput Party) { this.Party = Party; }
    }
    public static class PartyNameUpdateInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableBoolFieldUpdateOperationsInput defaultIndicator;
        private NullableStringFieldUpdateOperationsInput description;
        private NullableStringFieldUpdateOperationsInput effectivePeriodStart;
        private NullableStringFieldUpdateOperationsInput effectivePeriodEnd;
        private NullableStringFieldUpdateOperationsInput fullName;
        private NullableStringFieldUpdateOperationsInput givenName;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput middleName;
        private NullableStringFieldUpdateOperationsInput ownerPartyKey;
        private NullableStringFieldUpdateOperationsInput partyNameKey;
        private NullableStringFieldUpdateOperationsInput partyNameKind;
        private NullableStringFieldUpdateOperationsInput prefixTitleCode;
        private NullableStringFieldUpdateOperationsInput suffix;
        private NullableStringFieldUpdateOperationsInput surname;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput usageCode;
        private NullableStringFieldUpdateOperationsInput utilizedLanguageLanguageKey;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private NullableStringFieldUpdateOperationsInput CompanyId;
        private NullableStringFieldUpdateOperationsInput OrganizationUnitId;
        private ChildOrganizationUpdateManyWithoutPartyNameInput ChildOrganization;
        private PersonUpdateOneWithoutPartyNameInput Person;
        private PartyUpdateOneWithoutPartyNameInput Party;

        public PartyNameUpdateInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableBoolFieldUpdateOperationsInput getDefaultIndicator() { return this.defaultIndicator; }
        public NullableStringFieldUpdateOperationsInput getDescription() { return this.description; }
        public NullableStringFieldUpdateOperationsInput getEffectivePeriodStart() { return this.effectivePeriodStart; }
        public NullableStringFieldUpdateOperationsInput getEffectivePeriodEnd() { return this.effectivePeriodEnd; }
        public NullableStringFieldUpdateOperationsInput getFullName() { return this.fullName; }
        public NullableStringFieldUpdateOperationsInput getGivenName() { return this.givenName; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getMiddleName() { return this.middleName; }
        public NullableStringFieldUpdateOperationsInput getOwnerPartyKey() { return this.ownerPartyKey; }
        public NullableStringFieldUpdateOperationsInput getPartyNameKey() { return this.partyNameKey; }
        public NullableStringFieldUpdateOperationsInput getPartyNameKind() { return this.partyNameKind; }
        public NullableStringFieldUpdateOperationsInput getPrefixTitleCode() { return this.prefixTitleCode; }
        public NullableStringFieldUpdateOperationsInput getSuffix() { return this.suffix; }
        public NullableStringFieldUpdateOperationsInput getSurname() { return this.surname; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getUsageCode() { return this.usageCode; }
        public NullableStringFieldUpdateOperationsInput getUtilizedLanguageLanguageKey() { return this.utilizedLanguageLanguageKey; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public NullableStringFieldUpdateOperationsInput getCompanyId() { return this.CompanyId; }
        public NullableStringFieldUpdateOperationsInput getOrganizationUnitId() { return this.OrganizationUnitId; }
        public ChildOrganizationUpdateManyWithoutPartyNameInput getChildOrganization() { return this.ChildOrganization; }
        public PersonUpdateOneWithoutPartyNameInput getPerson() { return this.Person; }
        public PartyUpdateOneWithoutPartyNameInput getParty() { return this.Party; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDefaultIndicator(NullableBoolFieldUpdateOperationsInput defaultIndicator) { this.defaultIndicator = defaultIndicator; }
        public void setDescription(NullableStringFieldUpdateOperationsInput description) { this.description = description; }
        public void setEffectivePeriodStart(NullableStringFieldUpdateOperationsInput effectivePeriodStart) { this.effectivePeriodStart = effectivePeriodStart; }
        public void setEffectivePeriodEnd(NullableStringFieldUpdateOperationsInput effectivePeriodEnd) { this.effectivePeriodEnd = effectivePeriodEnd; }
        public void setFullName(NullableStringFieldUpdateOperationsInput fullName) { this.fullName = fullName; }
        public void setGivenName(NullableStringFieldUpdateOperationsInput givenName) { this.givenName = givenName; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setMiddleName(NullableStringFieldUpdateOperationsInput middleName) { this.middleName = middleName; }
        public void setOwnerPartyKey(NullableStringFieldUpdateOperationsInput ownerPartyKey) { this.ownerPartyKey = ownerPartyKey; }
        public void setPartyNameKey(NullableStringFieldUpdateOperationsInput partyNameKey) { this.partyNameKey = partyNameKey; }
        public void setPartyNameKind(NullableStringFieldUpdateOperationsInput partyNameKind) { this.partyNameKind = partyNameKind; }
        public void setPrefixTitleCode(NullableStringFieldUpdateOperationsInput prefixTitleCode) { this.prefixTitleCode = prefixTitleCode; }
        public void setSuffix(NullableStringFieldUpdateOperationsInput suffix) { this.suffix = suffix; }
        public void setSurname(NullableStringFieldUpdateOperationsInput surname) { this.surname = surname; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setUsageCode(NullableStringFieldUpdateOperationsInput usageCode) { this.usageCode = usageCode; }
        public void setUtilizedLanguageLanguageKey(NullableStringFieldUpdateOperationsInput utilizedLanguageLanguageKey) { this.utilizedLanguageLanguageKey = utilizedLanguageLanguageKey; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setCompanyId(NullableStringFieldUpdateOperationsInput CompanyId) { this.CompanyId = CompanyId; }
        public void setOrganizationUnitId(NullableStringFieldUpdateOperationsInput OrganizationUnitId) { this.OrganizationUnitId = OrganizationUnitId; }
        public void setChildOrganization(ChildOrganizationUpdateManyWithoutPartyNameInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
        public void setPerson(PersonUpdateOneWithoutPartyNameInput Person) { this.Person = Person; }
        public void setParty(PartyUpdateOneWithoutPartyNameInput Party) { this.Party = Party; }
    }
    public static class PartyNameUpdateManyMutationInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableBoolFieldUpdateOperationsInput defaultIndicator;
        private NullableStringFieldUpdateOperationsInput description;
        private NullableStringFieldUpdateOperationsInput effectivePeriodStart;
        private NullableStringFieldUpdateOperationsInput effectivePeriodEnd;
        private NullableStringFieldUpdateOperationsInput fullName;
        private NullableStringFieldUpdateOperationsInput givenName;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput middleName;
        private NullableStringFieldUpdateOperationsInput ownerPartyKey;
        private NullableStringFieldUpdateOperationsInput partyNameKey;
        private NullableStringFieldUpdateOperationsInput partyNameKind;
        private NullableStringFieldUpdateOperationsInput prefixTitleCode;
        private NullableStringFieldUpdateOperationsInput suffix;
        private NullableStringFieldUpdateOperationsInput surname;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput usageCode;
        private NullableStringFieldUpdateOperationsInput utilizedLanguageLanguageKey;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private NullableStringFieldUpdateOperationsInput CompanyId;
        private NullableStringFieldUpdateOperationsInput OrganizationUnitId;

        public PartyNameUpdateManyMutationInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableBoolFieldUpdateOperationsInput getDefaultIndicator() { return this.defaultIndicator; }
        public NullableStringFieldUpdateOperationsInput getDescription() { return this.description; }
        public NullableStringFieldUpdateOperationsInput getEffectivePeriodStart() { return this.effectivePeriodStart; }
        public NullableStringFieldUpdateOperationsInput getEffectivePeriodEnd() { return this.effectivePeriodEnd; }
        public NullableStringFieldUpdateOperationsInput getFullName() { return this.fullName; }
        public NullableStringFieldUpdateOperationsInput getGivenName() { return this.givenName; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getMiddleName() { return this.middleName; }
        public NullableStringFieldUpdateOperationsInput getOwnerPartyKey() { return this.ownerPartyKey; }
        public NullableStringFieldUpdateOperationsInput getPartyNameKey() { return this.partyNameKey; }
        public NullableStringFieldUpdateOperationsInput getPartyNameKind() { return this.partyNameKind; }
        public NullableStringFieldUpdateOperationsInput getPrefixTitleCode() { return this.prefixTitleCode; }
        public NullableStringFieldUpdateOperationsInput getSuffix() { return this.suffix; }
        public NullableStringFieldUpdateOperationsInput getSurname() { return this.surname; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getUsageCode() { return this.usageCode; }
        public NullableStringFieldUpdateOperationsInput getUtilizedLanguageLanguageKey() { return this.utilizedLanguageLanguageKey; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public NullableStringFieldUpdateOperationsInput getCompanyId() { return this.CompanyId; }
        public NullableStringFieldUpdateOperationsInput getOrganizationUnitId() { return this.OrganizationUnitId; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDefaultIndicator(NullableBoolFieldUpdateOperationsInput defaultIndicator) { this.defaultIndicator = defaultIndicator; }
        public void setDescription(NullableStringFieldUpdateOperationsInput description) { this.description = description; }
        public void setEffectivePeriodStart(NullableStringFieldUpdateOperationsInput effectivePeriodStart) { this.effectivePeriodStart = effectivePeriodStart; }
        public void setEffectivePeriodEnd(NullableStringFieldUpdateOperationsInput effectivePeriodEnd) { this.effectivePeriodEnd = effectivePeriodEnd; }
        public void setFullName(NullableStringFieldUpdateOperationsInput fullName) { this.fullName = fullName; }
        public void setGivenName(NullableStringFieldUpdateOperationsInput givenName) { this.givenName = givenName; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setMiddleName(NullableStringFieldUpdateOperationsInput middleName) { this.middleName = middleName; }
        public void setOwnerPartyKey(NullableStringFieldUpdateOperationsInput ownerPartyKey) { this.ownerPartyKey = ownerPartyKey; }
        public void setPartyNameKey(NullableStringFieldUpdateOperationsInput partyNameKey) { this.partyNameKey = partyNameKey; }
        public void setPartyNameKind(NullableStringFieldUpdateOperationsInput partyNameKind) { this.partyNameKind = partyNameKind; }
        public void setPrefixTitleCode(NullableStringFieldUpdateOperationsInput prefixTitleCode) { this.prefixTitleCode = prefixTitleCode; }
        public void setSuffix(NullableStringFieldUpdateOperationsInput suffix) { this.suffix = suffix; }
        public void setSurname(NullableStringFieldUpdateOperationsInput surname) { this.surname = surname; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setUsageCode(NullableStringFieldUpdateOperationsInput usageCode) { this.usageCode = usageCode; }
        public void setUtilizedLanguageLanguageKey(NullableStringFieldUpdateOperationsInput utilizedLanguageLanguageKey) { this.utilizedLanguageLanguageKey = utilizedLanguageLanguageKey; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setCompanyId(NullableStringFieldUpdateOperationsInput CompanyId) { this.CompanyId = CompanyId; }
        public void setOrganizationUnitId(NullableStringFieldUpdateOperationsInput OrganizationUnitId) { this.OrganizationUnitId = OrganizationUnitId; }
    }
    public static class PersonCreateInput {
        private String id;
        private String birthDateTime;
        private String bloodTypeCode;
        private Boolean deathIndicator;
        private String ethnicityCode;
        private String genderCode;
        private String maritalStatusCode;
        private String missingDateTime;
        private Boolean missingIndicator;
        private String partyKey;
        private String primaryLanguageLanguageKey;
        private String txGlobalGenderCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private PartyNameCreateManyWithoutPersonInput PartyName;
        private PartyCreateOneWithoutPersonInput Party;

        public PersonCreateInput() {}

        public String getId() { return this.id; }
        public String getBirthDateTime() { return this.birthDateTime; }
        public String getBloodTypeCode() { return this.bloodTypeCode; }
        public Boolean getDeathIndicator() { return this.deathIndicator; }
        public String getEthnicityCode() { return this.ethnicityCode; }
        public String getGenderCode() { return this.genderCode; }
        public String getMaritalStatusCode() { return this.maritalStatusCode; }
        public String getMissingDateTime() { return this.missingDateTime; }
        public Boolean getMissingIndicator() { return this.missingIndicator; }
        public String getPartyKey() { return this.partyKey; }
        public String getPrimaryLanguageLanguageKey() { return this.primaryLanguageLanguageKey; }
        public String getTxGlobalGenderCode() { return this.txGlobalGenderCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyNameCreateManyWithoutPersonInput getPartyName() { return this.PartyName; }
        public PartyCreateOneWithoutPersonInput getParty() { return this.Party; }
        public void setId(String id) { this.id = id; }
        public void setBirthDateTime(String birthDateTime) { this.birthDateTime = birthDateTime; }
        public void setBloodTypeCode(String bloodTypeCode) { this.bloodTypeCode = bloodTypeCode; }
        public void setDeathIndicator(Boolean deathIndicator) { this.deathIndicator = deathIndicator; }
        public void setEthnicityCode(String ethnicityCode) { this.ethnicityCode = ethnicityCode; }
        public void setGenderCode(String genderCode) { this.genderCode = genderCode; }
        public void setMaritalStatusCode(String maritalStatusCode) { this.maritalStatusCode = maritalStatusCode; }
        public void setMissingDateTime(String missingDateTime) { this.missingDateTime = missingDateTime; }
        public void setMissingIndicator(Boolean missingIndicator) { this.missingIndicator = missingIndicator; }
        public void setPartyKey(String partyKey) { this.partyKey = partyKey; }
        public void setPrimaryLanguageLanguageKey(String primaryLanguageLanguageKey) { this.primaryLanguageLanguageKey = primaryLanguageLanguageKey; }
        public void setTxGlobalGenderCode(String txGlobalGenderCode) { this.txGlobalGenderCode = txGlobalGenderCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPartyName(PartyNameCreateManyWithoutPersonInput PartyName) { this.PartyName = PartyName; }
        public void setParty(PartyCreateOneWithoutPersonInput Party) { this.Party = Party; }
    }
    public static class PersonUpdateInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput birthDateTime;
        private NullableStringFieldUpdateOperationsInput bloodTypeCode;
        private NullableBoolFieldUpdateOperationsInput deathIndicator;
        private NullableStringFieldUpdateOperationsInput ethnicityCode;
        private NullableStringFieldUpdateOperationsInput genderCode;
        private NullableStringFieldUpdateOperationsInput maritalStatusCode;
        private NullableStringFieldUpdateOperationsInput missingDateTime;
        private NullableBoolFieldUpdateOperationsInput missingIndicator;
        private NullableStringFieldUpdateOperationsInput partyKey;
        private NullableStringFieldUpdateOperationsInput primaryLanguageLanguageKey;
        private NullableStringFieldUpdateOperationsInput txGlobalGenderCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private PartyNameUpdateManyWithoutPersonInput PartyName;
        private PartyUpdateOneWithoutPersonInput Party;

        public PersonUpdateInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBirthDateTime() { return this.birthDateTime; }
        public NullableStringFieldUpdateOperationsInput getBloodTypeCode() { return this.bloodTypeCode; }
        public NullableBoolFieldUpdateOperationsInput getDeathIndicator() { return this.deathIndicator; }
        public NullableStringFieldUpdateOperationsInput getEthnicityCode() { return this.ethnicityCode; }
        public NullableStringFieldUpdateOperationsInput getGenderCode() { return this.genderCode; }
        public NullableStringFieldUpdateOperationsInput getMaritalStatusCode() { return this.maritalStatusCode; }
        public NullableStringFieldUpdateOperationsInput getMissingDateTime() { return this.missingDateTime; }
        public NullableBoolFieldUpdateOperationsInput getMissingIndicator() { return this.missingIndicator; }
        public NullableStringFieldUpdateOperationsInput getPartyKey() { return this.partyKey; }
        public NullableStringFieldUpdateOperationsInput getPrimaryLanguageLanguageKey() { return this.primaryLanguageLanguageKey; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalGenderCode() { return this.txGlobalGenderCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyNameUpdateManyWithoutPersonInput getPartyName() { return this.PartyName; }
        public PartyUpdateOneWithoutPersonInput getParty() { return this.Party; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBirthDateTime(NullableStringFieldUpdateOperationsInput birthDateTime) { this.birthDateTime = birthDateTime; }
        public void setBloodTypeCode(NullableStringFieldUpdateOperationsInput bloodTypeCode) { this.bloodTypeCode = bloodTypeCode; }
        public void setDeathIndicator(NullableBoolFieldUpdateOperationsInput deathIndicator) { this.deathIndicator = deathIndicator; }
        public void setEthnicityCode(NullableStringFieldUpdateOperationsInput ethnicityCode) { this.ethnicityCode = ethnicityCode; }
        public void setGenderCode(NullableStringFieldUpdateOperationsInput genderCode) { this.genderCode = genderCode; }
        public void setMaritalStatusCode(NullableStringFieldUpdateOperationsInput maritalStatusCode) { this.maritalStatusCode = maritalStatusCode; }
        public void setMissingDateTime(NullableStringFieldUpdateOperationsInput missingDateTime) { this.missingDateTime = missingDateTime; }
        public void setMissingIndicator(NullableBoolFieldUpdateOperationsInput missingIndicator) { this.missingIndicator = missingIndicator; }
        public void setPartyKey(NullableStringFieldUpdateOperationsInput partyKey) { this.partyKey = partyKey; }
        public void setPrimaryLanguageLanguageKey(NullableStringFieldUpdateOperationsInput primaryLanguageLanguageKey) { this.primaryLanguageLanguageKey = primaryLanguageLanguageKey; }
        public void setTxGlobalGenderCode(NullableStringFieldUpdateOperationsInput txGlobalGenderCode) { this.txGlobalGenderCode = txGlobalGenderCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPartyName(PartyNameUpdateManyWithoutPersonInput PartyName) { this.PartyName = PartyName; }
        public void setParty(PartyUpdateOneWithoutPersonInput Party) { this.Party = Party; }
    }
    public static class PersonUpdateManyMutationInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput birthDateTime;
        private NullableStringFieldUpdateOperationsInput bloodTypeCode;
        private NullableBoolFieldUpdateOperationsInput deathIndicator;
        private NullableStringFieldUpdateOperationsInput ethnicityCode;
        private NullableStringFieldUpdateOperationsInput genderCode;
        private NullableStringFieldUpdateOperationsInput maritalStatusCode;
        private NullableStringFieldUpdateOperationsInput missingDateTime;
        private NullableBoolFieldUpdateOperationsInput missingIndicator;
        private NullableStringFieldUpdateOperationsInput partyKey;
        private NullableStringFieldUpdateOperationsInput primaryLanguageLanguageKey;
        private NullableStringFieldUpdateOperationsInput txGlobalGenderCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;

        public PersonUpdateManyMutationInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBirthDateTime() { return this.birthDateTime; }
        public NullableStringFieldUpdateOperationsInput getBloodTypeCode() { return this.bloodTypeCode; }
        public NullableBoolFieldUpdateOperationsInput getDeathIndicator() { return this.deathIndicator; }
        public NullableStringFieldUpdateOperationsInput getEthnicityCode() { return this.ethnicityCode; }
        public NullableStringFieldUpdateOperationsInput getGenderCode() { return this.genderCode; }
        public NullableStringFieldUpdateOperationsInput getMaritalStatusCode() { return this.maritalStatusCode; }
        public NullableStringFieldUpdateOperationsInput getMissingDateTime() { return this.missingDateTime; }
        public NullableBoolFieldUpdateOperationsInput getMissingIndicator() { return this.missingIndicator; }
        public NullableStringFieldUpdateOperationsInput getPartyKey() { return this.partyKey; }
        public NullableStringFieldUpdateOperationsInput getPrimaryLanguageLanguageKey() { return this.primaryLanguageLanguageKey; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalGenderCode() { return this.txGlobalGenderCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBirthDateTime(NullableStringFieldUpdateOperationsInput birthDateTime) { this.birthDateTime = birthDateTime; }
        public void setBloodTypeCode(NullableStringFieldUpdateOperationsInput bloodTypeCode) { this.bloodTypeCode = bloodTypeCode; }
        public void setDeathIndicator(NullableBoolFieldUpdateOperationsInput deathIndicator) { this.deathIndicator = deathIndicator; }
        public void setEthnicityCode(NullableStringFieldUpdateOperationsInput ethnicityCode) { this.ethnicityCode = ethnicityCode; }
        public void setGenderCode(NullableStringFieldUpdateOperationsInput genderCode) { this.genderCode = genderCode; }
        public void setMaritalStatusCode(NullableStringFieldUpdateOperationsInput maritalStatusCode) { this.maritalStatusCode = maritalStatusCode; }
        public void setMissingDateTime(NullableStringFieldUpdateOperationsInput missingDateTime) { this.missingDateTime = missingDateTime; }
        public void setMissingIndicator(NullableBoolFieldUpdateOperationsInput missingIndicator) { this.missingIndicator = missingIndicator; }
        public void setPartyKey(NullableStringFieldUpdateOperationsInput partyKey) { this.partyKey = partyKey; }
        public void setPrimaryLanguageLanguageKey(NullableStringFieldUpdateOperationsInput primaryLanguageLanguageKey) { this.primaryLanguageLanguageKey = primaryLanguageLanguageKey; }
        public void setTxGlobalGenderCode(NullableStringFieldUpdateOperationsInput txGlobalGenderCode) { this.txGlobalGenderCode = txGlobalGenderCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
    }
    public static class StringFilterInput {
        private String equals;
        private Iterable<String> in;
        private Iterable<String> notIn;
        private String lt;
        private String lte;
        private String gt;
        private String gte;
        private String contains;
        private String startsWith;
        private String endsWith;
        private String not;

        public StringFilterInput() {}

        public String getEquals() { return this.equals; }
        public Iterable<String> getIn() { return this.in; }
        public Iterable<String> getNotIn() { return this.notIn; }
        public String getLt() { return this.lt; }
        public String getLte() { return this.lte; }
        public String getGt() { return this.gt; }
        public String getGte() { return this.gte; }
        public String getContains() { return this.contains; }
        public String getStartsWith() { return this.startsWith; }
        public String getEndsWith() { return this.endsWith; }
        public String getNot() { return this.not; }
        public void setEquals(String equals) { this.equals = equals; }
        public void setIn(Iterable<String> in) { this.in = in; }
        public void setNotIn(Iterable<String> notIn) { this.notIn = notIn; }
        public void setLt(String lt) { this.lt = lt; }
        public void setLte(String lte) { this.lte = lte; }
        public void setGt(String gt) { this.gt = gt; }
        public void setGte(String gte) { this.gte = gte; }
        public void setContains(String contains) { this.contains = contains; }
        public void setStartsWith(String startsWith) { this.startsWith = startsWith; }
        public void setEndsWith(String endsWith) { this.endsWith = endsWith; }
        public void setNot(String not) { this.not = not; }
    }
    public static class StringNullableFilterInput {
        private String equals;
        private Iterable<String> in;
        private Iterable<String> notIn;
        private String lt;
        private String lte;
        private String gt;
        private String gte;
        private String contains;
        private String startsWith;
        private String endsWith;
        private String not;

        public StringNullableFilterInput() {}

        public String getEquals() { return this.equals; }
        public Iterable<String> getIn() { return this.in; }
        public Iterable<String> getNotIn() { return this.notIn; }
        public String getLt() { return this.lt; }
        public String getLte() { return this.lte; }
        public String getGt() { return this.gt; }
        public String getGte() { return this.gte; }
        public String getContains() { return this.contains; }
        public String getStartsWith() { return this.startsWith; }
        public String getEndsWith() { return this.endsWith; }
        public String getNot() { return this.not; }
        public void setEquals(String equals) { this.equals = equals; }
        public void setIn(Iterable<String> in) { this.in = in; }
        public void setNotIn(Iterable<String> notIn) { this.notIn = notIn; }
        public void setLt(String lt) { this.lt = lt; }
        public void setLte(String lte) { this.lte = lte; }
        public void setGt(String gt) { this.gt = gt; }
        public void setGte(String gte) { this.gte = gte; }
        public void setContains(String contains) { this.contains = contains; }
        public void setStartsWith(String startsWith) { this.startsWith = startsWith; }
        public void setEndsWith(String endsWith) { this.endsWith = endsWith; }
        public void setNot(String not) { this.not = not; }
    }
    public static class IntNullableFilterInput {
        private Integer equals;
        private Iterable<Integer> in;
        private Iterable<Integer> notIn;
        private Integer lt;
        private Integer lte;
        private Integer gt;
        private Integer gte;
        private Integer not;

        public IntNullableFilterInput() {}

        public Integer getEquals() { return this.equals; }
        public Iterable<Integer> getIn() { return this.in; }
        public Iterable<Integer> getNotIn() { return this.notIn; }
        public Integer getLt() { return this.lt; }
        public Integer getLte() { return this.lte; }
        public Integer getGt() { return this.gt; }
        public Integer getGte() { return this.gte; }
        public Integer getNot() { return this.not; }
        public void setEquals(Integer equals) { this.equals = equals; }
        public void setIn(Iterable<Integer> in) { this.in = in; }
        public void setNotIn(Iterable<Integer> notIn) { this.notIn = notIn; }
        public void setLt(Integer lt) { this.lt = lt; }
        public void setLte(Integer lte) { this.lte = lte; }
        public void setGt(Integer gt) { this.gt = gt; }
        public void setGte(Integer gte) { this.gte = gte; }
        public void setNot(Integer not) { this.not = not; }
    }
    public static class PartyRelationFilterInput {
        private PartyWhereInput is;
        private PartyWhereInput isNot;

        public PartyRelationFilterInput() {}

        public PartyWhereInput getIs() { return this.is; }
        public PartyWhereInput getIsNot() { return this.isNot; }
        public void setIs(PartyWhereInput is) { this.is = is; }
        public void setIsNot(PartyWhereInput isNot) { this.isNot = isNot; }
    }
    public static class PartyNameRelationFilterInput {
        private PartyNameWhereInput is;
        private PartyNameWhereInput isNot;

        public PartyNameRelationFilterInput() {}

        public PartyNameWhereInput getIs() { return this.is; }
        public PartyNameWhereInput getIsNot() { return this.isNot; }
        public void setIs(PartyNameWhereInput is) { this.is = is; }
        public void setIsNot(PartyNameWhereInput isNot) { this.isNot = isNot; }
    }
    public static class PersonListRelationFilterInput {
        private PersonWhereInput every;
        private PersonWhereInput some;
        private PersonWhereInput none;

        public PersonListRelationFilterInput() {}

        public PersonWhereInput getEvery() { return this.every; }
        public PersonWhereInput getSome() { return this.some; }
        public PersonWhereInput getNone() { return this.none; }
        public void setEvery(PersonWhereInput every) { this.every = every; }
        public void setSome(PersonWhereInput some) { this.some = some; }
        public void setNone(PersonWhereInput none) { this.none = none; }
    }
    public static class PartyNameListRelationFilterInput {
        private PartyNameWhereInput every;
        private PartyNameWhereInput some;
        private PartyNameWhereInput none;

        public PartyNameListRelationFilterInput() {}

        public PartyNameWhereInput getEvery() { return this.every; }
        public PartyNameWhereInput getSome() { return this.some; }
        public PartyNameWhereInput getNone() { return this.none; }
        public void setEvery(PartyNameWhereInput every) { this.every = every; }
        public void setSome(PartyNameWhereInput some) { this.some = some; }
        public void setNone(PartyNameWhereInput none) { this.none = none; }
    }
    public static class ChildOrganizationListRelationFilterInput {
        private ChildOrganizationWhereInput every;
        private ChildOrganizationWhereInput some;
        private ChildOrganizationWhereInput none;

        public ChildOrganizationListRelationFilterInput() {}

        public ChildOrganizationWhereInput getEvery() { return this.every; }
        public ChildOrganizationWhereInput getSome() { return this.some; }
        public ChildOrganizationWhereInput getNone() { return this.none; }
        public void setEvery(ChildOrganizationWhereInput every) { this.every = every; }
        public void setSome(ChildOrganizationWhereInput some) { this.some = some; }
        public void setNone(ChildOrganizationWhereInput none) { this.none = none; }
    }
    public static class BoolNullableFilterInput {
        private Boolean equals;
        private Boolean not;

        public BoolNullableFilterInput() {}

        public Boolean getEquals() { return this.equals; }
        public Boolean getNot() { return this.not; }
        public void setEquals(Boolean equals) { this.equals = equals; }
        public void setNot(Boolean not) { this.not = not; }
    }
    public static class PersonRelationFilterInput {
        private PersonWhereInput is;
        private PersonWhereInput isNot;

        public PersonRelationFilterInput() {}

        public PersonWhereInput getIs() { return this.is; }
        public PersonWhereInput getIsNot() { return this.isNot; }
        public void setIs(PersonWhereInput is) { this.is = is; }
        public void setIsNot(PersonWhereInput isNot) { this.isNot = isNot; }
    }
    public static class PartyCreateOneWithoutChildOrganizationInput {
        private PartyCreateWithoutChildOrganizationInput create;
        private PartyWhereUniqueInput connect;

        public PartyCreateOneWithoutChildOrganizationInput() {}

        public PartyCreateWithoutChildOrganizationInput getCreate() { return this.create; }
        public PartyWhereUniqueInput getConnect() { return this.connect; }
        public void setCreate(PartyCreateWithoutChildOrganizationInput create) { this.create = create; }
        public void setConnect(PartyWhereUniqueInput connect) { this.connect = connect; }
    }
    public static class PartyNameCreateOneWithoutChildOrganizationInput {
        private PartyNameCreateWithoutChildOrganizationInput create;
        private PartyNameWhereUniqueInput connect;

        public PartyNameCreateOneWithoutChildOrganizationInput() {}

        public PartyNameCreateWithoutChildOrganizationInput getCreate() { return this.create; }
        public PartyNameWhereUniqueInput getConnect() { return this.connect; }
        public void setCreate(PartyNameCreateWithoutChildOrganizationInput create) { this.create = create; }
        public void setConnect(PartyNameWhereUniqueInput connect) { this.connect = connect; }
    }
    public static class StringFieldUpdateOperationsInput {
        private String set;

        public StringFieldUpdateOperationsInput() {}

        public String getSet() { return this.set; }
        public void setSet(String set) { this.set = set; }
    }
    public static class NullableStringFieldUpdateOperationsInput {
        private String set;

        public NullableStringFieldUpdateOperationsInput() {}

        public String getSet() { return this.set; }
        public void setSet(String set) { this.set = set; }
    }
    public static class NullableIntFieldUpdateOperationsInput {
        private Integer set;

        public NullableIntFieldUpdateOperationsInput() {}

        public Integer getSet() { return this.set; }
        public void setSet(Integer set) { this.set = set; }
    }
    public static class PartyUpdateOneWithoutChildOrganizationInput {
        private PartyCreateWithoutChildOrganizationInput create;
        private PartyWhereUniqueInput connect;
        private Boolean disconnect;
        private Boolean delete;
        private PartyUpdateWithoutChildOrganizationDataInput update;
        private PartyUpsertWithoutChildOrganizationInput upsert;

        public PartyUpdateOneWithoutChildOrganizationInput() {}

        public PartyCreateWithoutChildOrganizationInput getCreate() { return this.create; }
        public PartyWhereUniqueInput getConnect() { return this.connect; }
        public Boolean getDisconnect() { return this.disconnect; }
        public Boolean getDelete() { return this.delete; }
        public PartyUpdateWithoutChildOrganizationDataInput getUpdate() { return this.update; }
        public PartyUpsertWithoutChildOrganizationInput getUpsert() { return this.upsert; }
        public void setCreate(PartyCreateWithoutChildOrganizationInput create) { this.create = create; }
        public void setConnect(PartyWhereUniqueInput connect) { this.connect = connect; }
        public void setDisconnect(Boolean disconnect) { this.disconnect = disconnect; }
        public void setDelete(Boolean delete) { this.delete = delete; }
        public void setUpdate(PartyUpdateWithoutChildOrganizationDataInput update) { this.update = update; }
        public void setUpsert(PartyUpsertWithoutChildOrganizationInput upsert) { this.upsert = upsert; }
    }
    public static class PartyNameUpdateOneWithoutChildOrganizationInput {
        private PartyNameCreateWithoutChildOrganizationInput create;
        private PartyNameWhereUniqueInput connect;
        private Boolean disconnect;
        private Boolean delete;
        private PartyNameUpdateWithoutChildOrganizationDataInput update;
        private PartyNameUpsertWithoutChildOrganizationInput upsert;

        public PartyNameUpdateOneWithoutChildOrganizationInput() {}

        public PartyNameCreateWithoutChildOrganizationInput getCreate() { return this.create; }
        public PartyNameWhereUniqueInput getConnect() { return this.connect; }
        public Boolean getDisconnect() { return this.disconnect; }
        public Boolean getDelete() { return this.delete; }
        public PartyNameUpdateWithoutChildOrganizationDataInput getUpdate() { return this.update; }
        public PartyNameUpsertWithoutChildOrganizationInput getUpsert() { return this.upsert; }
        public void setCreate(PartyNameCreateWithoutChildOrganizationInput create) { this.create = create; }
        public void setConnect(PartyNameWhereUniqueInput connect) { this.connect = connect; }
        public void setDisconnect(Boolean disconnect) { this.disconnect = disconnect; }
        public void setDelete(Boolean delete) { this.delete = delete; }
        public void setUpdate(PartyNameUpdateWithoutChildOrganizationDataInput update) { this.update = update; }
        public void setUpsert(PartyNameUpsertWithoutChildOrganizationInput upsert) { this.upsert = upsert; }
    }
    public static class PersonCreateManyWithoutPartyInput {
        private Iterable<PersonCreateWithoutPartyInput> create;
        private Iterable<PersonWhereUniqueInput> connect;

        public PersonCreateManyWithoutPartyInput() {}

        public Iterable<PersonCreateWithoutPartyInput> getCreate() { return this.create; }
        public Iterable<PersonWhereUniqueInput> getConnect() { return this.connect; }
        public void setCreate(Iterable<PersonCreateWithoutPartyInput> create) { this.create = create; }
        public void setConnect(Iterable<PersonWhereUniqueInput> connect) { this.connect = connect; }
    }
    public static class PartyNameCreateManyWithoutPartyInput {
        private Iterable<PartyNameCreateWithoutPartyInput> create;
        private Iterable<PartyNameWhereUniqueInput> connect;

        public PartyNameCreateManyWithoutPartyInput() {}

        public Iterable<PartyNameCreateWithoutPartyInput> getCreate() { return this.create; }
        public Iterable<PartyNameWhereUniqueInput> getConnect() { return this.connect; }
        public void setCreate(Iterable<PartyNameCreateWithoutPartyInput> create) { this.create = create; }
        public void setConnect(Iterable<PartyNameWhereUniqueInput> connect) { this.connect = connect; }
    }
    public static class ChildOrganizationCreateManyWithoutPartyInput {
        private Iterable<ChildOrganizationCreateWithoutPartyInput> create;
        private Iterable<ChildOrganizationWhereUniqueInput> connect;

        public ChildOrganizationCreateManyWithoutPartyInput() {}

        public Iterable<ChildOrganizationCreateWithoutPartyInput> getCreate() { return this.create; }
        public Iterable<ChildOrganizationWhereUniqueInput> getConnect() { return this.connect; }
        public void setCreate(Iterable<ChildOrganizationCreateWithoutPartyInput> create) { this.create = create; }
        public void setConnect(Iterable<ChildOrganizationWhereUniqueInput> connect) { this.connect = connect; }
    }
    public static class PersonUpdateManyWithoutPartyInput {
        private Iterable<PersonCreateWithoutPartyInput> create;
        private Iterable<PersonWhereUniqueInput> connect;
        private Iterable<PersonWhereUniqueInput> set;
        private Iterable<PersonWhereUniqueInput> disconnect;
        private Iterable<PersonWhereUniqueInput> delete;
        private Iterable<PersonUpdateWithWhereUniqueWithoutPartyInput> update;
        private Iterable<PersonUpdateManyWithWhereNestedInput> updateMany;
        private Iterable<PersonScalarWhereInput> deleteMany;
        private Iterable<PersonUpsertWithWhereUniqueWithoutPartyInput> upsert;

        public PersonUpdateManyWithoutPartyInput() {}

        public Iterable<PersonCreateWithoutPartyInput> getCreate() { return this.create; }
        public Iterable<PersonWhereUniqueInput> getConnect() { return this.connect; }
        public Iterable<PersonWhereUniqueInput> getSet() { return this.set; }
        public Iterable<PersonWhereUniqueInput> getDisconnect() { return this.disconnect; }
        public Iterable<PersonWhereUniqueInput> getDelete() { return this.delete; }
        public Iterable<PersonUpdateWithWhereUniqueWithoutPartyInput> getUpdate() { return this.update; }
        public Iterable<PersonUpdateManyWithWhereNestedInput> getUpdateMany() { return this.updateMany; }
        public Iterable<PersonScalarWhereInput> getDeleteMany() { return this.deleteMany; }
        public Iterable<PersonUpsertWithWhereUniqueWithoutPartyInput> getUpsert() { return this.upsert; }
        public void setCreate(Iterable<PersonCreateWithoutPartyInput> create) { this.create = create; }
        public void setConnect(Iterable<PersonWhereUniqueInput> connect) { this.connect = connect; }
        public void setSet(Iterable<PersonWhereUniqueInput> set) { this.set = set; }
        public void setDisconnect(Iterable<PersonWhereUniqueInput> disconnect) { this.disconnect = disconnect; }
        public void setDelete(Iterable<PersonWhereUniqueInput> delete) { this.delete = delete; }
        public void setUpdate(Iterable<PersonUpdateWithWhereUniqueWithoutPartyInput> update) { this.update = update; }
        public void setUpdateMany(Iterable<PersonUpdateManyWithWhereNestedInput> updateMany) { this.updateMany = updateMany; }
        public void setDeleteMany(Iterable<PersonScalarWhereInput> deleteMany) { this.deleteMany = deleteMany; }
        public void setUpsert(Iterable<PersonUpsertWithWhereUniqueWithoutPartyInput> upsert) { this.upsert = upsert; }
    }
    public static class PartyNameUpdateManyWithoutPartyInput {
        private Iterable<PartyNameCreateWithoutPartyInput> create;
        private Iterable<PartyNameWhereUniqueInput> connect;
        private Iterable<PartyNameWhereUniqueInput> set;
        private Iterable<PartyNameWhereUniqueInput> disconnect;
        private Iterable<PartyNameWhereUniqueInput> delete;
        private Iterable<PartyNameUpdateWithWhereUniqueWithoutPartyInput> update;
        private Iterable<PartyNameUpdateManyWithWhereNestedInput> updateMany;
        private Iterable<PartyNameScalarWhereInput> deleteMany;
        private Iterable<PartyNameUpsertWithWhereUniqueWithoutPartyInput> upsert;

        public PartyNameUpdateManyWithoutPartyInput() {}

        public Iterable<PartyNameCreateWithoutPartyInput> getCreate() { return this.create; }
        public Iterable<PartyNameWhereUniqueInput> getConnect() { return this.connect; }
        public Iterable<PartyNameWhereUniqueInput> getSet() { return this.set; }
        public Iterable<PartyNameWhereUniqueInput> getDisconnect() { return this.disconnect; }
        public Iterable<PartyNameWhereUniqueInput> getDelete() { return this.delete; }
        public Iterable<PartyNameUpdateWithWhereUniqueWithoutPartyInput> getUpdate() { return this.update; }
        public Iterable<PartyNameUpdateManyWithWhereNestedInput> getUpdateMany() { return this.updateMany; }
        public Iterable<PartyNameScalarWhereInput> getDeleteMany() { return this.deleteMany; }
        public Iterable<PartyNameUpsertWithWhereUniqueWithoutPartyInput> getUpsert() { return this.upsert; }
        public void setCreate(Iterable<PartyNameCreateWithoutPartyInput> create) { this.create = create; }
        public void setConnect(Iterable<PartyNameWhereUniqueInput> connect) { this.connect = connect; }
        public void setSet(Iterable<PartyNameWhereUniqueInput> set) { this.set = set; }
        public void setDisconnect(Iterable<PartyNameWhereUniqueInput> disconnect) { this.disconnect = disconnect; }
        public void setDelete(Iterable<PartyNameWhereUniqueInput> delete) { this.delete = delete; }
        public void setUpdate(Iterable<PartyNameUpdateWithWhereUniqueWithoutPartyInput> update) { this.update = update; }
        public void setUpdateMany(Iterable<PartyNameUpdateManyWithWhereNestedInput> updateMany) { this.updateMany = updateMany; }
        public void setDeleteMany(Iterable<PartyNameScalarWhereInput> deleteMany) { this.deleteMany = deleteMany; }
        public void setUpsert(Iterable<PartyNameUpsertWithWhereUniqueWithoutPartyInput> upsert) { this.upsert = upsert; }
    }
    public static class ChildOrganizationUpdateManyWithoutPartyInput {
        private Iterable<ChildOrganizationCreateWithoutPartyInput> create;
        private Iterable<ChildOrganizationWhereUniqueInput> connect;
        private Iterable<ChildOrganizationWhereUniqueInput> set;
        private Iterable<ChildOrganizationWhereUniqueInput> disconnect;
        private Iterable<ChildOrganizationWhereUniqueInput> delete;
        private Iterable<ChildOrganizationUpdateWithWhereUniqueWithoutPartyInput> update;
        private Iterable<ChildOrganizationUpdateManyWithWhereNestedInput> updateMany;
        private Iterable<ChildOrganizationScalarWhereInput> deleteMany;
        private Iterable<ChildOrganizationUpsertWithWhereUniqueWithoutPartyInput> upsert;

        public ChildOrganizationUpdateManyWithoutPartyInput() {}

        public Iterable<ChildOrganizationCreateWithoutPartyInput> getCreate() { return this.create; }
        public Iterable<ChildOrganizationWhereUniqueInput> getConnect() { return this.connect; }
        public Iterable<ChildOrganizationWhereUniqueInput> getSet() { return this.set; }
        public Iterable<ChildOrganizationWhereUniqueInput> getDisconnect() { return this.disconnect; }
        public Iterable<ChildOrganizationWhereUniqueInput> getDelete() { return this.delete; }
        public Iterable<ChildOrganizationUpdateWithWhereUniqueWithoutPartyInput> getUpdate() { return this.update; }
        public Iterable<ChildOrganizationUpdateManyWithWhereNestedInput> getUpdateMany() { return this.updateMany; }
        public Iterable<ChildOrganizationScalarWhereInput> getDeleteMany() { return this.deleteMany; }
        public Iterable<ChildOrganizationUpsertWithWhereUniqueWithoutPartyInput> getUpsert() { return this.upsert; }
        public void setCreate(Iterable<ChildOrganizationCreateWithoutPartyInput> create) { this.create = create; }
        public void setConnect(Iterable<ChildOrganizationWhereUniqueInput> connect) { this.connect = connect; }
        public void setSet(Iterable<ChildOrganizationWhereUniqueInput> set) { this.set = set; }
        public void setDisconnect(Iterable<ChildOrganizationWhereUniqueInput> disconnect) { this.disconnect = disconnect; }
        public void setDelete(Iterable<ChildOrganizationWhereUniqueInput> delete) { this.delete = delete; }
        public void setUpdate(Iterable<ChildOrganizationUpdateWithWhereUniqueWithoutPartyInput> update) { this.update = update; }
        public void setUpdateMany(Iterable<ChildOrganizationUpdateManyWithWhereNestedInput> updateMany) { this.updateMany = updateMany; }
        public void setDeleteMany(Iterable<ChildOrganizationScalarWhereInput> deleteMany) { this.deleteMany = deleteMany; }
        public void setUpsert(Iterable<ChildOrganizationUpsertWithWhereUniqueWithoutPartyInput> upsert) { this.upsert = upsert; }
    }
    public static class ChildOrganizationCreateManyWithoutPartyNameInput {
        private Iterable<ChildOrganizationCreateWithoutPartyNameInput> create;
        private Iterable<ChildOrganizationWhereUniqueInput> connect;

        public ChildOrganizationCreateManyWithoutPartyNameInput() {}

        public Iterable<ChildOrganizationCreateWithoutPartyNameInput> getCreate() { return this.create; }
        public Iterable<ChildOrganizationWhereUniqueInput> getConnect() { return this.connect; }
        public void setCreate(Iterable<ChildOrganizationCreateWithoutPartyNameInput> create) { this.create = create; }
        public void setConnect(Iterable<ChildOrganizationWhereUniqueInput> connect) { this.connect = connect; }
    }
    public static class PersonCreateOneWithoutPartyNameInput {
        private PersonCreateWithoutPartyNameInput create;
        private PersonWhereUniqueInput connect;

        public PersonCreateOneWithoutPartyNameInput() {}

        public PersonCreateWithoutPartyNameInput getCreate() { return this.create; }
        public PersonWhereUniqueInput getConnect() { return this.connect; }
        public void setCreate(PersonCreateWithoutPartyNameInput create) { this.create = create; }
        public void setConnect(PersonWhereUniqueInput connect) { this.connect = connect; }
    }
    public static class PartyCreateOneWithoutPartyNameInput {
        private PartyCreateWithoutPartyNameInput create;
        private PartyWhereUniqueInput connect;

        public PartyCreateOneWithoutPartyNameInput() {}

        public PartyCreateWithoutPartyNameInput getCreate() { return this.create; }
        public PartyWhereUniqueInput getConnect() { return this.connect; }
        public void setCreate(PartyCreateWithoutPartyNameInput create) { this.create = create; }
        public void setConnect(PartyWhereUniqueInput connect) { this.connect = connect; }
    }
    public static class NullableBoolFieldUpdateOperationsInput {
        private Boolean set;

        public NullableBoolFieldUpdateOperationsInput() {}

        public Boolean getSet() { return this.set; }
        public void setSet(Boolean set) { this.set = set; }
    }
    public static class ChildOrganizationUpdateManyWithoutPartyNameInput {
        private Iterable<ChildOrganizationCreateWithoutPartyNameInput> create;
        private Iterable<ChildOrganizationWhereUniqueInput> connect;
        private Iterable<ChildOrganizationWhereUniqueInput> set;
        private Iterable<ChildOrganizationWhereUniqueInput> disconnect;
        private Iterable<ChildOrganizationWhereUniqueInput> delete;
        private Iterable<ChildOrganizationUpdateWithWhereUniqueWithoutPartyNameInput> update;
        private Iterable<ChildOrganizationUpdateManyWithWhereNestedInput> updateMany;
        private Iterable<ChildOrganizationScalarWhereInput> deleteMany;
        private Iterable<ChildOrganizationUpsertWithWhereUniqueWithoutPartyNameInput> upsert;

        public ChildOrganizationUpdateManyWithoutPartyNameInput() {}

        public Iterable<ChildOrganizationCreateWithoutPartyNameInput> getCreate() { return this.create; }
        public Iterable<ChildOrganizationWhereUniqueInput> getConnect() { return this.connect; }
        public Iterable<ChildOrganizationWhereUniqueInput> getSet() { return this.set; }
        public Iterable<ChildOrganizationWhereUniqueInput> getDisconnect() { return this.disconnect; }
        public Iterable<ChildOrganizationWhereUniqueInput> getDelete() { return this.delete; }
        public Iterable<ChildOrganizationUpdateWithWhereUniqueWithoutPartyNameInput> getUpdate() { return this.update; }
        public Iterable<ChildOrganizationUpdateManyWithWhereNestedInput> getUpdateMany() { return this.updateMany; }
        public Iterable<ChildOrganizationScalarWhereInput> getDeleteMany() { return this.deleteMany; }
        public Iterable<ChildOrganizationUpsertWithWhereUniqueWithoutPartyNameInput> getUpsert() { return this.upsert; }
        public void setCreate(Iterable<ChildOrganizationCreateWithoutPartyNameInput> create) { this.create = create; }
        public void setConnect(Iterable<ChildOrganizationWhereUniqueInput> connect) { this.connect = connect; }
        public void setSet(Iterable<ChildOrganizationWhereUniqueInput> set) { this.set = set; }
        public void setDisconnect(Iterable<ChildOrganizationWhereUniqueInput> disconnect) { this.disconnect = disconnect; }
        public void setDelete(Iterable<ChildOrganizationWhereUniqueInput> delete) { this.delete = delete; }
        public void setUpdate(Iterable<ChildOrganizationUpdateWithWhereUniqueWithoutPartyNameInput> update) { this.update = update; }
        public void setUpdateMany(Iterable<ChildOrganizationUpdateManyWithWhereNestedInput> updateMany) { this.updateMany = updateMany; }
        public void setDeleteMany(Iterable<ChildOrganizationScalarWhereInput> deleteMany) { this.deleteMany = deleteMany; }
        public void setUpsert(Iterable<ChildOrganizationUpsertWithWhereUniqueWithoutPartyNameInput> upsert) { this.upsert = upsert; }
    }
    public static class PersonUpdateOneWithoutPartyNameInput {
        private PersonCreateWithoutPartyNameInput create;
        private PersonWhereUniqueInput connect;
        private Boolean disconnect;
        private Boolean delete;
        private PersonUpdateWithoutPartyNameDataInput update;
        private PersonUpsertWithoutPartyNameInput upsert;

        public PersonUpdateOneWithoutPartyNameInput() {}

        public PersonCreateWithoutPartyNameInput getCreate() { return this.create; }
        public PersonWhereUniqueInput getConnect() { return this.connect; }
        public Boolean getDisconnect() { return this.disconnect; }
        public Boolean getDelete() { return this.delete; }
        public PersonUpdateWithoutPartyNameDataInput getUpdate() { return this.update; }
        public PersonUpsertWithoutPartyNameInput getUpsert() { return this.upsert; }
        public void setCreate(PersonCreateWithoutPartyNameInput create) { this.create = create; }
        public void setConnect(PersonWhereUniqueInput connect) { this.connect = connect; }
        public void setDisconnect(Boolean disconnect) { this.disconnect = disconnect; }
        public void setDelete(Boolean delete) { this.delete = delete; }
        public void setUpdate(PersonUpdateWithoutPartyNameDataInput update) { this.update = update; }
        public void setUpsert(PersonUpsertWithoutPartyNameInput upsert) { this.upsert = upsert; }
    }
    public static class PartyUpdateOneWithoutPartyNameInput {
        private PartyCreateWithoutPartyNameInput create;
        private PartyWhereUniqueInput connect;
        private Boolean disconnect;
        private Boolean delete;
        private PartyUpdateWithoutPartyNameDataInput update;
        private PartyUpsertWithoutPartyNameInput upsert;

        public PartyUpdateOneWithoutPartyNameInput() {}

        public PartyCreateWithoutPartyNameInput getCreate() { return this.create; }
        public PartyWhereUniqueInput getConnect() { return this.connect; }
        public Boolean getDisconnect() { return this.disconnect; }
        public Boolean getDelete() { return this.delete; }
        public PartyUpdateWithoutPartyNameDataInput getUpdate() { return this.update; }
        public PartyUpsertWithoutPartyNameInput getUpsert() { return this.upsert; }
        public void setCreate(PartyCreateWithoutPartyNameInput create) { this.create = create; }
        public void setConnect(PartyWhereUniqueInput connect) { this.connect = connect; }
        public void setDisconnect(Boolean disconnect) { this.disconnect = disconnect; }
        public void setDelete(Boolean delete) { this.delete = delete; }
        public void setUpdate(PartyUpdateWithoutPartyNameDataInput update) { this.update = update; }
        public void setUpsert(PartyUpsertWithoutPartyNameInput upsert) { this.upsert = upsert; }
    }
    public static class PartyNameCreateManyWithoutPersonInput {
        private Iterable<PartyNameCreateWithoutPersonInput> create;
        private Iterable<PartyNameWhereUniqueInput> connect;

        public PartyNameCreateManyWithoutPersonInput() {}

        public Iterable<PartyNameCreateWithoutPersonInput> getCreate() { return this.create; }
        public Iterable<PartyNameWhereUniqueInput> getConnect() { return this.connect; }
        public void setCreate(Iterable<PartyNameCreateWithoutPersonInput> create) { this.create = create; }
        public void setConnect(Iterable<PartyNameWhereUniqueInput> connect) { this.connect = connect; }
    }
    public static class PartyCreateOneWithoutPersonInput {
        private PartyCreateWithoutPersonInput create;
        private PartyWhereUniqueInput connect;

        public PartyCreateOneWithoutPersonInput() {}

        public PartyCreateWithoutPersonInput getCreate() { return this.create; }
        public PartyWhereUniqueInput getConnect() { return this.connect; }
        public void setCreate(PartyCreateWithoutPersonInput create) { this.create = create; }
        public void setConnect(PartyWhereUniqueInput connect) { this.connect = connect; }
    }
    public static class PartyNameUpdateManyWithoutPersonInput {
        private Iterable<PartyNameCreateWithoutPersonInput> create;
        private Iterable<PartyNameWhereUniqueInput> connect;
        private Iterable<PartyNameWhereUniqueInput> set;
        private Iterable<PartyNameWhereUniqueInput> disconnect;
        private Iterable<PartyNameWhereUniqueInput> delete;
        private Iterable<PartyNameUpdateWithWhereUniqueWithoutPersonInput> update;
        private Iterable<PartyNameUpdateManyWithWhereNestedInput> updateMany;
        private Iterable<PartyNameScalarWhereInput> deleteMany;
        private Iterable<PartyNameUpsertWithWhereUniqueWithoutPersonInput> upsert;

        public PartyNameUpdateManyWithoutPersonInput() {}

        public Iterable<PartyNameCreateWithoutPersonInput> getCreate() { return this.create; }
        public Iterable<PartyNameWhereUniqueInput> getConnect() { return this.connect; }
        public Iterable<PartyNameWhereUniqueInput> getSet() { return this.set; }
        public Iterable<PartyNameWhereUniqueInput> getDisconnect() { return this.disconnect; }
        public Iterable<PartyNameWhereUniqueInput> getDelete() { return this.delete; }
        public Iterable<PartyNameUpdateWithWhereUniqueWithoutPersonInput> getUpdate() { return this.update; }
        public Iterable<PartyNameUpdateManyWithWhereNestedInput> getUpdateMany() { return this.updateMany; }
        public Iterable<PartyNameScalarWhereInput> getDeleteMany() { return this.deleteMany; }
        public Iterable<PartyNameUpsertWithWhereUniqueWithoutPersonInput> getUpsert() { return this.upsert; }
        public void setCreate(Iterable<PartyNameCreateWithoutPersonInput> create) { this.create = create; }
        public void setConnect(Iterable<PartyNameWhereUniqueInput> connect) { this.connect = connect; }
        public void setSet(Iterable<PartyNameWhereUniqueInput> set) { this.set = set; }
        public void setDisconnect(Iterable<PartyNameWhereUniqueInput> disconnect) { this.disconnect = disconnect; }
        public void setDelete(Iterable<PartyNameWhereUniqueInput> delete) { this.delete = delete; }
        public void setUpdate(Iterable<PartyNameUpdateWithWhereUniqueWithoutPersonInput> update) { this.update = update; }
        public void setUpdateMany(Iterable<PartyNameUpdateManyWithWhereNestedInput> updateMany) { this.updateMany = updateMany; }
        public void setDeleteMany(Iterable<PartyNameScalarWhereInput> deleteMany) { this.deleteMany = deleteMany; }
        public void setUpsert(Iterable<PartyNameUpsertWithWhereUniqueWithoutPersonInput> upsert) { this.upsert = upsert; }
    }
    public static class PartyUpdateOneWithoutPersonInput {
        private PartyCreateWithoutPersonInput create;
        private PartyWhereUniqueInput connect;
        private Boolean disconnect;
        private Boolean delete;
        private PartyUpdateWithoutPersonDataInput update;
        private PartyUpsertWithoutPersonInput upsert;

        public PartyUpdateOneWithoutPersonInput() {}

        public PartyCreateWithoutPersonInput getCreate() { return this.create; }
        public PartyWhereUniqueInput getConnect() { return this.connect; }
        public Boolean getDisconnect() { return this.disconnect; }
        public Boolean getDelete() { return this.delete; }
        public PartyUpdateWithoutPersonDataInput getUpdate() { return this.update; }
        public PartyUpsertWithoutPersonInput getUpsert() { return this.upsert; }
        public void setCreate(PartyCreateWithoutPersonInput create) { this.create = create; }
        public void setConnect(PartyWhereUniqueInput connect) { this.connect = connect; }
        public void setDisconnect(Boolean disconnect) { this.disconnect = disconnect; }
        public void setDelete(Boolean delete) { this.delete = delete; }
        public void setUpdate(PartyUpdateWithoutPersonDataInput update) { this.update = update; }
        public void setUpsert(PartyUpsertWithoutPersonInput upsert) { this.upsert = upsert; }
    }
    public static class NestedStringFilterInput {
        private String equals;
        private Iterable<String> in;
        private Iterable<String> notIn;
        private String lt;
        private String lte;
        private String gt;
        private String gte;
        private String contains;
        private String startsWith;
        private String endsWith;
        private NestedStringFilterInput not;

        public NestedStringFilterInput() {}

        public String getEquals() { return this.equals; }
        public Iterable<String> getIn() { return this.in; }
        public Iterable<String> getNotIn() { return this.notIn; }
        public String getLt() { return this.lt; }
        public String getLte() { return this.lte; }
        public String getGt() { return this.gt; }
        public String getGte() { return this.gte; }
        public String getContains() { return this.contains; }
        public String getStartsWith() { return this.startsWith; }
        public String getEndsWith() { return this.endsWith; }
        public NestedStringFilterInput getNot() { return this.not; }
        public void setEquals(String equals) { this.equals = equals; }
        public void setIn(Iterable<String> in) { this.in = in; }
        public void setNotIn(Iterable<String> notIn) { this.notIn = notIn; }
        public void setLt(String lt) { this.lt = lt; }
        public void setLte(String lte) { this.lte = lte; }
        public void setGt(String gt) { this.gt = gt; }
        public void setGte(String gte) { this.gte = gte; }
        public void setContains(String contains) { this.contains = contains; }
        public void setStartsWith(String startsWith) { this.startsWith = startsWith; }
        public void setEndsWith(String endsWith) { this.endsWith = endsWith; }
        public void setNot(NestedStringFilterInput not) { this.not = not; }
    }
    public static class NestedStringNullableFilterInput {
        private String equals;
        private Iterable<String> in;
        private Iterable<String> notIn;
        private String lt;
        private String lte;
        private String gt;
        private String gte;
        private String contains;
        private String startsWith;
        private String endsWith;
        private NestedStringNullableFilterInput not;

        public NestedStringNullableFilterInput() {}

        public String getEquals() { return this.equals; }
        public Iterable<String> getIn() { return this.in; }
        public Iterable<String> getNotIn() { return this.notIn; }
        public String getLt() { return this.lt; }
        public String getLte() { return this.lte; }
        public String getGt() { return this.gt; }
        public String getGte() { return this.gte; }
        public String getContains() { return this.contains; }
        public String getStartsWith() { return this.startsWith; }
        public String getEndsWith() { return this.endsWith; }
        public NestedStringNullableFilterInput getNot() { return this.not; }
        public void setEquals(String equals) { this.equals = equals; }
        public void setIn(Iterable<String> in) { this.in = in; }
        public void setNotIn(Iterable<String> notIn) { this.notIn = notIn; }
        public void setLt(String lt) { this.lt = lt; }
        public void setLte(String lte) { this.lte = lte; }
        public void setGt(String gt) { this.gt = gt; }
        public void setGte(String gte) { this.gte = gte; }
        public void setContains(String contains) { this.contains = contains; }
        public void setStartsWith(String startsWith) { this.startsWith = startsWith; }
        public void setEndsWith(String endsWith) { this.endsWith = endsWith; }
        public void setNot(NestedStringNullableFilterInput not) { this.not = not; }
    }
    public static class NestedIntNullableFilterInput {
        private Integer equals;
        private Iterable<Integer> in;
        private Iterable<Integer> notIn;
        private Integer lt;
        private Integer lte;
        private Integer gt;
        private Integer gte;
        private NestedIntNullableFilterInput not;

        public NestedIntNullableFilterInput() {}

        public Integer getEquals() { return this.equals; }
        public Iterable<Integer> getIn() { return this.in; }
        public Iterable<Integer> getNotIn() { return this.notIn; }
        public Integer getLt() { return this.lt; }
        public Integer getLte() { return this.lte; }
        public Integer getGt() { return this.gt; }
        public Integer getGte() { return this.gte; }
        public NestedIntNullableFilterInput getNot() { return this.not; }
        public void setEquals(Integer equals) { this.equals = equals; }
        public void setIn(Iterable<Integer> in) { this.in = in; }
        public void setNotIn(Iterable<Integer> notIn) { this.notIn = notIn; }
        public void setLt(Integer lt) { this.lt = lt; }
        public void setLte(Integer lte) { this.lte = lte; }
        public void setGt(Integer gt) { this.gt = gt; }
        public void setGte(Integer gte) { this.gte = gte; }
        public void setNot(NestedIntNullableFilterInput not) { this.not = not; }
    }
    public static class NestedBoolNullableFilterInput {
        private Boolean equals;
        private NestedBoolNullableFilterInput not;

        public NestedBoolNullableFilterInput() {}

        public Boolean getEquals() { return this.equals; }
        public NestedBoolNullableFilterInput getNot() { return this.not; }
        public void setEquals(Boolean equals) { this.equals = equals; }
        public void setNot(NestedBoolNullableFilterInput not) { this.not = not; }
    }
    public static class PartyCreateWithoutChildOrganizationInput {
        private String id;
        private String basicDataCompleteCode;
        private String creationDateTime;
        private String informationModelObjectKind;
        private String partyKey;
        private String partyKind;
        private String typeName;
        private String txGlobalTypeName;
        private String txTypeCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private PersonCreateManyWithoutPartyInput Person;
        private PartyNameCreateManyWithoutPartyInput PartyName;

        public PartyCreateWithoutChildOrganizationInput() {}

        public String getId() { return this.id; }
        public String getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public String getCreationDateTime() { return this.creationDateTime; }
        public String getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public String getPartyKey() { return this.partyKey; }
        public String getPartyKind() { return this.partyKind; }
        public String getTypeName() { return this.typeName; }
        public String getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public String getTxTypeCode() { return this.txTypeCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PersonCreateManyWithoutPartyInput getPerson() { return this.Person; }
        public PartyNameCreateManyWithoutPartyInput getPartyName() { return this.PartyName; }
        public void setId(String id) { this.id = id; }
        public void setBasicDataCompleteCode(String basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(String creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setInformationModelObjectKind(String informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setPartyKey(String partyKey) { this.partyKey = partyKey; }
        public void setPartyKind(String partyKind) { this.partyKind = partyKind; }
        public void setTypeName(String typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(String txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(String txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPerson(PersonCreateManyWithoutPartyInput Person) { this.Person = Person; }
        public void setPartyName(PartyNameCreateManyWithoutPartyInput PartyName) { this.PartyName = PartyName; }
    }
    public static class PartyNameCreateWithoutChildOrganizationInput {
        private String id;
        private String basicDataCompleteCode;
        private String creationDateTime;
        private Boolean defaultIndicator;
        private String description;
        private String effectivePeriodStart;
        private String effectivePeriodEnd;
        private String fullName;
        private String givenName;
        private String informationModelObjectKind;
        private String middleName;
        private String ownerPartyKey;
        private String partyNameKey;
        private String partyNameKind;
        private String prefixTitleCode;
        private String suffix;
        private String surname;
        private String typeName;
        private String usageCode;
        private String utilizedLanguageLanguageKey;
        private String txGlobalTypeName;
        private String txTypeCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private String CompanyId;
        private String OrganizationUnitId;
        private PersonCreateOneWithoutPartyNameInput Person;
        private PartyCreateOneWithoutPartyNameInput Party;

        public PartyNameCreateWithoutChildOrganizationInput() {}

        public String getId() { return this.id; }
        public String getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public String getCreationDateTime() { return this.creationDateTime; }
        public Boolean getDefaultIndicator() { return this.defaultIndicator; }
        public String getDescription() { return this.description; }
        public String getEffectivePeriodStart() { return this.effectivePeriodStart; }
        public String getEffectivePeriodEnd() { return this.effectivePeriodEnd; }
        public String getFullName() { return this.fullName; }
        public String getGivenName() { return this.givenName; }
        public String getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public String getMiddleName() { return this.middleName; }
        public String getOwnerPartyKey() { return this.ownerPartyKey; }
        public String getPartyNameKey() { return this.partyNameKey; }
        public String getPartyNameKind() { return this.partyNameKind; }
        public String getPrefixTitleCode() { return this.prefixTitleCode; }
        public String getSuffix() { return this.suffix; }
        public String getSurname() { return this.surname; }
        public String getTypeName() { return this.typeName; }
        public String getUsageCode() { return this.usageCode; }
        public String getUtilizedLanguageLanguageKey() { return this.utilizedLanguageLanguageKey; }
        public String getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public String getTxTypeCode() { return this.txTypeCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public String getCompanyId() { return this.CompanyId; }
        public String getOrganizationUnitId() { return this.OrganizationUnitId; }
        public PersonCreateOneWithoutPartyNameInput getPerson() { return this.Person; }
        public PartyCreateOneWithoutPartyNameInput getParty() { return this.Party; }
        public void setId(String id) { this.id = id; }
        public void setBasicDataCompleteCode(String basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(String creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDefaultIndicator(Boolean defaultIndicator) { this.defaultIndicator = defaultIndicator; }
        public void setDescription(String description) { this.description = description; }
        public void setEffectivePeriodStart(String effectivePeriodStart) { this.effectivePeriodStart = effectivePeriodStart; }
        public void setEffectivePeriodEnd(String effectivePeriodEnd) { this.effectivePeriodEnd = effectivePeriodEnd; }
        public void setFullName(String fullName) { this.fullName = fullName; }
        public void setGivenName(String givenName) { this.givenName = givenName; }
        public void setInformationModelObjectKind(String informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setMiddleName(String middleName) { this.middleName = middleName; }
        public void setOwnerPartyKey(String ownerPartyKey) { this.ownerPartyKey = ownerPartyKey; }
        public void setPartyNameKey(String partyNameKey) { this.partyNameKey = partyNameKey; }
        public void setPartyNameKind(String partyNameKind) { this.partyNameKind = partyNameKind; }
        public void setPrefixTitleCode(String prefixTitleCode) { this.prefixTitleCode = prefixTitleCode; }
        public void setSuffix(String suffix) { this.suffix = suffix; }
        public void setSurname(String surname) { this.surname = surname; }
        public void setTypeName(String typeName) { this.typeName = typeName; }
        public void setUsageCode(String usageCode) { this.usageCode = usageCode; }
        public void setUtilizedLanguageLanguageKey(String utilizedLanguageLanguageKey) { this.utilizedLanguageLanguageKey = utilizedLanguageLanguageKey; }
        public void setTxGlobalTypeName(String txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(String txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setCompanyId(String CompanyId) { this.CompanyId = CompanyId; }
        public void setOrganizationUnitId(String OrganizationUnitId) { this.OrganizationUnitId = OrganizationUnitId; }
        public void setPerson(PersonCreateOneWithoutPartyNameInput Person) { this.Person = Person; }
        public void setParty(PartyCreateOneWithoutPartyNameInput Party) { this.Party = Party; }
    }
    public static class PartyUpdateWithoutChildOrganizationDataInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput partyKey;
        private NullableStringFieldUpdateOperationsInput partyKind;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private PersonUpdateManyWithoutPartyInput Person;
        private PartyNameUpdateManyWithoutPartyInput PartyName;

        public PartyUpdateWithoutChildOrganizationDataInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getPartyKey() { return this.partyKey; }
        public NullableStringFieldUpdateOperationsInput getPartyKind() { return this.partyKind; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PersonUpdateManyWithoutPartyInput getPerson() { return this.Person; }
        public PartyNameUpdateManyWithoutPartyInput getPartyName() { return this.PartyName; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setPartyKey(NullableStringFieldUpdateOperationsInput partyKey) { this.partyKey = partyKey; }
        public void setPartyKind(NullableStringFieldUpdateOperationsInput partyKind) { this.partyKind = partyKind; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPerson(PersonUpdateManyWithoutPartyInput Person) { this.Person = Person; }
        public void setPartyName(PartyNameUpdateManyWithoutPartyInput PartyName) { this.PartyName = PartyName; }
    }
    public static class PartyUpsertWithoutChildOrganizationInput {
        private PartyUpdateWithoutChildOrganizationDataInput update;
        private PartyCreateWithoutChildOrganizationInput create;

        public PartyUpsertWithoutChildOrganizationInput() {}

        public PartyUpdateWithoutChildOrganizationDataInput getUpdate() { return this.update; }
        public PartyCreateWithoutChildOrganizationInput getCreate() { return this.create; }
        public void setUpdate(PartyUpdateWithoutChildOrganizationDataInput update) { this.update = update; }
        public void setCreate(PartyCreateWithoutChildOrganizationInput create) { this.create = create; }
    }
    public static class PartyNameUpdateWithoutChildOrganizationDataInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableBoolFieldUpdateOperationsInput defaultIndicator;
        private NullableStringFieldUpdateOperationsInput description;
        private NullableStringFieldUpdateOperationsInput effectivePeriodStart;
        private NullableStringFieldUpdateOperationsInput effectivePeriodEnd;
        private NullableStringFieldUpdateOperationsInput fullName;
        private NullableStringFieldUpdateOperationsInput givenName;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput middleName;
        private NullableStringFieldUpdateOperationsInput ownerPartyKey;
        private NullableStringFieldUpdateOperationsInput partyNameKey;
        private NullableStringFieldUpdateOperationsInput partyNameKind;
        private NullableStringFieldUpdateOperationsInput prefixTitleCode;
        private NullableStringFieldUpdateOperationsInput suffix;
        private NullableStringFieldUpdateOperationsInput surname;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput usageCode;
        private NullableStringFieldUpdateOperationsInput utilizedLanguageLanguageKey;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private NullableStringFieldUpdateOperationsInput CompanyId;
        private NullableStringFieldUpdateOperationsInput OrganizationUnitId;
        private PersonUpdateOneWithoutPartyNameInput Person;
        private PartyUpdateOneWithoutPartyNameInput Party;

        public PartyNameUpdateWithoutChildOrganizationDataInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableBoolFieldUpdateOperationsInput getDefaultIndicator() { return this.defaultIndicator; }
        public NullableStringFieldUpdateOperationsInput getDescription() { return this.description; }
        public NullableStringFieldUpdateOperationsInput getEffectivePeriodStart() { return this.effectivePeriodStart; }
        public NullableStringFieldUpdateOperationsInput getEffectivePeriodEnd() { return this.effectivePeriodEnd; }
        public NullableStringFieldUpdateOperationsInput getFullName() { return this.fullName; }
        public NullableStringFieldUpdateOperationsInput getGivenName() { return this.givenName; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getMiddleName() { return this.middleName; }
        public NullableStringFieldUpdateOperationsInput getOwnerPartyKey() { return this.ownerPartyKey; }
        public NullableStringFieldUpdateOperationsInput getPartyNameKey() { return this.partyNameKey; }
        public NullableStringFieldUpdateOperationsInput getPartyNameKind() { return this.partyNameKind; }
        public NullableStringFieldUpdateOperationsInput getPrefixTitleCode() { return this.prefixTitleCode; }
        public NullableStringFieldUpdateOperationsInput getSuffix() { return this.suffix; }
        public NullableStringFieldUpdateOperationsInput getSurname() { return this.surname; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getUsageCode() { return this.usageCode; }
        public NullableStringFieldUpdateOperationsInput getUtilizedLanguageLanguageKey() { return this.utilizedLanguageLanguageKey; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public NullableStringFieldUpdateOperationsInput getCompanyId() { return this.CompanyId; }
        public NullableStringFieldUpdateOperationsInput getOrganizationUnitId() { return this.OrganizationUnitId; }
        public PersonUpdateOneWithoutPartyNameInput getPerson() { return this.Person; }
        public PartyUpdateOneWithoutPartyNameInput getParty() { return this.Party; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDefaultIndicator(NullableBoolFieldUpdateOperationsInput defaultIndicator) { this.defaultIndicator = defaultIndicator; }
        public void setDescription(NullableStringFieldUpdateOperationsInput description) { this.description = description; }
        public void setEffectivePeriodStart(NullableStringFieldUpdateOperationsInput effectivePeriodStart) { this.effectivePeriodStart = effectivePeriodStart; }
        public void setEffectivePeriodEnd(NullableStringFieldUpdateOperationsInput effectivePeriodEnd) { this.effectivePeriodEnd = effectivePeriodEnd; }
        public void setFullName(NullableStringFieldUpdateOperationsInput fullName) { this.fullName = fullName; }
        public void setGivenName(NullableStringFieldUpdateOperationsInput givenName) { this.givenName = givenName; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setMiddleName(NullableStringFieldUpdateOperationsInput middleName) { this.middleName = middleName; }
        public void setOwnerPartyKey(NullableStringFieldUpdateOperationsInput ownerPartyKey) { this.ownerPartyKey = ownerPartyKey; }
        public void setPartyNameKey(NullableStringFieldUpdateOperationsInput partyNameKey) { this.partyNameKey = partyNameKey; }
        public void setPartyNameKind(NullableStringFieldUpdateOperationsInput partyNameKind) { this.partyNameKind = partyNameKind; }
        public void setPrefixTitleCode(NullableStringFieldUpdateOperationsInput prefixTitleCode) { this.prefixTitleCode = prefixTitleCode; }
        public void setSuffix(NullableStringFieldUpdateOperationsInput suffix) { this.suffix = suffix; }
        public void setSurname(NullableStringFieldUpdateOperationsInput surname) { this.surname = surname; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setUsageCode(NullableStringFieldUpdateOperationsInput usageCode) { this.usageCode = usageCode; }
        public void setUtilizedLanguageLanguageKey(NullableStringFieldUpdateOperationsInput utilizedLanguageLanguageKey) { this.utilizedLanguageLanguageKey = utilizedLanguageLanguageKey; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setCompanyId(NullableStringFieldUpdateOperationsInput CompanyId) { this.CompanyId = CompanyId; }
        public void setOrganizationUnitId(NullableStringFieldUpdateOperationsInput OrganizationUnitId) { this.OrganizationUnitId = OrganizationUnitId; }
        public void setPerson(PersonUpdateOneWithoutPartyNameInput Person) { this.Person = Person; }
        public void setParty(PartyUpdateOneWithoutPartyNameInput Party) { this.Party = Party; }
    }
    public static class PartyNameUpsertWithoutChildOrganizationInput {
        private PartyNameUpdateWithoutChildOrganizationDataInput update;
        private PartyNameCreateWithoutChildOrganizationInput create;

        public PartyNameUpsertWithoutChildOrganizationInput() {}

        public PartyNameUpdateWithoutChildOrganizationDataInput getUpdate() { return this.update; }
        public PartyNameCreateWithoutChildOrganizationInput getCreate() { return this.create; }
        public void setUpdate(PartyNameUpdateWithoutChildOrganizationDataInput update) { this.update = update; }
        public void setCreate(PartyNameCreateWithoutChildOrganizationInput create) { this.create = create; }
    }
    public static class PersonCreateWithoutPartyInput {
        private String id;
        private String birthDateTime;
        private String bloodTypeCode;
        private Boolean deathIndicator;
        private String ethnicityCode;
        private String genderCode;
        private String maritalStatusCode;
        private String missingDateTime;
        private Boolean missingIndicator;
        private String partyKey;
        private String primaryLanguageLanguageKey;
        private String txGlobalGenderCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private PartyNameCreateManyWithoutPersonInput PartyName;

        public PersonCreateWithoutPartyInput() {}

        public String getId() { return this.id; }
        public String getBirthDateTime() { return this.birthDateTime; }
        public String getBloodTypeCode() { return this.bloodTypeCode; }
        public Boolean getDeathIndicator() { return this.deathIndicator; }
        public String getEthnicityCode() { return this.ethnicityCode; }
        public String getGenderCode() { return this.genderCode; }
        public String getMaritalStatusCode() { return this.maritalStatusCode; }
        public String getMissingDateTime() { return this.missingDateTime; }
        public Boolean getMissingIndicator() { return this.missingIndicator; }
        public String getPartyKey() { return this.partyKey; }
        public String getPrimaryLanguageLanguageKey() { return this.primaryLanguageLanguageKey; }
        public String getTxGlobalGenderCode() { return this.txGlobalGenderCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyNameCreateManyWithoutPersonInput getPartyName() { return this.PartyName; }
        public void setId(String id) { this.id = id; }
        public void setBirthDateTime(String birthDateTime) { this.birthDateTime = birthDateTime; }
        public void setBloodTypeCode(String bloodTypeCode) { this.bloodTypeCode = bloodTypeCode; }
        public void setDeathIndicator(Boolean deathIndicator) { this.deathIndicator = deathIndicator; }
        public void setEthnicityCode(String ethnicityCode) { this.ethnicityCode = ethnicityCode; }
        public void setGenderCode(String genderCode) { this.genderCode = genderCode; }
        public void setMaritalStatusCode(String maritalStatusCode) { this.maritalStatusCode = maritalStatusCode; }
        public void setMissingDateTime(String missingDateTime) { this.missingDateTime = missingDateTime; }
        public void setMissingIndicator(Boolean missingIndicator) { this.missingIndicator = missingIndicator; }
        public void setPartyKey(String partyKey) { this.partyKey = partyKey; }
        public void setPrimaryLanguageLanguageKey(String primaryLanguageLanguageKey) { this.primaryLanguageLanguageKey = primaryLanguageLanguageKey; }
        public void setTxGlobalGenderCode(String txGlobalGenderCode) { this.txGlobalGenderCode = txGlobalGenderCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPartyName(PartyNameCreateManyWithoutPersonInput PartyName) { this.PartyName = PartyName; }
    }
    public static class PartyNameCreateWithoutPartyInput {
        private String id;
        private String basicDataCompleteCode;
        private String creationDateTime;
        private Boolean defaultIndicator;
        private String description;
        private String effectivePeriodStart;
        private String effectivePeriodEnd;
        private String fullName;
        private String givenName;
        private String informationModelObjectKind;
        private String middleName;
        private String ownerPartyKey;
        private String partyNameKey;
        private String partyNameKind;
        private String prefixTitleCode;
        private String suffix;
        private String surname;
        private String typeName;
        private String usageCode;
        private String utilizedLanguageLanguageKey;
        private String txGlobalTypeName;
        private String txTypeCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private String CompanyId;
        private String OrganizationUnitId;
        private ChildOrganizationCreateManyWithoutPartyNameInput ChildOrganization;
        private PersonCreateOneWithoutPartyNameInput Person;

        public PartyNameCreateWithoutPartyInput() {}

        public String getId() { return this.id; }
        public String getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public String getCreationDateTime() { return this.creationDateTime; }
        public Boolean getDefaultIndicator() { return this.defaultIndicator; }
        public String getDescription() { return this.description; }
        public String getEffectivePeriodStart() { return this.effectivePeriodStart; }
        public String getEffectivePeriodEnd() { return this.effectivePeriodEnd; }
        public String getFullName() { return this.fullName; }
        public String getGivenName() { return this.givenName; }
        public String getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public String getMiddleName() { return this.middleName; }
        public String getOwnerPartyKey() { return this.ownerPartyKey; }
        public String getPartyNameKey() { return this.partyNameKey; }
        public String getPartyNameKind() { return this.partyNameKind; }
        public String getPrefixTitleCode() { return this.prefixTitleCode; }
        public String getSuffix() { return this.suffix; }
        public String getSurname() { return this.surname; }
        public String getTypeName() { return this.typeName; }
        public String getUsageCode() { return this.usageCode; }
        public String getUtilizedLanguageLanguageKey() { return this.utilizedLanguageLanguageKey; }
        public String getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public String getTxTypeCode() { return this.txTypeCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public String getCompanyId() { return this.CompanyId; }
        public String getOrganizationUnitId() { return this.OrganizationUnitId; }
        public ChildOrganizationCreateManyWithoutPartyNameInput getChildOrganization() { return this.ChildOrganization; }
        public PersonCreateOneWithoutPartyNameInput getPerson() { return this.Person; }
        public void setId(String id) { this.id = id; }
        public void setBasicDataCompleteCode(String basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(String creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDefaultIndicator(Boolean defaultIndicator) { this.defaultIndicator = defaultIndicator; }
        public void setDescription(String description) { this.description = description; }
        public void setEffectivePeriodStart(String effectivePeriodStart) { this.effectivePeriodStart = effectivePeriodStart; }
        public void setEffectivePeriodEnd(String effectivePeriodEnd) { this.effectivePeriodEnd = effectivePeriodEnd; }
        public void setFullName(String fullName) { this.fullName = fullName; }
        public void setGivenName(String givenName) { this.givenName = givenName; }
        public void setInformationModelObjectKind(String informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setMiddleName(String middleName) { this.middleName = middleName; }
        public void setOwnerPartyKey(String ownerPartyKey) { this.ownerPartyKey = ownerPartyKey; }
        public void setPartyNameKey(String partyNameKey) { this.partyNameKey = partyNameKey; }
        public void setPartyNameKind(String partyNameKind) { this.partyNameKind = partyNameKind; }
        public void setPrefixTitleCode(String prefixTitleCode) { this.prefixTitleCode = prefixTitleCode; }
        public void setSuffix(String suffix) { this.suffix = suffix; }
        public void setSurname(String surname) { this.surname = surname; }
        public void setTypeName(String typeName) { this.typeName = typeName; }
        public void setUsageCode(String usageCode) { this.usageCode = usageCode; }
        public void setUtilizedLanguageLanguageKey(String utilizedLanguageLanguageKey) { this.utilizedLanguageLanguageKey = utilizedLanguageLanguageKey; }
        public void setTxGlobalTypeName(String txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(String txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setCompanyId(String CompanyId) { this.CompanyId = CompanyId; }
        public void setOrganizationUnitId(String OrganizationUnitId) { this.OrganizationUnitId = OrganizationUnitId; }
        public void setChildOrganization(ChildOrganizationCreateManyWithoutPartyNameInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
        public void setPerson(PersonCreateOneWithoutPartyNameInput Person) { this.Person = Person; }
    }
    public static class ChildOrganizationCreateWithoutPartyInput {
        private String id;
        private String basicDataCompleteCode;
        private String basingPartyRoleInRelationshipSpecificationSpecificationKey;
        private String creationDateTime;
        private String description;
        private String informationModelObjectKind;
        private String namePartyNameKey;
        private String partyRoleInRelationshipKind;
        private String partyRoleKind;
        private String playerRoleRoleKey;
        private String playingPartyPartyKey;
        private String roleKey;
        private String roleKind;
        private String rolePlayerPeriodStart;
        private String rolePlayerPeriodEnd;
        private String typeName;
        private String txGlobalTypeName;
        private String txTypeCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private PartyNameCreateOneWithoutChildOrganizationInput PartyName;

        public ChildOrganizationCreateWithoutPartyInput() {}

        public String getId() { return this.id; }
        public String getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public String getBasingPartyRoleInRelationshipSpecificationSpecificationKey() { return this.basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public String getCreationDateTime() { return this.creationDateTime; }
        public String getDescription() { return this.description; }
        public String getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public String getNamePartyNameKey() { return this.namePartyNameKey; }
        public String getPartyRoleInRelationshipKind() { return this.partyRoleInRelationshipKind; }
        public String getPartyRoleKind() { return this.partyRoleKind; }
        public String getPlayerRoleRoleKey() { return this.playerRoleRoleKey; }
        public String getPlayingPartyPartyKey() { return this.playingPartyPartyKey; }
        public String getRoleKey() { return this.roleKey; }
        public String getRoleKind() { return this.roleKind; }
        public String getRolePlayerPeriodStart() { return this.rolePlayerPeriodStart; }
        public String getRolePlayerPeriodEnd() { return this.rolePlayerPeriodEnd; }
        public String getTypeName() { return this.typeName; }
        public String getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public String getTxTypeCode() { return this.txTypeCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyNameCreateOneWithoutChildOrganizationInput getPartyName() { return this.PartyName; }
        public void setId(String id) { this.id = id; }
        public void setBasicDataCompleteCode(String basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setBasingPartyRoleInRelationshipSpecificationSpecificationKey(String basingPartyRoleInRelationshipSpecificationSpecificationKey) { this.basingPartyRoleInRelationshipSpecificationSpecificationKey = basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public void setCreationDateTime(String creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDescription(String description) { this.description = description; }
        public void setInformationModelObjectKind(String informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setNamePartyNameKey(String namePartyNameKey) { this.namePartyNameKey = namePartyNameKey; }
        public void setPartyRoleInRelationshipKind(String partyRoleInRelationshipKind) { this.partyRoleInRelationshipKind = partyRoleInRelationshipKind; }
        public void setPartyRoleKind(String partyRoleKind) { this.partyRoleKind = partyRoleKind; }
        public void setPlayerRoleRoleKey(String playerRoleRoleKey) { this.playerRoleRoleKey = playerRoleRoleKey; }
        public void setPlayingPartyPartyKey(String playingPartyPartyKey) { this.playingPartyPartyKey = playingPartyPartyKey; }
        public void setRoleKey(String roleKey) { this.roleKey = roleKey; }
        public void setRoleKind(String roleKind) { this.roleKind = roleKind; }
        public void setRolePlayerPeriodStart(String rolePlayerPeriodStart) { this.rolePlayerPeriodStart = rolePlayerPeriodStart; }
        public void setRolePlayerPeriodEnd(String rolePlayerPeriodEnd) { this.rolePlayerPeriodEnd = rolePlayerPeriodEnd; }
        public void setTypeName(String typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(String txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(String txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPartyName(PartyNameCreateOneWithoutChildOrganizationInput PartyName) { this.PartyName = PartyName; }
    }
    public static class PersonUpdateWithWhereUniqueWithoutPartyInput {
        private PersonWhereUniqueInput where;
        private PersonUpdateWithoutPartyDataInput data;

        public PersonUpdateWithWhereUniqueWithoutPartyInput() {}

        public PersonWhereUniqueInput getWhere() { return this.where; }
        public PersonUpdateWithoutPartyDataInput getData() { return this.data; }
        public void setWhere(PersonWhereUniqueInput where) { this.where = where; }
        public void setData(PersonUpdateWithoutPartyDataInput data) { this.data = data; }
    }
    public static class PersonUpdateManyWithWhereNestedInput {
        private PersonScalarWhereInput where;
        private PersonUpdateManyDataInput data;

        public PersonUpdateManyWithWhereNestedInput() {}

        public PersonScalarWhereInput getWhere() { return this.where; }
        public PersonUpdateManyDataInput getData() { return this.data; }
        public void setWhere(PersonScalarWhereInput where) { this.where = where; }
        public void setData(PersonUpdateManyDataInput data) { this.data = data; }
    }
    public static class PersonScalarWhereInput {
        private Iterable<PersonScalarWhereInput> AND;
        private Iterable<PersonScalarWhereInput> OR;
        private Iterable<PersonScalarWhereInput> NOT;
        private StringFilterInput id;
        private StringNullableFilterInput birthDateTime;
        private StringNullableFilterInput bloodTypeCode;
        private BoolNullableFilterInput deathIndicator;
        private StringNullableFilterInput ethnicityCode;
        private StringNullableFilterInput genderCode;
        private StringNullableFilterInput maritalStatusCode;
        private StringNullableFilterInput missingDateTime;
        private BoolNullableFilterInput missingIndicator;
        private StringNullableFilterInput partyKey;
        private StringNullableFilterInput primaryLanguageLanguageKey;
        private StringNullableFilterInput txGlobalGenderCode;
        private StringNullableFilterInput txPrimaryKey;
        private StringNullableFilterInput txMetaSourceKey;
        private StringNullableFilterInput txMetaStartEventTime;
        private StringNullableFilterInput txMetaLoadTime;
        private StringNullableFilterInput txMetaSource;
        private StringNullableFilterInput txMetaCorrection;
        private StringNullableFilterInput txMetaChange;
        private IntNullableFilterInput txMetaAccessFilter;
        private StringNullableFilterInput PartyId;

        public PersonScalarWhereInput() {}

        public Iterable<PersonScalarWhereInput> getAnd() { return this.AND; }
        public Iterable<PersonScalarWhereInput> getOr() { return this.OR; }
        public Iterable<PersonScalarWhereInput> getNot() { return this.NOT; }
        public StringFilterInput getId() { return this.id; }
        public StringNullableFilterInput getBirthDateTime() { return this.birthDateTime; }
        public StringNullableFilterInput getBloodTypeCode() { return this.bloodTypeCode; }
        public BoolNullableFilterInput getDeathIndicator() { return this.deathIndicator; }
        public StringNullableFilterInput getEthnicityCode() { return this.ethnicityCode; }
        public StringNullableFilterInput getGenderCode() { return this.genderCode; }
        public StringNullableFilterInput getMaritalStatusCode() { return this.maritalStatusCode; }
        public StringNullableFilterInput getMissingDateTime() { return this.missingDateTime; }
        public BoolNullableFilterInput getMissingIndicator() { return this.missingIndicator; }
        public StringNullableFilterInput getPartyKey() { return this.partyKey; }
        public StringNullableFilterInput getPrimaryLanguageLanguageKey() { return this.primaryLanguageLanguageKey; }
        public StringNullableFilterInput getTxGlobalGenderCode() { return this.txGlobalGenderCode; }
        public StringNullableFilterInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public StringNullableFilterInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public StringNullableFilterInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public StringNullableFilterInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public StringNullableFilterInput getTxMetaSource() { return this.txMetaSource; }
        public StringNullableFilterInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public StringNullableFilterInput getTxMetaChange() { return this.txMetaChange; }
        public IntNullableFilterInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public StringNullableFilterInput getPartyId() { return this.PartyId; }
        public void setAnd(Iterable<PersonScalarWhereInput> AND) { this.AND = AND; }
        public void setOr(Iterable<PersonScalarWhereInput> OR) { this.OR = OR; }
        public void setNot(Iterable<PersonScalarWhereInput> NOT) { this.NOT = NOT; }
        public void setId(StringFilterInput id) { this.id = id; }
        public void setBirthDateTime(StringNullableFilterInput birthDateTime) { this.birthDateTime = birthDateTime; }
        public void setBloodTypeCode(StringNullableFilterInput bloodTypeCode) { this.bloodTypeCode = bloodTypeCode; }
        public void setDeathIndicator(BoolNullableFilterInput deathIndicator) { this.deathIndicator = deathIndicator; }
        public void setEthnicityCode(StringNullableFilterInput ethnicityCode) { this.ethnicityCode = ethnicityCode; }
        public void setGenderCode(StringNullableFilterInput genderCode) { this.genderCode = genderCode; }
        public void setMaritalStatusCode(StringNullableFilterInput maritalStatusCode) { this.maritalStatusCode = maritalStatusCode; }
        public void setMissingDateTime(StringNullableFilterInput missingDateTime) { this.missingDateTime = missingDateTime; }
        public void setMissingIndicator(BoolNullableFilterInput missingIndicator) { this.missingIndicator = missingIndicator; }
        public void setPartyKey(StringNullableFilterInput partyKey) { this.partyKey = partyKey; }
        public void setPrimaryLanguageLanguageKey(StringNullableFilterInput primaryLanguageLanguageKey) { this.primaryLanguageLanguageKey = primaryLanguageLanguageKey; }
        public void setTxGlobalGenderCode(StringNullableFilterInput txGlobalGenderCode) { this.txGlobalGenderCode = txGlobalGenderCode; }
        public void setTxPrimaryKey(StringNullableFilterInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(StringNullableFilterInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(StringNullableFilterInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(StringNullableFilterInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(StringNullableFilterInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(StringNullableFilterInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(StringNullableFilterInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(IntNullableFilterInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPartyId(StringNullableFilterInput PartyId) { this.PartyId = PartyId; }
    }
    public static class PersonUpsertWithWhereUniqueWithoutPartyInput {
        private PersonWhereUniqueInput where;
        private PersonUpdateWithoutPartyDataInput update;
        private PersonCreateWithoutPartyInput create;

        public PersonUpsertWithWhereUniqueWithoutPartyInput() {}

        public PersonWhereUniqueInput getWhere() { return this.where; }
        public PersonUpdateWithoutPartyDataInput getUpdate() { return this.update; }
        public PersonCreateWithoutPartyInput getCreate() { return this.create; }
        public void setWhere(PersonWhereUniqueInput where) { this.where = where; }
        public void setUpdate(PersonUpdateWithoutPartyDataInput update) { this.update = update; }
        public void setCreate(PersonCreateWithoutPartyInput create) { this.create = create; }
    }
    public static class PartyNameUpdateWithWhereUniqueWithoutPartyInput {
        private PartyNameWhereUniqueInput where;
        private PartyNameUpdateWithoutPartyDataInput data;

        public PartyNameUpdateWithWhereUniqueWithoutPartyInput() {}

        public PartyNameWhereUniqueInput getWhere() { return this.where; }
        public PartyNameUpdateWithoutPartyDataInput getData() { return this.data; }
        public void setWhere(PartyNameWhereUniqueInput where) { this.where = where; }
        public void setData(PartyNameUpdateWithoutPartyDataInput data) { this.data = data; }
    }
    public static class PartyNameUpdateManyWithWhereNestedInput {
        private PartyNameScalarWhereInput where;
        private PartyNameUpdateManyDataInput data;

        public PartyNameUpdateManyWithWhereNestedInput() {}

        public PartyNameScalarWhereInput getWhere() { return this.where; }
        public PartyNameUpdateManyDataInput getData() { return this.data; }
        public void setWhere(PartyNameScalarWhereInput where) { this.where = where; }
        public void setData(PartyNameUpdateManyDataInput data) { this.data = data; }
    }
    public static class PartyNameScalarWhereInput {
        private Iterable<PartyNameScalarWhereInput> AND;
        private Iterable<PartyNameScalarWhereInput> OR;
        private Iterable<PartyNameScalarWhereInput> NOT;
        private StringFilterInput id;
        private StringNullableFilterInput basicDataCompleteCode;
        private StringNullableFilterInput creationDateTime;
        private BoolNullableFilterInput defaultIndicator;
        private StringNullableFilterInput description;
        private StringNullableFilterInput effectivePeriodStart;
        private StringNullableFilterInput effectivePeriodEnd;
        private StringNullableFilterInput fullName;
        private StringNullableFilterInput givenName;
        private StringNullableFilterInput informationModelObjectKind;
        private StringNullableFilterInput middleName;
        private StringNullableFilterInput ownerPartyKey;
        private StringNullableFilterInput partyNameKey;
        private StringNullableFilterInput partyNameKind;
        private StringNullableFilterInput prefixTitleCode;
        private StringNullableFilterInput suffix;
        private StringNullableFilterInput surname;
        private StringNullableFilterInput typeName;
        private StringNullableFilterInput usageCode;
        private StringNullableFilterInput utilizedLanguageLanguageKey;
        private StringNullableFilterInput txGlobalTypeName;
        private StringNullableFilterInput txTypeCode;
        private StringNullableFilterInput txPrimaryKey;
        private StringNullableFilterInput txMetaSourceKey;
        private StringNullableFilterInput txMetaStartEventTime;
        private StringNullableFilterInput txMetaLoadTime;
        private StringNullableFilterInput txMetaSource;
        private StringNullableFilterInput txMetaCorrection;
        private StringNullableFilterInput txMetaChange;
        private IntNullableFilterInput txMetaAccessFilter;
        private StringNullableFilterInput PersonId;
        private StringNullableFilterInput PartyId;
        private StringNullableFilterInput CompanyId;
        private StringNullableFilterInput OrganizationUnitId;

        public PartyNameScalarWhereInput() {}

        public Iterable<PartyNameScalarWhereInput> getAnd() { return this.AND; }
        public Iterable<PartyNameScalarWhereInput> getOr() { return this.OR; }
        public Iterable<PartyNameScalarWhereInput> getNot() { return this.NOT; }
        public StringFilterInput getId() { return this.id; }
        public StringNullableFilterInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public StringNullableFilterInput getCreationDateTime() { return this.creationDateTime; }
        public BoolNullableFilterInput getDefaultIndicator() { return this.defaultIndicator; }
        public StringNullableFilterInput getDescription() { return this.description; }
        public StringNullableFilterInput getEffectivePeriodStart() { return this.effectivePeriodStart; }
        public StringNullableFilterInput getEffectivePeriodEnd() { return this.effectivePeriodEnd; }
        public StringNullableFilterInput getFullName() { return this.fullName; }
        public StringNullableFilterInput getGivenName() { return this.givenName; }
        public StringNullableFilterInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public StringNullableFilterInput getMiddleName() { return this.middleName; }
        public StringNullableFilterInput getOwnerPartyKey() { return this.ownerPartyKey; }
        public StringNullableFilterInput getPartyNameKey() { return this.partyNameKey; }
        public StringNullableFilterInput getPartyNameKind() { return this.partyNameKind; }
        public StringNullableFilterInput getPrefixTitleCode() { return this.prefixTitleCode; }
        public StringNullableFilterInput getSuffix() { return this.suffix; }
        public StringNullableFilterInput getSurname() { return this.surname; }
        public StringNullableFilterInput getTypeName() { return this.typeName; }
        public StringNullableFilterInput getUsageCode() { return this.usageCode; }
        public StringNullableFilterInput getUtilizedLanguageLanguageKey() { return this.utilizedLanguageLanguageKey; }
        public StringNullableFilterInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public StringNullableFilterInput getTxTypeCode() { return this.txTypeCode; }
        public StringNullableFilterInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public StringNullableFilterInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public StringNullableFilterInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public StringNullableFilterInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public StringNullableFilterInput getTxMetaSource() { return this.txMetaSource; }
        public StringNullableFilterInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public StringNullableFilterInput getTxMetaChange() { return this.txMetaChange; }
        public IntNullableFilterInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public StringNullableFilterInput getPersonId() { return this.PersonId; }
        public StringNullableFilterInput getPartyId() { return this.PartyId; }
        public StringNullableFilterInput getCompanyId() { return this.CompanyId; }
        public StringNullableFilterInput getOrganizationUnitId() { return this.OrganizationUnitId; }
        public void setAnd(Iterable<PartyNameScalarWhereInput> AND) { this.AND = AND; }
        public void setOr(Iterable<PartyNameScalarWhereInput> OR) { this.OR = OR; }
        public void setNot(Iterable<PartyNameScalarWhereInput> NOT) { this.NOT = NOT; }
        public void setId(StringFilterInput id) { this.id = id; }
        public void setBasicDataCompleteCode(StringNullableFilterInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(StringNullableFilterInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDefaultIndicator(BoolNullableFilterInput defaultIndicator) { this.defaultIndicator = defaultIndicator; }
        public void setDescription(StringNullableFilterInput description) { this.description = description; }
        public void setEffectivePeriodStart(StringNullableFilterInput effectivePeriodStart) { this.effectivePeriodStart = effectivePeriodStart; }
        public void setEffectivePeriodEnd(StringNullableFilterInput effectivePeriodEnd) { this.effectivePeriodEnd = effectivePeriodEnd; }
        public void setFullName(StringNullableFilterInput fullName) { this.fullName = fullName; }
        public void setGivenName(StringNullableFilterInput givenName) { this.givenName = givenName; }
        public void setInformationModelObjectKind(StringNullableFilterInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setMiddleName(StringNullableFilterInput middleName) { this.middleName = middleName; }
        public void setOwnerPartyKey(StringNullableFilterInput ownerPartyKey) { this.ownerPartyKey = ownerPartyKey; }
        public void setPartyNameKey(StringNullableFilterInput partyNameKey) { this.partyNameKey = partyNameKey; }
        public void setPartyNameKind(StringNullableFilterInput partyNameKind) { this.partyNameKind = partyNameKind; }
        public void setPrefixTitleCode(StringNullableFilterInput prefixTitleCode) { this.prefixTitleCode = prefixTitleCode; }
        public void setSuffix(StringNullableFilterInput suffix) { this.suffix = suffix; }
        public void setSurname(StringNullableFilterInput surname) { this.surname = surname; }
        public void setTypeName(StringNullableFilterInput typeName) { this.typeName = typeName; }
        public void setUsageCode(StringNullableFilterInput usageCode) { this.usageCode = usageCode; }
        public void setUtilizedLanguageLanguageKey(StringNullableFilterInput utilizedLanguageLanguageKey) { this.utilizedLanguageLanguageKey = utilizedLanguageLanguageKey; }
        public void setTxGlobalTypeName(StringNullableFilterInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(StringNullableFilterInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(StringNullableFilterInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(StringNullableFilterInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(StringNullableFilterInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(StringNullableFilterInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(StringNullableFilterInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(StringNullableFilterInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(StringNullableFilterInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(IntNullableFilterInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPersonId(StringNullableFilterInput PersonId) { this.PersonId = PersonId; }
        public void setPartyId(StringNullableFilterInput PartyId) { this.PartyId = PartyId; }
        public void setCompanyId(StringNullableFilterInput CompanyId) { this.CompanyId = CompanyId; }
        public void setOrganizationUnitId(StringNullableFilterInput OrganizationUnitId) { this.OrganizationUnitId = OrganizationUnitId; }
    }
    public static class PartyNameUpsertWithWhereUniqueWithoutPartyInput {
        private PartyNameWhereUniqueInput where;
        private PartyNameUpdateWithoutPartyDataInput update;
        private PartyNameCreateWithoutPartyInput create;

        public PartyNameUpsertWithWhereUniqueWithoutPartyInput() {}

        public PartyNameWhereUniqueInput getWhere() { return this.where; }
        public PartyNameUpdateWithoutPartyDataInput getUpdate() { return this.update; }
        public PartyNameCreateWithoutPartyInput getCreate() { return this.create; }
        public void setWhere(PartyNameWhereUniqueInput where) { this.where = where; }
        public void setUpdate(PartyNameUpdateWithoutPartyDataInput update) { this.update = update; }
        public void setCreate(PartyNameCreateWithoutPartyInput create) { this.create = create; }
    }
    public static class ChildOrganizationUpdateWithWhereUniqueWithoutPartyInput {
        private ChildOrganizationWhereUniqueInput where;
        private ChildOrganizationUpdateWithoutPartyDataInput data;

        public ChildOrganizationUpdateWithWhereUniqueWithoutPartyInput() {}

        public ChildOrganizationWhereUniqueInput getWhere() { return this.where; }
        public ChildOrganizationUpdateWithoutPartyDataInput getData() { return this.data; }
        public void setWhere(ChildOrganizationWhereUniqueInput where) { this.where = where; }
        public void setData(ChildOrganizationUpdateWithoutPartyDataInput data) { this.data = data; }
    }
    public static class ChildOrganizationUpdateManyWithWhereNestedInput {
        private ChildOrganizationScalarWhereInput where;
        private ChildOrganizationUpdateManyDataInput data;

        public ChildOrganizationUpdateManyWithWhereNestedInput() {}

        public ChildOrganizationScalarWhereInput getWhere() { return this.where; }
        public ChildOrganizationUpdateManyDataInput getData() { return this.data; }
        public void setWhere(ChildOrganizationScalarWhereInput where) { this.where = where; }
        public void setData(ChildOrganizationUpdateManyDataInput data) { this.data = data; }
    }
    public static class ChildOrganizationScalarWhereInput {
        private Iterable<ChildOrganizationScalarWhereInput> AND;
        private Iterable<ChildOrganizationScalarWhereInput> OR;
        private Iterable<ChildOrganizationScalarWhereInput> NOT;
        private StringFilterInput id;
        private StringNullableFilterInput basicDataCompleteCode;
        private StringNullableFilterInput basingPartyRoleInRelationshipSpecificationSpecificationKey;
        private StringNullableFilterInput creationDateTime;
        private StringNullableFilterInput description;
        private StringNullableFilterInput informationModelObjectKind;
        private StringNullableFilterInput namePartyNameKey;
        private StringNullableFilterInput partyRoleInRelationshipKind;
        private StringNullableFilterInput partyRoleKind;
        private StringNullableFilterInput playerRoleRoleKey;
        private StringNullableFilterInput playingPartyPartyKey;
        private StringNullableFilterInput roleKey;
        private StringNullableFilterInput roleKind;
        private StringNullableFilterInput rolePlayerPeriodStart;
        private StringNullableFilterInput rolePlayerPeriodEnd;
        private StringNullableFilterInput typeName;
        private StringNullableFilterInput txGlobalTypeName;
        private StringNullableFilterInput txTypeCode;
        private StringNullableFilterInput txPrimaryKey;
        private StringNullableFilterInput txMetaSourceKey;
        private StringNullableFilterInput txMetaStartEventTime;
        private StringNullableFilterInput txMetaLoadTime;
        private StringNullableFilterInput txMetaSource;
        private StringNullableFilterInput txMetaCorrection;
        private StringNullableFilterInput txMetaChange;
        private IntNullableFilterInput txMetaAccessFilter;
        private StringNullableFilterInput PartyId;
        private StringNullableFilterInput PartyNameId;

        public ChildOrganizationScalarWhereInput() {}

        public Iterable<ChildOrganizationScalarWhereInput> getAnd() { return this.AND; }
        public Iterable<ChildOrganizationScalarWhereInput> getOr() { return this.OR; }
        public Iterable<ChildOrganizationScalarWhereInput> getNot() { return this.NOT; }
        public StringFilterInput getId() { return this.id; }
        public StringNullableFilterInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public StringNullableFilterInput getBasingPartyRoleInRelationshipSpecificationSpecificationKey() { return this.basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public StringNullableFilterInput getCreationDateTime() { return this.creationDateTime; }
        public StringNullableFilterInput getDescription() { return this.description; }
        public StringNullableFilterInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public StringNullableFilterInput getNamePartyNameKey() { return this.namePartyNameKey; }
        public StringNullableFilterInput getPartyRoleInRelationshipKind() { return this.partyRoleInRelationshipKind; }
        public StringNullableFilterInput getPartyRoleKind() { return this.partyRoleKind; }
        public StringNullableFilterInput getPlayerRoleRoleKey() { return this.playerRoleRoleKey; }
        public StringNullableFilterInput getPlayingPartyPartyKey() { return this.playingPartyPartyKey; }
        public StringNullableFilterInput getRoleKey() { return this.roleKey; }
        public StringNullableFilterInput getRoleKind() { return this.roleKind; }
        public StringNullableFilterInput getRolePlayerPeriodStart() { return this.rolePlayerPeriodStart; }
        public StringNullableFilterInput getRolePlayerPeriodEnd() { return this.rolePlayerPeriodEnd; }
        public StringNullableFilterInput getTypeName() { return this.typeName; }
        public StringNullableFilterInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public StringNullableFilterInput getTxTypeCode() { return this.txTypeCode; }
        public StringNullableFilterInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public StringNullableFilterInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public StringNullableFilterInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public StringNullableFilterInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public StringNullableFilterInput getTxMetaSource() { return this.txMetaSource; }
        public StringNullableFilterInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public StringNullableFilterInput getTxMetaChange() { return this.txMetaChange; }
        public IntNullableFilterInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public StringNullableFilterInput getPartyId() { return this.PartyId; }
        public StringNullableFilterInput getPartyNameId() { return this.PartyNameId; }
        public void setAnd(Iterable<ChildOrganizationScalarWhereInput> AND) { this.AND = AND; }
        public void setOr(Iterable<ChildOrganizationScalarWhereInput> OR) { this.OR = OR; }
        public void setNot(Iterable<ChildOrganizationScalarWhereInput> NOT) { this.NOT = NOT; }
        public void setId(StringFilterInput id) { this.id = id; }
        public void setBasicDataCompleteCode(StringNullableFilterInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setBasingPartyRoleInRelationshipSpecificationSpecificationKey(StringNullableFilterInput basingPartyRoleInRelationshipSpecificationSpecificationKey) { this.basingPartyRoleInRelationshipSpecificationSpecificationKey = basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public void setCreationDateTime(StringNullableFilterInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDescription(StringNullableFilterInput description) { this.description = description; }
        public void setInformationModelObjectKind(StringNullableFilterInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setNamePartyNameKey(StringNullableFilterInput namePartyNameKey) { this.namePartyNameKey = namePartyNameKey; }
        public void setPartyRoleInRelationshipKind(StringNullableFilterInput partyRoleInRelationshipKind) { this.partyRoleInRelationshipKind = partyRoleInRelationshipKind; }
        public void setPartyRoleKind(StringNullableFilterInput partyRoleKind) { this.partyRoleKind = partyRoleKind; }
        public void setPlayerRoleRoleKey(StringNullableFilterInput playerRoleRoleKey) { this.playerRoleRoleKey = playerRoleRoleKey; }
        public void setPlayingPartyPartyKey(StringNullableFilterInput playingPartyPartyKey) { this.playingPartyPartyKey = playingPartyPartyKey; }
        public void setRoleKey(StringNullableFilterInput roleKey) { this.roleKey = roleKey; }
        public void setRoleKind(StringNullableFilterInput roleKind) { this.roleKind = roleKind; }
        public void setRolePlayerPeriodStart(StringNullableFilterInput rolePlayerPeriodStart) { this.rolePlayerPeriodStart = rolePlayerPeriodStart; }
        public void setRolePlayerPeriodEnd(StringNullableFilterInput rolePlayerPeriodEnd) { this.rolePlayerPeriodEnd = rolePlayerPeriodEnd; }
        public void setTypeName(StringNullableFilterInput typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(StringNullableFilterInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(StringNullableFilterInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(StringNullableFilterInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(StringNullableFilterInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(StringNullableFilterInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(StringNullableFilterInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(StringNullableFilterInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(StringNullableFilterInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(StringNullableFilterInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(IntNullableFilterInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPartyId(StringNullableFilterInput PartyId) { this.PartyId = PartyId; }
        public void setPartyNameId(StringNullableFilterInput PartyNameId) { this.PartyNameId = PartyNameId; }
    }
    public static class ChildOrganizationUpsertWithWhereUniqueWithoutPartyInput {
        private ChildOrganizationWhereUniqueInput where;
        private ChildOrganizationUpdateWithoutPartyDataInput update;
        private ChildOrganizationCreateWithoutPartyInput create;

        public ChildOrganizationUpsertWithWhereUniqueWithoutPartyInput() {}

        public ChildOrganizationWhereUniqueInput getWhere() { return this.where; }
        public ChildOrganizationUpdateWithoutPartyDataInput getUpdate() { return this.update; }
        public ChildOrganizationCreateWithoutPartyInput getCreate() { return this.create; }
        public void setWhere(ChildOrganizationWhereUniqueInput where) { this.where = where; }
        public void setUpdate(ChildOrganizationUpdateWithoutPartyDataInput update) { this.update = update; }
        public void setCreate(ChildOrganizationCreateWithoutPartyInput create) { this.create = create; }
    }
    public static class ChildOrganizationCreateWithoutPartyNameInput {
        private String id;
        private String basicDataCompleteCode;
        private String basingPartyRoleInRelationshipSpecificationSpecificationKey;
        private String creationDateTime;
        private String description;
        private String informationModelObjectKind;
        private String namePartyNameKey;
        private String partyRoleInRelationshipKind;
        private String partyRoleKind;
        private String playerRoleRoleKey;
        private String playingPartyPartyKey;
        private String roleKey;
        private String roleKind;
        private String rolePlayerPeriodStart;
        private String rolePlayerPeriodEnd;
        private String typeName;
        private String txGlobalTypeName;
        private String txTypeCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private PartyCreateOneWithoutChildOrganizationInput Party;

        public ChildOrganizationCreateWithoutPartyNameInput() {}

        public String getId() { return this.id; }
        public String getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public String getBasingPartyRoleInRelationshipSpecificationSpecificationKey() { return this.basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public String getCreationDateTime() { return this.creationDateTime; }
        public String getDescription() { return this.description; }
        public String getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public String getNamePartyNameKey() { return this.namePartyNameKey; }
        public String getPartyRoleInRelationshipKind() { return this.partyRoleInRelationshipKind; }
        public String getPartyRoleKind() { return this.partyRoleKind; }
        public String getPlayerRoleRoleKey() { return this.playerRoleRoleKey; }
        public String getPlayingPartyPartyKey() { return this.playingPartyPartyKey; }
        public String getRoleKey() { return this.roleKey; }
        public String getRoleKind() { return this.roleKind; }
        public String getRolePlayerPeriodStart() { return this.rolePlayerPeriodStart; }
        public String getRolePlayerPeriodEnd() { return this.rolePlayerPeriodEnd; }
        public String getTypeName() { return this.typeName; }
        public String getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public String getTxTypeCode() { return this.txTypeCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyCreateOneWithoutChildOrganizationInput getParty() { return this.Party; }
        public void setId(String id) { this.id = id; }
        public void setBasicDataCompleteCode(String basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setBasingPartyRoleInRelationshipSpecificationSpecificationKey(String basingPartyRoleInRelationshipSpecificationSpecificationKey) { this.basingPartyRoleInRelationshipSpecificationSpecificationKey = basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public void setCreationDateTime(String creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDescription(String description) { this.description = description; }
        public void setInformationModelObjectKind(String informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setNamePartyNameKey(String namePartyNameKey) { this.namePartyNameKey = namePartyNameKey; }
        public void setPartyRoleInRelationshipKind(String partyRoleInRelationshipKind) { this.partyRoleInRelationshipKind = partyRoleInRelationshipKind; }
        public void setPartyRoleKind(String partyRoleKind) { this.partyRoleKind = partyRoleKind; }
        public void setPlayerRoleRoleKey(String playerRoleRoleKey) { this.playerRoleRoleKey = playerRoleRoleKey; }
        public void setPlayingPartyPartyKey(String playingPartyPartyKey) { this.playingPartyPartyKey = playingPartyPartyKey; }
        public void setRoleKey(String roleKey) { this.roleKey = roleKey; }
        public void setRoleKind(String roleKind) { this.roleKind = roleKind; }
        public void setRolePlayerPeriodStart(String rolePlayerPeriodStart) { this.rolePlayerPeriodStart = rolePlayerPeriodStart; }
        public void setRolePlayerPeriodEnd(String rolePlayerPeriodEnd) { this.rolePlayerPeriodEnd = rolePlayerPeriodEnd; }
        public void setTypeName(String typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(String txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(String txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setParty(PartyCreateOneWithoutChildOrganizationInput Party) { this.Party = Party; }
    }
    public static class PersonCreateWithoutPartyNameInput {
        private String id;
        private String birthDateTime;
        private String bloodTypeCode;
        private Boolean deathIndicator;
        private String ethnicityCode;
        private String genderCode;
        private String maritalStatusCode;
        private String missingDateTime;
        private Boolean missingIndicator;
        private String partyKey;
        private String primaryLanguageLanguageKey;
        private String txGlobalGenderCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private PartyCreateOneWithoutPersonInput Party;

        public PersonCreateWithoutPartyNameInput() {}

        public String getId() { return this.id; }
        public String getBirthDateTime() { return this.birthDateTime; }
        public String getBloodTypeCode() { return this.bloodTypeCode; }
        public Boolean getDeathIndicator() { return this.deathIndicator; }
        public String getEthnicityCode() { return this.ethnicityCode; }
        public String getGenderCode() { return this.genderCode; }
        public String getMaritalStatusCode() { return this.maritalStatusCode; }
        public String getMissingDateTime() { return this.missingDateTime; }
        public Boolean getMissingIndicator() { return this.missingIndicator; }
        public String getPartyKey() { return this.partyKey; }
        public String getPrimaryLanguageLanguageKey() { return this.primaryLanguageLanguageKey; }
        public String getTxGlobalGenderCode() { return this.txGlobalGenderCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyCreateOneWithoutPersonInput getParty() { return this.Party; }
        public void setId(String id) { this.id = id; }
        public void setBirthDateTime(String birthDateTime) { this.birthDateTime = birthDateTime; }
        public void setBloodTypeCode(String bloodTypeCode) { this.bloodTypeCode = bloodTypeCode; }
        public void setDeathIndicator(Boolean deathIndicator) { this.deathIndicator = deathIndicator; }
        public void setEthnicityCode(String ethnicityCode) { this.ethnicityCode = ethnicityCode; }
        public void setGenderCode(String genderCode) { this.genderCode = genderCode; }
        public void setMaritalStatusCode(String maritalStatusCode) { this.maritalStatusCode = maritalStatusCode; }
        public void setMissingDateTime(String missingDateTime) { this.missingDateTime = missingDateTime; }
        public void setMissingIndicator(Boolean missingIndicator) { this.missingIndicator = missingIndicator; }
        public void setPartyKey(String partyKey) { this.partyKey = partyKey; }
        public void setPrimaryLanguageLanguageKey(String primaryLanguageLanguageKey) { this.primaryLanguageLanguageKey = primaryLanguageLanguageKey; }
        public void setTxGlobalGenderCode(String txGlobalGenderCode) { this.txGlobalGenderCode = txGlobalGenderCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setParty(PartyCreateOneWithoutPersonInput Party) { this.Party = Party; }
    }
    public static class PartyCreateWithoutPartyNameInput {
        private String id;
        private String basicDataCompleteCode;
        private String creationDateTime;
        private String informationModelObjectKind;
        private String partyKey;
        private String partyKind;
        private String typeName;
        private String txGlobalTypeName;
        private String txTypeCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private PersonCreateManyWithoutPartyInput Person;
        private ChildOrganizationCreateManyWithoutPartyInput ChildOrganization;

        public PartyCreateWithoutPartyNameInput() {}

        public String getId() { return this.id; }
        public String getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public String getCreationDateTime() { return this.creationDateTime; }
        public String getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public String getPartyKey() { return this.partyKey; }
        public String getPartyKind() { return this.partyKind; }
        public String getTypeName() { return this.typeName; }
        public String getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public String getTxTypeCode() { return this.txTypeCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PersonCreateManyWithoutPartyInput getPerson() { return this.Person; }
        public ChildOrganizationCreateManyWithoutPartyInput getChildOrganization() { return this.ChildOrganization; }
        public void setId(String id) { this.id = id; }
        public void setBasicDataCompleteCode(String basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(String creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setInformationModelObjectKind(String informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setPartyKey(String partyKey) { this.partyKey = partyKey; }
        public void setPartyKind(String partyKind) { this.partyKind = partyKind; }
        public void setTypeName(String typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(String txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(String txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPerson(PersonCreateManyWithoutPartyInput Person) { this.Person = Person; }
        public void setChildOrganization(ChildOrganizationCreateManyWithoutPartyInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
    }
    public static class ChildOrganizationUpdateWithWhereUniqueWithoutPartyNameInput {
        private ChildOrganizationWhereUniqueInput where;
        private ChildOrganizationUpdateWithoutPartyNameDataInput data;

        public ChildOrganizationUpdateWithWhereUniqueWithoutPartyNameInput() {}

        public ChildOrganizationWhereUniqueInput getWhere() { return this.where; }
        public ChildOrganizationUpdateWithoutPartyNameDataInput getData() { return this.data; }
        public void setWhere(ChildOrganizationWhereUniqueInput where) { this.where = where; }
        public void setData(ChildOrganizationUpdateWithoutPartyNameDataInput data) { this.data = data; }
    }
    public static class ChildOrganizationUpsertWithWhereUniqueWithoutPartyNameInput {
        private ChildOrganizationWhereUniqueInput where;
        private ChildOrganizationUpdateWithoutPartyNameDataInput update;
        private ChildOrganizationCreateWithoutPartyNameInput create;

        public ChildOrganizationUpsertWithWhereUniqueWithoutPartyNameInput() {}

        public ChildOrganizationWhereUniqueInput getWhere() { return this.where; }
        public ChildOrganizationUpdateWithoutPartyNameDataInput getUpdate() { return this.update; }
        public ChildOrganizationCreateWithoutPartyNameInput getCreate() { return this.create; }
        public void setWhere(ChildOrganizationWhereUniqueInput where) { this.where = where; }
        public void setUpdate(ChildOrganizationUpdateWithoutPartyNameDataInput update) { this.update = update; }
        public void setCreate(ChildOrganizationCreateWithoutPartyNameInput create) { this.create = create; }
    }
    public static class PersonUpdateWithoutPartyNameDataInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput birthDateTime;
        private NullableStringFieldUpdateOperationsInput bloodTypeCode;
        private NullableBoolFieldUpdateOperationsInput deathIndicator;
        private NullableStringFieldUpdateOperationsInput ethnicityCode;
        private NullableStringFieldUpdateOperationsInput genderCode;
        private NullableStringFieldUpdateOperationsInput maritalStatusCode;
        private NullableStringFieldUpdateOperationsInput missingDateTime;
        private NullableBoolFieldUpdateOperationsInput missingIndicator;
        private NullableStringFieldUpdateOperationsInput partyKey;
        private NullableStringFieldUpdateOperationsInput primaryLanguageLanguageKey;
        private NullableStringFieldUpdateOperationsInput txGlobalGenderCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private PartyUpdateOneWithoutPersonInput Party;

        public PersonUpdateWithoutPartyNameDataInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBirthDateTime() { return this.birthDateTime; }
        public NullableStringFieldUpdateOperationsInput getBloodTypeCode() { return this.bloodTypeCode; }
        public NullableBoolFieldUpdateOperationsInput getDeathIndicator() { return this.deathIndicator; }
        public NullableStringFieldUpdateOperationsInput getEthnicityCode() { return this.ethnicityCode; }
        public NullableStringFieldUpdateOperationsInput getGenderCode() { return this.genderCode; }
        public NullableStringFieldUpdateOperationsInput getMaritalStatusCode() { return this.maritalStatusCode; }
        public NullableStringFieldUpdateOperationsInput getMissingDateTime() { return this.missingDateTime; }
        public NullableBoolFieldUpdateOperationsInput getMissingIndicator() { return this.missingIndicator; }
        public NullableStringFieldUpdateOperationsInput getPartyKey() { return this.partyKey; }
        public NullableStringFieldUpdateOperationsInput getPrimaryLanguageLanguageKey() { return this.primaryLanguageLanguageKey; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalGenderCode() { return this.txGlobalGenderCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyUpdateOneWithoutPersonInput getParty() { return this.Party; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBirthDateTime(NullableStringFieldUpdateOperationsInput birthDateTime) { this.birthDateTime = birthDateTime; }
        public void setBloodTypeCode(NullableStringFieldUpdateOperationsInput bloodTypeCode) { this.bloodTypeCode = bloodTypeCode; }
        public void setDeathIndicator(NullableBoolFieldUpdateOperationsInput deathIndicator) { this.deathIndicator = deathIndicator; }
        public void setEthnicityCode(NullableStringFieldUpdateOperationsInput ethnicityCode) { this.ethnicityCode = ethnicityCode; }
        public void setGenderCode(NullableStringFieldUpdateOperationsInput genderCode) { this.genderCode = genderCode; }
        public void setMaritalStatusCode(NullableStringFieldUpdateOperationsInput maritalStatusCode) { this.maritalStatusCode = maritalStatusCode; }
        public void setMissingDateTime(NullableStringFieldUpdateOperationsInput missingDateTime) { this.missingDateTime = missingDateTime; }
        public void setMissingIndicator(NullableBoolFieldUpdateOperationsInput missingIndicator) { this.missingIndicator = missingIndicator; }
        public void setPartyKey(NullableStringFieldUpdateOperationsInput partyKey) { this.partyKey = partyKey; }
        public void setPrimaryLanguageLanguageKey(NullableStringFieldUpdateOperationsInput primaryLanguageLanguageKey) { this.primaryLanguageLanguageKey = primaryLanguageLanguageKey; }
        public void setTxGlobalGenderCode(NullableStringFieldUpdateOperationsInput txGlobalGenderCode) { this.txGlobalGenderCode = txGlobalGenderCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setParty(PartyUpdateOneWithoutPersonInput Party) { this.Party = Party; }
    }
    public static class PersonUpsertWithoutPartyNameInput {
        private PersonUpdateWithoutPartyNameDataInput update;
        private PersonCreateWithoutPartyNameInput create;

        public PersonUpsertWithoutPartyNameInput() {}

        public PersonUpdateWithoutPartyNameDataInput getUpdate() { return this.update; }
        public PersonCreateWithoutPartyNameInput getCreate() { return this.create; }
        public void setUpdate(PersonUpdateWithoutPartyNameDataInput update) { this.update = update; }
        public void setCreate(PersonCreateWithoutPartyNameInput create) { this.create = create; }
    }
    public static class PartyUpdateWithoutPartyNameDataInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput partyKey;
        private NullableStringFieldUpdateOperationsInput partyKind;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private PersonUpdateManyWithoutPartyInput Person;
        private ChildOrganizationUpdateManyWithoutPartyInput ChildOrganization;

        public PartyUpdateWithoutPartyNameDataInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getPartyKey() { return this.partyKey; }
        public NullableStringFieldUpdateOperationsInput getPartyKind() { return this.partyKind; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PersonUpdateManyWithoutPartyInput getPerson() { return this.Person; }
        public ChildOrganizationUpdateManyWithoutPartyInput getChildOrganization() { return this.ChildOrganization; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setPartyKey(NullableStringFieldUpdateOperationsInput partyKey) { this.partyKey = partyKey; }
        public void setPartyKind(NullableStringFieldUpdateOperationsInput partyKind) { this.partyKind = partyKind; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPerson(PersonUpdateManyWithoutPartyInput Person) { this.Person = Person; }
        public void setChildOrganization(ChildOrganizationUpdateManyWithoutPartyInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
    }
    public static class PartyUpsertWithoutPartyNameInput {
        private PartyUpdateWithoutPartyNameDataInput update;
        private PartyCreateWithoutPartyNameInput create;

        public PartyUpsertWithoutPartyNameInput() {}

        public PartyUpdateWithoutPartyNameDataInput getUpdate() { return this.update; }
        public PartyCreateWithoutPartyNameInput getCreate() { return this.create; }
        public void setUpdate(PartyUpdateWithoutPartyNameDataInput update) { this.update = update; }
        public void setCreate(PartyCreateWithoutPartyNameInput create) { this.create = create; }
    }
    public static class PartyNameCreateWithoutPersonInput {
        private String id;
        private String basicDataCompleteCode;
        private String creationDateTime;
        private Boolean defaultIndicator;
        private String description;
        private String effectivePeriodStart;
        private String effectivePeriodEnd;
        private String fullName;
        private String givenName;
        private String informationModelObjectKind;
        private String middleName;
        private String ownerPartyKey;
        private String partyNameKey;
        private String partyNameKind;
        private String prefixTitleCode;
        private String suffix;
        private String surname;
        private String typeName;
        private String usageCode;
        private String utilizedLanguageLanguageKey;
        private String txGlobalTypeName;
        private String txTypeCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private String CompanyId;
        private String OrganizationUnitId;
        private ChildOrganizationCreateManyWithoutPartyNameInput ChildOrganization;
        private PartyCreateOneWithoutPartyNameInput Party;

        public PartyNameCreateWithoutPersonInput() {}

        public String getId() { return this.id; }
        public String getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public String getCreationDateTime() { return this.creationDateTime; }
        public Boolean getDefaultIndicator() { return this.defaultIndicator; }
        public String getDescription() { return this.description; }
        public String getEffectivePeriodStart() { return this.effectivePeriodStart; }
        public String getEffectivePeriodEnd() { return this.effectivePeriodEnd; }
        public String getFullName() { return this.fullName; }
        public String getGivenName() { return this.givenName; }
        public String getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public String getMiddleName() { return this.middleName; }
        public String getOwnerPartyKey() { return this.ownerPartyKey; }
        public String getPartyNameKey() { return this.partyNameKey; }
        public String getPartyNameKind() { return this.partyNameKind; }
        public String getPrefixTitleCode() { return this.prefixTitleCode; }
        public String getSuffix() { return this.suffix; }
        public String getSurname() { return this.surname; }
        public String getTypeName() { return this.typeName; }
        public String getUsageCode() { return this.usageCode; }
        public String getUtilizedLanguageLanguageKey() { return this.utilizedLanguageLanguageKey; }
        public String getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public String getTxTypeCode() { return this.txTypeCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public String getCompanyId() { return this.CompanyId; }
        public String getOrganizationUnitId() { return this.OrganizationUnitId; }
        public ChildOrganizationCreateManyWithoutPartyNameInput getChildOrganization() { return this.ChildOrganization; }
        public PartyCreateOneWithoutPartyNameInput getParty() { return this.Party; }
        public void setId(String id) { this.id = id; }
        public void setBasicDataCompleteCode(String basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(String creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDefaultIndicator(Boolean defaultIndicator) { this.defaultIndicator = defaultIndicator; }
        public void setDescription(String description) { this.description = description; }
        public void setEffectivePeriodStart(String effectivePeriodStart) { this.effectivePeriodStart = effectivePeriodStart; }
        public void setEffectivePeriodEnd(String effectivePeriodEnd) { this.effectivePeriodEnd = effectivePeriodEnd; }
        public void setFullName(String fullName) { this.fullName = fullName; }
        public void setGivenName(String givenName) { this.givenName = givenName; }
        public void setInformationModelObjectKind(String informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setMiddleName(String middleName) { this.middleName = middleName; }
        public void setOwnerPartyKey(String ownerPartyKey) { this.ownerPartyKey = ownerPartyKey; }
        public void setPartyNameKey(String partyNameKey) { this.partyNameKey = partyNameKey; }
        public void setPartyNameKind(String partyNameKind) { this.partyNameKind = partyNameKind; }
        public void setPrefixTitleCode(String prefixTitleCode) { this.prefixTitleCode = prefixTitleCode; }
        public void setSuffix(String suffix) { this.suffix = suffix; }
        public void setSurname(String surname) { this.surname = surname; }
        public void setTypeName(String typeName) { this.typeName = typeName; }
        public void setUsageCode(String usageCode) { this.usageCode = usageCode; }
        public void setUtilizedLanguageLanguageKey(String utilizedLanguageLanguageKey) { this.utilizedLanguageLanguageKey = utilizedLanguageLanguageKey; }
        public void setTxGlobalTypeName(String txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(String txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setCompanyId(String CompanyId) { this.CompanyId = CompanyId; }
        public void setOrganizationUnitId(String OrganizationUnitId) { this.OrganizationUnitId = OrganizationUnitId; }
        public void setChildOrganization(ChildOrganizationCreateManyWithoutPartyNameInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
        public void setParty(PartyCreateOneWithoutPartyNameInput Party) { this.Party = Party; }
    }
    public static class PartyCreateWithoutPersonInput {
        private String id;
        private String basicDataCompleteCode;
        private String creationDateTime;
        private String informationModelObjectKind;
        private String partyKey;
        private String partyKind;
        private String typeName;
        private String txGlobalTypeName;
        private String txTypeCode;
        private String txPrimaryKey;
        private String txMetaSourceKey;
        private String txMetaStartEventTime;
        private String txMetaLoadTime;
        private String txMetaSource;
        private String txMetaCorrection;
        private String txMetaChange;
        private Integer txMetaAccessFilter;
        private PartyNameCreateManyWithoutPartyInput PartyName;
        private ChildOrganizationCreateManyWithoutPartyInput ChildOrganization;

        public PartyCreateWithoutPersonInput() {}

        public String getId() { return this.id; }
        public String getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public String getCreationDateTime() { return this.creationDateTime; }
        public String getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public String getPartyKey() { return this.partyKey; }
        public String getPartyKind() { return this.partyKind; }
        public String getTypeName() { return this.typeName; }
        public String getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public String getTxTypeCode() { return this.txTypeCode; }
        public String getTxPrimaryKey() { return this.txPrimaryKey; }
        public String getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public String getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public String getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public String getTxMetaSource() { return this.txMetaSource; }
        public String getTxMetaCorrection() { return this.txMetaCorrection; }
        public String getTxMetaChange() { return this.txMetaChange; }
        public Integer getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyNameCreateManyWithoutPartyInput getPartyName() { return this.PartyName; }
        public ChildOrganizationCreateManyWithoutPartyInput getChildOrganization() { return this.ChildOrganization; }
        public void setId(String id) { this.id = id; }
        public void setBasicDataCompleteCode(String basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(String creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setInformationModelObjectKind(String informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setPartyKey(String partyKey) { this.partyKey = partyKey; }
        public void setPartyKind(String partyKind) { this.partyKind = partyKind; }
        public void setTypeName(String typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(String txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(String txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(String txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(String txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(String txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(String txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(String txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(String txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(String txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(Integer txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPartyName(PartyNameCreateManyWithoutPartyInput PartyName) { this.PartyName = PartyName; }
        public void setChildOrganization(ChildOrganizationCreateManyWithoutPartyInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
    }
    public static class PartyNameUpdateWithWhereUniqueWithoutPersonInput {
        private PartyNameWhereUniqueInput where;
        private PartyNameUpdateWithoutPersonDataInput data;

        public PartyNameUpdateWithWhereUniqueWithoutPersonInput() {}

        public PartyNameWhereUniqueInput getWhere() { return this.where; }
        public PartyNameUpdateWithoutPersonDataInput getData() { return this.data; }
        public void setWhere(PartyNameWhereUniqueInput where) { this.where = where; }
        public void setData(PartyNameUpdateWithoutPersonDataInput data) { this.data = data; }
    }
    public static class PartyNameUpsertWithWhereUniqueWithoutPersonInput {
        private PartyNameWhereUniqueInput where;
        private PartyNameUpdateWithoutPersonDataInput update;
        private PartyNameCreateWithoutPersonInput create;

        public PartyNameUpsertWithWhereUniqueWithoutPersonInput() {}

        public PartyNameWhereUniqueInput getWhere() { return this.where; }
        public PartyNameUpdateWithoutPersonDataInput getUpdate() { return this.update; }
        public PartyNameCreateWithoutPersonInput getCreate() { return this.create; }
        public void setWhere(PartyNameWhereUniqueInput where) { this.where = where; }
        public void setUpdate(PartyNameUpdateWithoutPersonDataInput update) { this.update = update; }
        public void setCreate(PartyNameCreateWithoutPersonInput create) { this.create = create; }
    }
    public static class PartyUpdateWithoutPersonDataInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput partyKey;
        private NullableStringFieldUpdateOperationsInput partyKind;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private PartyNameUpdateManyWithoutPartyInput PartyName;
        private ChildOrganizationUpdateManyWithoutPartyInput ChildOrganization;

        public PartyUpdateWithoutPersonDataInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getPartyKey() { return this.partyKey; }
        public NullableStringFieldUpdateOperationsInput getPartyKind() { return this.partyKind; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyNameUpdateManyWithoutPartyInput getPartyName() { return this.PartyName; }
        public ChildOrganizationUpdateManyWithoutPartyInput getChildOrganization() { return this.ChildOrganization; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setPartyKey(NullableStringFieldUpdateOperationsInput partyKey) { this.partyKey = partyKey; }
        public void setPartyKind(NullableStringFieldUpdateOperationsInput partyKind) { this.partyKind = partyKind; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPartyName(PartyNameUpdateManyWithoutPartyInput PartyName) { this.PartyName = PartyName; }
        public void setChildOrganization(ChildOrganizationUpdateManyWithoutPartyInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
    }
    public static class PartyUpsertWithoutPersonInput {
        private PartyUpdateWithoutPersonDataInput update;
        private PartyCreateWithoutPersonInput create;

        public PartyUpsertWithoutPersonInput() {}

        public PartyUpdateWithoutPersonDataInput getUpdate() { return this.update; }
        public PartyCreateWithoutPersonInput getCreate() { return this.create; }
        public void setUpdate(PartyUpdateWithoutPersonDataInput update) { this.update = update; }
        public void setCreate(PartyCreateWithoutPersonInput create) { this.create = create; }
    }
    public static class PersonUpdateWithoutPartyDataInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput birthDateTime;
        private NullableStringFieldUpdateOperationsInput bloodTypeCode;
        private NullableBoolFieldUpdateOperationsInput deathIndicator;
        private NullableStringFieldUpdateOperationsInput ethnicityCode;
        private NullableStringFieldUpdateOperationsInput genderCode;
        private NullableStringFieldUpdateOperationsInput maritalStatusCode;
        private NullableStringFieldUpdateOperationsInput missingDateTime;
        private NullableBoolFieldUpdateOperationsInput missingIndicator;
        private NullableStringFieldUpdateOperationsInput partyKey;
        private NullableStringFieldUpdateOperationsInput primaryLanguageLanguageKey;
        private NullableStringFieldUpdateOperationsInput txGlobalGenderCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private PartyNameUpdateManyWithoutPersonInput PartyName;

        public PersonUpdateWithoutPartyDataInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBirthDateTime() { return this.birthDateTime; }
        public NullableStringFieldUpdateOperationsInput getBloodTypeCode() { return this.bloodTypeCode; }
        public NullableBoolFieldUpdateOperationsInput getDeathIndicator() { return this.deathIndicator; }
        public NullableStringFieldUpdateOperationsInput getEthnicityCode() { return this.ethnicityCode; }
        public NullableStringFieldUpdateOperationsInput getGenderCode() { return this.genderCode; }
        public NullableStringFieldUpdateOperationsInput getMaritalStatusCode() { return this.maritalStatusCode; }
        public NullableStringFieldUpdateOperationsInput getMissingDateTime() { return this.missingDateTime; }
        public NullableBoolFieldUpdateOperationsInput getMissingIndicator() { return this.missingIndicator; }
        public NullableStringFieldUpdateOperationsInput getPartyKey() { return this.partyKey; }
        public NullableStringFieldUpdateOperationsInput getPrimaryLanguageLanguageKey() { return this.primaryLanguageLanguageKey; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalGenderCode() { return this.txGlobalGenderCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyNameUpdateManyWithoutPersonInput getPartyName() { return this.PartyName; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBirthDateTime(NullableStringFieldUpdateOperationsInput birthDateTime) { this.birthDateTime = birthDateTime; }
        public void setBloodTypeCode(NullableStringFieldUpdateOperationsInput bloodTypeCode) { this.bloodTypeCode = bloodTypeCode; }
        public void setDeathIndicator(NullableBoolFieldUpdateOperationsInput deathIndicator) { this.deathIndicator = deathIndicator; }
        public void setEthnicityCode(NullableStringFieldUpdateOperationsInput ethnicityCode) { this.ethnicityCode = ethnicityCode; }
        public void setGenderCode(NullableStringFieldUpdateOperationsInput genderCode) { this.genderCode = genderCode; }
        public void setMaritalStatusCode(NullableStringFieldUpdateOperationsInput maritalStatusCode) { this.maritalStatusCode = maritalStatusCode; }
        public void setMissingDateTime(NullableStringFieldUpdateOperationsInput missingDateTime) { this.missingDateTime = missingDateTime; }
        public void setMissingIndicator(NullableBoolFieldUpdateOperationsInput missingIndicator) { this.missingIndicator = missingIndicator; }
        public void setPartyKey(NullableStringFieldUpdateOperationsInput partyKey) { this.partyKey = partyKey; }
        public void setPrimaryLanguageLanguageKey(NullableStringFieldUpdateOperationsInput primaryLanguageLanguageKey) { this.primaryLanguageLanguageKey = primaryLanguageLanguageKey; }
        public void setTxGlobalGenderCode(NullableStringFieldUpdateOperationsInput txGlobalGenderCode) { this.txGlobalGenderCode = txGlobalGenderCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPartyName(PartyNameUpdateManyWithoutPersonInput PartyName) { this.PartyName = PartyName; }
    }
    public static class PersonUpdateManyDataInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput birthDateTime;
        private NullableStringFieldUpdateOperationsInput bloodTypeCode;
        private NullableBoolFieldUpdateOperationsInput deathIndicator;
        private NullableStringFieldUpdateOperationsInput ethnicityCode;
        private NullableStringFieldUpdateOperationsInput genderCode;
        private NullableStringFieldUpdateOperationsInput maritalStatusCode;
        private NullableStringFieldUpdateOperationsInput missingDateTime;
        private NullableBoolFieldUpdateOperationsInput missingIndicator;
        private NullableStringFieldUpdateOperationsInput partyKey;
        private NullableStringFieldUpdateOperationsInput primaryLanguageLanguageKey;
        private NullableStringFieldUpdateOperationsInput txGlobalGenderCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;

        public PersonUpdateManyDataInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBirthDateTime() { return this.birthDateTime; }
        public NullableStringFieldUpdateOperationsInput getBloodTypeCode() { return this.bloodTypeCode; }
        public NullableBoolFieldUpdateOperationsInput getDeathIndicator() { return this.deathIndicator; }
        public NullableStringFieldUpdateOperationsInput getEthnicityCode() { return this.ethnicityCode; }
        public NullableStringFieldUpdateOperationsInput getGenderCode() { return this.genderCode; }
        public NullableStringFieldUpdateOperationsInput getMaritalStatusCode() { return this.maritalStatusCode; }
        public NullableStringFieldUpdateOperationsInput getMissingDateTime() { return this.missingDateTime; }
        public NullableBoolFieldUpdateOperationsInput getMissingIndicator() { return this.missingIndicator; }
        public NullableStringFieldUpdateOperationsInput getPartyKey() { return this.partyKey; }
        public NullableStringFieldUpdateOperationsInput getPrimaryLanguageLanguageKey() { return this.primaryLanguageLanguageKey; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalGenderCode() { return this.txGlobalGenderCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBirthDateTime(NullableStringFieldUpdateOperationsInput birthDateTime) { this.birthDateTime = birthDateTime; }
        public void setBloodTypeCode(NullableStringFieldUpdateOperationsInput bloodTypeCode) { this.bloodTypeCode = bloodTypeCode; }
        public void setDeathIndicator(NullableBoolFieldUpdateOperationsInput deathIndicator) { this.deathIndicator = deathIndicator; }
        public void setEthnicityCode(NullableStringFieldUpdateOperationsInput ethnicityCode) { this.ethnicityCode = ethnicityCode; }
        public void setGenderCode(NullableStringFieldUpdateOperationsInput genderCode) { this.genderCode = genderCode; }
        public void setMaritalStatusCode(NullableStringFieldUpdateOperationsInput maritalStatusCode) { this.maritalStatusCode = maritalStatusCode; }
        public void setMissingDateTime(NullableStringFieldUpdateOperationsInput missingDateTime) { this.missingDateTime = missingDateTime; }
        public void setMissingIndicator(NullableBoolFieldUpdateOperationsInput missingIndicator) { this.missingIndicator = missingIndicator; }
        public void setPartyKey(NullableStringFieldUpdateOperationsInput partyKey) { this.partyKey = partyKey; }
        public void setPrimaryLanguageLanguageKey(NullableStringFieldUpdateOperationsInput primaryLanguageLanguageKey) { this.primaryLanguageLanguageKey = primaryLanguageLanguageKey; }
        public void setTxGlobalGenderCode(NullableStringFieldUpdateOperationsInput txGlobalGenderCode) { this.txGlobalGenderCode = txGlobalGenderCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
    }
    public static class PartyNameUpdateWithoutPartyDataInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableBoolFieldUpdateOperationsInput defaultIndicator;
        private NullableStringFieldUpdateOperationsInput description;
        private NullableStringFieldUpdateOperationsInput effectivePeriodStart;
        private NullableStringFieldUpdateOperationsInput effectivePeriodEnd;
        private NullableStringFieldUpdateOperationsInput fullName;
        private NullableStringFieldUpdateOperationsInput givenName;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput middleName;
        private NullableStringFieldUpdateOperationsInput ownerPartyKey;
        private NullableStringFieldUpdateOperationsInput partyNameKey;
        private NullableStringFieldUpdateOperationsInput partyNameKind;
        private NullableStringFieldUpdateOperationsInput prefixTitleCode;
        private NullableStringFieldUpdateOperationsInput suffix;
        private NullableStringFieldUpdateOperationsInput surname;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput usageCode;
        private NullableStringFieldUpdateOperationsInput utilizedLanguageLanguageKey;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private NullableStringFieldUpdateOperationsInput CompanyId;
        private NullableStringFieldUpdateOperationsInput OrganizationUnitId;
        private ChildOrganizationUpdateManyWithoutPartyNameInput ChildOrganization;
        private PersonUpdateOneWithoutPartyNameInput Person;

        public PartyNameUpdateWithoutPartyDataInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableBoolFieldUpdateOperationsInput getDefaultIndicator() { return this.defaultIndicator; }
        public NullableStringFieldUpdateOperationsInput getDescription() { return this.description; }
        public NullableStringFieldUpdateOperationsInput getEffectivePeriodStart() { return this.effectivePeriodStart; }
        public NullableStringFieldUpdateOperationsInput getEffectivePeriodEnd() { return this.effectivePeriodEnd; }
        public NullableStringFieldUpdateOperationsInput getFullName() { return this.fullName; }
        public NullableStringFieldUpdateOperationsInput getGivenName() { return this.givenName; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getMiddleName() { return this.middleName; }
        public NullableStringFieldUpdateOperationsInput getOwnerPartyKey() { return this.ownerPartyKey; }
        public NullableStringFieldUpdateOperationsInput getPartyNameKey() { return this.partyNameKey; }
        public NullableStringFieldUpdateOperationsInput getPartyNameKind() { return this.partyNameKind; }
        public NullableStringFieldUpdateOperationsInput getPrefixTitleCode() { return this.prefixTitleCode; }
        public NullableStringFieldUpdateOperationsInput getSuffix() { return this.suffix; }
        public NullableStringFieldUpdateOperationsInput getSurname() { return this.surname; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getUsageCode() { return this.usageCode; }
        public NullableStringFieldUpdateOperationsInput getUtilizedLanguageLanguageKey() { return this.utilizedLanguageLanguageKey; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public NullableStringFieldUpdateOperationsInput getCompanyId() { return this.CompanyId; }
        public NullableStringFieldUpdateOperationsInput getOrganizationUnitId() { return this.OrganizationUnitId; }
        public ChildOrganizationUpdateManyWithoutPartyNameInput getChildOrganization() { return this.ChildOrganization; }
        public PersonUpdateOneWithoutPartyNameInput getPerson() { return this.Person; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDefaultIndicator(NullableBoolFieldUpdateOperationsInput defaultIndicator) { this.defaultIndicator = defaultIndicator; }
        public void setDescription(NullableStringFieldUpdateOperationsInput description) { this.description = description; }
        public void setEffectivePeriodStart(NullableStringFieldUpdateOperationsInput effectivePeriodStart) { this.effectivePeriodStart = effectivePeriodStart; }
        public void setEffectivePeriodEnd(NullableStringFieldUpdateOperationsInput effectivePeriodEnd) { this.effectivePeriodEnd = effectivePeriodEnd; }
        public void setFullName(NullableStringFieldUpdateOperationsInput fullName) { this.fullName = fullName; }
        public void setGivenName(NullableStringFieldUpdateOperationsInput givenName) { this.givenName = givenName; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setMiddleName(NullableStringFieldUpdateOperationsInput middleName) { this.middleName = middleName; }
        public void setOwnerPartyKey(NullableStringFieldUpdateOperationsInput ownerPartyKey) { this.ownerPartyKey = ownerPartyKey; }
        public void setPartyNameKey(NullableStringFieldUpdateOperationsInput partyNameKey) { this.partyNameKey = partyNameKey; }
        public void setPartyNameKind(NullableStringFieldUpdateOperationsInput partyNameKind) { this.partyNameKind = partyNameKind; }
        public void setPrefixTitleCode(NullableStringFieldUpdateOperationsInput prefixTitleCode) { this.prefixTitleCode = prefixTitleCode; }
        public void setSuffix(NullableStringFieldUpdateOperationsInput suffix) { this.suffix = suffix; }
        public void setSurname(NullableStringFieldUpdateOperationsInput surname) { this.surname = surname; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setUsageCode(NullableStringFieldUpdateOperationsInput usageCode) { this.usageCode = usageCode; }
        public void setUtilizedLanguageLanguageKey(NullableStringFieldUpdateOperationsInput utilizedLanguageLanguageKey) { this.utilizedLanguageLanguageKey = utilizedLanguageLanguageKey; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setCompanyId(NullableStringFieldUpdateOperationsInput CompanyId) { this.CompanyId = CompanyId; }
        public void setOrganizationUnitId(NullableStringFieldUpdateOperationsInput OrganizationUnitId) { this.OrganizationUnitId = OrganizationUnitId; }
        public void setChildOrganization(ChildOrganizationUpdateManyWithoutPartyNameInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
        public void setPerson(PersonUpdateOneWithoutPartyNameInput Person) { this.Person = Person; }
    }
    public static class PartyNameUpdateManyDataInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableBoolFieldUpdateOperationsInput defaultIndicator;
        private NullableStringFieldUpdateOperationsInput description;
        private NullableStringFieldUpdateOperationsInput effectivePeriodStart;
        private NullableStringFieldUpdateOperationsInput effectivePeriodEnd;
        private NullableStringFieldUpdateOperationsInput fullName;
        private NullableStringFieldUpdateOperationsInput givenName;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput middleName;
        private NullableStringFieldUpdateOperationsInput ownerPartyKey;
        private NullableStringFieldUpdateOperationsInput partyNameKey;
        private NullableStringFieldUpdateOperationsInput partyNameKind;
        private NullableStringFieldUpdateOperationsInput prefixTitleCode;
        private NullableStringFieldUpdateOperationsInput suffix;
        private NullableStringFieldUpdateOperationsInput surname;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput usageCode;
        private NullableStringFieldUpdateOperationsInput utilizedLanguageLanguageKey;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private NullableStringFieldUpdateOperationsInput CompanyId;
        private NullableStringFieldUpdateOperationsInput OrganizationUnitId;

        public PartyNameUpdateManyDataInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableBoolFieldUpdateOperationsInput getDefaultIndicator() { return this.defaultIndicator; }
        public NullableStringFieldUpdateOperationsInput getDescription() { return this.description; }
        public NullableStringFieldUpdateOperationsInput getEffectivePeriodStart() { return this.effectivePeriodStart; }
        public NullableStringFieldUpdateOperationsInput getEffectivePeriodEnd() { return this.effectivePeriodEnd; }
        public NullableStringFieldUpdateOperationsInput getFullName() { return this.fullName; }
        public NullableStringFieldUpdateOperationsInput getGivenName() { return this.givenName; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getMiddleName() { return this.middleName; }
        public NullableStringFieldUpdateOperationsInput getOwnerPartyKey() { return this.ownerPartyKey; }
        public NullableStringFieldUpdateOperationsInput getPartyNameKey() { return this.partyNameKey; }
        public NullableStringFieldUpdateOperationsInput getPartyNameKind() { return this.partyNameKind; }
        public NullableStringFieldUpdateOperationsInput getPrefixTitleCode() { return this.prefixTitleCode; }
        public NullableStringFieldUpdateOperationsInput getSuffix() { return this.suffix; }
        public NullableStringFieldUpdateOperationsInput getSurname() { return this.surname; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getUsageCode() { return this.usageCode; }
        public NullableStringFieldUpdateOperationsInput getUtilizedLanguageLanguageKey() { return this.utilizedLanguageLanguageKey; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public NullableStringFieldUpdateOperationsInput getCompanyId() { return this.CompanyId; }
        public NullableStringFieldUpdateOperationsInput getOrganizationUnitId() { return this.OrganizationUnitId; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDefaultIndicator(NullableBoolFieldUpdateOperationsInput defaultIndicator) { this.defaultIndicator = defaultIndicator; }
        public void setDescription(NullableStringFieldUpdateOperationsInput description) { this.description = description; }
        public void setEffectivePeriodStart(NullableStringFieldUpdateOperationsInput effectivePeriodStart) { this.effectivePeriodStart = effectivePeriodStart; }
        public void setEffectivePeriodEnd(NullableStringFieldUpdateOperationsInput effectivePeriodEnd) { this.effectivePeriodEnd = effectivePeriodEnd; }
        public void setFullName(NullableStringFieldUpdateOperationsInput fullName) { this.fullName = fullName; }
        public void setGivenName(NullableStringFieldUpdateOperationsInput givenName) { this.givenName = givenName; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setMiddleName(NullableStringFieldUpdateOperationsInput middleName) { this.middleName = middleName; }
        public void setOwnerPartyKey(NullableStringFieldUpdateOperationsInput ownerPartyKey) { this.ownerPartyKey = ownerPartyKey; }
        public void setPartyNameKey(NullableStringFieldUpdateOperationsInput partyNameKey) { this.partyNameKey = partyNameKey; }
        public void setPartyNameKind(NullableStringFieldUpdateOperationsInput partyNameKind) { this.partyNameKind = partyNameKind; }
        public void setPrefixTitleCode(NullableStringFieldUpdateOperationsInput prefixTitleCode) { this.prefixTitleCode = prefixTitleCode; }
        public void setSuffix(NullableStringFieldUpdateOperationsInput suffix) { this.suffix = suffix; }
        public void setSurname(NullableStringFieldUpdateOperationsInput surname) { this.surname = surname; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setUsageCode(NullableStringFieldUpdateOperationsInput usageCode) { this.usageCode = usageCode; }
        public void setUtilizedLanguageLanguageKey(NullableStringFieldUpdateOperationsInput utilizedLanguageLanguageKey) { this.utilizedLanguageLanguageKey = utilizedLanguageLanguageKey; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setCompanyId(NullableStringFieldUpdateOperationsInput CompanyId) { this.CompanyId = CompanyId; }
        public void setOrganizationUnitId(NullableStringFieldUpdateOperationsInput OrganizationUnitId) { this.OrganizationUnitId = OrganizationUnitId; }
    }
    public static class ChildOrganizationUpdateWithoutPartyDataInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput basingPartyRoleInRelationshipSpecificationSpecificationKey;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableStringFieldUpdateOperationsInput description;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput namePartyNameKey;
        private NullableStringFieldUpdateOperationsInput partyRoleInRelationshipKind;
        private NullableStringFieldUpdateOperationsInput partyRoleKind;
        private NullableStringFieldUpdateOperationsInput playerRoleRoleKey;
        private NullableStringFieldUpdateOperationsInput playingPartyPartyKey;
        private NullableStringFieldUpdateOperationsInput roleKey;
        private NullableStringFieldUpdateOperationsInput roleKind;
        private NullableStringFieldUpdateOperationsInput rolePlayerPeriodStart;
        private NullableStringFieldUpdateOperationsInput rolePlayerPeriodEnd;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private PartyNameUpdateOneWithoutChildOrganizationInput PartyName;

        public ChildOrganizationUpdateWithoutPartyDataInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getBasingPartyRoleInRelationshipSpecificationSpecificationKey() { return this.basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableStringFieldUpdateOperationsInput getDescription() { return this.description; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getNamePartyNameKey() { return this.namePartyNameKey; }
        public NullableStringFieldUpdateOperationsInput getPartyRoleInRelationshipKind() { return this.partyRoleInRelationshipKind; }
        public NullableStringFieldUpdateOperationsInput getPartyRoleKind() { return this.partyRoleKind; }
        public NullableStringFieldUpdateOperationsInput getPlayerRoleRoleKey() { return this.playerRoleRoleKey; }
        public NullableStringFieldUpdateOperationsInput getPlayingPartyPartyKey() { return this.playingPartyPartyKey; }
        public NullableStringFieldUpdateOperationsInput getRoleKey() { return this.roleKey; }
        public NullableStringFieldUpdateOperationsInput getRoleKind() { return this.roleKind; }
        public NullableStringFieldUpdateOperationsInput getRolePlayerPeriodStart() { return this.rolePlayerPeriodStart; }
        public NullableStringFieldUpdateOperationsInput getRolePlayerPeriodEnd() { return this.rolePlayerPeriodEnd; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyNameUpdateOneWithoutChildOrganizationInput getPartyName() { return this.PartyName; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setBasingPartyRoleInRelationshipSpecificationSpecificationKey(NullableStringFieldUpdateOperationsInput basingPartyRoleInRelationshipSpecificationSpecificationKey) { this.basingPartyRoleInRelationshipSpecificationSpecificationKey = basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDescription(NullableStringFieldUpdateOperationsInput description) { this.description = description; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setNamePartyNameKey(NullableStringFieldUpdateOperationsInput namePartyNameKey) { this.namePartyNameKey = namePartyNameKey; }
        public void setPartyRoleInRelationshipKind(NullableStringFieldUpdateOperationsInput partyRoleInRelationshipKind) { this.partyRoleInRelationshipKind = partyRoleInRelationshipKind; }
        public void setPartyRoleKind(NullableStringFieldUpdateOperationsInput partyRoleKind) { this.partyRoleKind = partyRoleKind; }
        public void setPlayerRoleRoleKey(NullableStringFieldUpdateOperationsInput playerRoleRoleKey) { this.playerRoleRoleKey = playerRoleRoleKey; }
        public void setPlayingPartyPartyKey(NullableStringFieldUpdateOperationsInput playingPartyPartyKey) { this.playingPartyPartyKey = playingPartyPartyKey; }
        public void setRoleKey(NullableStringFieldUpdateOperationsInput roleKey) { this.roleKey = roleKey; }
        public void setRoleKind(NullableStringFieldUpdateOperationsInput roleKind) { this.roleKind = roleKind; }
        public void setRolePlayerPeriodStart(NullableStringFieldUpdateOperationsInput rolePlayerPeriodStart) { this.rolePlayerPeriodStart = rolePlayerPeriodStart; }
        public void setRolePlayerPeriodEnd(NullableStringFieldUpdateOperationsInput rolePlayerPeriodEnd) { this.rolePlayerPeriodEnd = rolePlayerPeriodEnd; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setPartyName(PartyNameUpdateOneWithoutChildOrganizationInput PartyName) { this.PartyName = PartyName; }
    }
    public static class ChildOrganizationUpdateManyDataInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput basingPartyRoleInRelationshipSpecificationSpecificationKey;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableStringFieldUpdateOperationsInput description;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput namePartyNameKey;
        private NullableStringFieldUpdateOperationsInput partyRoleInRelationshipKind;
        private NullableStringFieldUpdateOperationsInput partyRoleKind;
        private NullableStringFieldUpdateOperationsInput playerRoleRoleKey;
        private NullableStringFieldUpdateOperationsInput playingPartyPartyKey;
        private NullableStringFieldUpdateOperationsInput roleKey;
        private NullableStringFieldUpdateOperationsInput roleKind;
        private NullableStringFieldUpdateOperationsInput rolePlayerPeriodStart;
        private NullableStringFieldUpdateOperationsInput rolePlayerPeriodEnd;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;

        public ChildOrganizationUpdateManyDataInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getBasingPartyRoleInRelationshipSpecificationSpecificationKey() { return this.basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableStringFieldUpdateOperationsInput getDescription() { return this.description; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getNamePartyNameKey() { return this.namePartyNameKey; }
        public NullableStringFieldUpdateOperationsInput getPartyRoleInRelationshipKind() { return this.partyRoleInRelationshipKind; }
        public NullableStringFieldUpdateOperationsInput getPartyRoleKind() { return this.partyRoleKind; }
        public NullableStringFieldUpdateOperationsInput getPlayerRoleRoleKey() { return this.playerRoleRoleKey; }
        public NullableStringFieldUpdateOperationsInput getPlayingPartyPartyKey() { return this.playingPartyPartyKey; }
        public NullableStringFieldUpdateOperationsInput getRoleKey() { return this.roleKey; }
        public NullableStringFieldUpdateOperationsInput getRoleKind() { return this.roleKind; }
        public NullableStringFieldUpdateOperationsInput getRolePlayerPeriodStart() { return this.rolePlayerPeriodStart; }
        public NullableStringFieldUpdateOperationsInput getRolePlayerPeriodEnd() { return this.rolePlayerPeriodEnd; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setBasingPartyRoleInRelationshipSpecificationSpecificationKey(NullableStringFieldUpdateOperationsInput basingPartyRoleInRelationshipSpecificationSpecificationKey) { this.basingPartyRoleInRelationshipSpecificationSpecificationKey = basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDescription(NullableStringFieldUpdateOperationsInput description) { this.description = description; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setNamePartyNameKey(NullableStringFieldUpdateOperationsInput namePartyNameKey) { this.namePartyNameKey = namePartyNameKey; }
        public void setPartyRoleInRelationshipKind(NullableStringFieldUpdateOperationsInput partyRoleInRelationshipKind) { this.partyRoleInRelationshipKind = partyRoleInRelationshipKind; }
        public void setPartyRoleKind(NullableStringFieldUpdateOperationsInput partyRoleKind) { this.partyRoleKind = partyRoleKind; }
        public void setPlayerRoleRoleKey(NullableStringFieldUpdateOperationsInput playerRoleRoleKey) { this.playerRoleRoleKey = playerRoleRoleKey; }
        public void setPlayingPartyPartyKey(NullableStringFieldUpdateOperationsInput playingPartyPartyKey) { this.playingPartyPartyKey = playingPartyPartyKey; }
        public void setRoleKey(NullableStringFieldUpdateOperationsInput roleKey) { this.roleKey = roleKey; }
        public void setRoleKind(NullableStringFieldUpdateOperationsInput roleKind) { this.roleKind = roleKind; }
        public void setRolePlayerPeriodStart(NullableStringFieldUpdateOperationsInput rolePlayerPeriodStart) { this.rolePlayerPeriodStart = rolePlayerPeriodStart; }
        public void setRolePlayerPeriodEnd(NullableStringFieldUpdateOperationsInput rolePlayerPeriodEnd) { this.rolePlayerPeriodEnd = rolePlayerPeriodEnd; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
    }
    public static class ChildOrganizationUpdateWithoutPartyNameDataInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput basingPartyRoleInRelationshipSpecificationSpecificationKey;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableStringFieldUpdateOperationsInput description;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput namePartyNameKey;
        private NullableStringFieldUpdateOperationsInput partyRoleInRelationshipKind;
        private NullableStringFieldUpdateOperationsInput partyRoleKind;
        private NullableStringFieldUpdateOperationsInput playerRoleRoleKey;
        private NullableStringFieldUpdateOperationsInput playingPartyPartyKey;
        private NullableStringFieldUpdateOperationsInput roleKey;
        private NullableStringFieldUpdateOperationsInput roleKind;
        private NullableStringFieldUpdateOperationsInput rolePlayerPeriodStart;
        private NullableStringFieldUpdateOperationsInput rolePlayerPeriodEnd;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private PartyUpdateOneWithoutChildOrganizationInput Party;

        public ChildOrganizationUpdateWithoutPartyNameDataInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getBasingPartyRoleInRelationshipSpecificationSpecificationKey() { return this.basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableStringFieldUpdateOperationsInput getDescription() { return this.description; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getNamePartyNameKey() { return this.namePartyNameKey; }
        public NullableStringFieldUpdateOperationsInput getPartyRoleInRelationshipKind() { return this.partyRoleInRelationshipKind; }
        public NullableStringFieldUpdateOperationsInput getPartyRoleKind() { return this.partyRoleKind; }
        public NullableStringFieldUpdateOperationsInput getPlayerRoleRoleKey() { return this.playerRoleRoleKey; }
        public NullableStringFieldUpdateOperationsInput getPlayingPartyPartyKey() { return this.playingPartyPartyKey; }
        public NullableStringFieldUpdateOperationsInput getRoleKey() { return this.roleKey; }
        public NullableStringFieldUpdateOperationsInput getRoleKind() { return this.roleKind; }
        public NullableStringFieldUpdateOperationsInput getRolePlayerPeriodStart() { return this.rolePlayerPeriodStart; }
        public NullableStringFieldUpdateOperationsInput getRolePlayerPeriodEnd() { return this.rolePlayerPeriodEnd; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public PartyUpdateOneWithoutChildOrganizationInput getParty() { return this.Party; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setBasingPartyRoleInRelationshipSpecificationSpecificationKey(NullableStringFieldUpdateOperationsInput basingPartyRoleInRelationshipSpecificationSpecificationKey) { this.basingPartyRoleInRelationshipSpecificationSpecificationKey = basingPartyRoleInRelationshipSpecificationSpecificationKey; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDescription(NullableStringFieldUpdateOperationsInput description) { this.description = description; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setNamePartyNameKey(NullableStringFieldUpdateOperationsInput namePartyNameKey) { this.namePartyNameKey = namePartyNameKey; }
        public void setPartyRoleInRelationshipKind(NullableStringFieldUpdateOperationsInput partyRoleInRelationshipKind) { this.partyRoleInRelationshipKind = partyRoleInRelationshipKind; }
        public void setPartyRoleKind(NullableStringFieldUpdateOperationsInput partyRoleKind) { this.partyRoleKind = partyRoleKind; }
        public void setPlayerRoleRoleKey(NullableStringFieldUpdateOperationsInput playerRoleRoleKey) { this.playerRoleRoleKey = playerRoleRoleKey; }
        public void setPlayingPartyPartyKey(NullableStringFieldUpdateOperationsInput playingPartyPartyKey) { this.playingPartyPartyKey = playingPartyPartyKey; }
        public void setRoleKey(NullableStringFieldUpdateOperationsInput roleKey) { this.roleKey = roleKey; }
        public void setRoleKind(NullableStringFieldUpdateOperationsInput roleKind) { this.roleKind = roleKind; }
        public void setRolePlayerPeriodStart(NullableStringFieldUpdateOperationsInput rolePlayerPeriodStart) { this.rolePlayerPeriodStart = rolePlayerPeriodStart; }
        public void setRolePlayerPeriodEnd(NullableStringFieldUpdateOperationsInput rolePlayerPeriodEnd) { this.rolePlayerPeriodEnd = rolePlayerPeriodEnd; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setParty(PartyUpdateOneWithoutChildOrganizationInput Party) { this.Party = Party; }
    }
    public static class PartyNameUpdateWithoutPersonDataInput {
        private StringFieldUpdateOperationsInput id;
        private NullableStringFieldUpdateOperationsInput basicDataCompleteCode;
        private NullableStringFieldUpdateOperationsInput creationDateTime;
        private NullableBoolFieldUpdateOperationsInput defaultIndicator;
        private NullableStringFieldUpdateOperationsInput description;
        private NullableStringFieldUpdateOperationsInput effectivePeriodStart;
        private NullableStringFieldUpdateOperationsInput effectivePeriodEnd;
        private NullableStringFieldUpdateOperationsInput fullName;
        private NullableStringFieldUpdateOperationsInput givenName;
        private NullableStringFieldUpdateOperationsInput informationModelObjectKind;
        private NullableStringFieldUpdateOperationsInput middleName;
        private NullableStringFieldUpdateOperationsInput ownerPartyKey;
        private NullableStringFieldUpdateOperationsInput partyNameKey;
        private NullableStringFieldUpdateOperationsInput partyNameKind;
        private NullableStringFieldUpdateOperationsInput prefixTitleCode;
        private NullableStringFieldUpdateOperationsInput suffix;
        private NullableStringFieldUpdateOperationsInput surname;
        private NullableStringFieldUpdateOperationsInput typeName;
        private NullableStringFieldUpdateOperationsInput usageCode;
        private NullableStringFieldUpdateOperationsInput utilizedLanguageLanguageKey;
        private NullableStringFieldUpdateOperationsInput txGlobalTypeName;
        private NullableStringFieldUpdateOperationsInput txTypeCode;
        private NullableStringFieldUpdateOperationsInput txPrimaryKey;
        private NullableStringFieldUpdateOperationsInput txMetaSourceKey;
        private NullableStringFieldUpdateOperationsInput txMetaStartEventTime;
        private NullableStringFieldUpdateOperationsInput txMetaLoadTime;
        private NullableStringFieldUpdateOperationsInput txMetaSource;
        private NullableStringFieldUpdateOperationsInput txMetaCorrection;
        private NullableStringFieldUpdateOperationsInput txMetaChange;
        private NullableIntFieldUpdateOperationsInput txMetaAccessFilter;
        private NullableStringFieldUpdateOperationsInput CompanyId;
        private NullableStringFieldUpdateOperationsInput OrganizationUnitId;
        private ChildOrganizationUpdateManyWithoutPartyNameInput ChildOrganization;
        private PartyUpdateOneWithoutPartyNameInput Party;

        public PartyNameUpdateWithoutPersonDataInput() {}

        public StringFieldUpdateOperationsInput getId() { return this.id; }
        public NullableStringFieldUpdateOperationsInput getBasicDataCompleteCode() { return this.basicDataCompleteCode; }
        public NullableStringFieldUpdateOperationsInput getCreationDateTime() { return this.creationDateTime; }
        public NullableBoolFieldUpdateOperationsInput getDefaultIndicator() { return this.defaultIndicator; }
        public NullableStringFieldUpdateOperationsInput getDescription() { return this.description; }
        public NullableStringFieldUpdateOperationsInput getEffectivePeriodStart() { return this.effectivePeriodStart; }
        public NullableStringFieldUpdateOperationsInput getEffectivePeriodEnd() { return this.effectivePeriodEnd; }
        public NullableStringFieldUpdateOperationsInput getFullName() { return this.fullName; }
        public NullableStringFieldUpdateOperationsInput getGivenName() { return this.givenName; }
        public NullableStringFieldUpdateOperationsInput getInformationModelObjectKind() { return this.informationModelObjectKind; }
        public NullableStringFieldUpdateOperationsInput getMiddleName() { return this.middleName; }
        public NullableStringFieldUpdateOperationsInput getOwnerPartyKey() { return this.ownerPartyKey; }
        public NullableStringFieldUpdateOperationsInput getPartyNameKey() { return this.partyNameKey; }
        public NullableStringFieldUpdateOperationsInput getPartyNameKind() { return this.partyNameKind; }
        public NullableStringFieldUpdateOperationsInput getPrefixTitleCode() { return this.prefixTitleCode; }
        public NullableStringFieldUpdateOperationsInput getSuffix() { return this.suffix; }
        public NullableStringFieldUpdateOperationsInput getSurname() { return this.surname; }
        public NullableStringFieldUpdateOperationsInput getTypeName() { return this.typeName; }
        public NullableStringFieldUpdateOperationsInput getUsageCode() { return this.usageCode; }
        public NullableStringFieldUpdateOperationsInput getUtilizedLanguageLanguageKey() { return this.utilizedLanguageLanguageKey; }
        public NullableStringFieldUpdateOperationsInput getTxGlobalTypeName() { return this.txGlobalTypeName; }
        public NullableStringFieldUpdateOperationsInput getTxTypeCode() { return this.txTypeCode; }
        public NullableStringFieldUpdateOperationsInput getTxPrimaryKey() { return this.txPrimaryKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSourceKey() { return this.txMetaSourceKey; }
        public NullableStringFieldUpdateOperationsInput getTxMetaStartEventTime() { return this.txMetaStartEventTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaLoadTime() { return this.txMetaLoadTime; }
        public NullableStringFieldUpdateOperationsInput getTxMetaSource() { return this.txMetaSource; }
        public NullableStringFieldUpdateOperationsInput getTxMetaCorrection() { return this.txMetaCorrection; }
        public NullableStringFieldUpdateOperationsInput getTxMetaChange() { return this.txMetaChange; }
        public NullableIntFieldUpdateOperationsInput getTxMetaAccessFilter() { return this.txMetaAccessFilter; }
        public NullableStringFieldUpdateOperationsInput getCompanyId() { return this.CompanyId; }
        public NullableStringFieldUpdateOperationsInput getOrganizationUnitId() { return this.OrganizationUnitId; }
        public ChildOrganizationUpdateManyWithoutPartyNameInput getChildOrganization() { return this.ChildOrganization; }
        public PartyUpdateOneWithoutPartyNameInput getParty() { return this.Party; }
        public void setId(StringFieldUpdateOperationsInput id) { this.id = id; }
        public void setBasicDataCompleteCode(NullableStringFieldUpdateOperationsInput basicDataCompleteCode) { this.basicDataCompleteCode = basicDataCompleteCode; }
        public void setCreationDateTime(NullableStringFieldUpdateOperationsInput creationDateTime) { this.creationDateTime = creationDateTime; }
        public void setDefaultIndicator(NullableBoolFieldUpdateOperationsInput defaultIndicator) { this.defaultIndicator = defaultIndicator; }
        public void setDescription(NullableStringFieldUpdateOperationsInput description) { this.description = description; }
        public void setEffectivePeriodStart(NullableStringFieldUpdateOperationsInput effectivePeriodStart) { this.effectivePeriodStart = effectivePeriodStart; }
        public void setEffectivePeriodEnd(NullableStringFieldUpdateOperationsInput effectivePeriodEnd) { this.effectivePeriodEnd = effectivePeriodEnd; }
        public void setFullName(NullableStringFieldUpdateOperationsInput fullName) { this.fullName = fullName; }
        public void setGivenName(NullableStringFieldUpdateOperationsInput givenName) { this.givenName = givenName; }
        public void setInformationModelObjectKind(NullableStringFieldUpdateOperationsInput informationModelObjectKind) { this.informationModelObjectKind = informationModelObjectKind; }
        public void setMiddleName(NullableStringFieldUpdateOperationsInput middleName) { this.middleName = middleName; }
        public void setOwnerPartyKey(NullableStringFieldUpdateOperationsInput ownerPartyKey) { this.ownerPartyKey = ownerPartyKey; }
        public void setPartyNameKey(NullableStringFieldUpdateOperationsInput partyNameKey) { this.partyNameKey = partyNameKey; }
        public void setPartyNameKind(NullableStringFieldUpdateOperationsInput partyNameKind) { this.partyNameKind = partyNameKind; }
        public void setPrefixTitleCode(NullableStringFieldUpdateOperationsInput prefixTitleCode) { this.prefixTitleCode = prefixTitleCode; }
        public void setSuffix(NullableStringFieldUpdateOperationsInput suffix) { this.suffix = suffix; }
        public void setSurname(NullableStringFieldUpdateOperationsInput surname) { this.surname = surname; }
        public void setTypeName(NullableStringFieldUpdateOperationsInput typeName) { this.typeName = typeName; }
        public void setUsageCode(NullableStringFieldUpdateOperationsInput usageCode) { this.usageCode = usageCode; }
        public void setUtilizedLanguageLanguageKey(NullableStringFieldUpdateOperationsInput utilizedLanguageLanguageKey) { this.utilizedLanguageLanguageKey = utilizedLanguageLanguageKey; }
        public void setTxGlobalTypeName(NullableStringFieldUpdateOperationsInput txGlobalTypeName) { this.txGlobalTypeName = txGlobalTypeName; }
        public void setTxTypeCode(NullableStringFieldUpdateOperationsInput txTypeCode) { this.txTypeCode = txTypeCode; }
        public void setTxPrimaryKey(NullableStringFieldUpdateOperationsInput txPrimaryKey) { this.txPrimaryKey = txPrimaryKey; }
        public void setTxMetaSourceKey(NullableStringFieldUpdateOperationsInput txMetaSourceKey) { this.txMetaSourceKey = txMetaSourceKey; }
        public void setTxMetaStartEventTime(NullableStringFieldUpdateOperationsInput txMetaStartEventTime) { this.txMetaStartEventTime = txMetaStartEventTime; }
        public void setTxMetaLoadTime(NullableStringFieldUpdateOperationsInput txMetaLoadTime) { this.txMetaLoadTime = txMetaLoadTime; }
        public void setTxMetaSource(NullableStringFieldUpdateOperationsInput txMetaSource) { this.txMetaSource = txMetaSource; }
        public void setTxMetaCorrection(NullableStringFieldUpdateOperationsInput txMetaCorrection) { this.txMetaCorrection = txMetaCorrection; }
        public void setTxMetaChange(NullableStringFieldUpdateOperationsInput txMetaChange) { this.txMetaChange = txMetaChange; }
        public void setTxMetaAccessFilter(NullableIntFieldUpdateOperationsInput txMetaAccessFilter) { this.txMetaAccessFilter = txMetaAccessFilter; }
        public void setCompanyId(NullableStringFieldUpdateOperationsInput CompanyId) { this.CompanyId = CompanyId; }
        public void setOrganizationUnitId(NullableStringFieldUpdateOperationsInput OrganizationUnitId) { this.OrganizationUnitId = OrganizationUnitId; }
        public void setChildOrganization(ChildOrganizationUpdateManyWithoutPartyNameInput ChildOrganization) { this.ChildOrganization = ChildOrganization; }
        public void setParty(PartyUpdateOneWithoutPartyNameInput Party) { this.Party = Party; }
    }




















    public static class PersonPartyNameArgs {
        private PartyNameWhereInput where;
        private PartyNameOrderByInput orderBy;
        private PartyNameWhereUniqueInput cursor;
        private Integer take;
        private Integer skip;
        private PartyNameDistinctFieldEnum distinct;

        public PersonPartyNameArgs() {}

        public PartyNameWhereInput getWhere() { return this.where; }
        public PartyNameOrderByInput getOrderBy() { return this.orderBy; }
        public PartyNameWhereUniqueInput getCursor() { return this.cursor; }
        public Integer getTake() { return this.take; }
        public Integer getSkip() { return this.skip; }
        public PartyNameDistinctFieldEnum getDistinct() { return this.distinct; }
        public void setWhere(PartyNameWhereInput where) { this.where = where; }
        public void setOrderBy(PartyNameOrderByInput orderBy) { this.orderBy = orderBy; }
        public void setCursor(PartyNameWhereUniqueInput cursor) { this.cursor = cursor; }
        public void setTake(Integer take) { this.take = take; }
        public void setSkip(Integer skip) { this.skip = skip; }
        public void setDistinct(PartyNameDistinctFieldEnum distinct) { this.distinct = distinct; }
    }
    public static class QueryFindOnePersonArgs {
        private PersonWhereUniqueInput where;

        public QueryFindOnePersonArgs() {}

        public PersonWhereUniqueInput getWhere() { return this.where; }
        public void setWhere(PersonWhereUniqueInput where) { this.where = where; }
    }
    public static class QueryFindManyPersonArgs {
        private PersonWhereInput where;
        private Iterable<PersonOrderByInput> orderBy;
        private PersonWhereUniqueInput cursor;
        private PersonDistinctFieldEnum distinct;
        private Integer skip;
        private Integer take;

        public QueryFindManyPersonArgs() {}

        public PersonWhereInput getWhere() { return this.where; }
        public Iterable<PersonOrderByInput> getOrderBy() { return this.orderBy; }
        public PersonWhereUniqueInput getCursor() { return this.cursor; }
        public PersonDistinctFieldEnum getDistinct() { return this.distinct; }
        public Integer getSkip() { return this.skip; }
        public Integer getTake() { return this.take; }
        public void setWhere(PersonWhereInput where) { this.where = where; }
        public void setOrderBy(Iterable<PersonOrderByInput> orderBy) { this.orderBy = orderBy; }
        public void setCursor(PersonWhereUniqueInput cursor) { this.cursor = cursor; }
        public void setDistinct(PersonDistinctFieldEnum distinct) { this.distinct = distinct; }
        public void setSkip(Integer skip) { this.skip = skip; }
        public void setTake(Integer take) { this.take = take; }
    }
    public static class QueryFindOneChildOrganizationArgs {
        private ChildOrganizationWhereUniqueInput where;

        public QueryFindOneChildOrganizationArgs() {}

        public ChildOrganizationWhereUniqueInput getWhere() { return this.where; }
        public void setWhere(ChildOrganizationWhereUniqueInput where) { this.where = where; }
    }
    public static class QueryFindManyChildOrganizationArgs {
        private ChildOrganizationWhereInput where;
        private Iterable<ChildOrganizationOrderByInput> orderBy;
        private ChildOrganizationWhereUniqueInput cursor;
        private ChildOrganizationDistinctFieldEnum distinct;
        private Integer skip;
        private Integer take;

        public QueryFindManyChildOrganizationArgs() {}

        public ChildOrganizationWhereInput getWhere() { return this.where; }
        public Iterable<ChildOrganizationOrderByInput> getOrderBy() { return this.orderBy; }
        public ChildOrganizationWhereUniqueInput getCursor() { return this.cursor; }
        public ChildOrganizationDistinctFieldEnum getDistinct() { return this.distinct; }
        public Integer getSkip() { return this.skip; }
        public Integer getTake() { return this.take; }
        public void setWhere(ChildOrganizationWhereInput where) { this.where = where; }
        public void setOrderBy(Iterable<ChildOrganizationOrderByInput> orderBy) { this.orderBy = orderBy; }
        public void setCursor(ChildOrganizationWhereUniqueInput cursor) { this.cursor = cursor; }
        public void setDistinct(ChildOrganizationDistinctFieldEnum distinct) { this.distinct = distinct; }
        public void setSkip(Integer skip) { this.skip = skip; }
        public void setTake(Integer take) { this.take = take; }
    }
    public static class QueryFindOnePartyArgs {
        private PartyWhereUniqueInput where;

        public QueryFindOnePartyArgs() {}

        public PartyWhereUniqueInput getWhere() { return this.where; }
        public void setWhere(PartyWhereUniqueInput where) { this.where = where; }
    }
    public static class QueryFindManyPartyArgs {
        private PartyWhereInput where;
        private Iterable<PartyOrderByInput> orderBy;
        private PartyWhereUniqueInput cursor;
        private PartyDistinctFieldEnum distinct;
        private Integer skip;
        private Integer take;

        public QueryFindManyPartyArgs() {}

        public PartyWhereInput getWhere() { return this.where; }
        public Iterable<PartyOrderByInput> getOrderBy() { return this.orderBy; }
        public PartyWhereUniqueInput getCursor() { return this.cursor; }
        public PartyDistinctFieldEnum getDistinct() { return this.distinct; }
        public Integer getSkip() { return this.skip; }
        public Integer getTake() { return this.take; }
        public void setWhere(PartyWhereInput where) { this.where = where; }
        public void setOrderBy(Iterable<PartyOrderByInput> orderBy) { this.orderBy = orderBy; }
        public void setCursor(PartyWhereUniqueInput cursor) { this.cursor = cursor; }
        public void setDistinct(PartyDistinctFieldEnum distinct) { this.distinct = distinct; }
        public void setSkip(Integer skip) { this.skip = skip; }
        public void setTake(Integer take) { this.take = take; }
    }
    public static class QueryFindOnePartyNameArgs {
        private PartyNameWhereUniqueInput where;

        public QueryFindOnePartyNameArgs() {}

        public PartyNameWhereUniqueInput getWhere() { return this.where; }
        public void setWhere(PartyNameWhereUniqueInput where) { this.where = where; }
    }
    public static class QueryFindManyPartyNameArgs {
        private PartyNameWhereInput where;
        private Iterable<PartyNameOrderByInput> orderBy;
        private PartyNameWhereUniqueInput cursor;
        private PartyNameDistinctFieldEnum distinct;
        private Integer skip;
        private Integer take;

        public QueryFindManyPartyNameArgs() {}

        public PartyNameWhereInput getWhere() { return this.where; }
        public Iterable<PartyNameOrderByInput> getOrderBy() { return this.orderBy; }
        public PartyNameWhereUniqueInput getCursor() { return this.cursor; }
        public PartyNameDistinctFieldEnum getDistinct() { return this.distinct; }
        public Integer getSkip() { return this.skip; }
        public Integer getTake() { return this.take; }
        public void setWhere(PartyNameWhereInput where) { this.where = where; }
        public void setOrderBy(Iterable<PartyNameOrderByInput> orderBy) { this.orderBy = orderBy; }
        public void setCursor(PartyNameWhereUniqueInput cursor) { this.cursor = cursor; }
        public void setDistinct(PartyNameDistinctFieldEnum distinct) { this.distinct = distinct; }
        public void setSkip(Integer skip) { this.skip = skip; }
        public void setTake(Integer take) { this.take = take; }
    }
    public static class MutationCreateOnePersonArgs {
        private PersonCreateInput data;

        public MutationCreateOnePersonArgs() {}

        public PersonCreateInput getData() { return this.data; }
        public void setData(PersonCreateInput data) { this.data = data; }
    }
    public static class MutationCreateOneChildOrganizationArgs {
        private ChildOrganizationCreateInput data;

        public MutationCreateOneChildOrganizationArgs() {}

        public ChildOrganizationCreateInput getData() { return this.data; }
        public void setData(ChildOrganizationCreateInput data) { this.data = data; }
    }
    public static class MutationCreateOnePartyArgs {
        private PartyCreateInput data;

        public MutationCreateOnePartyArgs() {}

        public PartyCreateInput getData() { return this.data; }
        public void setData(PartyCreateInput data) { this.data = data; }
    }
    public static class MutationCreateOnePartyNameArgs {
        private PartyNameCreateInput data;

        public MutationCreateOnePartyNameArgs() {}

        public PartyNameCreateInput getData() { return this.data; }
        public void setData(PartyNameCreateInput data) { this.data = data; }
    }

    public static class PartyPersonArgs {
        private PersonWhereInput where;
        private PersonOrderByInput orderBy;
        private PersonWhereUniqueInput cursor;
        private Integer take;
        private Integer skip;
        private PersonDistinctFieldEnum distinct;

        public PartyPersonArgs() {}

        public PersonWhereInput getWhere() { return this.where; }
        public PersonOrderByInput getOrderBy() { return this.orderBy; }
        public PersonWhereUniqueInput getCursor() { return this.cursor; }
        public Integer getTake() { return this.take; }
        public Integer getSkip() { return this.skip; }
        public PersonDistinctFieldEnum getDistinct() { return this.distinct; }
        public void setWhere(PersonWhereInput where) { this.where = where; }
        public void setOrderBy(PersonOrderByInput orderBy) { this.orderBy = orderBy; }
        public void setCursor(PersonWhereUniqueInput cursor) { this.cursor = cursor; }
        public void setTake(Integer take) { this.take = take; }
        public void setSkip(Integer skip) { this.skip = skip; }
        public void setDistinct(PersonDistinctFieldEnum distinct) { this.distinct = distinct; }
    }
    public static class PartyPartyNameArgs {
        private PartyNameWhereInput where;
        private PartyNameOrderByInput orderBy;
        private PartyNameWhereUniqueInput cursor;
        private Integer take;
        private Integer skip;
        private PartyNameDistinctFieldEnum distinct;

        public PartyPartyNameArgs() {}

        public PartyNameWhereInput getWhere() { return this.where; }
        public PartyNameOrderByInput getOrderBy() { return this.orderBy; }
        public PartyNameWhereUniqueInput getCursor() { return this.cursor; }
        public Integer getTake() { return this.take; }
        public Integer getSkip() { return this.skip; }
        public PartyNameDistinctFieldEnum getDistinct() { return this.distinct; }
        public void setWhere(PartyNameWhereInput where) { this.where = where; }
        public void setOrderBy(PartyNameOrderByInput orderBy) { this.orderBy = orderBy; }
        public void setCursor(PartyNameWhereUniqueInput cursor) { this.cursor = cursor; }
        public void setTake(Integer take) { this.take = take; }
        public void setSkip(Integer skip) { this.skip = skip; }
        public void setDistinct(PartyNameDistinctFieldEnum distinct) { this.distinct = distinct; }
    }
    public static class PartyChildOrganizationArgs {
        private ChildOrganizationWhereInput where;
        private ChildOrganizationOrderByInput orderBy;
        private ChildOrganizationWhereUniqueInput cursor;
        private Integer take;
        private Integer skip;
        private ChildOrganizationDistinctFieldEnum distinct;

        public PartyChildOrganizationArgs() {}

        public ChildOrganizationWhereInput getWhere() { return this.where; }
        public ChildOrganizationOrderByInput getOrderBy() { return this.orderBy; }
        public ChildOrganizationWhereUniqueInput getCursor() { return this.cursor; }
        public Integer getTake() { return this.take; }
        public Integer getSkip() { return this.skip; }
        public ChildOrganizationDistinctFieldEnum getDistinct() { return this.distinct; }
        public void setWhere(ChildOrganizationWhereInput where) { this.where = where; }
        public void setOrderBy(ChildOrganizationOrderByInput orderBy) { this.orderBy = orderBy; }
        public void setCursor(ChildOrganizationWhereUniqueInput cursor) { this.cursor = cursor; }
        public void setTake(Integer take) { this.take = take; }
        public void setSkip(Integer skip) { this.skip = skip; }
        public void setDistinct(ChildOrganizationDistinctFieldEnum distinct) { this.distinct = distinct; }
    }
    public static class PartyNameChildOrganizationArgs {
        private ChildOrganizationWhereInput where;
        private ChildOrganizationOrderByInput orderBy;
        private ChildOrganizationWhereUniqueInput cursor;
        private Integer take;
        private Integer skip;
        private ChildOrganizationDistinctFieldEnum distinct;

        public PartyNameChildOrganizationArgs() {}

        public ChildOrganizationWhereInput getWhere() { return this.where; }
        public ChildOrganizationOrderByInput getOrderBy() { return this.orderBy; }
        public ChildOrganizationWhereUniqueInput getCursor() { return this.cursor; }
        public Integer getTake() { return this.take; }
        public Integer getSkip() { return this.skip; }
        public ChildOrganizationDistinctFieldEnum getDistinct() { return this.distinct; }
        public void setWhere(ChildOrganizationWhereInput where) { this.where = where; }
        public void setOrderBy(ChildOrganizationOrderByInput orderBy) { this.orderBy = orderBy; }
        public void setCursor(ChildOrganizationWhereUniqueInput cursor) { this.cursor = cursor; }
        public void setTake(Integer take) { this.take = take; }
        public void setSkip(Integer skip) { this.skip = skip; }
        public void setDistinct(ChildOrganizationDistinctFieldEnum distinct) { this.distinct = distinct; }
    }
}
