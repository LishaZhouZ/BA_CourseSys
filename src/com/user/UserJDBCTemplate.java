package com.user;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.student.StudentJDBCTemplate;

public class UserJDBCTemplate implements UserDAO{

	private DataSource dataSource; 
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) { 
		this.dataSource = dataSource; 
		this.jdbcTemplateObject = new JdbcTemplate(dataSource); 
		} 
	
	public void create(Integer id,String name,String pw,String priv){ 
		String SQL="insert into user (ID,Name, Password, Privilege) values (?,?, ?, ?)"; 
		jdbcTemplateObject.update(SQL,id,name,pw,priv);
		System.out.println("Created Record ID="+id+" Name = " + name + " pw = " + pw +" priv= "+priv); 
		return;
		} 
	public Integer getMax(String column){
		String SQL="select max(ID) ID,Name,Password,Privilege from schedule.user where Privilege=?";
		User max=jdbcTemplateObject.queryForObject(SQL, new Object[]{column},new UserMapper());
		return max.getUid();
	}
	public User getUser(String name) {
		String SQL = "select * from user where Name= ?"; 
		User user = jdbcTemplateObject.queryForObject(SQL,
			new Object[]{name}, new UserMapper()); 
			return user;
			}
	public User getUser(Integer id) {
		String SQL = "select * from user where ID= ?"; 
		User user = jdbcTemplateObject.queryForObject(SQL,
			new Object[]{id}, new UserMapper()); 
			return user;
			}
	
	public List<User> listUsers() { 
		String SQL = "select * from user"; 
		List <User> users = jdbcTemplateObject.query(SQL, new UserMapper()); 
		return users; 
		} 
	public void delete(Integer id){ 
		String SQL = "delete from user where ID = ?"; 
		jdbcTemplateObject.update(SQL, id); 
		System.out.println("Deleted Record with ID = " + id ); 
		return; 
		} 
	public void updatePriv(Integer id, String priv){ 
		String SQL = "update user set Privilege= ? where ID= ?";
		System.out.println(priv);
		if(priv.equalsIgnoreCase("1")){
			priv="admin";
		}
		else if(priv.equalsIgnoreCase("2")){
			priv="teacher";
		}
		else{
			priv="student";
		}
		System.out.println(priv);
		jdbcTemplateObject.update(SQL, priv, id);
		System.out.println("Updated Record with ID = " + id ); return; 
		}
	public void update(Integer id, String pw){ 
		String SQL = "update user set Password= ? where ID= ?"; 
		jdbcTemplateObject.update(SQL, pw, id); 
		System.out.println("Updated Record with ID = " + id );
		return; 
		}
}
