package com.coding.gradebook.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssessmentResponse {
    private Long courseId;
    private Long assessmentId;
    private String dtSubmitted;
    private ScoreResponse score;
}