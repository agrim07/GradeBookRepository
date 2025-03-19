package com.coding.gradebook.request;

import java.math.BigDecimal;

public class ScoreRequest {

    private BigDecimal pointsEarned;
    private BigDecimal pointsPossible;

    public ScoreRequest(BigDecimal pointsEarned, BigDecimal pointsPossible) {
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

    @Override
    public String toString() {
        return "ScoreRequest{" +
                "pointsEarned=" + pointsEarned +
                ", pointsPossible=" + pointsPossible +
                '}';
    }
}