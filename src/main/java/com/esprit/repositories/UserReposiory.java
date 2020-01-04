package com.esprit.repositories;

import com.esprit.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserReposiory extends CrudRepository<User, Long> {
}
