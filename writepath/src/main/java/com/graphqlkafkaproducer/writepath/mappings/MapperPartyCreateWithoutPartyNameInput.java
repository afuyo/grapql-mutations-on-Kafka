package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PartyCreateWithoutPartyNameInput;
import com.graphqlkafkaproducer.writepath.models2.Party;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperPartyCreateWithoutPartyNameInput {
MapperPartyCreateWithoutPartyNameInput MAPPER = Mappers.getMapper(MapperPartyCreateWithoutPartyNameInput.class);
@Mappings( {
@Mapping(target=" person" , ignore= true ),
@Mapping(target=" childOrganization" , ignore= true ),
})
Party toTarget(PartyCreateWithoutPartyNameInput source);
}