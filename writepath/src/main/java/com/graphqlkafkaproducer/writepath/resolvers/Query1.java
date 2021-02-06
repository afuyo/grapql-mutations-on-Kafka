package com.graphqlkafkaproducer.writepath.resolvers;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import graphql.GraphQL;
import graphql.kickstart.tools.GraphQLQueryResolver;

import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.URL;

@Component
public class Query1 implements GraphQLQueryResolver{

   private GraphQL graphQL;

   @Bean
   public GraphQL graphQL()
   {
       return graphQL;
   }
    @PostConstruct
    public void init() throws IOException {
        URL url = Resources.getResource("worksperson.graphqls1");
        String sdl = Resources.toString(url, Charsets.UTF_8);
        GraphQLSchema graphQLSchema = buildSchema(sdl);
        this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();
    }

    private GraphQLSchema buildSchema(String sdl) {
        TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(sdl);
        RuntimeWiring runtimeWiring = buildWiring();
        SchemaGenerator schemaGenerator = new SchemaGenerator();
        return schemaGenerator.makeExecutableSchema(typeRegistry, runtimeWiring);
    }


    private RuntimeWiring buildWiring() {
        return RuntimeWiring.newRuntimeWiring()
                .build();
    }
    public String hello() {
        return "Hello";
    }
   // findOneInsuranceAgreement(where: InsuranceAgreementWhereUniqueInput!): InsuranceAgreement
  //  public InsuranceAgreement findOneInsuranceAgreement(Types.InsuranceAgreementWhereUniqueInput input){return null;}
}
