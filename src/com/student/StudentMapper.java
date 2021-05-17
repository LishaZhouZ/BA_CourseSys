package com.student;


import java.sql.ResultSet; 
import java.sql.SQLException; 
import org.springframework.jdbc.core.RowMapper; 

public class StudentMapper implements RowMapper<Student> { 
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException { 
		Student student = new Student(); 
		if(!rs.isAfterLast()){
		student.setId(rs.getInt("StuNo")); 
		student.setName(rs.getString("Sname")); 
		student.setSex(rs.getString("Ssex")); 
		}
		return student; 
		} 
	}