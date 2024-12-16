package org.camunda.bpm.getstarted.loanapproval.exceptions;

import io.camunda.zeebe.client.api.response.ActivatedJob;

import static java.lang.String.format;

public class CouldNotCompleteJobException extends RuntimeException {
    public CouldNotCompleteJobException(final ActivatedJob job, Throwable cause) {
        super(format("Could not complete job %s", job), cause);
    }
}