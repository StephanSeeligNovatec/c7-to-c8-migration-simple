package org.camunda.bpm.getstarted.loanapproval.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class LoggingService {
    private final Logger LOGGER = Logger.getLogger(LoggingService.class.getName());

    public void doLogging(DelegateExecution execution) {
        LOGGER.info("\n ... LoggerDelegate invoked by \n"
                + "activityName='" + execution.getCurrentActivityName() + "'"
                + ", activityId=" + execution.getCurrentActivityId()
                + ", processDefinitionId=" + execution.getProcessDefinitionId()
                + ", processInstanceId=" + execution.getProcessInstanceId()
                + ", businessKey=" + execution.getProcessBusinessKey()
                + ", executionId=" + execution.getId()
                + ", variables=" + execution.getVariables()
                + " \n\n");
    }

    public void newLogging(String jobType, Long key, String elementId, Long elementInstanceKey, Long processInstanceKey, Long processDefinitionKey, String variables) {
        LOGGER.info("\n ... LoggerDelegate invoked by \n"
                + "jobType='" + jobType + "'"
                + ", key=" + key
                + ", elementId=" + elementId
                + ", elementInstanceKey=" + elementInstanceKey
                + ", processInstanceKey=" + processInstanceKey
                + ", processDefinitionKey=" + processDefinitionKey
                + ", variables=" + variables
                + " \n\n");
    }
}
