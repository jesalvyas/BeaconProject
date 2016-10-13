package com.jesal.patient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patient_details")
public class Patient {

	@Id
	@GeneratedValue
	public Integer id;
	public String firstname;
	public String lastname;
	public int age;


	
	public Integer getId() {
		return id;
	}
	

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	@Column(name = "fname")
	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lname")
	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Column(name = "P_age")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Patient(Integer id, String firstname, String lastname, int age) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	
	public Patient(){
		
	}

}
