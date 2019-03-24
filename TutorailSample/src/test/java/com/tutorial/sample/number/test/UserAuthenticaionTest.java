package com.tutorial.sample.number.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;

import com.tutorial.sample.number.example.AuthorizeDao;
import com.tutorial.sample.number.example.AuthorizeService;
import com.tutorial.sample.number.example.UserInfo;

import junit.framework.Assert;





public class UserAuthenticaionTest {
	
	AuthorizeDao dataObj;
	AuthorizeService service;
	UserInfo resultInfo;
	
	public void createResultSucess(){
		resultInfo = new UserInfo();
		resultInfo.setName("abc1");
		resultInfo.setPassword("xyz");
	}
	
	
	 public void setUp(){
	    dataObj=Mockito.mock(AuthorizeDao.class);
	    Mockito.when(dataObj.getUserName()).thenReturn(resultInfo);    	    
	}
	
	@After
	public void cleanUp(){
		dataObj=null;
		service=null;
		//user=null;
	}
	
	
	
	@Test
	public void validuserTest(){
		boolean expected = true;
		boolean actual;
		createResultSucess();
		setUp();
		UserInfo testUser= new UserInfo();
		service= new AuthorizeService(dataObj);
		testUser.setName("abc1");
		testUser.setPassword("xyz");
		actual = service.authenticate(testUser);
		
		Mockito.verify(dataObj).getUserName();
		assertEquals(expected, actual);
	}

}
