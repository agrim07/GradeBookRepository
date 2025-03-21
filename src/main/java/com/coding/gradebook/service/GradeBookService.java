package com.coding.gradebook.service;

import com.coding.gradebook.Domain.Assessment;
import com.coding.gradebook.Domain.Course;
import com.coding.gradebook.Domain.Score;
import com.coding.gradebook.Domain.User;
import com.coding.gradebook.exception.RecordNotFoundException;
import com.coding.gradebook.repository.AssessmentRepository;
import com.coding.gradebook.repository.CourseRepository;
import com.coding.gradebook.repository.ScoreRepository;
import com.coding.gradebook.repository.UserRepository;
import com.coding.gradebook.request.AssessmentSubmitRequest;
import com.coding.gradebook.response.AssessmentResponse;
import com.coding.gradebook.response.ScoreResponse;
import com.coding.gradebook.response.UserAssessmentResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<UserAssessmentResponse> getUsers() {
        List<UserAssessmentResponse> userAssessmentResponses = new ArrayList<>();
        List<User> users = userRepository.findAll();
        users.forEach(user -> {
            List<AssessmentResponse> assessmentList = new ArrayList<>();
            user.getScores().forEach(score -> assessmentList.add(new AssessmentResponse(score.getCourse().getId(),
                    score.getAssessment().getId(), score.getAttemptedOn(), new ScoreResponse(score.getPointsEarned(), score.getPointsPossible()))));
            userAssessmentResponses.add(new UserAssessmentResponse(user.getId(), assessmentList));
        });
        return userAssessmentResponses;
    }

    public UserAssessmentResponse getUser(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isPresent()) {
            List<AssessmentResponse> assessmentList = new ArrayList<>();
            User user = optionalUser.get();
            user.getScores().forEach(score -> assessmentList.add(new AssessmentResponse(score.getCourse().getId(),
            score.getAssessment().getId(), score.getAttemptedOn(), new ScoreResponse(score.getPointsEarned(), score.getPointsPossible()))));
            return new UserAssessmentResponse(user.getId(), assessmentList);
        }
        throw new RecordNotFoundException("User not found");
    }

    private Score mapToScoreEntity(AssessmentSubmitRequest request) {
        return new Score(new User(request.getUserId()), new Course( request.getCourseId()),
                new Assessment( request.getAssessmentId()), request.getScore().getPointsEarned(),
                request.getScore().getPointsPossible());
    }
}
