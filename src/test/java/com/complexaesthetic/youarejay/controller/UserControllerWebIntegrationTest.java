package com.complexaesthetic.youarejay.controller;

import com.complexaesthetic.youarejay.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.hamcrest.*;
import org.springframework.web.servlet.tags.Param;

import java.io.IOException;
import java.util.List;

/**
 * project: YouAreJay
 * package: com.complexaesthetic.youarejay.controller
 * author: https://github.com/vvmk
 * date: 4/4/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class UserControllerWebIntegrationTest {

    @Test
    public void testGetAllUsers() throws IOException {
        TestRestTemplate restTemplate = new TestRestTemplate();
        ParameterizedTypeReference<Iterable<User>> responseType = new ParameterizedTypeReference<>(){};
        ResponseEntity<Iterable<User>> response = restTemplate.getForEntity("http://localhost:8080/users", List<User>.class);

        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

}
