package org.camunda.bpm.getstarted.loanapproval.worker;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.camunda.bpm.getstarted.loanapproval.exceptions.CouldNotCompleteJobException;
import org.camunda.bpm.getstarted.loanapproval.service.LoggingService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AnotherC8DoSomething {

    private final LoggingService loggingService;

    public AnotherC8DoSomething(LoggingService loggingService) {
        this.loggingService = loggingService;
    }

    @JobWorker(type = "do-something")
    public void handleJobFoo(final JobClient client, final ActivatedJob job) {

        loggingService.newLogging(job.getType(), job.getKey(), job.getElementId(), job.getElementInstanceKey(),
                job.getProcessInstanceKey(), job.getProcessDefinitionKey(), job.getVariables());


        client.newCompleteCommand(job.getKey())
                .send()
                .exceptionally( throwable -> {
                    throw new CouldNotCompleteJobException(job, throwable);
                });
    }


}
