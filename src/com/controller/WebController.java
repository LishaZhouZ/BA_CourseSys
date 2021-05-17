package com.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.user.User;
import com.user.UserJDBCTemplate;

//todo 处理当页面无法获取到id或者密码时的错误

@Controller
public class WebController {
	private Integer CID=null;
	private String usernameG;
	private String pwG;
	
	private User dbuser;
	
	@ModelAttribute("user")
	public User initUser() {
		System.out.println("initUser");
		User user = new User();
		return user;
	}
	
	@RequestMapping(value="/index")
	public String index(){
		System.out.println("Turn into index");
		return"pages/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public User setUser(){
		System.out.println("set a user to attribute login");
		return new User();
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String certUser(User user, ModelMap model,HttpServletRequest request) {
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		UserJDBCTemplate data = (UserJDBCTemplate)context.getBean("userJDBCTemplate");
		usernameG=user.getName();
		pwG=user.getPassword();
		System.out.println(usernameG+" try to login");
		dbuser=data.getUser(usernameG);
		if(usernameG.equalsIgnoreCase(dbuser.getName())&&pwG.equalsIgnoreCase(dbuser.getPassword())){
		if(dbuser.getPrivilege().equalsIgnoreCase("Admin")){
			  CID=dbuser.getUid();
			  System.out.println("Admin "+usernameG+" login");
			 //传递出个人信息
			  request.getSession().setAttribute("username", usernameG);
			  request.getSession().setAttribute("password", pwG);
			  request.getSession().setAttribute("ID", CID);
			  return"redirect:/Alogin.action";
		  }
		else if(data.getUser(usernameG).getPrivilege().equalsIgnoreCase("Teacher")){
			 CID=dbuser.getUid();
			System.out.println("Teacher "+CID+" login");
			//传递出个人信息
			  request.getSession().setAttribute("username", usernameG);
			  request.getSession().setAttribute("password", pwG);
			  request.getSession().setAttribute("ID", CID);
				return"redirect:/Tlogin.action";
		  }
		else if(data.getUser(usernameG).getPrivilege().equalsIgnoreCase("Student")){
			 CID=dbuser.getUid();
			System.out.println("Student "+usernameG+" login");
			//传递出个人信息
			  request.getSession().setAttribute("username", usernameG);
			  request.getSession().setAttribute("password", pwG);
			  request.getSession().setAttribute("ID", CID);
			  return"redirect:/Slogin.action";
		  }
		else{
			usernameG=null;
			pwG=null;
			return"pages/Fail";
			}
		}
		else{
			usernameG=null;
			pwG=null;
			return"pages/Fail";
			}
		}
	} 