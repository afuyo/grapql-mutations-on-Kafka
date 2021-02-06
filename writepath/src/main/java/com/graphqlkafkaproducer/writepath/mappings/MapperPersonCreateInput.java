package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.PersonCreateInput;
import com.graphqlkafkaproducer.writepath.models2.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperPersonCreateInput {
MapperPersonCreateInput MAPPER = Mappers.getMapper(MapperPersonCreateInput.class);
@Mappings( {
@Mapping(target=" partyName" , ignore= true ),
@Mapping(target=" party" , ignore= true ),
})
Person toTarget(PersonCreateInput source);
}