package com.FarmSharingResourse.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FarmSharingResourse.model.Resource;
import com.FarmSharingResourse.repository.ResourceRepository;
import com.FarmSharingResourse.service.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService {

	 @Autowired
	    private ResourceRepository resourceRepository;
	
	@Override
	public Resource saveResource(Resource resource) {
		return resourceRepository.save(resource);
			}

	@Override
	public List<Resource> getAllResources() {
	    return resourceRepository.findAll();
	}

}
