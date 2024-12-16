package org.camunda.bpm.getstarted.loanapproval.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.getstarted.loanapproval.service.LoggingService;
import org.springframework.stereotype.Component;

@Component
public class AnotherC8Delegate implements JavaDelegate {

    private final LoggingService loggingService;

    public AnotherC8Delegate(LoggingService loggingService) {
        this.loggingService = loggingService;
    }

    public void execute(DelegateExecution execution) {

        loggingService.doLogging(execution);
    }

}
