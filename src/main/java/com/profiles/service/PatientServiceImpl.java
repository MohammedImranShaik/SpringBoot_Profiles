package com.profiles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.profiles.model.Patient;
import com.profiles.repository.PatientRepository;
@Component
@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public Patient findPatient(Integer id) {
		
		return patientRepository.findById(id).get();
	}

	@Override
	public Patient createPatient(Patient p) {
		
		return patientRepository.save(p);
	}

	@Override
	public List<Patient> findAllPatients() {
		
		return patientRepository.findAll();
	}

	@Override
	public Patient updatePatient(Patient p) {
		// TODO Auto-generated method stub
		return patientRepository.save(p);
	}

	@Override
	public void deletePatient(Integer id) {
		patientRepository.deleteById(id);
		
	}

	
	

}
