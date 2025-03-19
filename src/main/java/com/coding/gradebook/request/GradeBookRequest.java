package com.coding.gradebook.request;

import com.coding.gradebook.response.ScoreResponse;

import java.util.Date;

public class GradeBookRequest {
    private int courseId;
    private int userId;
    private int accessmentId;
    private Date dtSubmitted;
    private ScoreResponse score;
}