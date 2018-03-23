package com.complexaesthetic.youarejay.controller;

import com.complexaesthetic.youarejay.entity.User;
import com.complexaesthetic.youarejay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * project: YouAreJay
 * package: com.complexaesthetic.youarejay.controller
 * author: https://github.com/vvmk
 * date: 3/23/18
 */

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value="/messages", method= RequestMethod.GET)
    public ResponseEntity<Iterable<User>> getAllUsers() {
        Iterable<User> allUsers = userRepository.findAll();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }
}
