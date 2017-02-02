package com.jobll.web.home;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service("homeService")
public class HomeServiceImpl implements HomeService {
	protected static final Logger LOGGER = LoggerFactory.getLogger(HomeServiceImpl.class);
	
	@Autowired
	private Home home;
	@Autowired
	private HomeRepository homeRepository;
	
	
	@Override
	public int create(Home entity, List<MultipartFile> files) throws Exception {
		
		entity.setTest_idx(123);
		
		homeRepository.create(entity);
		
		return 0;
	}
	
	public Home findOne(Home entity)throws Exception{
		
		home = 	homeRepository.findOne(entity);
		
		return home;
	}
	
}
