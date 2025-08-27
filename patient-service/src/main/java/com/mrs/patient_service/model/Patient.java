package com.mrs.patient_service.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Patient {
	@Id
	private int id;
	private String name;
	private String email;
	private String address;
	private LocalDate dob;
	private LocalDate regd_date;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		this.email=email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getRegd_date() {
		return regd_date;
	}
	public void setRegd_date(LocalDate regd_date) {
		this.regd_date = regd_date;
	}
	

}
