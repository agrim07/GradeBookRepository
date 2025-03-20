package com.coding.gradebook.response;

import java.math.BigDecimal;

public class ScoreResponse {

    private BigDecimal pointsEarned;
    private BigDecimal pointsPossible;

    public ScoreResponse() {}

    public ScoreResponse(BigDecimal pointsEarned, BigDecimal pointsPossible) {
        this.pointsEarned = pointsEarned;
        this.pointsPossible = pointsPossible;
    }

    public BigDecimal getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(BigDecimal pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public BigDecimal getPointsPossible() {
        return pointsPossible;
    }

    public void setPointsPossible(BigDecimal pointsPossible) {
        this.pointsPossible = pointsPossible;
    }
}