package com.graphqlkafkaproducer.writepath.mappings;


import org.mapstruct.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
public class UtilPersonCreateWithoutPartyInput {
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Id {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface BirthDateTime {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface BloodTypeCode {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface DeathIndicator {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface EthnicityCode {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface GenderCode {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface MaritalStatusCode {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface MissingDateTime {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface MissingIndicator {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface PartyKey {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface PrimaryLanguageLanguageKey {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TxGlobalGenderCode {
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
public @interface PartyName {
}

@Id
public String id(Map<String, Object> in) {
return (String)in.get("id");
}
@BirthDateTime
public String birthDateTime(Map<String, Object> in) {
return (String)in.get("birthDateTime");
}
@BloodTypeCode
public String bloodTypeCode(Map<String, Object> in) {
return (String)in.get("bloodTypeCode");
}
@DeathIndicator
public Boolean deathIndicator(Map<String, Object> in) {
return (Boolean)in.get("deathIndicator");
}
@EthnicityCode
public String ethnicityCode(Map<String, Object> in) {
return (String)in.get("ethnicityCode");
}
@GenderCode
public String genderCode(Map<String, Object> in) {
return (String)in.get("genderCode");
}
@MaritalStatusCode
public String maritalStatusCode(Map<String, Object> in) {
return (String)in.get("maritalStatusCode");
}
@MissingDateTime
public String missingDateTime(Map<String, Object> in) {
return (String)in.get("missingDateTime");
}
@MissingIndicator
public Boolean missingIndicator(Map<String, Object> in) {
return (Boolean)in.get("missingIndicator");
}
@PartyKey
public String partyKey(Map<String, Object> in) {
return (String)in.get("partyKey");
}
@PrimaryLanguageLanguageKey
public String primaryLanguageLanguageKey(Map<String, Object> in) {
return (String)in.get("primaryLanguageLanguageKey");
}
@TxGlobalGenderCode
public String txGlobalGenderCode(Map<String, Object> in) {
return (String)in.get("txGlobalGenderCode");
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
@UtilPersonCreateWithoutPartyInput.PartyName
public PartyName partyName(Map<String, Object> in) {
return (PartyName)in.get("PartyName");
}
}
