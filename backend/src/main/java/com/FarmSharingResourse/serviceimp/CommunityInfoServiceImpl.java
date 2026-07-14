package com.FarmSharingResourse.serviceimp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FarmSharingResourse.model.CommunityInfo;
import com.FarmSharingResourse.repository.CommunityInfoRepository;
import com.FarmSharingResourse.service.CommunityInfoService;

@Service
public class CommunityInfoServiceImpl implements CommunityInfoService {

	@Autowired
    private CommunityInfoRepository repository;
	
    @Override
	public CommunityInfo saveInfo(CommunityInfo updatedInfo) {
       
        Optional<CommunityInfo> optional = repository.findById(updatedInfo.getId());
        if (optional.isPresent()) {
            return repository.save(updatedInfo);
        } else {
            throw new RuntimeException("Community info not found with id: " + updatedInfo.getId());
        }
    }
	@Override
    public CommunityInfo getInfo() {
        return repository.findById(1).orElse(null);
    }
	

}
