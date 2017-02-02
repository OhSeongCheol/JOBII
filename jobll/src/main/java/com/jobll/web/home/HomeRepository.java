package com.jobll.web.home;

public interface HomeRepository {

	public int create(Home entity) throws Exception;
	
	public Home findOne (Home entity) throws Exception;

}
