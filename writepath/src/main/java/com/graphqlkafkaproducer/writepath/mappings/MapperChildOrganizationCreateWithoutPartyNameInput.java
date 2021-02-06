package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.ChildOrganizationCreateWithoutPartyNameInput;
import com.graphqlkafkaproducer.writepath.models2.ChildOrganization;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperChildOrganizationCreateWithoutPartyNameInput {
MapperChildOrganizationCreateWithoutPartyNameInput MAPPER = Mappers.getMapper(MapperChildOrganizationCreateWithoutPartyNameInput.class);
@Mappings( {
@Mapping(target=" party" , ignore= true ),
})
ChildOrganization toTarget(ChildOrganizationCreateWithoutPartyNameInput source);
}