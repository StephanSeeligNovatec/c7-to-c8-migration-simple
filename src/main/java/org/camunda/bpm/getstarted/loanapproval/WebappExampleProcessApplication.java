/*
 * Copyright Camunda Services GmbH and/or licensed to Camunda Services GmbH
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. Camunda licenses this file to you under the Apache License,
 * Version 2.0; you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.engine.RuntimeService;
import io.camunda.zeebe.spring.client.annotation.Deployment;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;

@SpringBootApplication
//@Deployment(resources = "classpath*:/processesc8/*.*") // Camunda 8 Model deployment  // TODO Siehe Camunda8Appconfiguration Class
//https://github.com/camunda-community-hub/spring-zeebe?tab=readme-ov-file#deploy-process-models
public class WebappExampleProcessApplication {

    private final RuntimeService runtimeService;

    public WebappExampleProcessApplication(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    public static void main(String... args) {
        SpringApplication.run(WebappExampleProcessApplication.class, args);
    }

    @EventListener
    public void processPostDeploy(PostDeployEvent event) {
        runtimeService.startProcessInstanceByKey("loanApproval");
    }

}