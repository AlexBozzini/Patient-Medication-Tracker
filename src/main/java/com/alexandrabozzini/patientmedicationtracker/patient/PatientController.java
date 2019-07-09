package com.alexandrabozzini.patientmedicationtracker.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PatientController {

    @Autowired
    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping(value = "/patients")
    public ResponseEntity<Iterable<Patient>> index(){
        return new ResponseEntity<>(patientService.index(), HttpStatus.OK);
    }

    @GetMapping(value = "patients/{id}")
    public ResponseEntity<Patient> show(@PathVariable Long id){
        return new ResponseEntity<>(patientService.show(id), HttpStatus.OK);
    }

    @PostMapping("/patients")
    public ResponseEntity<Patient> create(@RequestBody Patient patient){
        return new ResponseEntity<>(patientService.create(patient), HttpStatus.CREATED);
    }
}
