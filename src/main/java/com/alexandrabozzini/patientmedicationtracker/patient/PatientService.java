package com.alexandrabozzini.patientmedicationtracker.patient;

import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Iterable<Patient> index(){
        return patientRepository.findAll();
    }

    public Patient show(Long id){
        return patientRepository.findById(id).get();
    }

    public Patient create(Patient patient){
        return patientRepository.save(patient);
    }
}
