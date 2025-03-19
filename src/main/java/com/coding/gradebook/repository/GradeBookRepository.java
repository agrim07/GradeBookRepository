package com.coding.gradebook.repository;

import com.coding.gradebook.Domain.Score;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeBookRepository extends ListCrudRepository<Score, Long> {

}
