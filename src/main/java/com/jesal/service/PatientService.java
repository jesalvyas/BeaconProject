package com.jesal.service;

import java.util.List;

import com.jesal.patient.Patient;

public interface PatientService {
	public void addPatient(Patient patient);
	public List<Patient> getPatients();

}
