package solid.srp.exercise;

public class Main {

	public static void main(String[] args) {
        ManagementSystem managementSystem = new ManagementSystem();

        managementSystem.addEmployee("John Doe", 101, "Engineering");
        managementSystem.updateEmployee(101, "Jonathan Doe");
        managementSystem.removeEmployee(101);

        managementSystem.processPayroll(102, 75000.50);
        managementSystem.generatePayrollReport();

        managementSystem.assignProject(102, "AI Development");
        managementSystem.completeProject(102, "AI Development");
        managementSystem.generateProjectStatusReport("AI Development");

        managementSystem.addCustomer("Alice Smith", "alice@example.com");
        managementSystem.updateCustomer(201, "alice.smith@example.com");
        managementSystem.sendPromotionalEmail(201, "50% Off Sale!");
        managementSystem.removeCustomer(201);

        managementSystem.recordSale(202, 1500.75);
        managementSystem.generateSalesReport();

        managementSystem.addInventoryItem("Laptop", 50);
        managementSystem.updateInventoryItemQuantity("Laptop", 45);
        managementSystem.generateInventoryReport();
        managementSystem.removeInventoryItem("Laptop");

        managementSystem.generateCompanyWideReport();

        managementSystem.connectToDatabase();
        managementSystem.saveDataToDatabase("Sample data");
        managementSystem.loadDataFromDatabase();
        managementSystem.disconnectFromDatabase();

        managementSystem.saveReportToFile("Annual Report", "reports/annual_report.txt");
        managementSystem.loadReportFromFile("reports/annual_report.txt");

        managementSystem.sendEmail("admin@example.com", "System Update", "The system will undergo maintenance tonight.");
        managementSystem.logEvent("System maintenance scheduled.");
        managementSystem.sendSystemNotification("Reminder: Maintenance scheduled at 10 PM.");
        managementSystem.printDocument("Company Policy Document");

        managementSystem.shutdownSystem();
	}

}
