package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PartyCreateWithoutPersonInput;
import com.graphqlkafkaproducer.writepath.models2.Party;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperPartyCreateWithoutPersonInput {
MapperPartyCreateWithoutPersonInput MAPPER = Mappers.getMapper(MapperPartyCreateWithoutPersonInput.class);
@Mappings( {
@Mapping(target=" partyName" , ignore= true ),
@Mapping(target=" childOrganization" , ignore= true ),
})
Party toTarget(PartyCreateWithoutPersonInput source);
}