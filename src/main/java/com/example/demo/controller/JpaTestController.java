package com.example.demo.controller;

import com.example.demo.entity.Profile;
import com.example.demo.entity.User;
import com.example.demo.service.JpaTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class JpaTestController {

    @Autowired
    JpaTestService jpaTestService;

    @GetMapping("")
    public String jpaTest1() {
        // Create an encoder with strength 16
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
//        String result = encoder.encode("myPassword");
//        System.out.println( "myPassword"+ result);
//        System.out.println(encoder.matches("myPassword", result));

//        return "<h1>Hello JPA home</h1>  "+result;
        return "<h1>Hello JPA home</h1>  ";
    }
    @GetMapping("hello")
    public String jpaTest() {
//        User user = new User();
//        Profile profile = new Profile();
//        profile.setBio("Test Bio");
//        user.setProfile(profile);
//        jpaTestService.saveUser(user);
        return "<h1>Hello JPA</h1>  ";
    }

    @GetMapping("deleteUser")
    public String deleteUser() {
        return jpaTestService.deleteUser();
    }
}
