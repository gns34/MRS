package com.mrs.patient_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
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
	@PostMapping("/new")
	public Patient newPatient(@RequestBody Patient patient) {
		return patientService.savePatient(patient);
	}
}