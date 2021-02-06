package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.ChildOrganizationCreateWithoutPartyNameInput;
import com.graphqlkafkaproducer.writepath.models2.Types2.HashMapWrapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper(uses= UtilChildOrganizationCreateWithoutPartyNameInput.class)
public interface MapperChildOrganizationCreateWithoutPartyNameInputUtil {

MapperChildOrganizationCreateWithoutPartyNameInputUtil MAPPER = Mappers.getMapper(MapperChildOrganizationCreateWithoutPartyNameInputUtil.class);
@Mappings( {
@Mapping(source = "meta", target = "id", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.Id.class ),
@Mapping(source = "meta", target = "basicDataCompleteCode", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.BasicDataCompleteCode.class ),
@Mapping(source = "meta", target = "basingPartyRoleInRelationshipSpecificationSpecificationKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.BasingPartyRoleInRelationshipSpecificationSpecificationKey.class ),
@Mapping(source = "meta", target = "creationDateTime", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.CreationDateTime.class ),
@Mapping(source = "meta", target = "description", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.Description.class ),
@Mapping(source = "meta", target = "informationModelObjectKind", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.InformationModelObjectKind.class ),
@Mapping(source = "meta", target = "namePartyNameKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.NamePartyNameKey.class ),
@Mapping(source = "meta", target = "partyRoleInRelationshipKind", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.PartyRoleInRelationshipKind.class ),
@Mapping(source = "meta", target = "partyRoleKind", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.PartyRoleKind.class ),
@Mapping(source = "meta", target = "playerRoleRoleKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.PlayerRoleRoleKey.class ),
@Mapping(source = "meta", target = "playingPartyPartyKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.PlayingPartyPartyKey.class ),
@Mapping(source = "meta", target = "roleKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.RoleKey.class ),
@Mapping(source = "meta", target = "roleKind", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.RoleKind.class ),
@Mapping(source = "meta", target = "rolePlayerPeriodStart", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.RolePlayerPeriodStart.class ),
@Mapping(source = "meta", target = "rolePlayerPeriodEnd", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.RolePlayerPeriodEnd.class ),
@Mapping(source = "meta", target = "typeName", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.TypeName.class ),
@Mapping(source = "meta", target = "txGlobalTypeName", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.TxGlobalTypeName.class ),
@Mapping(source = "meta", target = "txTypeCode", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.TxTypeCode.class ),
@Mapping(source = "meta", target = "txPrimaryKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.TxPrimaryKey.class ),
@Mapping(source = "meta", target = "txMetaSourceKey", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.TxMetaSourceKey.class ),
@Mapping(source = "meta", target = "txMetaStartEventTime", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.TxMetaStartEventTime.class ),
@Mapping(source = "meta", target = "txMetaLoadTime", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.TxMetaLoadTime.class ),
@Mapping(source = "meta", target = "txMetaSource", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.TxMetaSource.class ),
@Mapping(source = "meta", target = "txMetaCorrection", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.TxMetaCorrection.class ),
@Mapping(source = "meta", target = "txMetaChange", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.TxMetaChange.class ),
@Mapping(source = "meta", target = "txMetaAccessFilter", qualifiedBy = UtilChildOrganizationCreateWithoutPartyNameInput.TxMetaAccessFilter.class ),
@Mapping(target=" party" , ignore= true ),
})
ChildOrganizationCreateWithoutPartyNameInput toTarget(HashMapWrapper source);
}