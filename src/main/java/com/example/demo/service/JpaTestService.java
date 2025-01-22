package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JpaTestService {

    @Autowired
    UserRepo userRepo;

    public User saveUser(User user){
        userRepo.save(user);
        return user;

    }

    public String deleteUser() {
//        Optional<User> userRepoById = userRepo.findById(1l);
//        User user = userRepoById.get();
//         userRepo.delete(user);
         return "deleted";

    }
}
