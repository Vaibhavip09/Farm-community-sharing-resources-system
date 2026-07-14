package com.FarmSharingResourse.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FarmSharingResourse.model.Register;
import com.FarmSharingResourse.repository.RegisterRepo;
import com.FarmSharingResourse.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	RegisterRepo registerrepo;
	@Override
	public void saveUser(Register reg) {
		registerrepo.save(reg);
		
	}

	@Override
	public Register findByUsername(String username) {		
		return registerrepo.findByUsername(username);
	}

}
