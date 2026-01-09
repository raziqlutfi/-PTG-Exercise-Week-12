package com.mycompany.ptg_exercise_occ7;

public class Appointment {
    // Attributes
    private String appointmentID;
    private String date;
    private boolean isConfirmed;
    
    // Objects involved
    private Doctor doctor;
    private Patient patient;

    // Constructor
    public Appointment(String id, String date, Doctor d, Patient p) {
        this.appointmentID = id;
        this.date = date;
        this.doctor = d;
        this.patient = p;
        this.isConfirmed = true;
        
        // When appointment is created, doctor becomes unavailable
        this.doctor.setAvailability(false);
    }

    // Method 1
    public void printReceipt() {
        System.out.println("--- APPOINTMENT RECEIPT ---");
        System.out.println("Date: " + date);
        System.out.println("Doctor: " + doctor.getName());
        System.out.println("Patient: " + patient.getName());
        System.out.println("Status: " + (isConfirmed ? "Confirmed" : "Cancelled"));
    }

    // Method 2
    public void cancel() {
        this.isConfirmed = false;
        this.doctor.setAvailability(true); // Free up the doctor
        System.out.println("Appointment cancelled.");
    }
}