package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.URLConstants;
import com.example.demo.models.TestBase;
import com.example.demo.services.TestService;



@RestController
@RequestMapping(URLConstants.API_TEST_BASE)
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping(URLConstants.API_TEST_USER)
    public TestBase getTestUser(@PathVariable Long id) {
        return testService.getTestUser(id);
    }

    @PostMapping
    public Long saveUser(@RequestBody TestBase name) {
        return testService.saveTestUser(name);
    }
    
}
