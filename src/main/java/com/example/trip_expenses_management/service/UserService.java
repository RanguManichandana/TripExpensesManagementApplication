package com.example.trip_expenses_management.service;

import com.example.trip_expenses_management.entity.User;

import com.example.trip_expenses_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public com.example.trip_expenses_management.entity.User save(com.example.trip_expenses_management.entity.User user) {
        return userRepository.save(user);
    }
}

