package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PersonCreateWithoutPartyNameInput;
import com.graphqlkafkaproducer.writepath.models2.Types2.HashMapWrapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper(uses= UtilPersonCreateWithoutPartyNameInput.class)
public interface MapperPersonCreateWithoutPartyNameInputUtil {

MapperPersonCreateWithoutPartyNameInputUtil MAPPER = Mappers.getMapper(MapperPersonCreateWithoutPartyNameInputUtil.class);
@Mappings( {
@Mapping(source = "meta", target = "id", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.Id.class ),
@Mapping(source = "meta", target = "birthDateTime", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.BirthDateTime.class ),
@Mapping(source = "meta", target = "bloodTypeCode", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.BloodTypeCode.class ),
@Mapping(source = "meta", target = "deathIndicator", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.DeathIndicator.class ),
@Mapping(source = "meta", target = "ethnicityCode", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.EthnicityCode.class ),
@Mapping(source = "meta", target = "genderCode", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.GenderCode.class ),
@Mapping(source = "meta", target = "maritalStatusCode", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.MaritalStatusCode.class ),
@Mapping(source = "meta", target = "missingDateTime", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.MissingDateTime.class ),
@Mapping(source = "meta", target = "missingIndicator", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.MissingIndicator.class ),
@Mapping(source = "meta", target = "partyKey", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.PartyKey.class ),
@Mapping(source = "meta", target = "primaryLanguageLanguageKey", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.PrimaryLanguageLanguageKey.class ),
@Mapping(source = "meta", target = "txGlobalGenderCode", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.TxGlobalGenderCode.class ),
@Mapping(source = "meta", target = "txPrimaryKey", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.TxPrimaryKey.class ),
@Mapping(source = "meta", target = "txMetaSourceKey", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.TxMetaSourceKey.class ),
@Mapping(source = "meta", target = "txMetaStartEventTime", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.TxMetaStartEventTime.class ),
@Mapping(source = "meta", target = "txMetaLoadTime", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.TxMetaLoadTime.class ),
@Mapping(source = "meta", target = "txMetaSource", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.TxMetaSource.class ),
@Mapping(source = "meta", target = "txMetaCorrection", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.TxMetaCorrection.class ),
@Mapping(source = "meta", target = "txMetaChange", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.TxMetaChange.class ),
@Mapping(source = "meta", target = "txMetaAccessFilter", qualifiedBy = UtilPersonCreateWithoutPartyNameInput.TxMetaAccessFilter.class ),
@Mapping(target=" party" , ignore= true ),
})
PersonCreateWithoutPartyNameInput toTarget(HashMapWrapper source);
}