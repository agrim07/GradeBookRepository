package com.coding.gradebook.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAssessmentResponse {
    private Long userId;
    private List<AssessmentResponse> assessments;
}