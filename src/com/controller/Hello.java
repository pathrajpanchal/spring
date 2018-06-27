package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello 
	{
		@RequestMapping(value="world.html",method = RequestMethod.GET)
		public ModelAndView helloworld()
			{
				String s1 = "HELLO PARTH ! ";
				return new ModelAndView("welcome", "msg", s1);
			}
	}

