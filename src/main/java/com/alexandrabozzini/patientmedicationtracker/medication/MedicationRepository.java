package com.alexandrabozzini.patientmedicationtracker.medication;

import org.springframework.data.repository.CrudRepository;

public interface MedicationRepository extends CrudRepository<Medication, Long> {
}
