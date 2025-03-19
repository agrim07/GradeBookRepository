package com.coding.gradebook.repository;

import com.coding.gradebook.Domain.Course;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends ListCrudRepository<Course, Long> {

}
