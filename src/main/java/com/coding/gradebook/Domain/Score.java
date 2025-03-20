package com.coding.gradebook.Domain;

import com.coding.gradebook.constant.GradeBookConstant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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


    public Score(User user, Course course, Assessment assessment, BigDecimal pointsEarned,
                 BigDecimal pointsPossible) {
        this.user = user;
        this.course = course;
        this.assessment = assessment;
        this.pointsEarned = pointsEarned;
        this.pointsPossible = pointsPossible;
    }

    @PrePersist
    @PreUpdate
    public void insertUpdatePreEvent() {
        if(null == attemptedOn) {
            attemptedOn = GradeBookConstant.dateFormat.format(System.currentTimeMillis());
        }
    }
}