package com.FarmSharingResourse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FarmSharingResourse.model.JoinRequest;

public interface JoinRequestRepository extends JpaRepository<JoinRequest, Long> {
	 List<JoinRequest> findByEmail(String email);
}
