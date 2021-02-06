package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PartyCreateWithoutChildOrganizationInput;
import com.graphqlkafkaproducer.writepath.models2.Types2.HashMapWrapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper(uses= UtilPartyCreateWithoutChildOrganizationInput.class)
public interface MapperPartyCreateWithoutChildOrganizationInputUtil {

MapperPartyCreateWithoutChildOrganizationInputUtil MAPPER = Mappers.getMapper(MapperPartyCreateWithoutChildOrganizationInputUtil.class);
@Mappings( {
@Mapping(source = "meta", target = "id", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.Id.class ),
@Mapping(source = "meta", target = "basicDataCompleteCode", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.BasicDataCompleteCode.class ),
@Mapping(source = "meta", target = "creationDateTime", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.CreationDateTime.class ),
@Mapping(source = "meta", target = "informationModelObjectKind", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.InformationModelObjectKind.class ),
@Mapping(source = "meta", target = "partyKey", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.PartyKey.class ),
@Mapping(source = "meta", target = "partyKind", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.PartyKind.class ),
@Mapping(source = "meta", target = "typeName", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.TypeName.class ),
@Mapping(source = "meta", target = "txGlobalTypeName", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.TxGlobalTypeName.class ),
@Mapping(source = "meta", target = "txTypeCode", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.TxTypeCode.class ),
@Mapping(source = "meta", target = "txPrimaryKey", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.TxPrimaryKey.class ),
@Mapping(source = "meta", target = "txMetaSourceKey", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.TxMetaSourceKey.class ),
@Mapping(source = "meta", target = "txMetaStartEventTime", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.TxMetaStartEventTime.class ),
@Mapping(source = "meta", target = "txMetaLoadTime", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.TxMetaLoadTime.class ),
@Mapping(source = "meta", target = "txMetaSource", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.TxMetaSource.class ),
@Mapping(source = "meta", target = "txMetaCorrection", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.TxMetaCorrection.class ),
@Mapping(source = "meta", target = "txMetaChange", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.TxMetaChange.class ),
@Mapping(source = "meta", target = "txMetaAccessFilter", qualifiedBy = UtilPartyCreateWithoutChildOrganizationInput.TxMetaAccessFilter.class ),
@Mapping(target=" person" , ignore= true ),
@Mapping(target=" partyName" , ignore= true ),
})
PartyCreateWithoutChildOrganizationInput toTarget(HashMapWrapper source);
}