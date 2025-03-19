package com.coding.gradebook.response;

import java.util.Date;

public class GradeBookResponse {
    private int courseId;
    private int userId;
    private int accessmentId;
    private Date dtSubmitted;
    private ScoreResponse score;
}