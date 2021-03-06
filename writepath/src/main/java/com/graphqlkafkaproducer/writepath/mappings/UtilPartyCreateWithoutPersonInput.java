package com.graphqlkafkaproducer.writepath.mappings;


import org.mapstruct.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
public class UtilPartyCreateWithoutPersonInput {
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
public @interface InformationModelObjectKind {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface PartyKey {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface PartyKind {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface TypeName {
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
public @interface PartyName {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface ChildOrganization {
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
@InformationModelObjectKind
public String informationModelObjectKind(Map<String, Object> in) {
return (String)in.get("informationModelObjectKind");
}
@PartyKey
public String partyKey(Map<String, Object> in) {
return (String)in.get("partyKey");
}
@PartyKind
public String partyKind(Map<String, Object> in) {
return (String)in.get("partyKind");
}
@TypeName
public String typeName(Map<String, Object> in) {
return (String)in.get("typeName");
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
@UtilPartyCreateWithoutPersonInput.PartyName
public PartyName partyName(Map<String, Object> in) {
return (PartyName)in.get("PartyName");
}
@UtilPartyCreateWithoutPersonInput.ChildOrganization
public ChildOrganization childOrganization(Map<String, Object> in) {
return (ChildOrganization)in.get("ChildOrganization");
}
}
