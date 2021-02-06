
package com.graphqlkafkaproducer.writepath.resolvers;

//import com.graphqlkafkaproducer.writepath.models.*;
//import com.graphqlkafkaproducer.writepath.models.util.DataFetchersDelegateMutation;

import com.graphqlkafkaproducer.writepath.models2.agreement.Coverage;
import com.graphqlkafkaproducer.writepath.models2.agreement.InsuranceAgreement;
import com.graphqlkafkaproducer.writepath.models2.agreement.InsuredObject;
import com.graphqlkafkaproducer.writepath.models2.agreement.Types.InsuranceAgreementCreateInput;
import com.graphqlkafkaproducer.writepath.models2.agreement.Types.InsuredObjectCreateInput;
import com.graphqlkafkaproducer.writepath.models2.agreement.Types.CoverageCreateInput;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.schema.DataFetchingEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;

//runs on paryt Schema

@Component
public class FailsAgreement implements GraphQLMutationResolver
    //    , DataFetchersDelegateMutation

{
    private static final Logger logger = LoggerFactory.getLogger(GraphQLMutationResolver.class);

    private static final String CHILDORGANIZATIONTOPIC= "childOrganization";
    private static final String PARTYTOPIC= "party";
    private static final String PARTYNAMETOPIC = "partyName";
    private static final String PERSONTOPIC = "person";



    @Resource(name="manyToOne")
    private Map<String,List<String>> manyToOne;

    @Resource(name="oneToMany")
    private Map<String,List<String>> oneToMany;

    InsuranceAgreement createOneInsuranceAgreement(InsuranceAgreementCreateInput input, DataFetchingEnvironment env) {
    return null;
    }

    InsuredObject createOneInsuredObject(InsuredObjectCreateInput input, DataFetchingEnvironment env) {

        return null;

    }

    Coverage createOneCoverage(CoverageCreateInput input, DataFetchingEnvironment env) {
        return null;
    }
/*public InsuranceAgreement typeLoader(InsuranceAgreementCreateOneWithoutInsuranceAgreement_IncludedAgreementInput input)
{
    return null;
}*/
}


