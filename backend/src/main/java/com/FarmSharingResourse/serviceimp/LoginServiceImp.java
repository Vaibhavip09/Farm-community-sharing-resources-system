package com.FarmSharingResourse.serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FarmSharingResourse.model.Login;
import com.FarmSharingResourse.repository.LoginRepo;
import com.FarmSharingResourse.service.LoginService;

@Service
public class LoginServiceImp implements LoginService {

    @Autowired
    private LoginRepo loginRepo;

    @Override
    public Login findByUsernameAndPassword(String username, String password) {
        return loginRepo.findByUsernameAndPassword(username, password);
    }

    public boolean validateUser(String username, String password) {
        return findByUsernameAndPassword(username, password) != null;
    }
}

