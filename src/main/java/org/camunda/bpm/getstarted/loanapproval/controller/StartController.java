package org.camunda.bpm.getstarted.loanapproval.controller;

import org.camunda.bpm.getstarted.loanapproval.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StartController {

    private final StartService startService;

    public StartController(StartService startService) {
        this.startService = startService;
    }

    @PostMapping("/start-process")
    public ResponseEntity<String> startProcess() {
        startService.startLoanApprovalProcess();
        return ResponseEntity.ok("Process started!");
    }

}