package com.cognizant.auditchecklist.controller;

import java.util.List;

import com.cognizant.auditchecklist.exception.QuestionsNotFound;
import com.cognizant.auditchecklist.model.AuditQuestions;
import com.cognizant.auditchecklist.service.AuditChecklistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/checklist")
@Slf4j
public class AuditChecklistController {
	
	/** 
     * This class is handling all the end points for Audit Checklist microservice. 
     * This controller has mappings as-
     * 			Getmapping-auditchecklistquestions()
     */

    @Autowired
    private AuditChecklistService auditChecklistService;
    
    
    /** 
      Returns the Questions according to the User's input whether he has chosen Internal or SOX audit type
     */

    @GetMapping("/auditchecklistquestions/{auditType}")
    @ApiOperation(value = "gets list of checklist questions from database.", notes = "this request should get the audit type and return the checklist questions", response = AuditChecklistService.class)
    public ResponseEntity<List<AuditQuestions>> getAuditQuestions(@RequestHeader("Authorization") String jwt,
            @PathVariable String auditType) {
        log.debug("inside the /checklist/auditchecklistquestions API");
        List<AuditQuestions> questions = No.xml(auditType);
        public void Nocode(){
            log.info("code is missing !!");
        }
        

    }
}
