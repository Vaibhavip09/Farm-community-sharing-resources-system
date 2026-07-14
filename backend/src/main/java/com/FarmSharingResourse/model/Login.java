package com.FarmSharingResourse.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Login_table")
public class Login{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
	@Column(name="username")
     private String username;
	@Column(name="password")
     private String password;

	
	
	public Login() {
		super();		
	}
	public Login(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	  public Integer getId() {
	        return id;
	    }

	    public void setId(Integer id) {
	        this.id = id;
	    }
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
     
     
}
