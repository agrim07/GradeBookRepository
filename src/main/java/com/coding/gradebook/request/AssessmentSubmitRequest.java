package com.coding.gradebook.request;

import java.util.Date;

public class AssessmentSubmitRequest {
    private Long courseId;
    private Long userId;
    private Long assessmentId;
    private Date dtSubmitted;
    private ScoreRequest score;

    public AssessmentSubmitRequest(Long courseId, Long userId, Long assessmentId, Date dtSubmitted, ScoreRequest score) {
        this.courseId = courseId;
        this.userId = userId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Long assessmentId) {
        this.assessmentId = assessmentId;
    }

    public Date getDtSubmitted() {
        return dtSubmitted;
    }

    public void setDtSubmitted(Date dtSubmitted) {
        this.dtSubmitted = dtSubmitted;
    }

    public ScoreRequest getScore() {
        return score;
    }

    public void setScore(ScoreRequest score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "AssessmentSubmitRequest{" +
                "courseId=" + courseId +
                ", userId=" + userId +
                ", assessmentId=" + assessmentId +
                ", dtSubmitted=" + dtSubmitted +
                ", score=" + score +
                '}';
    }
}