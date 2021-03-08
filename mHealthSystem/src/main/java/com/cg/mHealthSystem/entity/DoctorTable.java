package com.cg.mHealthSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DoctorTable {
    @Id
	public int Doctor_ID;
	public  int User_ID;
	public int Emp_ID;
	public int Dept_ID;
	public int ConsultingFee;
	public int getDoctor_ID() {
		return Doctor_ID;
	}
	public void setDoctor_ID(int doctor_ID) {
		Doctor_ID = doctor_ID;
	}
	public int getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(int user_ID) {
		User_ID = user_ID;
	}
	public int getEmp_ID() {
		return Emp_ID;
	}
	public void setEmp_ID(int emp_ID) {
		Emp_ID = emp_ID;
	}
	public int getDept_ID() {
		return Dept_ID;
	}
	public void setDept_ID(int dept_ID) {
		Dept_ID = dept_ID;
	}
	public int getConsultingFee() {
		return ConsultingFee;
	}
	public void setConsultingFee(int consultingFee) {
		ConsultingFee = consultingFee;
	}
	public DoctorTable(int doctor_ID, int user_ID, int emp_ID, int dept_ID, int consultingFee) {
		super();
		Doctor_ID = doctor_ID;
		User_ID = user_ID;
		Emp_ID = emp_ID;
		Dept_ID = dept_ID;
		ConsultingFee = consultingFee;
	}
	public DoctorTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
