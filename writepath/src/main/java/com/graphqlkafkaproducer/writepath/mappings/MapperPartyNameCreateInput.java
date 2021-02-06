package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PartyNameCreateInput;
import com.graphqlkafkaproducer.writepath.models2.PartyName;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperPartyNameCreateInput {
MapperPartyNameCreateInput MAPPER = Mappers.getMapper(MapperPartyNameCreateInput.class);
@Mappings( {
@Mapping(target=" childOrganization" , ignore= true ),
@Mapping(target=" person" , ignore= true ),
@Mapping(target=" party" , ignore= true ),
})
PartyName toTarget(PartyNameCreateInput source);
}