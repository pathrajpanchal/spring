package com.controller;
import java.lang.annotation.Annotation;

//import com.dao.RegDAO;
import com.vo.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vo.RegVo;

@Controller
public class RegController
	{
	@RequestMapping(value="loginhere.html",method = RequestMethod.GET)
	public ModelAndView gotologin( )
		{
			return new ModelAndView("login");
		}	
	
	@RequestMapping(value="signuppage.html",method = RequestMethod.GET)
	public ModelAndView  gotosignuppage( )
		{
			return new ModelAndView("signuppage","x",new RegVo() ); 
		}	
	
	
		@RequestMapping(value="check.html",method = RequestMethod.GET)
		public ModelAndView signincheck(HttpServletRequest request )
			{
				String username=request.getParameter("username");
				String password=request.getParameter("password");
				if(username.equals("admin") & password.equals("admin"))
				{
					return new ModelAndView("loggedin","msg","welcome Admin");
				}
				else
				{
					String status="0";
					return new ModelAndView("login","status",status);
				}
			}


@RequestMapping(value="signupprocess.html",method = RequestMethod.GET)
public ModelAndView signupprocess(@ModelAttribute RegVo x ,HttpSession session)
	{
		String username=x.getUsername();
		String password=x.getPassword();
		String firstname=x.getFirstname();
		session.setAttribute("username",username);
		session.setAttribute("password",password);
		session.setAttribute("firstname",firstname);
		return new ModelAndView("loginforsession","y",new RegVo());

	}

@RequestMapping(value="signinsession.html",method = RequestMethod.GET)
public ModelAndView signinsession(@ModelAttribute RegVo y,HttpSession session)
	{
		String username=y.getUsername();
		String password=y.getPassword();
		String Susername=(String) session.getAttribute("username");
		String Spassword=(String)session.getAttribute("password");
		String Sfirstname=(String)session.getAttribute("firstname");
		if(username.equals(Susername) && password.equals(Spassword))
		{
			return new ModelAndView("loggedin");
		}
		else
		{
			return new ModelAndView("loginforsession","y",new RegVo());
		}

	}
	}

//=============================================SPRING WITH HIBERNATE


