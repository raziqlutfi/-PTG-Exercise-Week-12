public class Patient extends Person {
    // 3 Attributes specific to Patient
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

    // Method 1: Add to bill
    public void addCharge(double amount) {
        this.currentBill += amount;
        System.out.println("Added $" + amount + " to bill. Total: $" + currentBill);
    }

    // Method 2: Overridden method
    @Override
    public void displayInfo() {
        System.out.println("PATIENT: " + name + " | Symptom: " + symptom + " | Bill: $" + currentBill);
    }
    
    public String getSymptom() {
        return symptom;
    }
}
