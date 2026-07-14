package com.FarmSharingResourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.FarmSharingResourse.dto.LoginRequest;
import com.FarmSharingResourse.dto.LoginRequest;
import com.FarmSharingResourse.model.Admin;
import com.FarmSharingResourse.service.AdminService;



@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "*")
public class AdminController {

	    @Autowired
	    private AdminService adminService;

	    @PostMapping("/login")
	    public ResponseEntity<String> login(@RequestBody LoginRequest request) {
	    	 String username = request.getUsername();
	         String password = request.getPassword();

	         if (adminService.authenticate(username, password)) {
	             return ResponseEntity.ok("Admin login successful");
	         } else {
	             return ResponseEntity.status(401).body("Invalid username or password");
	         }
	    
	    }
	    @GetMapping("/home")
	    public ResponseEntity<String> getUserHome() {
	        return ResponseEntity.ok("User home page data");
	    }
	}
