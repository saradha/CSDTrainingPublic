package com.tutorial.sample.number.example;

public class AuthorizeService {
	
	private AuthorizeDao authorizeDao;
	
	public AuthorizeService(AuthorizeDao authorizeDao){
		 this.authorizeDao = authorizeDao;
	}

	public boolean authenticate(UserInfo userInfo){
		UserInfo dbuserInfo = new UserInfo();
		dbuserInfo=authorizeDao.getUserName();
		if(dbuserInfo.getName().equals(userInfo.getName()) &&
		 (dbuserInfo.getPassword().equals(userInfo.getPassword())))
		 return true;
		else
			return false;
		
	}
	
}
