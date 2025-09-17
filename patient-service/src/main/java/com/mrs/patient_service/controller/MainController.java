package com.mrs.patient_service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mrs.patient_service.model.Patient;
import com.mrs.patient_service.service.PatientService;

@RestController
public class MainController {
	@Autowired
	private PatientService patientService;

	@GetMapping("/all")
	public List<Patient> getAllUserHome(){
		return patientService.getAllPatients();
	}
	@PostMapping("/byid")
	public Optional<Patient> getPatientById(@RequestBody Patient patient) {
		Long id= (long) patient.getId();
		return patientService.getPatientById(id);
		
	}
	
	@PostMapping("/new")
	public Patient newPatient(@RequestBody Patient patient) {
		return patientService.savePatient(patient);
	}
	@PutMapping("/update")
	public Patient updatePatient(@RequestBody Patient patient) {
		
		return patientService.updatePatient(patient);
	}
	@DeleteMapping("/delete")
	public String deletePatient() {
		System.out.println("Deleted");
		return "Deleted";
	}
	
}