package com.cit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	private int id;
	private String username;
	private String password;
	private String emailid;
	private long mobileno;
	private String active;
	private String role;
	
	
	public User()
	{
		
	}
	public User(int id, String username, String password, String emailid, long mobileno, String active, String role) {
		
		this.id = id;
		this.username = username;
		this.password = password;
		this.emailid = emailid;
		this.mobileno = mobileno;
		this.active = active;
		this.role = role;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
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


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public long getMobileno() {
		return mobileno;
	}


	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}


	public String getActive() {
		return active;
	}


	public void setActive(String active) {
		this.active = active;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	
	@Override
	public String toString()
	{
		return id+""+username+""+password+""+emailid+""+mobileno+""+active+""+role;
	}

}
