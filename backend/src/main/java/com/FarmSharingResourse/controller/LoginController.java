package com.FarmSharingResourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.FarmSharingResourse.model.Login;
import com.FarmSharingResourse.service.LoginService;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginService ls;

    @PostMapping("/login")
    public String login(@RequestBody Login login) {
        Login foundUser = ls.findByUsernameAndPassword(login.getUsername(), login.getPassword());
        if (foundUser != null) {
            return "Login Successful!";
        } else {
            return "Invalid credentials";
        }
    }
}

