package com.upgrad.ST2_Backend_upGrad.service;

import com.upgrad.ST2_Backend_upGrad.model.User;
import com.upgrad.ST2_Backend_upGrad.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void registerUser(User newUser){

        userRepository.registerUser(newUser);

    }
}

