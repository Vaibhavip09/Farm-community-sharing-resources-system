package com.FarmSharingResourse.service;

import java.util.List;

import com.FarmSharingResourse.model.Resource;

public interface ResourceService {
      
	 Resource saveResource(Resource resource);
	 List<Resource> getAllResources();

	
}
