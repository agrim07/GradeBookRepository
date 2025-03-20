package com.coding.gradebook.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssessmentSubmitRequest {
    @NotNull(message = "Course ID is required.")
    private Long courseId;

    @NotNull(message = "User Id is required.")
    private Long userId;

    @NotNull(message = "Assessment Id is required.")
    private Long assessmentId;

    @NotNull(message = "Score is required.")
    private ScoreRequest score;
}