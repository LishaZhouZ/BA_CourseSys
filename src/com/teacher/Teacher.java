package com.teacher;
public class Teacher { 
	
	private String sex;   //0 represents girl£»1 represents boy
	private String name; 
	private Integer id; 
	
	public void setSex(String sex){ 
		this.sex = sex; 
		} 
	
	public String getSex() {
		return sex; 
		} 
	
	public void setName(String name) { 
		this.name= name; 
		}

	public String getName() { 
		return name; 
		}

public void setId(Integer id) { 
	this.id = id; 
	} 

public Integer getId() { 
	return id; 
	}
}
