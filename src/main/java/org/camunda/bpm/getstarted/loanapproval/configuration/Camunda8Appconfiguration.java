package org.camunda.bpm.getstarted.loanapproval.configuration;

import io.camunda.zeebe.spring.client.annotation.Deployment;
import org.springframework.context.annotation.Configuration;

@Configuration
@Deployment(resources = "classpath*:/processesc8/*.*") // Camunda 8 Model deployment
//https://github.com/camunda-community-hub/spring-zeebe?tab=readme-ov-file#deploy-process-models
public class Camunda8Appconfiguration {
}
