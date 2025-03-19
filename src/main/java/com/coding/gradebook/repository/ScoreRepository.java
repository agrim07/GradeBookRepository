package com.coding.gradebook.repository;

import com.coding.gradebook.Domain.Score;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends ListCrudRepository<Score, Long> {

}
