package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.exceptions.UserAlreadyExistsExceptions;
import com.stackroute.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
public class UserServiceimpl implements UserService {


   private UserRepository userRepository;

    @Autowired
    public  UserServiceimpl(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }
    @Override
    public User saveUser(User user)throws UserAlreadyExistsExceptions {

        if(userRepository.existsById(user.getId()))
        {
            throw  new UserAlreadyExistsExceptions("user already exists");
        }
        User saveduser=userRepository.save(user);
        if(saveduser==null)
        {
            throw  new UserAlreadyExistsExceptions("user already exists");
        }
        return saveduser;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
