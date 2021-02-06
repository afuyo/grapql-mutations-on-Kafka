package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PartyNameCreateWithoutChildOrganizationInput;
import com.graphqlkafkaproducer.writepath.models2.PartyName;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperPartyNameCreateWithoutChildOrganizationInput {
MapperPartyNameCreateWithoutChildOrganizationInput MAPPER = Mappers.getMapper(MapperPartyNameCreateWithoutChildOrganizationInput.class);
@Mappings( {
@Mapping(target=" person" , ignore= true ),
@Mapping(target=" party" , ignore= true ),
})
PartyName toTarget(PartyNameCreateWithoutChildOrganizationInput source);
}