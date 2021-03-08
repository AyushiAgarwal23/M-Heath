package com.cg.mHealthSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RolesTable {
	@Id
	public int role_ID;
	public String Role_name;
	public int getRole_ID() {
		return role_ID;
	}
	public void setRole_ID(int role_ID) {
		this.role_ID = role_ID;
	}
	public String getRole_name() {
		return Role_name;
	}
	public void setRole_name(String role_name) {
		Role_name = role_name;
	}
	public RolesTable(int role_ID, String role_name) {
		super();
		this.role_ID = role_ID;
		Role_name = role_name;
	}
	public RolesTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
