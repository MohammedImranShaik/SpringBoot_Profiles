package com.profiles.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.profiles.model.Patient;
import com.profiles.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/findPatient/{id}")
	public Patient findPatient(@PathVariable Integer id) {
		return patientService.findPatient(id);
	}
	
	@PostMapping("/createPatient")
	public Patient createPatient(@RequestBody Patient patient) {
		return patientService.createPatient(patient);
	}
	
	@GetMapping("/findAllPatients")
	public List<Patient> findAllPatients() {
		return patientService.findAllPatients();
	}
	
	@PutMapping("/updatePatient")
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientService.updatePatient(patient);
	}
	
	@DeleteMapping("/deletePatient/{id}")
	public void deletePatient(@PathVariable Integer id) {
		patientService.deletePatient(id);
	}

}
