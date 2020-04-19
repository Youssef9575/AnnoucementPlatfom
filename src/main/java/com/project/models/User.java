package com.project.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

@Entity
@Inheritance(
	    strategy = InheritanceType.JOINED
	)
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long idUser;
	
    @NonNull @NotBlank
	private String name;
    @NonNull @NotBlank
	private String email;
    @NonNull @NotBlank
	private String password;
	@NonNull @NotBlank
	private String phone;
	
	//Constructor
	public User(Long idUser, String name, String email, String password, String phone) {
		this.idUser = idUser;
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}
	//getters and setters

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}	

}
