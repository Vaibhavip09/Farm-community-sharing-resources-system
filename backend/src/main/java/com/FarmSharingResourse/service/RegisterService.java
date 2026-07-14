package com.FarmSharingResourse.service;

import org.springframework.stereotype.Service;

import com.FarmSharingResourse.model.Register;

@Service
public interface RegisterService {
         
	void saveUser(Register reg);
    Register findByUsername(String username);
	
	
}
