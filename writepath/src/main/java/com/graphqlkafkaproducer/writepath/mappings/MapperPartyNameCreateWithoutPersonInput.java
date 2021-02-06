package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PartyNameCreateWithoutPersonInput;
import com.graphqlkafkaproducer.writepath.models2.PartyName;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperPartyNameCreateWithoutPersonInput {
MapperPartyNameCreateWithoutPersonInput MAPPER = Mappers.getMapper(MapperPartyNameCreateWithoutPersonInput.class);
@Mappings( {
@Mapping(target=" childOrganization" , ignore= true ),
@Mapping(target=" party" , ignore= true ),
})
PartyName toTarget(PartyNameCreateWithoutPersonInput source);
}