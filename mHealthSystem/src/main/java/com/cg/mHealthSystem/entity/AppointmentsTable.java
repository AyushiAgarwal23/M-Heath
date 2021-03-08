package com.cg.mHealthSystem.entity;

import javax.persistence.Entity;

@Entity
public class AppointmentsTable {
	
	public int Appointment_ID;
	public int Doctor_ID;
	public int Patient_ID;
	public String Start_Time;
	public String End_Time;
	public String Created_At;
	public String Deleted_At;
	public int getAppointment_ID() {
		return Appointment_ID;
	}
	public void setAppointment_ID(int appointment_ID) {
		Appointment_ID = appointment_ID;
	}
	public int getDoctor_ID() {
		return Doctor_ID;
	}
	public void setDoctor_ID(int doctor_ID) {
		Doctor_ID = doctor_ID;
	}
	public int getPatient_ID() {
		return Patient_ID;
	}
	public void setPatient_ID(int patient_ID) {
		Patient_ID = patient_ID;
	}
	public String getStart_Time() {
		return Start_Time;
	}
	public void setStart_Time(String start_Time) {
		Start_Time = start_Time;
	}
	public String getEnd_Time() {
		return End_Time;
	}
	public void setEnd_Time(String end_Time) {
		End_Time = end_Time;
	}
	public String getCreated_At() {
		return Created_At;
	}
	public void setCreated_At(String created_At) {
		Created_At = created_At;
	}
	public String getDeleted_At() {
		return Deleted_At;
	}
	public void setDeleted_At(String deleted_At) {
		Deleted_At = deleted_At;
	}
	public AppointmentsTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppointmentsTable(int appointment_ID, int doctor_ID, int patient_ID, String start_Time, String end_Time,
			String created_At, String deleted_At) {
		super();
		Appointment_ID = appointment_ID;
		Doctor_ID = doctor_ID;
		Patient_ID = patient_ID;
		Start_Time = start_Time;
		End_Time = end_Time;
		Created_At = created_At;
		Deleted_At = deleted_At;
	}
	

}
