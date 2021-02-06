package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.ChildOrganizationCreateWithoutPartyInput;
import com.graphqlkafkaproducer.writepath.models2.ChildOrganization;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperChildOrganizationCreateWithoutPartyInput {
MapperChildOrganizationCreateWithoutPartyInput MAPPER = Mappers.getMapper(MapperChildOrganizationCreateWithoutPartyInput.class);
@Mappings( {
@Mapping(target=" partyName" , ignore= true ),
})
ChildOrganization toTarget(ChildOrganizationCreateWithoutPartyInput source);
}