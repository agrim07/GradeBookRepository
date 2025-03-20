package com.coding.gradebook.controller;

import com.coding.gradebook.request.AssessmentSubmitRequest;
import com.coding.gradebook.response.UserAssessmentResponse;
import com.coding.gradebook.service.GradeBookService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class GradeBookController {

    private static final Logger log = LoggerFactory.getLogger(GradeBookController.class);

    private GradeBookService gradeBookService;

    public GradeBookController(GradeBookService gradeBookService) {
        this.gradeBookService = gradeBookService;
    }

    @PostMapping("/submitAssessment")
    public ResponseEntity<String> submitAssessment(@Valid @RequestBody AssessmentSubmitRequest request) {
        log.info("Request Received to accept and record user assessment submissions{}", request);
        this.gradeBookService.submitAssessment(request);
        return ResponseEntity.ok("Assessment Submitted Successfully.");
    }

    @PostMapping("/createUser")
    public ResponseEntity<String> createUser(@RequestBody String name) {
        log.info("Request Received to create a User name {}", name);
        this.gradeBookService.createUser(name);
        return ResponseEntity.ok("User created Successfully.");
    }

    @PostMapping("/createCourse")
    public ResponseEntity<String> createCourse(@RequestBody String name) {
        log.info("Request Received to create a Course name {}", name);
        this.gradeBookService.createCourse(name);
        return ResponseEntity.ok("Course created Successfully.");
    }

    @PostMapping("/createAssessment")
    public ResponseEntity<String> createAssessment(@RequestBody String type) {
        log.info("Request Received to create a Assessment name {}", type);
        this.gradeBookService.createAssessment(type);
        return ResponseEntity.ok("Assessment created Successfully.");
    }

    @GetMapping("/usersScores")
    public ResponseEntity<List<UserAssessmentResponse>> usersScores() {
        log.info("Request Received to get scores for all users.");
        List<UserAssessmentResponse> userScores = this.gradeBookService.getUsers();
        return ResponseEntity.ok(userScores);
    }

    @GetMapping("/usersScores/{userId}")
    public ResponseEntity<UserAssessmentResponse> userScores(@PathVariable Long userId) {
        log.info("Request Received to get scores for user ID {}.", userId);
        UserAssessmentResponse responses = this.gradeBookService.getUser(userId);
        return ResponseEntity.ok(responses);
    }

}

