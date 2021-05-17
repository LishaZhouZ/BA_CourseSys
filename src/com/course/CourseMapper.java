package com.course;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

public class CourseMapper  implements RowMapper<Course>{
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException { 
		Course course=new Course(); 
		if(!rs.isAfterLast()){
		course.setCname(rs.getString("Cname")); 
		course.setCno(rs.getInt("Cno"));
		course.setCredit(rs.getInt("Credit"));
		course.setCstart(rs.getString("CStart"));
		course.setTname(rs.getString("Tname"));
		
		String var=""+rs.getInt("Mark");
		if(!var.isEmpty()){
			course.setMark(rs.getInt("Mark"));
		}
		
		else{
			course.setMark(null);
		}
		}
		return course;
		}

}
