package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.user.User;
import com.user.UserJDBCTemplate;
//todo 注意修改权限后getmax的值会改变，导致再次设置老师的序号无法从1000四位
//注意跳转操作成功页面

@Controller
public class AdminController {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	UserJDBCTemplate data = (UserJDBCTemplate)context.getBean("userJDBCTemplate");
	
	@ModelAttribute("user")
	public User initAdmin(HttpServletRequest request){
		User user=new User();
		user.setName(request.getSession().getAttribute("username").toString());
		user.setUid(data.getUser(user.getName()).getUid());
		user.setPassword(data.getUser(user.getName()).getPassword());
		user.setPrivilege(data.getUser(user.getName()).getPrivilege());
		return user;
	}
	
	@RequestMapping(value = "/Alogin.action")
	public String Alogin(User user, Model model){
		List<User> listuser=new ArrayList<User>(data.listUsers());
		model.addAttribute("listuser", listuser);
		return "/Admin/Admin";
	}
	@RequestMapping(value="/AccCreate.action")
	public String AccCreate(Model model){
		User newuser=new User();
		model.addAttribute("newuser", newuser);
		return"/Admin/AccCreate";
	}
	
	@RequestMapping(value="/acccreate.action",method=RequestMethod.POST)
	public String create(User newuser,Model model){
		System.out.println("priv="+newuser.getPrivilege());
		String priv="";
		Integer id=0;
		if(newuser.getPrivilege().equalsIgnoreCase("1")){
			priv="admin";
			id=data.getMax("admin")+1;
		}
		else if(newuser.getPrivilege().equalsIgnoreCase("2")){
			priv="teacher";
			System.out.println("after set:"+priv);
			id=data.getMax("teacher")+1;
		}
		else{
			priv="student";
			id=data.getMax("student")+1;
		}
		System.out.println(priv);
		data.create(id,newuser.getName(), newuser.getPassword(),priv);
		return"redirect:/Alogin.action";
	}
	
	@RequestMapping(value="/MyAAcc.action")
	public String Aacc(User user,Model model){
		return"/Admin/MyAcc";
	}
	
	@RequestMapping(value="/ChangePass.action",method=RequestMethod.POST)
	public String changePass(@RequestParam("pwd") String pw1,User user,Model model){
		data.update(user.getUid(),pw1);
		System.out.println("after changed password:"+user.getPassword());
		return"redirect:/index";
	}
	
	//修改用户权限操作
	@RequestMapping(value="/{uid}/changePriv.action")
	public String changePriv(@PathVariable Integer uid , Model model){
		model.addAttribute("changedid",uid);
		model.addAttribute("changedname", data.getUser(uid).getName());
		return "Admin/AccChange";
	}
	
	@RequestMapping(value="/{changedid}/privchange.action",method=RequestMethod.POST)
	public String priv(@RequestParam("priv") String priv,@PathVariable Integer changedid,Model model){
		data.updatePriv(changedid, priv);
		return"redirect:/Alogin.action";
	}
	
	@RequestMapping(value="/{uid}/resetPass.action")
	public String resetcc(@PathVariable Integer uid , Model model){
		data.update(uid,"1234");
		return "redirect:/Alogin.action";
	}
	@RequestMapping(value="/{uid}/deleteAcc.action")
	public String deletAcc(@PathVariable Integer uid , Model model){
		data.delete(uid);
		return "redirect:/Alogin.action";
	}
	
}
