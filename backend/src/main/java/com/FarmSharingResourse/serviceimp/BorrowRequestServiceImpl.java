package com.FarmSharingResourse.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FarmSharingResourse.model.BorrowRequest;
import com.FarmSharingResourse.repository.BorrowRequestRepository;
import com.FarmSharingResourse.repository.BorrowRequestRepository;
import com.FarmSharingResourse.service.BorrowRequestService;

@Service
public class BorrowRequestServiceImpl implements BorrowRequestService {
	
	
	 @Autowired
	    private BorrowRequestRepository borrowRequestRepo;

	    @Override
	    public BorrowRequest createBorrowRequest(BorrowRequest request) {
	        return borrowRequestRepo.save(request);
	    }

	    @Override
	    public List<BorrowRequest> findAll() {
	        return borrowRequestRepo.findAll();
	    }

	    @Override
	    public List<BorrowRequest> findByUserName(String username) {
	        return borrowRequestRepo.findByUserName(username);
	    }

		 @Override
		    public BorrowRequest getRequestById(Long id) {
		        return borrowRequestRepo.findById(id).orElse(null);
		    }
		
		    @Override
		    public BorrowRequest updateRequest(Long id, BorrowRequest updated) {
		        BorrowRequest existing = borrowRequestRepo.findById(id).orElse(null);
		        if (existing != null) {
		            existing.setUserName(updated.getUserName());
		            existing.setEmail(updated.getEmail());
		            existing.setPhone(updated.getPhone());
		            existing.setDuration(updated.getDuration());
		            existing.setPickupDate(updated.getPickupDate());
		            existing.setStatus(updated.getStatus());
		            return borrowRequestRepo.save(existing);
		        }
		        return null;
		    }
		
		    @Override
		    public void deleteRequest(Long id) {
		    	borrowRequestRepo.deleteById(id);
		    }
		
		    @Override
		    public BorrowRequest updateStatus(Long id, String status) {
		        BorrowRequest request = borrowRequestRepo.findById(id).orElse(null);
		        if (request != null) {
		            request.setStatus(status);
		            return borrowRequestRepo.save(request);
		        }
		        return null;
		    }
	    
	    

}
