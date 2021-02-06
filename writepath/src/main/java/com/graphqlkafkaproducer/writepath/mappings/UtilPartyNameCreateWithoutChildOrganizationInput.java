package com.graphqlkafkaproducer.writepath.mappings;


import org.mapstruct.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
public class UtilPartyNameCreateWithoutChildOrganizationInput {
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Id {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface BasicDataCompleteCode {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface CreationDateTime {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface DefaultIndicator {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Description {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface EffectivePeriodStart {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface EffectivePeriodEnd {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface FullName {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface GivenName {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface InformationModelObjectKind {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface MiddleName {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface OwnerPartyKey {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface PartyNameKey {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface PartyNameKind {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface PrefixTitleCode {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Suffix {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Surname {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TypeName {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface UsageCode {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface UtilizedLanguageLanguageKey {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TxGlobalTypeName {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TxTypeCode {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TxPrimaryKey {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TxMetaSourceKey {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TxMetaStartEventTime {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TxMetaLoadTime {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TxMetaSource {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TxMetaCorrection {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TxMetaChange {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TxMetaAccessFilter {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface CompanyId {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface OrganizationUnitId {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Person {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Party {
}

@Id
public String id(Map<String, Object> in) {
return (String)in.get("id");
}
@BasicDataCompleteCode
public String basicDataCompleteCode(Map<String, Object> in) {
return (String)in.get("basicDataCompleteCode");
}
@CreationDateTime
public String creationDateTime(Map<String, Object> in) {
return (String)in.get("creationDateTime");
}
@DefaultIndicator
public Boolean defaultIndicator(Map<String, Object> in) {
return (Boolean)in.get("defaultIndicator");
}
@Description
public String description(Map<String, Object> in) {
return (String)in.get("description");
}
@EffectivePeriodStart
public String effectivePeriodStart(Map<String, Object> in) {
return (String)in.get("effectivePeriodStart");
}
@EffectivePeriodEnd
public String effectivePeriodEnd(Map<String, Object> in) {
return (String)in.get("effectivePeriodEnd");
}
@FullName
public String fullName(Map<String, Object> in) {
return (String)in.get("fullName");
}
@GivenName
public String givenName(Map<String, Object> in) {
return (String)in.get("givenName");
}
@InformationModelObjectKind
public String informationModelObjectKind(Map<String, Object> in) {
return (String)in.get("informationModelObjectKind");
}
@MiddleName
public String middleName(Map<String, Object> in) {
return (String)in.get("middleName");
}
@OwnerPartyKey
public String ownerPartyKey(Map<String, Object> in) {
return (String)in.get("ownerPartyKey");
}
@PartyNameKey
public String partyNameKey(Map<String, Object> in) {
return (String)in.get("partyNameKey");
}
@PartyNameKind
public String partyNameKind(Map<String, Object> in) {
return (String)in.get("partyNameKind");
}
@PrefixTitleCode
public String prefixTitleCode(Map<String, Object> in) {
return (String)in.get("prefixTitleCode");
}
@Suffix
public String suffix(Map<String, Object> in) {
return (String)in.get("suffix");
}
@Surname
public String surname(Map<String, Object> in) {
return (String)in.get("surname");
}
@TypeName
public String typeName(Map<String, Object> in) {
return (String)in.get("typeName");
}
@UsageCode
public String usageCode(Map<String, Object> in) {
return (String)in.get("usageCode");
}
@UtilizedLanguageLanguageKey
public String utilizedLanguageLanguageKey(Map<String, Object> in) {
return (String)in.get("utilizedLanguageLanguageKey");
}
@TxGlobalTypeName
public String txGlobalTypeName(Map<String, Object> in) {
return (String)in.get("txGlobalTypeName");
}
@TxTypeCode
public String txTypeCode(Map<String, Object> in) {
return (String)in.get("txTypeCode");
}
@TxPrimaryKey
public String txPrimaryKey(Map<String, Object> in) {
return (String)in.get("txPrimaryKey");
}
@TxMetaSourceKey
public String txMetaSourceKey(Map<String, Object> in) {
return (String)in.get("txMetaSourceKey");
}
@TxMetaStartEventTime
public String txMetaStartEventTime(Map<String, Object> in) {
return (String)in.get("txMetaStartEventTime");
}
@TxMetaLoadTime
public String txMetaLoadTime(Map<String, Object> in) {
return (String)in.get("txMetaLoadTime");
}
@TxMetaSource
public String txMetaSource(Map<String, Object> in) {
return (String)in.get("txMetaSource");
}
@TxMetaCorrection
public String txMetaCorrection(Map<String, Object> in) {
return (String)in.get("txMetaCorrection");
}
@TxMetaChange
public String txMetaChange(Map<String, Object> in) {
return (String)in.get("txMetaChange");
}
@TxMetaAccessFilter
public Integer txMetaAccessFilter(Map<String, Object> in) {
return (Integer)in.get("txMetaAccessFilter");
}
@CompanyId
public String companyId(Map<String, Object> in) {
return (String)in.get("CompanyId");
}
@OrganizationUnitId
public String organizationUnitId(Map<String, Object> in) {
return (String)in.get("OrganizationUnitId");
}
@UtilPartyNameCreateWithoutChildOrganizationInput.Person
public Person person(Map<String, Object> in) {
return (Person)in.get("Person");
}
@UtilPartyNameCreateWithoutChildOrganizationInput.Party
public Party party(Map<String, Object> in) {
return (Party)in.get("Party");
}
}
