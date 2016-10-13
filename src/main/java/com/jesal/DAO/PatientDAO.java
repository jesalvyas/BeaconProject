package com.jesal.DAO;

import java.util.List;

import com.jesal.patient.Patient;

public interface PatientDAO {
	public void addPatient(Patient patient);
	public List<Patient> getPatients();

}
