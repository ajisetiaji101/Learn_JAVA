package com.mycompany.testing_javaspringboot.service.impl;

import com.mycompany.testing_javaspringboot.service.HelloService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public List<String> getHobbies() {
        List<String> hobbies = Arrays.asList("basket","youtube","football","java");
        return hobbies;
    }
}
