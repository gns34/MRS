package com.mrs.patient_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrs.patient_service.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
