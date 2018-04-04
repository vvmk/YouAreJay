package com.complexaesthetic.youarejay.controller;

import com.complexaesthetic.youarejay.entity.User;
import com.complexaesthetic.youarejay.repository.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * project: YouAreJay
 * package: com.complexaesthetic.youarejay.controller
 * author: https://github.com/vvmk
 * date: 4/3/18
 */
public class UserControllerTest {
    @InjectMocks
    private UserController uc;

    @Mock
    private UserRepository userRepository;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        User u1 = new User();
        User u2 = new User();
        User u3 = new User();

        u1.setUserId(1L);
        u2.setUserId(2L);
        u3.setUserId(3L);

        List<User> userStubs = new ArrayList<>();
        userStubs.add(u1);
        userStubs.add(u2);
        userStubs.add(u3);

        when(userRepository.findAll()).thenReturn(userStubs);
    }

    @Test
    public void testUserGetAll() {
        Iterable<User> users = uc.getAllUsers().getBody();

        long expected = 3;
        long actual = users.spliterator().getExactSizeIfKnown();

        verify(userRepository).findAll();
        assertEquals(expected, actual);
    }

    @Test
    public void testUserPost() {

    }
}