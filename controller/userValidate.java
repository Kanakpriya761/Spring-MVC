package com.spring.mvc.controller;

import org.springframework.stereotype.Component;

@Component
public class userValidate {
	
	public boolean docheck(String user,String pas)
	{
		if(user.equals("David") && pas.equals("Dummy"))
		{
			return true;
		}
		else
			return false;
	}

}
