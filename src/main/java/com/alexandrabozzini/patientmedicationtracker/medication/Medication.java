package com.alexandrabozzini.patientmedicationtracker.medication;

import com.alexandrabozzini.patientmedicationtracker.patient.Patient;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate datePrescribed;
    @ManyToOne
    private Patient patient;

    public Medication(Long id, String name, LocalDate datePrescribed, Patient patient) {
        this.id = id;
        this.name = name;
        this.datePrescribed = datePrescribed;
        this.patient = patient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDatePrescribed() {
        return datePrescribed;
    }

    public void setDatePrescribed(LocalDate datePrescribed) {
        this.datePrescribed = datePrescribed;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(datePrescribed, that.datePrescribed) &&
                Objects.equals(patient, that.patient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, datePrescribed, patient);
    }
}
