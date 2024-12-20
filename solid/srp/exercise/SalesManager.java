package solid.srp.exercise;

public class SalesManager extends Manager {
    public void recordSale(int customerId, double amount) {
        // Logic to record a sale
        System.out.println("Recorded sale of $" + amount + " for customer ID: " + customerId);
    }

    public void generateSalesReport() {
        // Logic to generate sales report
        System.out.println("Generated sales report.");
    }
}
