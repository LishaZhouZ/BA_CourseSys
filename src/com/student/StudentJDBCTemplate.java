package com.student;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
	private DataSource dataSource; 
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) { 
		this.dataSource = dataSource; 
		this.jdbcTemplateObject = new JdbcTemplate(dataSource); 
		} 
	
	public void create(String name,Integer sex) { 
		String SQL="insert into student (Sname, Ssex) values (?, ?)"; 
		jdbcTemplateObject.update(SQL,name,sex);
		System.out.println("Created Record Name = " + name + " sex = " + sex); 
		return;
		} 
	public Student getStudent(String name) { 
		String SQL = "select * from student where Sname = ?"; 
		Student student = jdbcTemplateObject.queryForObject(SQL,
			new Object[]{name}, new StudentMapper()); 
			return student;
			} 
	public List<Student> listStudents() { 
		String SQL = "select * from student"; 
		List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper()); 
		return students; 
		} 
	public void delete(Integer id){ 
		String SQL = "delete from student where StuNo = ?"; 
		jdbcTemplateObject.update(SQL, id); 
		System.out.println("Deleted Record with ID = " + id ); return; 
		} 
	public void update(Integer id, String pw){ 
		String SQL = "update student set Password= ? where StuNo= ?"; 
		jdbcTemplateObject.update(SQL, pw, id); 
		System.out.println("Updated Record with StuNo = " + id ); return; 
		}


}

