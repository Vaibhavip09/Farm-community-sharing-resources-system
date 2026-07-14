package com.FarmSharingResourse.service;

import java.util.List;

import com.FarmSharingResourse.model.BorrowRequest;

public interface BorrowRequestService {

	 BorrowRequest createBorrowRequest(BorrowRequest request);
	 List<BorrowRequest> findAll();
	 List<BorrowRequest> findByUserName(String username);
	 BorrowRequest getRequestById(Long id);
	 BorrowRequest updateRequest(Long id, BorrowRequest request);
	 void deleteRequest(Long id);
	 BorrowRequest updateStatus(Long id, String status);
}
