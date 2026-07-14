package com.FarmSharingResourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FarmSharingResourse.model.CommunityInfo;
import com.FarmSharingResourse.serviceimp.CommunityInfoServiceImpl;

@RestController
@RequestMapping("/community")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CommunityInfoController {

	 @Autowired
	    private CommunityInfoServiceImpl service;

	 @PostMapping("/update")
	    public ResponseEntity<String> updateCommunity(@RequestBody CommunityInfo info) {
	        try {
	            service.saveInfo(info);
	            return ResponseEntity.ok("Updated");
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	                                 .body("Error updating");
	        }
	    }

	    @GetMapping("/get")
	    public CommunityInfo getCommunity() {
	        return service.getInfo();
	    }
}
