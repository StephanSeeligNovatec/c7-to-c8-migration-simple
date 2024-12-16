package org.camunda.bpm.getstarted.loanapproval.service;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.stereotype.Service;

@Service
public class StartC7Service {

    private final RuntimeService runtimeService;

    public StartC7Service(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    public void startLoanApprovalProcess() {
        runtimeService.startProcessInstanceByKey("loanApproval");
    }
}
