package com.coding.gradebook.repository;

import com.coding.gradebook.Domain.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ListCrudRepository<User, Long> {

}
