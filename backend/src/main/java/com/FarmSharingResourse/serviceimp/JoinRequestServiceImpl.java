package com.FarmSharingResourse.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FarmSharingResourse.model.JoinRequest;
import com.FarmSharingResourse.repository.JoinRequestRepository;
import com.FarmSharingResourse.service.JoinRequestService;

@Service
public class JoinRequestServiceImpl implements JoinRequestService {

	 @Autowired
	    private JoinRequestRepository repository;

	    public JoinRequest saveRequest(JoinRequest request) {
	        return repository.save(request);
	    }	

	    public List<JoinRequest> getAllRequests() {
	        return repository.findAll();
	    }

	    public JoinRequest updateStatus(Long id, String status) {
	        JoinRequest request = repository.findById(id).orElse(null);
	        if (request != null) {
	            request.setStatus(status);
	            return repository.save(request);
	        }
	        return null;
	    }
	    
	    @Override
	    public List<JoinRequest> getJoinRequestsByEmail(String email) {
	        return repository.findByEmail(email);
	    }

	    public void deleteRequest(Long id) {
	        repository.deleteById(id);
	    }
	}