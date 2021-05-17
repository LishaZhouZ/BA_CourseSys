package com.teacher;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class TeacherJDBCTemplate implements TeacherDAO{
	private DataSource dataSource; 
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) { 
		this.dataSource = dataSource; 
		this.jdbcTemplateObject = new JdbcTemplate(dataSource); 
		} 
	
	public void create(String name,Integer sex) { 
		String SQL="insert into teacher (Tname, Tsex) values (?, ?)"; 
		jdbcTemplateObject.update(SQL,name,sex);
		System.out.println("Created Record Name = " + name + " sex = " + sex); 
		return;
		} 
	public Teacher getTeacher(String name) { 
		String SQL = "select * from teacher where Tname = ?"; 
		Teacher teacher = jdbcTemplateObject.queryForObject(SQL,
			new Object[]{name}, new TeacherMapper()); 
			return teacher;
			}
	public List<Teacher> listTeachers() { 
		String SQL = "select * from teacher"; 
		List <Teacher> teachers = jdbcTemplateObject.query(SQL, new TeacherMapper()); 
		return teachers; 
		} 
	public void delete(Integer id){ 
		String SQL = "delete from teacher where TeachNo = ?"; 
		jdbcTemplateObject.update(SQL, id); 
		System.out.println("Deleted Record with ID = " + id ); return; 
		} 
	public void update(Integer id, Integer sex){ 
		String SQL = "update teacher set Tsex= ? where TeachNo= ?"; 
		jdbcTemplateObject.update(SQL, sex, id); 
		System.out.println("Updated Record with TeachNo = " + id ); return; 
		}
}
