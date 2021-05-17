package com.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User>{
		public User mapRow(ResultSet rs, int rowNum) throws SQLException { 
			User user=new User();
			user.setUid(rs.getInt("ID")); 
			user.setName(rs.getString("Name")); 
			user.setPassword(rs.getString("Password"));
			user.setPrivilege(rs.getString("Privilege"));
			return user; 
			} 
}
