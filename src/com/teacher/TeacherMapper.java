package com.teacher;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
public class TeacherMapper implements RowMapper<Teacher> {
	public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException { 
		Teacher teacher = new Teacher(); 
		if(!rs.isAfterLast()){
		teacher.setId(rs.getInt("TeachNo")); 
		teacher.setName(rs.getString("Tname")); 
		teacher.setSex(rs.getString("Tsex")); 
		}
		return teacher; 
		} 
}
