package com.FarmSharingResourse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FarmSharingResourse.model.Register;
@Repository
public interface RegisterRepo extends JpaRepository<Register, Integer> {
	Register findByUsername(String username);
}
