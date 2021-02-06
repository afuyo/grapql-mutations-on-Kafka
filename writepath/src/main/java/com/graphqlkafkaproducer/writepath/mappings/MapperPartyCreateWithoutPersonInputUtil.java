package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PartyCreateWithoutPersonInput;
import com.graphqlkafkaproducer.writepath.models2.Types2.HashMapWrapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper(uses= UtilPartyCreateWithoutPersonInput.class)
public interface MapperPartyCreateWithoutPersonInputUtil {

MapperPartyCreateWithoutPersonInputUtil MAPPER = Mappers.getMapper(MapperPartyCreateWithoutPersonInputUtil.class);
@Mappings( {
@Mapping(source = "meta", target = "id", qualifiedBy = UtilPartyCreateWithoutPersonInput.Id.class ),
@Mapping(source = "meta", target = "basicDataCompleteCode", qualifiedBy = UtilPartyCreateWithoutPersonInput.BasicDataCompleteCode.class ),
@Mapping(source = "meta", target = "creationDateTime", qualifiedBy = UtilPartyCreateWithoutPersonInput.CreationDateTime.class ),
@Mapping(source = "meta", target = "informationModelObjectKind", qualifiedBy = UtilPartyCreateWithoutPersonInput.InformationModelObjectKind.class ),
@Mapping(source = "meta", target = "partyKey", qualifiedBy = UtilPartyCreateWithoutPersonInput.PartyKey.class ),
@Mapping(source = "meta", target = "partyKind", qualifiedBy = UtilPartyCreateWithoutPersonInput.PartyKind.class ),
@Mapping(source = "meta", target = "typeName", qualifiedBy = UtilPartyCreateWithoutPersonInput.TypeName.class ),
@Mapping(source = "meta", target = "txGlobalTypeName", qualifiedBy = UtilPartyCreateWithoutPersonInput.TxGlobalTypeName.class ),
@Mapping(source = "meta", target = "txTypeCode", qualifiedBy = UtilPartyCreateWithoutPersonInput.TxTypeCode.class ),
@Mapping(source = "meta", target = "txPrimaryKey", qualifiedBy = UtilPartyCreateWithoutPersonInput.TxPrimaryKey.class ),
@Mapping(source = "meta", target = "txMetaSourceKey", qualifiedBy = UtilPartyCreateWithoutPersonInput.TxMetaSourceKey.class ),
@Mapping(source = "meta", target = "txMetaStartEventTime", qualifiedBy = UtilPartyCreateWithoutPersonInput.TxMetaStartEventTime.class ),
@Mapping(source = "meta", target = "txMetaLoadTime", qualifiedBy = UtilPartyCreateWithoutPersonInput.TxMetaLoadTime.class ),
@Mapping(source = "meta", target = "txMetaSource", qualifiedBy = UtilPartyCreateWithoutPersonInput.TxMetaSource.class ),
@Mapping(source = "meta", target = "txMetaCorrection", qualifiedBy = UtilPartyCreateWithoutPersonInput.TxMetaCorrection.class ),
@Mapping(source = "meta", target = "txMetaChange", qualifiedBy = UtilPartyCreateWithoutPersonInput.TxMetaChange.class ),
@Mapping(source = "meta", target = "txMetaAccessFilter", qualifiedBy = UtilPartyCreateWithoutPersonInput.TxMetaAccessFilter.class ),
@Mapping(target=" partyName" , ignore= true ),
@Mapping(target=" childOrganization" , ignore= true ),
})
PartyCreateWithoutPersonInput toTarget(HashMapWrapper source);
}