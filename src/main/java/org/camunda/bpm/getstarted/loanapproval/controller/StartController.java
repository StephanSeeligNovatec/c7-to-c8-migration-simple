package org.camunda.bpm.getstarted.loanapproval.controller;

import org.camunda.bpm.getstarted.loanapproval.service.StartC7Service;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StartController {

    private final StartC7Service startC7Service;

    public StartController(StartC7Service startC7Service) {
        this.startC7Service = startC7Service;
    }

    @PostMapping("/start-process")
    public ResponseEntity<String> startProcess() {
        startC7Service.startLoanApprovalProcess();
        return ResponseEntity.ok("Process started!");
    }

}