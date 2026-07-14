
package com.FarmSharingResourse.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.FarmSharingResourse.model.Login;
import com.FarmSharingResourse.repository.LoginRepo;

public interface LoginService {
	
	

	
    Login findByUsernameAndPassword(String username, String password);
    boolean validateUser(String username, String password);
}
