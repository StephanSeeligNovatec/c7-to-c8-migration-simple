package org.camunda.bpm.getstarted.loanapproval.service;

import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.response.ProcessInstanceEvent;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.logging.Logger;

@Service
public class StartC8Service {
    private final Logger LOGGER = Logger.getLogger(StartC8Service.class.getName());

    private final ZeebeClient zeebeClient;

    public StartC8Service(ZeebeClient zeebeClient) {
        this.zeebeClient = zeebeClient;
    }

    public void startProcessInstance(String processId, Map<String, Object> variables) {
        ProcessInstanceEvent processInstanceResult = zeebeClient.newCreateInstanceCommand()
                .bpmnProcessId(processId)
                .latestVersion()
                .variables(variables)
                .send()
                .join();

        LOGGER.info("Started process instance with key: " + processInstanceResult.getProcessInstanceKey());
    }
}