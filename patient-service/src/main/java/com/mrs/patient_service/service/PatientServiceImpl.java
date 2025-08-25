package com.mrs.patient_service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrs.patient_service.model.Patient;
import com.mrs.patient_service.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	public Patient savePatient(Patient patient) {
		
		return patientRepository.save(patient);
	}

	public Optional<Patient> getPatientById(Long id) {

		return patientRepository.findById(id);
	}

	public Patient updatePatient(Patient patient) {

		return null;
	}

	public void deletePatientById(Long id) {

		patientRepository.deleteById(id);
	}


}
