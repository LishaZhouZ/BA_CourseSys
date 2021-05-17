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
import org.springframework.web.servlet.ModelAndView;

import com.course.Course;
import com.course.CourseJDBCTemplate;
import com.teacher.Teacher;
import com.teacher.TeacherJDBCTemplate;
import com.user.UserJDBCTemplate;

//todo:处理当sql为空时发生的错误

@Controller
public class TeacherController {
	private List<Course> courseOfTeacher=new ArrayList<Course>();
	ApplicationContext contextC = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	CourseJDBCTemplate dataC = (CourseJDBCTemplate)contextC.getBean("courseJDBCTemplate");
	private Teacher teacher=new Teacher();
	private Course changedC=new Course();
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	UserJDBCTemplate data = (UserJDBCTemplate)context.getBean("userJDBCTemplate");

	
	@ModelAttribute("teacher")
	public void initTeacher(HttpServletRequest request,Model model) {
		System.out.println("initTeacher");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		TeacherJDBCTemplate data = (TeacherJDBCTemplate)context.getBean("teacherJDBCTemplate");
		teacher.setName(request.getSession().getAttribute("username").toString());
		teacher.setId(data.getTeacher(teacher.getName()).getId());
		teacher.setSex(data.getTeacher(teacher.getName()).getSex());
		model.addAttribute("teacher", teacher);
		System.out.println("name"+ teacher.getName());
		System.out.println("id"+ teacher.getId());
		System.out.println("sex"+ teacher.getSex());
	}
	
	
	//显示
	@RequestMapping(value={"/Tlogin.action","/Teacher?.action"})
	public String setT(Model model){
		System.out.println("set a teacher "+teacher.getId()+" to attribute");
		courseOfTeacher=dataC.listCourseOfTeacher(teacher.getId());
		model.addAttribute("course",courseOfTeacher);
		return "Teacher/Teacher";
	}
	
	//删除
	@RequestMapping(value="/{cno}/deletecourse.action")
	public String deleteC(@PathVariable Integer cno,Model model){

		dataC.delete(cno);
		System.out.println("delete course cno:"+cno);
		return "pages/Success";
	}
	
	//修改
	@RequestMapping(value="/{cno}/modifycourse.action")
	public String modifyC(@PathVariable Integer cno,Model model){
		changedC=dataC.getCourse(cno);
		model.addAttribute("changedC",changedC);
		return"Teacher/CourChange";
	}
	
	//修改后
	@RequestMapping(value="/{cno}/changeComfirm.action", method=RequestMethod.POST)
	public String changeC(Course changedC,Model model){

		System.out.println(changedC.getCstart());
		Integer c=changedC.getCredit()/2;
		changedC.setCredit(c);
		dataC.update(changedC.getCno(), changedC.getCredit() ,changedC.getCstart());
		return "pages/Success";
	}
	
	//创建新课程
	@RequestMapping(value="/courCreate.action", method=RequestMethod.POST)
	public String createC(Teacher teacher,Course createC,Model model){
		Integer c=createC.getCredit()/2;
		createC.setCredit(c);
		System.out.println(createC.getCname()+" "+teacher.getId()+" "+createC.getCredit()+" "+createC.getCstart());
		dataC.create(createC.getCname(), teacher.getId(), createC.getCredit(), createC.getCstart());
		return "pages/Success";
	}
	
	//操作成功
	@RequestMapping(value="/success.action")
	public String back(Model model){
		return"redirect:/Tlogin.action";
	}

	
	

	//网页的跳转方法
	
	@RequestMapping("/MyTAcc?.action")
	public String goMyTAcc(Teacher teacher,Model model)
	{
		return"Teacher/MyAcc";
	}
	
	@RequestMapping(value="/TchangeP.action")
	public String changeP(@RequestParam("pwd") String pw1,Teacher teacher,Model model){
		data.update(teacher.getId(), pw1);
		return"redirect:/index";
	}
	
	@RequestMapping("/CourCreate?.action")
	public ModelAndView goCourCreate()
	{
		ModelAndView model=new ModelAndView();
		Course course=new Course();
		model.addObject("course",course);
		model.setViewName("Teacher/CourCreate");
		return model;
	}

}
