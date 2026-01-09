package com.mycompany.ptg_exercise_occ7;

public class Patient extends Person {

    private String symptom;
    private int roomNumber;
    private double currentBill;

    // Constructor
    public Patient(String name, int age, String id, String symptom) {
        super(name, age, id);
        this.symptom = symptom;
        this.roomNumber = 0; // 0 means not admitted yet
        this.currentBill = 0.0;
    }

    // Method: Add to bill
    public void addCharge(double amount) {
        this.currentBill += amount;
        System.out.println("Added $" + amount + " to bill. Total: $" + currentBill);
    }

    // Method: Overridden method
    @Override
    public void displayInfo() {
        System.out.println("PATIENT: " + name + " | Symptom: " + symptom + " | Bill: $" + currentBill);
    }
    
    public String getSymptom() {
        return symptom;
    }
}