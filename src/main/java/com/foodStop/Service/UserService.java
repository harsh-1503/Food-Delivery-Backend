package com.foodStop.Service;

import com.foodStop.model.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService {

    public User findUserByJwtToken(String jwt) throws Exception;

    public User findUserByEmail(String jwt) throws Exception;
}
