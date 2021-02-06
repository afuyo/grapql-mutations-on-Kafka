package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PersonCreateWithoutPartyInput;
import com.graphqlkafkaproducer.writepath.models2.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperPersonCreateWithoutPartyInput {
MapperPersonCreateWithoutPartyInput MAPPER = Mappers.getMapper(MapperPersonCreateWithoutPartyInput.class);
@Mappings( {
@Mapping(target=" partyName" , ignore= true ),
})
Person toTarget(PersonCreateWithoutPartyInput source);
}