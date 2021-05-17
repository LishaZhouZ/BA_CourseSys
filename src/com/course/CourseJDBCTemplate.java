package com.course;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
public class CourseJDBCTemplate implements CourseDAO {

	private DataSource dataSource; 
	private JdbcTemplate jdbcTemplateObject;
	private List<Course> listcourse=new ArrayList<Course>();
	
	public void setDataSource(DataSource dataSource) { 
		this.dataSource = dataSource; 
		this.jdbcTemplateObject = new JdbcTemplate(dataSource); 
		} 
	
	public void create(String name, int teachNo, int credit, String cStart){
		String SQL="insert into course (Cname, TeachNo, Credit, CStart) values (?, ?, ?, ?)"; 
		jdbcTemplateObject.update(SQL,name,teachNo,credit,cStart);
		System.out.println("Created Record Name = " + name + " TeachNo = " + teachNo +" credit= "+credit+" cStart= "+ cStart); 
		return;
		}
	public void selectedInsert(Integer stuno,Integer cno){
		String SQL="insert into ccourse (StuNo,Cno) values (?, ?)"; 
		jdbcTemplateObject.update(SQL,stuno,cno);
		System.out.println("Created Record StuNo = " + stuno + " Cno = " + cno); 
		return;
		}
	
	public Course getCourse(Integer cno) { 
		String SQL = "select * from ccourse cc join course c on cc.Cno=c.Cno join teacher t on t.TeachNo=c.TeachNo where c.Cno= ?"; 
		Course course = jdbcTemplateObject.queryForObject(SQL, new Object[]{cno}, new CourseMapper()); 
			return course;
			}
	public List<Course> listCourseOfTeacher(Integer id){
		String SQL="select * from  course c left outer join ccourse cc on cc.Cno=c.Cno join teacher t on t.TeachNo=c.TeachNo where c.TeachNo= ?";
		List <Course> courses = jdbcTemplateObject.query(SQL,new Object[]{id}, new CourseMapper()); 
		return courses;
	}
	public List<Course> listCourseOfStudent(Integer id){
		String SQL="select * from ccourse cc join course c on cc.Cno=c.Cno join teacher t on t.TeachNo=c.TeachNo where cc.StuNo= ?";
		List <Course> courses = jdbcTemplateObject.query(SQL,new Object[]{id}, new CourseMapper()); 
		return courses;
	}
	public List<Course> listCourses() { 
		String SQL = "select * from  course c left outer join ccourse cc on cc.Cno=c.Cno join teacher t on t.TeachNo=c.TeachNo"; 
		listcourse = jdbcTemplateObject.query(SQL, new CourseMapper()); 
		return listcourse; 
		} 
	
	public void delete(Integer cno){
		String SQL1="delete from ccourse where Cno = ?";
		String SQL2 = "delete from course where Cno = ?";
		jdbcTemplateObject.update(SQL1, cno);
		jdbcTemplateObject.update(SQL2, cno); 
		System.out.println("Deleted Record with ID = " + cno ); 
		return; 
		} 
	
	public void deleteCC(Integer cno, Integer stuno){
		String SQL="delete from ccourse where Cno=? and StuNo=?";
		jdbcTemplateObject.update(SQL,cno,stuno);
		System.out.println("Delete record with cno="+cno+" stuNo="+stuno);
		return;
	}
	public void update(Integer cno, Integer credit, String cstart){ 
		String SQL1 = "update course set Credit= ? where Cno= ?";
		String SQL2 = "update course set cStart= ? where Cno= ?";
		jdbcTemplateObject.update(SQL1, credit, cno); 
		jdbcTemplateObject.update(SQL2, cstart, cno); 
		System.out.println("Updated Record with ID = " + cno ); 
		return; 
		}
}
