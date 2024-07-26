package com.foodStop.repository;

import com.foodStop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {

    User findByEmail(String username);
}
