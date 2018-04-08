package com.complexaesthetic.youarejay.controller;

import com.complexaesthetic.youarejay.entity.Message;
import com.complexaesthetic.youarejay.entity.User;
import com.complexaesthetic.youarejay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * project: YouAreJay
 * package: com.complexaesthetic.youarejay.controller
 * author: https://github.com/vvmk
 * date: 3/23/18
 */

@RestController
public class UserController {

    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value="/users", method= RequestMethod.GET)
    public ResponseEntity<Iterable<User>> getAllUsers() {
        Iterable<User> allUsers = userRepository.findAll();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

    @RequestMapping(value="/users", method = RequestMethod.POST)
    public ResponseEntity<?> createUser(@RequestBody User user) {
        user.setJoinedOn(new Date());
        userRepository.save(user);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @RequestMapping(value="/users/{id}", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Message>> getUsersMessages(@PathVariable Long id) {
        Optional<User> user = userRepository.findById(id);
        List<Message> messages = user.isPresent() ? user.get().getReceivedMessages() : new ArrayList<>(0);
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }
}
