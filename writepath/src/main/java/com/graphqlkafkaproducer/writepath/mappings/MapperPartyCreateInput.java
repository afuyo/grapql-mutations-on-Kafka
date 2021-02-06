package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PartyCreateInput;
import com.graphqlkafkaproducer.writepath.models2.Party;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperPartyCreateInput {
MapperPartyCreateInput MAPPER = Mappers.getMapper(MapperPartyCreateInput.class);
@Mappings( {
@Mapping(target=" person" , ignore= true ),
@Mapping(target=" partyName" , ignore= true ),
@Mapping(target=" childOrganization" , ignore= true ),
})
Party toTarget(PartyCreateInput source);
}