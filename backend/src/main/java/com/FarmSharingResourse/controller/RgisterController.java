package com.FarmSharingResourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.FarmSharingResourse.model.Register;
import com.FarmSharingResourse.service.RegisterService;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/API")
public class RgisterController {

    @Autowired
    private RegisterService regser;

    @PostMapping("/Register")
    public String registerUser(@RequestBody Register reg) {
        if (regser.findByUsername(reg.getUsername()) != null) {
            return "Username already exists!";
        }
        regser.saveUser(reg);
        return "Registration successful!";
    }
}
