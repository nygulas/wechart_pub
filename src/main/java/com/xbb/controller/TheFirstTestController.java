package com.xbb.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xbb.entity.User;

@RestController  
@RequestMapping("/0001")
public class TheFirstTestController {
	@RequestMapping("/1")  
    public User view(String id) {  
        User user = new User();  
        user.setId("22222222");  
        user.setName("zhang"); 
        return user;  
    }  
	
	public static void main(String[] args) {  
        SpringApplication.run(TheFirstTestController.class);  
    }
}
