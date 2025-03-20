package com.coding.gradebook.repository;

import com.coding.gradebook.Domain.Assessment;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssessmentRepository extends ListCrudRepository<Assessment, Long> {

}
