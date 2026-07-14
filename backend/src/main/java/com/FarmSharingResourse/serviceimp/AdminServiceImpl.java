package com.FarmSharingResourse.serviceimp;

import org.springframework.stereotype.Service;

import com.FarmSharingResourse.model.Admin;
import com.FarmSharingResourse.repository.AdminRepository;
import com.FarmSharingResourse.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	
	@Override
	public boolean authenticate(String username, String password) {
        return "admin".equals(username) && "admin963".equals(password);

	}
}
