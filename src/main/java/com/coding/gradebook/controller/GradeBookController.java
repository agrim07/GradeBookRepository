package com.coding.gradebook.controller;

import com.coding.gradebook.request.AssessmentSubmitRequest;
import com.coding.gradebook.service.GradeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/v1")
public class GradeBookController {

    private static final Logger log = LoggerFactory.getLogger(GradeBookController.class);

    private GradeBookService gradeBookService;

    public GradeBookController(GradeBookService gradeBookService) {
        this.gradeBookService = gradeBookService;
    }

    @PostMapping("/submitAssessment")
    public ResponseEntity<String> createStock(@RequestBody AssessmentSubmitRequest request) {
        log.info("Request Received to accept and record user assessment submissions{}", request);
        this.gradeBookService.submitAssessment(request);
        return ResponseEntity.ok("Assessment Submitted Successfully.");
    }

}

