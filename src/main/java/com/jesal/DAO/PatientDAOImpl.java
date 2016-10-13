package com.jesal.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jesal.patient.Patient;

@Repository
public class PatientDAOImpl implements PatientDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public void addPatient(Patient patient) {
		getCurrentSession().save(patient);
		
		
	}


	public List<Patient> getPatients() {
		
		return getCurrentSession().createQuery("from Patient").list();
	}

}
