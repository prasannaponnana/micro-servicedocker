package com.stackroute.service;


import com.stackroute.domain.User;
import com.stackroute.exceptions.UserAlreadyExistsExceptions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserserviceConsoleimpl implements UserService {
    @Override
    public User saveUser(User user) throws UserAlreadyExistsExceptions {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
