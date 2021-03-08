package com.cg.mHealthSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PatientRecordsTable {
	@Id
	public int Record_ID;
	public int Patient_ID;
	public int Appointment_ID;
	public String Prescription ;
	public String Health_Complication ;
	public int getRecord_ID() {
		return Record_ID;
	}
	public void setRecord_ID(int record_ID) {
		Record_ID = record_ID;
	}
	public int getPatient_ID() {
		return Patient_ID;
	}
	public void setPatient_ID(int patient_ID) {
		Patient_ID = patient_ID;
	}
	public int getAppointment_ID() {
		return Appointment_ID;
	}
	public void setAppointment_ID(int appointment_ID) {
		Appointment_ID = appointment_ID;
	}
	public String getPrescription() {
		return Prescription;
	}
	public void setPrescription(String prescription) {
		Prescription = prescription;
	}
	public String getHealth_Complication() {
		return Health_Complication;
	}
	public void setHealth_Complication(String health_Complication) {
		Health_Complication = health_Complication;
	}
	public PatientRecordsTable(int record_ID, int patient_ID, int appointment_ID, String prescription,
			String health_Complication) {
		super();
		Record_ID = record_ID;
		Patient_ID = patient_ID;
		Appointment_ID = appointment_ID;
		Prescription = prescription;
		Health_Complication = health_Complication;
	}
	public PatientRecordsTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
