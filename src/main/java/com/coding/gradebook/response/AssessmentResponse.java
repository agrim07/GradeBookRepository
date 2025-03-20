package com.coding.gradebook.response;

public class AssessmentResponse {
    private Long courseId;
    private Long assessmentId;
    private String dtSubmitted;
    private ScoreResponse score;

    public AssessmentResponse() {}

    public AssessmentResponse(Long courseId, Long assessmentId, String dtSubmitted, ScoreResponse score) {
        this.courseId = courseId;
        this.assessmentId = assessmentId;
        this.dtSubmitted = dtSubmitted;
        this.score = score;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Long assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getDtSubmitted() {
        return dtSubmitted;
    }

    public void setDtSubmitted(String dtSubmitted) {
        this.dtSubmitted = dtSubmitted;
    }

    public ScoreResponse getScore() {
        return score;
    }

    public void setScore(ScoreResponse score) {
        this.score = score;
    }
}