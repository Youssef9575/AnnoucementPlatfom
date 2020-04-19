package com.project.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

@Entity
@Table(name="professor")
public class Professor extends User {
	private static final long serialVersionUID = 1L;
	
	@NonNull@NotBlank
	private String departement;
	
	//Constructor
	public Professor(Long idUser, String name, String email, String password, String phone, String departement) {
		super(idUser, name, email, password, phone);
		this.departement = departement;
	}

	//getter and setter
	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}
}
