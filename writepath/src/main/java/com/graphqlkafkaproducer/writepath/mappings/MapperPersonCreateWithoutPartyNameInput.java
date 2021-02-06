package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PersonCreateWithoutPartyNameInput;
import com.graphqlkafkaproducer.writepath.models2.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperPersonCreateWithoutPartyNameInput {
MapperPersonCreateWithoutPartyNameInput MAPPER = Mappers.getMapper(MapperPersonCreateWithoutPartyNameInput.class);
@Mappings( {
@Mapping(target=" party" , ignore= true ),
})
Person toTarget(PersonCreateWithoutPartyNameInput source);
}