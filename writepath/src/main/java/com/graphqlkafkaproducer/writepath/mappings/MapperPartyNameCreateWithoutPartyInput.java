package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PartyNameCreateWithoutPartyInput;
import com.graphqlkafkaproducer.writepath.models2.PartyName;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperPartyNameCreateWithoutPartyInput {
MapperPartyNameCreateWithoutPartyInput MAPPER = Mappers.getMapper(MapperPartyNameCreateWithoutPartyInput.class);
@Mappings( {
@Mapping(target=" childOrganization" , ignore= true ),
@Mapping(target=" person" , ignore= true ),
})
PartyName toTarget(PartyNameCreateWithoutPartyInput source);
}