package com.coding.gradebook.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreRequest {

    @NotNull(message = "Points Earned is required.")
    private BigDecimal pointsEarned;

    @NotNull(message = "Points Possible is required.")
    private BigDecimal pointsPossible;
}