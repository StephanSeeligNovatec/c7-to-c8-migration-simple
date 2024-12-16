package org.camunda.bpm.getstarted.loanapproval.controller;

import org.camunda.bpm.getstarted.loanapproval.service.StartC7Service;
import org.camunda.bpm.getstarted.loanapproval.service.StartC8Service;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;

@Controller
public class StartController {

    private final StartC7Service startC7Service;
    private final StartC8Service startC8Service;

    public StartController(StartC7Service startC7Service, StartC8Service startC8Service) {
        this.startC7Service = startC7Service;
        this.startC8Service = startC8Service;
    }

    @PostMapping("/start-process")
    public ResponseEntity<String> startProcess() {
        startC7Service.startLoanApprovalProcess();
        return ResponseEntity.ok("Process started!");
    }

    @PostMapping("/start-c8-process")
    public ResponseEntity<String> startC8Process() {
        startC8Service.startProcessInstance("RunOnCamunda8", Collections.emptyMap());
        return ResponseEntity.ok("Process started!");
    }

}