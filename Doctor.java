public class Doctor extends Person {
    // 3 Attributes specific to Doctor
    private String specialization;
    private boolean isAvailable;
    private double consultationFee;

    // Constructor
    public Doctor(String name, int age, String id, String specialization, double fee) {
        super(name, age, id); // Calls parent constructor
        this.specialization = specialization;
        this.consultationFee = fee;
        this.isAvailable = true; // Default to available
    }

    // Method 1: Change availability
    public void setAvailability(boolean status) {
        this.isAvailable = status;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    
    public String getSpecialization() {
        return specialization;
    }

    // Method 2: Overridden method 
    @Override
    public void displayInfo() {
        System.out.println("DOCTOR [" + specialization + "] " + name + " | Fee: $" + consultationFee + " | Available: " + isAvailable);
    }
}
