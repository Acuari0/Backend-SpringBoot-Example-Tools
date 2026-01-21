package com.example.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Test;
import com.example.demo.repositories.TestRepository;

@Service
public class TestService {
    
    @Autowired 
    private TestRepository testRepository;

    public Test getTestUser(Long id) {
        Test test = new Test();
        test.setId(id);
        test.setName("Sample User");
        return test;
    }

    public Long saveTestUser(Test test) {
        Test savedTest = testRepository.save(test);
        return savedTest.getId();
    }
}
