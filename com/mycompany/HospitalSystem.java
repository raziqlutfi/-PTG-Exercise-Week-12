package com.mycompany.ptg_exercise_occ7;

public class HospitalSystem {
    public static void main(String[] args) {
        System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===");

        //Create a Department (Aggregation)
        Department cardiology = new Department("Cardiology", 5);

        //Create Doctors
        Doctor d1 = new Doctor("Dr. Lutfy", 30, "D001", "Cardiologist", 150.0);
        Doctor d2 = new Doctor("Dr. Emran", 31, "D002", "Cardiologist", 200.0);

        //Add Doctors to Department
        cardiology.addDoctor(d1);
        cardiology.addDoctor(d2);

        //Create a Patient
        Patient p1 = new Patient("Abdullah Zahran", 18, "P100", "Chest Pain");
        p1.displayInfo();

        //Link Patient to Doctor via Department 
        System.out.println("\nFinding a doctor in " + cardiology.getName() + "...");
        Doctor assignedDoc = cardiology.findAvailableDoctor();

        if (assignedDoc != null) {
            System.out.println("Doctor Found: " + assignedDoc.getName());
            
            //Create Appointment
            Appointment appt = new Appointment("A-101", "2023-10-27", assignedDoc, p1);
            appt.printReceipt();
            
            //Verify Availability change
            System.out.println("Is " + assignedDoc.getName() + " available now? " + assignedDoc.isAvailable());
        } else {
            System.out.println("No doctors available in " + cardiology.getName());
        }
    }
}