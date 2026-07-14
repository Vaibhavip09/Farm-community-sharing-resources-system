package com.FarmSharingResourse.service;

import java.util.List;

import com.FarmSharingResourse.model.JoinRequest;


public interface JoinRequestService {
	 JoinRequest saveRequest(JoinRequest request);
	    List<JoinRequest> getAllRequests();
	    List<JoinRequest> getJoinRequestsByEmail(String email);
	    JoinRequest updateStatus(Long id, String status);
	    void deleteRequest(Long id);
}
