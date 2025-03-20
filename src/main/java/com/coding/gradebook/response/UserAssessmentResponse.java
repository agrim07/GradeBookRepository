package com.coding.gradebook.response;

import java.util.List;

public class UserAssessmentResponse {
    private Long userId;
    private List<AssessmentResponse> assessments;

    public UserAssessmentResponse() {}

    public UserAssessmentResponse(Long userId, List<AssessmentResponse> assessments) {
        this.userId = userId;
        this.assessments = assessments;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<AssessmentResponse> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<AssessmentResponse> assessments) {
        this.assessments = assessments;
    }
}