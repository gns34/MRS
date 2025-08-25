package com.mrs.patient_service.service;

import java.util.Optional;

import com.mrs.patient_service.model.Patient;

public interface PatientService {
	Patient savePatient(Patient patient);
	Optional<Patient> getPatientById(Long id);
	Patient updatePatient(Patient patient);
	void deletePatientById(Long id);

}
