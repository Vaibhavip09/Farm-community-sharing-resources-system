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
import com.FarmSharingResourse.model.BorrowRequest;
import com.FarmSharingResourse.service.BorrowRequestService;

@RestController
@RequestMapping("/borrow")
@CrossOrigin(origins = "*")
public class BorrowRequestController {

	@Autowired
	private BorrowRequestService brs;
	
	 @GetMapping("/status")
	    public List<BorrowRequest> getAllStatus() {
	        return brs.findAll();
	    }
	
	@PostMapping("/request")
	public BorrowRequest submitRequest(@RequestBody BorrowRequest request) {
		
		return brs.createBorrowRequest(request);
	}
	
	
	@GetMapping("/status/user")
	public List<BorrowRequest> getStatusByUser(@RequestParam String username) {
	    return brs.findByUserName(username);
	}
	
	
	 @GetMapping("/get/{id}")
	    public BorrowRequest getRequest(@PathVariable Long id) {
	        return brs.getRequestById(id);
	    }

	    @PutMapping("/update/{id}")
	    public BorrowRequest updateRequest(@PathVariable Long id, @RequestBody BorrowRequest request) {
	        return brs.updateRequest(id, request);
	    }

	    @PutMapping("/updateStatus/{id}")
	    public BorrowRequest updateStatus(@PathVariable Long id, @RequestBody BorrowRequest statusBody) {
	        return brs.updateStatus(id, statusBody.getStatus());
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteRequest(@PathVariable Long id) {
	    	brs.deleteRequest(id);
	    }
	
}
