package com.user;

import java.util.List;

import javax.sql.DataSource;
public interface UserDAO {

	/** * This is the method to be used to initialize 
	 * * database resources ie. connection. */ 
	public void setDataSource(DataSource ds); 
	/** * This is the method to be used to create* 
	 * a record in the user table. */ 
	
	public void create(Integer id,String name,String pw,String priv); 
	/** * This is the method to be used to list down 
	 * * a record from the user table corresponding 
	 * * to a passed user id. */ 
	public User getUser(String name);
	public User getUser(Integer id); 
	/** * This is the method to be used to list down 
	 * * all the records from the user table. */ 
	public List<User> listUsers(); 
	/** * This is the method to be used to delete 
	 * * a record from the user table corresponding 
	 * * to a passed user id. */ 
	public void delete(Integer id); 
	/** * This is the method to be used to update 
	 * * a record into the user table. */ 
	public void update(Integer id, String pw);
}
