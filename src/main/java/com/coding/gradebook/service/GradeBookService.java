package com.coding.gradebook.service;

import com.coding.gradebook.Domain.Assessment;
import com.coding.gradebook.Domain.Course;
import com.coding.gradebook.Domain.Score;
import com.coding.gradebook.Domain.User;
import com.coding.gradebook.repository.GradeBookRepository;
import com.coding.gradebook.request.AssessmentSubmitRequest;
import org.springframework.stereotype.Service;

@Service
public class GradeBookService {

    private GradeBookRepository gradeBookRepository;

    public GradeBookService(GradeBookRepository gradeBookRepository) {
        this.gradeBookRepository = gradeBookRepository;
    }

    public void submitAssessment(AssessmentSubmitRequest request) {
        Score score = mapToScoreEntity(request);
        gradeBookRepository.save(score);
    }

    private Score mapToScoreEntity(AssessmentSubmitRequest request) {
        return new Score(new User("Dummy-Name"), new Course( "Dummy-Java"),
                new Assessment( "Dummy-Quiz"), request.getScore().getPointsEarned(),
                request.getScore().getPointsPossible());
    }
}
