package com.mycompany.ptg_exercise_occ7;

public class Department {

    private String deptName;
    private Doctor[] doctorList; // Array of Objects 
    private int doctorCount;

    // Constructor
    public Department(String deptName, int capacity) {
        this.deptName = deptName;
        this.doctorList = new Doctor[capacity]; // Fixed size array
        this.doctorCount = 0;
    }

    // Method: Add a doctor to the array
    public void addDoctor(Doctor d) {
        if (doctorCount < doctorList.length) {
            doctorList[doctorCount] = d;
            doctorCount++;
        } else {
            System.out.println("Department is full!");
        }
    }

    // Method: The Challenge Logic - Find a doctor
    public Doctor findAvailableDoctor() {
        for (int i = 0; i < doctorCount; i++) {
            if (doctorList[i].isAvailable()) {
                return doctorList[i];
            }
        }
        return null; // No doctor available
    }

    public String getName() {
        return deptName;
    }
}