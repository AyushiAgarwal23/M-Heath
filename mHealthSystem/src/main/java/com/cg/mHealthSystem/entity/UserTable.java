package com.cg.mHealthSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserTable {
	@Id
	public int User_ID;
	public int role_ID;
	public String First_Name;
	public String email_ID;
	public String password;
	public int getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}
	public int getRole_ID() {
		return role_ID;
	}
	public void setRole_ID(int role_ID) {
		this.role_ID = role_ID;
	}
		public UserTable() {
		super();
		// TODO Auto-generated constructor stub
	}
		public String getFirst_Name() {
			return First_Name;
		}
		public void setFirst_Name(String first_Name) {
			First_Name = first_Name;
		}
		public String getEmail_ID() {
			return email_ID;
		}
		public void setEmail_ID(String email_ID) {
			this.email_ID = email_ID;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public UserTable(int user_ID, int role_ID, String first_Name, String email_ID, String password) {
			super();
			User_ID = user_ID;
			this.role_ID = role_ID;
			First_Name = first_Name;
			this.email_ID = email_ID;
			this.password = password;
		}
		
	
}
