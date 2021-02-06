package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PartyCreateWithoutChildOrganizationInput;
import com.graphqlkafkaproducer.writepath.models2.Party;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperPartyCreateWithoutChildOrganizationInput {
MapperPartyCreateWithoutChildOrganizationInput MAPPER = Mappers.getMapper(MapperPartyCreateWithoutChildOrganizationInput.class);
@Mappings( {
@Mapping(target=" person" , ignore= true ),
@Mapping(target=" partyName" , ignore= true ),
})
Party toTarget(PartyCreateWithoutChildOrganizationInput source);
}