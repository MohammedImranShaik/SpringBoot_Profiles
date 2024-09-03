package com.profiles.service;

import java.util.List;

import com.profiles.model.Patient;

public interface PatientService {

	Patient findPatient(Integer id);

	Patient createPatient(Patient p);

	List<Patient> findAllPatients();

	Patient updatePatient(Patient p);

	void deletePatient(Integer id);

}
