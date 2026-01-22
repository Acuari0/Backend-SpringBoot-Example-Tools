package com.example.demo.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.models.TestBase;

import tools.jackson.databind.ObjectMapper;


@SpringBootTest
@AutoConfiguration
class TestControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    private TestBase testUser;

    @BeforeEach
    void setUp() {
        testUser = new TestBase();
        testUser.setName("John Doe");
    }

}
