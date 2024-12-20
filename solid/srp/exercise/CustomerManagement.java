package solid.srp.exercise;

public class CustomerManagement {
    // Customer management
    public void addCustomer(String name, String email) {
        // Logic to add a customer
        System.out.println("Added customer: " + name + " with email: " + email);
    }

    public void removeCustomer(int customerId) {
        // Logic to remove customer
        System.out.println("Removed customer with ID: " + customerId);
    }

    public void updateCustomer(int customerId, String newEmail) {
        // Logic to update customer details
        System.out.println("Updated customer ID: " + customerId + " with new email: " + newEmail);
    }

    public void sendPromotionalEmail(int customerId, String promotion) {
        // Logic to send promotional email
        System.out.println("Sent promotional email: " + promotion + " to customer ID: " + customerId);
    }

}
