package com.coding.gradebook.Domain;

import com.coding.gradebook.constant.GradeBookConstant;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false, nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "USER_ID", referencedColumnName = "id")
    private User user;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "COURSE_ID", referencedColumnName = "id")
    private Course course;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "ASSESSMENT_ID", referencedColumnName = "id")
    private Assessment assessment;

    @Column(name = "POINTS_EARNED")
    private BigDecimal pointsEarned;

    @Column(name = "POINTS_POSSIBLE")
    private BigDecimal pointsPossible;

    @Column(name = "TIMESTAMP")
    private String  attemptedOn;

    public Score() { }

    public Score(User user, Course course, Assessment assessment, BigDecimal pointsEarned,
                 BigDecimal pointsPossible) {
        this.user = user;
        this.course = course;
        this.assessment = assessment;
        this.pointsEarned = pointsEarned;
        this.pointsPossible = pointsPossible;
    }

    public Score(Long id, User user, Course course, Assessment assessment, BigDecimal pointsEarned,
                 BigDecimal pointsPossible, String attemptedOn) {
        this.id = id;
        this.user = user;
        this.course = course;
        this.assessment = assessment;
        this.pointsEarned = pointsEarned;
        this.pointsPossible = pointsPossible;
        this.attemptedOn = attemptedOn;
    }

    @PrePersist
    @PreUpdate
    public void insertUpdatePreEvent() {
        if(null == attemptedOn) {
            attemptedOn = GradeBookConstant.dateFormat.format(System.currentTimeMillis());
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Assessment getAssessment() {
        return assessment;
    }

    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
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

    public String getAttemptedOn() {
        return attemptedOn;
    }

    public void setAttemptedOn(String attemptedOn) {
        this.attemptedOn = attemptedOn;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", user=" + user +
                ", course=" + course +
                ", assessment=" + assessment +
                ", pointsEarned=" + pointsEarned +
                ", pointsPossible=" + pointsPossible +
                ", attemptedOn='" + attemptedOn + '\'' +
                '}';
    }
}