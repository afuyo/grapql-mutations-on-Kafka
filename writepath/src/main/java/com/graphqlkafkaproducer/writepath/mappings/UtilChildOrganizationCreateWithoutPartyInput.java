package com.graphqlkafkaproducer.writepath.mappings;


import org.mapstruct.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
public class UtilChildOrganizationCreateWithoutPartyInput {
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
public @interface BasingPartyRoleInRelationshipSpecificationSpecificationKey {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface CreationDateTime {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Description {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface InformationModelObjectKind {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface NamePartyNameKey {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface PartyRoleInRelationshipKind {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface PartyRoleKind {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface PlayerRoleRoleKey {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface PlayingPartyPartyKey {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface RoleKey {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface RoleKind {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface RolePlayerPeriodStart {
}
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface RolePlayerPeriodEnd {
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

@Id
public String id(Map<String, Object> in) {
return (String)in.get("id");
}
@BasicDataCompleteCode
public String basicDataCompleteCode(Map<String, Object> in) {
return (String)in.get("basicDataCompleteCode");
}
@BasingPartyRoleInRelationshipSpecificationSpecificationKey
public String basingPartyRoleInRelationshipSpecificationSpecificationKey(Map<String, Object> in) {
return (String)in.get("basingPartyRoleInRelationshipSpecificationSpecificationKey");
}
@CreationDateTime
public String creationDateTime(Map<String, Object> in) {
return (String)in.get("creationDateTime");
}
@Description
public String description(Map<String, Object> in) {
return (String)in.get("description");
}
@InformationModelObjectKind
public String informationModelObjectKind(Map<String, Object> in) {
return (String)in.get("informationModelObjectKind");
}
@NamePartyNameKey
public String namePartyNameKey(Map<String, Object> in) {
return (String)in.get("namePartyNameKey");
}
@PartyRoleInRelationshipKind
public String partyRoleInRelationshipKind(Map<String, Object> in) {
return (String)in.get("partyRoleInRelationshipKind");
}
@PartyRoleKind
public String partyRoleKind(Map<String, Object> in) {
return (String)in.get("partyRoleKind");
}
@PlayerRoleRoleKey
public String playerRoleRoleKey(Map<String, Object> in) {
return (String)in.get("playerRoleRoleKey");
}
@PlayingPartyPartyKey
public String playingPartyPartyKey(Map<String, Object> in) {
return (String)in.get("playingPartyPartyKey");
}
@RoleKey
public String roleKey(Map<String, Object> in) {
return (String)in.get("roleKey");
}
@RoleKind
public String roleKind(Map<String, Object> in) {
return (String)in.get("roleKind");
}
@RolePlayerPeriodStart
public String rolePlayerPeriodStart(Map<String, Object> in) {
return (String)in.get("rolePlayerPeriodStart");
}
@RolePlayerPeriodEnd
public String rolePlayerPeriodEnd(Map<String, Object> in) {
return (String)in.get("rolePlayerPeriodEnd");
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
@UtilChildOrganizationCreateWithoutPartyInput.PartyName
public PartyName partyName(Map<String, Object> in) {
return (PartyName)in.get("PartyName");
}
}
