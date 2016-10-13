package com.jesal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jesal.DAO.PatientDAO;
import com.jesal.patient.Patient;

@Service//("PatientService")
@Transactional
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientDAO patientDAO;

	
	public void addPatient(Patient patient) {
		patientDAO.addPatient(patient);
		
		
	}

	
	public List<Patient> getPatients() {
		
		return patientDAO.getPatients();
	}

}
