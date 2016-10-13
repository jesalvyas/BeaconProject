package com.jesal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jesal.patient.Patient;

@Service
@Transactional
public class MailServiceImpl implements MailService {
	
	@Autowired
	private MailSender mailSender;
	
	public void setMailSender(MailSender mailSender){
		this.mailSender = mailSender;
	}

	
	public void sendMail(Patient patient) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("vinaycogent@gmail.com");
		message.setTo("vyas.jesal.a@gmail.com");
		message.setSubject("Confirmation");
		message.setText("Patient Registered!");
		
		mailSender.send(message);
		
	}

}
