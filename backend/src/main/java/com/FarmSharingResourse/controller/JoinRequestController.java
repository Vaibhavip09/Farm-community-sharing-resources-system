package com.FarmSharingResourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.FarmSharingResourse.model.JoinRequest;
import com.FarmSharingResourse.service.JoinRequestService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/join")
public class JoinRequestController {

	@Autowired
    private JoinRequestService joinRequestService;

  
    @PostMapping("/submit")
    public JoinRequest submitJoinRequest(@RequestBody JoinRequest request) {
        return joinRequestService.saveRequest(request);
    }
    
    @GetMapping("/all")
    public List<JoinRequest> getAllRequests() {
        return joinRequestService.getAllRequests();
    }


    @PutMapping("/update-status")
    public JoinRequest updateStatus(@RequestParam Long id, @RequestParam String status) {
        return joinRequestService.updateStatus(id, status);
    }
    
    
    @GetMapping("/status")
    public List<JoinRequest> getStatusByEmail(@RequestParam String email) {
        return joinRequestService.getJoinRequestsByEmail(email);
    }

  
    @DeleteMapping("/delete/{id}")
    public void deleteRequest(@PathVariable Long id) {
        joinRequestService.deleteRequest(id);
    }
	
	
}
