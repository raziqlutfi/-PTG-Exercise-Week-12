public class HospitalSystem {
    public static void main(String[] args) {
        System.out.println("=== HOSPITAL MANAGEMENT SYSTEM ===");

        // 1. Create a Department (Aggregation)
        Department cardiology = new Department("Cardiology", 5);

        // 2. Create Doctors
        Doctor d1 = new Doctor("Dr. Smith", 45, "D001", "Cardiologist", 150.0);
        Doctor d2 = new Doctor("Dr. Jones", 50, "D002", "Cardiologist", 200.0);

        // 3. Add Doctors to Department
        cardiology.addDoctor(d1);
        cardiology.addDoctor(d2);

        // 4. Create a Patient
        Patient p1 = new Patient("Alice Brown", 30, "P100", "Chest Pain");
        p1.displayInfo();

        // 5. Challenge Logic: Link Patient to Doctor via Department 
        System.out.println("\nFinding a doctor in " + cardiology.getName() + "...");
        Doctor assignedDoc = cardiology.findAvailableDoctor();

        if (assignedDoc != null) {
            System.out.println("Doctor Found: " + assignedDoc.getName());
            
            // 6. Create Appointment
            Appointment appt = new Appointment("A-101", "2023-10-27", assignedDoc, p1);
            appt.printReceipt();
            
            // 7. Verify Availability change
            System.out.println("Is " + assignedDoc.getName() + " available now? " + assignedDoc.isAvailable());
        } else {
            System.out.println("No doctors available in " + cardiology.getName());
        }
    }
}
