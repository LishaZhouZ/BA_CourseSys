package com.controller;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.course.Course;
import com.course.CourseJDBCTemplate;
import com.student.*;
import com.user.User;
import com.user.UserJDBCTemplate;

@Controller
public class StudentController {
	private Student stu=new Student();
	private ApplicationContext contextC = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	private CourseJDBCTemplate dataC = (CourseJDBCTemplate)contextC.getBean("courseJDBCTemplate");
	List<Course> courseOfStudent=new ArrayList<Course>();
	private ApplicationContext contextS = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	private StudentJDBCTemplate dataS = (StudentJDBCTemplate)contextS.getBean("studentJDBCTemplate");
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
	UserJDBCTemplate data = (UserJDBCTemplate)context.getBean("userJDBCTemplate");

	
	@ModelAttribute("student")
	public Student initStudent(HttpServletRequest request){
		System.out.println("initStudent");
		stu.setName(request.getSession().getAttribute("username").toString());
		stu.setId(dataS.getStudent(stu.getName()).getId());
		stu.setSex(dataS.getStudent(stu.getName()).getSex());
		
		System.out.println("name"+ stu.getName());
		System.out.println("id"+  stu.getId());
		System.out.println("sex"+  stu.getSex());
		return stu;
	}
	
	@RequestMapping(value="/Slogin.action")
	public String student(Student student, Model model){
		System.out.println("set a student "+student.getId()+" to attribute");
		courseOfStudent=dataC.listCourseOfStudent(student.getId());
		model.addAttribute("courseS",courseOfStudent);
		return "Student/Student";
	}
	
	@RequestMapping(value="/Sselect.action")
	public String Sselect(Student student,Model model){
		List<Course> listcourse=new ArrayList<Course>(dataC.listCourses());
		courseOfStudent=dataC.listCourseOfStudent(student.getId());
		listcourse.removeAll(courseOfStudent);

		
		model.addAttribute("listcourse",listcourse);
		return"Student/CourSelect";
	}
	
	@RequestMapping(value="/{cno}/deletecc.action")
	public String deleteCC(@PathVariable Integer cno,Student student,Model model){
		dataC.deleteCC(cno, student.getId());
		return "redirect:/Slogin.action";
	}
	
	@RequestMapping(value="/{cno}/Cselect.action")
	public String CourSelect(@PathVariable Integer cno,Student student,Model model){
		dataC.selectedInsert(student.getId(), cno);
		return "redirect:/Slogin.action";
	}
	@RequestMapping(value="/MySAcc.action")
	public String Aacc(Student student,Model model){
		return"/Student/MyAcc";
	}
	
	@RequestMapping(value="/SChangePass.action",method=RequestMethod.POST)
	public String changePass(@RequestParam("pwd") String pw1,Student student,Model model){
		data.update(student.getId(), pw1);
		return"redirect:/index";
	}
}
