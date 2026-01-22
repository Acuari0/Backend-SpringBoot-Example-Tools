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
        return testRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Test user not found"));
    }

    public Long saveTestUser(Test test) {
        try {
            Test savedTest = testRepository.save(test);
            return savedTest.getId();
        } catch (Exception e) {
            throw new IllegalArgumentException("Error saving Test user", e);
        }
        
    }
}
