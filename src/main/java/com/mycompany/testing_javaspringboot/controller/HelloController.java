package com.mycompany.testing_javaspringboot.controller;

import com.mycompany.testing_javaspringboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hobbies")
    public List<String> getHobbies(){
        return this.helloService.getHobbies();
    }

    @GetMapping("/nama")
    public String printHello(){
        String nama = "World";
        return "Hello "+ nama;
    }

    @GetMapping("/date")
    public Date printDate(){
        Date date = new Date();
        return date;
    }
}
