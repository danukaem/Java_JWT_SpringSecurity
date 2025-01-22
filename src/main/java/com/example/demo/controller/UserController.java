package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public String jpaTest1() {
        // Create an encoder with strength 16
//        System.out.println( "myPassword"+ (new BCryptPasswordEncoder(4).encode("myPassword")));

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
        return userService.deleteUser();
    }


    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        userService.save(user);
        return user;

    }
}
