package com.coding.gradebook.request;

import java.util.Date;

public class AssessmentSubmitRequest {
    private Long courseId;
    private Long userId;
    private Long accessmentId;
    private Date dtSubmitted;
    private ScoreRequest score;

    public AssessmentSubmitRequest(Long courseId, Long userId, Long accessmentId, Date dtSubmitted, ScoreRequest score) {
        this.courseId = courseId;
        this.userId = userId;
        this.accessmentId = accessmentId;
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

    public Long getAccessmentId() {
        return accessmentId;
    }

    public void setAccessmentId(Long accessmentId) {
        this.accessmentId = accessmentId;
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
}