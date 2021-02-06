package com.graphqlkafkaproducer.writepath.mappings;


import com.graphqlkafkaproducer.writepath.models2.Types.ChildOrganizationCreateInput;
import com.graphqlkafkaproducer.writepath.models2.ChildOrganization;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MapperChildOrganizationCreateInput {
MapperChildOrganizationCreateInput MAPPER = Mappers.getMapper(MapperChildOrganizationCreateInput.class);
@Mappings( {
@Mapping(target=" party" , ignore= true ),
@Mapping(target=" partyName" , ignore= true ),
})
ChildOrganization toTarget(ChildOrganizationCreateInput source);
}