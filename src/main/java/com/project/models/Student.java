package com.project.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

@Entity
public class Student extends User{

	private static final long serialVersionUID = 1L;
	@NonNull @Temporal(value = TemporalType.DATE)
	private Date date;
	@NonNull @NotBlank
	private String branch;
	
	//Constructor
	public Student(Long idUser, String name, String email, String password, String phone, Date date, String branch) {
		super(idUser, name, email, password, phone);
		this.date = date;
		this.branch = branch;
	}

	//getter and setter
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}	

}
