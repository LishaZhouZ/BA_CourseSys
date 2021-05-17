package com.course;
import java.util.List;

import javax.sql.DataSource;
public interface CourseDAO {
	/** * This is the method to be used to initialize 
	 * * database resources ie. connection. */ 
	public void setDataSource(DataSource ds); 
	/** * This is the method to be used to create* 
	 * a record in the user table. */ 
	
	public void create(String name, int teachNo, int credit, String cStart); 
	/** * This is the method to be used to list down 
	 * * a record from the user table corresponding 
	 * * to a passed user id. */ 
	
	public Course getCourse(Integer cno); 
	/** * This is the method to be used to list down 
	 * * all the records from the user table. */ 
	public List<Course> listCourses(); 
	/** * This is the method to be used to delete 
	 * * a record from the user table corresponding 
	 * * to a passed user id. */ 
	public void delete(Integer cno); 
	/** * This is the method to be used to update 
	 * * a record into the user table. */ 
	public void update(Integer cno, Integer credit, String cstart);
}
