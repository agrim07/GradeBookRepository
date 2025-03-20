package com.coding.gradebook.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreResponse {
    private BigDecimal pointsEarned;
    private BigDecimal pointsPossible;
}