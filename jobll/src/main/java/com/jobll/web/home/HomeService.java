package com.jobll.web.home;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

public interface HomeService {

	
	@Transactional
	public int create(Home entity, List<MultipartFile> files) throws Exception;
	
	@Transactional
	public Home findOne(Home entity) throws Exception;
	

}
