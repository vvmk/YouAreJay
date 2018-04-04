package com.complexaesthetic.youarejay.controller;

import com.complexaesthetic.youarejay.repository.MessageRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * project: YouAreJay
 * package: com.complexaesthetic.youarejay.controller
 * author: https://github.com/vvmk
 * date: 4/4/18
 */
public class MessageControllerTest {

    @InjectMocks
    MessageRepository messageRepository;

    @Mock
    MessageController mc;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getAllMessages() {
    }

    @Test
    public void createMessage() {
    }
}