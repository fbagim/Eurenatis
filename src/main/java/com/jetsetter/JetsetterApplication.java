package com.jetsetter;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import test.TestJSON;

@Configuration
@ComponentScan
@SpringBootApplication(scanBasePackages = {"com.test.cinglevue"})

public class JetsetterApplication {
    @Autowired
  //  private ElasticsearchOperations elasticsearchOperations;

    public static void main(String[] args) throws JsonProcessingException {
       new TestJSON().convert();
        SpringApplication.run(JetsetterApplication.class, args);
    }
}


