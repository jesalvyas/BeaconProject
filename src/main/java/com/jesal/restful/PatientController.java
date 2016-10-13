package com.jesal.restful;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jesal.patient.Patient;
import com.jesal.service.MailService;
import com.jesal.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@Autowired
	private MailService mailService;
	
	@CrossOrigin
	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Void> addingPatient(@RequestBody Patient patient) {
		System.out.println("Adding patient: " + patient.getFirstname()+patient.getLastname()+patient.getAge());
		patientService.addPatient(patient);
		mailService.sendMail(patient);
		return new ResponseEntity<Void>(HttpStatus.CREATED);

	}
	@CrossOrigin
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<Patient>> listAllPatients() {
		List<Patient> patients = patientService.getPatients();
		return new ResponseEntity<List<Patient>>(patients, HttpStatus.OK);
	}

	
}
