package com.FarmSharingResourse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FarmSharingResourse.model.Resource;
import com.FarmSharingResourse.service.ResourceService;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("/resources")
public class ResourceController {

	
	 @Autowired
	    private ResourceService resourceService;

	    @PostMapping("/add")
	    public String addResource(@RequestBody Resource resource) {
	    	resourceService.saveResource(resource);
	        return "Resource added successfully!";
	    }
	
	    @GetMapping("/all")
	    public List<Resource> getAllResources() {
	        return resourceService.getAllResources();
	    }
	    
}
