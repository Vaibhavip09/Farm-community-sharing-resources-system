package com.FarmSharingResourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FarmSharingResourse.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	 static Admin findByUsernameAndPassword(String username, String password) {
		return null;
	}
}
