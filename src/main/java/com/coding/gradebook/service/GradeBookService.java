package com.coding.gradebook.service;

import com.coding.gradebook.Domain.Assessment;
import com.coding.gradebook.Domain.Course;
import com.coding.gradebook.Domain.Score;
import com.coding.gradebook.Domain.User;
import com.coding.gradebook.repository.AssessmentRepository;
import com.coding.gradebook.repository.CourseRepository;
import com.coding.gradebook.repository.ScoreRepository;
import com.coding.gradebook.repository.UserRepository;
import com.coding.gradebook.request.AssessmentSubmitRequest;
import org.springframework.stereotype.Service;

@Service
public class GradeBookService {

    private UserRepository userRepository;
    private CourseRepository courseRepository;
    private AssessmentRepository assessmentRepository;
    private ScoreRepository scoreRepository;

    public GradeBookService(ScoreRepository gradeBookRepository, UserRepository userRepository,
                            CourseRepository courseRepository, AssessmentRepository assessmentRepository) {
        this.userRepository = userRepository;
        this.courseRepository = courseRepository;
        this.assessmentRepository = assessmentRepository;
        this.scoreRepository = gradeBookRepository;
    }

    public void submitAssessment(AssessmentSubmitRequest request) {
        Score score = mapToScoreEntity(request);
        scoreRepository.save(score);
    }

    public void createUser(String name) {
        userRepository.save(new User(name));
    }

    public void createCourse(String name) {
        courseRepository.save(new Course(name));
    }

    public void createAssessment(String type) {
        assessmentRepository.save(new Assessment(type));
    }

    private Score mapToScoreEntity(AssessmentSubmitRequest request) {
        return new Score(new User(request.getUserId()), new Course( request.getCourseId()),
                new Assessment( request.getAssessmentId()), request.getScore().getPointsEarned(),
                request.getScore().getPointsPossible());
    }
}
