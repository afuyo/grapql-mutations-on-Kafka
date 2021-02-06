package com.graphqlkafkaproducer.writepath.appcontext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class ApplicationContextTestResourceNameType {

    @Bean(name="namedFile")
    public File namedFile()
    {
        File namedFile = new File("namedFile.txt");
        return namedFile;
    }
    @Bean(name="defaultFile")
    public File defaultFile()
    {
        File defaultFile = new File("defaultFile.txt");
        return defaultFile;

    }
}
