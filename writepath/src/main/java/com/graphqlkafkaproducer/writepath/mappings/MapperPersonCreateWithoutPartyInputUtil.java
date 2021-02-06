package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PersonCreateWithoutPartyInput;
import com.graphqlkafkaproducer.writepath.models2.Types2.HashMapWrapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper(uses= UtilPersonCreateWithoutPartyInput.class)
public interface MapperPersonCreateWithoutPartyInputUtil {

MapperPersonCreateWithoutPartyInputUtil MAPPER = Mappers.getMapper(MapperPersonCreateWithoutPartyInputUtil.class);
@Mappings( {
@Mapping(source = "meta", target = "id", qualifiedBy = UtilPersonCreateWithoutPartyInput.Id.class ),
@Mapping(source = "meta", target = "birthDateTime", qualifiedBy = UtilPersonCreateWithoutPartyInput.BirthDateTime.class ),
@Mapping(source = "meta", target = "bloodTypeCode", qualifiedBy = UtilPersonCreateWithoutPartyInput.BloodTypeCode.class ),
@Mapping(source = "meta", target = "deathIndicator", qualifiedBy = UtilPersonCreateWithoutPartyInput.DeathIndicator.class ),
@Mapping(source = "meta", target = "ethnicityCode", qualifiedBy = UtilPersonCreateWithoutPartyInput.EthnicityCode.class ),
@Mapping(source = "meta", target = "genderCode", qualifiedBy = UtilPersonCreateWithoutPartyInput.GenderCode.class ),
@Mapping(source = "meta", target = "maritalStatusCode", qualifiedBy = UtilPersonCreateWithoutPartyInput.MaritalStatusCode.class ),
@Mapping(source = "meta", target = "missingDateTime", qualifiedBy = UtilPersonCreateWithoutPartyInput.MissingDateTime.class ),
@Mapping(source = "meta", target = "missingIndicator", qualifiedBy = UtilPersonCreateWithoutPartyInput.MissingIndicator.class ),
@Mapping(source = "meta", target = "partyKey", qualifiedBy = UtilPersonCreateWithoutPartyInput.PartyKey.class ),
@Mapping(source = "meta", target = "primaryLanguageLanguageKey", qualifiedBy = UtilPersonCreateWithoutPartyInput.PrimaryLanguageLanguageKey.class ),
@Mapping(source = "meta", target = "txGlobalGenderCode", qualifiedBy = UtilPersonCreateWithoutPartyInput.TxGlobalGenderCode.class ),
@Mapping(source = "meta", target = "txPrimaryKey", qualifiedBy = UtilPersonCreateWithoutPartyInput.TxPrimaryKey.class ),
@Mapping(source = "meta", target = "txMetaSourceKey", qualifiedBy = UtilPersonCreateWithoutPartyInput.TxMetaSourceKey.class ),
@Mapping(source = "meta", target = "txMetaStartEventTime", qualifiedBy = UtilPersonCreateWithoutPartyInput.TxMetaStartEventTime.class ),
@Mapping(source = "meta", target = "txMetaLoadTime", qualifiedBy = UtilPersonCreateWithoutPartyInput.TxMetaLoadTime.class ),
@Mapping(source = "meta", target = "txMetaSource", qualifiedBy = UtilPersonCreateWithoutPartyInput.TxMetaSource.class ),
@Mapping(source = "meta", target = "txMetaCorrection", qualifiedBy = UtilPersonCreateWithoutPartyInput.TxMetaCorrection.class ),
@Mapping(source = "meta", target = "txMetaChange", qualifiedBy = UtilPersonCreateWithoutPartyInput.TxMetaChange.class ),
@Mapping(source = "meta", target = "txMetaAccessFilter", qualifiedBy = UtilPersonCreateWithoutPartyInput.TxMetaAccessFilter.class ),
@Mapping(target=" partyName" , ignore= true ),
})
PersonCreateWithoutPartyInput toTarget(HashMapWrapper source);
}