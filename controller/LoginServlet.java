package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginServlet {
	
	@Autowired
 private userValidate uvalidate ;
 //= new userValidate();
	
	/*
	 @RequestMapping(value="/home")
	@ResponseBody
	public String hello()
	{
		return "hellooo!";
	} 
	
	*/
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String showloginGet()
	{
		return "login";
	}
	
	@RequestMapping(value="/home", method = RequestMethod.POST)
	public String showloginPost(@RequestParam String name,@RequestParam String pass,ModelMap model )
	{
		model.put("name", name);
		model.put("pass", pass);
		
		if(uvalidate.docheck(name, pass))
		{
			return "welcome";
		}
		else
		{
			model.put("error", "Invalid Credentials!");
			return "login";
		}
		
		//return "welcome";
	}

}
