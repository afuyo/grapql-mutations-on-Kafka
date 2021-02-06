package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.ChildOrganizationCreateWithoutPartyInput;
import com.graphqlkafkaproducer.writepath.models2.Types2.HashMapWrapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper(uses= UtilChildOrganizationCreateWithoutPartyInput.class)
public interface MapperChildOrganizationCreateWithoutPartyInputUtil {

MapperChildOrganizationCreateWithoutPartyInputUtil MAPPER = Mappers.getMapper(MapperChildOrganizationCreateWithoutPartyInputUtil.class);
@Mappings( {
@Mapping(source = "meta", target = "id", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.Id.class ),
@Mapping(source = "meta", target = "basicDataCompleteCode", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.BasicDataCompleteCode.class ),
@Mapping(source = "meta", target = "basingPartyRoleInRelationshipSpecificationSpecificationKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.BasingPartyRoleInRelationshipSpecificationSpecificationKey.class ),
@Mapping(source = "meta", target = "creationDateTime", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.CreationDateTime.class ),
@Mapping(source = "meta", target = "description", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.Description.class ),
@Mapping(source = "meta", target = "informationModelObjectKind", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.InformationModelObjectKind.class ),
@Mapping(source = "meta", target = "namePartyNameKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.NamePartyNameKey.class ),
@Mapping(source = "meta", target = "partyRoleInRelationshipKind", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.PartyRoleInRelationshipKind.class ),
@Mapping(source = "meta", target = "partyRoleKind", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.PartyRoleKind.class ),
@Mapping(source = "meta", target = "playerRoleRoleKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.PlayerRoleRoleKey.class ),
@Mapping(source = "meta", target = "playingPartyPartyKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.PlayingPartyPartyKey.class ),
@Mapping(source = "meta", target = "roleKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.RoleKey.class ),
@Mapping(source = "meta", target = "roleKind", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.RoleKind.class ),
@Mapping(source = "meta", target = "rolePlayerPeriodStart", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.RolePlayerPeriodStart.class ),
@Mapping(source = "meta", target = "rolePlayerPeriodEnd", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.RolePlayerPeriodEnd.class ),
@Mapping(source = "meta", target = "typeName", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.TypeName.class ),
@Mapping(source = "meta", target = "txGlobalTypeName", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.TxGlobalTypeName.class ),
@Mapping(source = "meta", target = "txTypeCode", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.TxTypeCode.class ),
@Mapping(source = "meta", target = "txPrimaryKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.TxPrimaryKey.class ),
@Mapping(source = "meta", target = "txMetaSourceKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.TxMetaSourceKey.class ),
@Mapping(source = "meta", target = "txMetaStartEventTime", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.TxMetaStartEventTime.class ),
@Mapping(source = "meta", target = "txMetaLoadTime", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.TxMetaLoadTime.class ),
@Mapping(source = "meta", target = "txMetaSource", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.TxMetaSource.class ),
@Mapping(source = "meta", target = "txMetaCorrection", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.TxMetaCorrection.class ),
@Mapping(source = "meta", target = "txMetaChange", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.TxMetaChange.class ),
@Mapping(source = "meta", target = "txMetaAccessFilter", qualifiedBy = UtilChildOrganizationCreateWithoutPartyInput.TxMetaAccessFilter.class ),
@Mapping(target=" partyName" , ignore= true ),
})
ChildOrganizationCreateWithoutPartyInput toTarget(HashMapWrapper source);
}