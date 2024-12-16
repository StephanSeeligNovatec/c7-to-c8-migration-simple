package org.camunda.bpm.getstarted.loanapproval.service;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StartService {

    private final RuntimeService runtimeService;

    public StartService(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    public void startLoanApprovalProcess() {
        runtimeService.startProcessInstanceByKey("loanApproval");
    }
}
