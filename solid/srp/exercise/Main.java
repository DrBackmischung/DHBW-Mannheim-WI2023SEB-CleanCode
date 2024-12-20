package solid.srp.exercise;

import java.io.File;

public class Main {

	public static void main(String[] args) {
        EmployeeManagement employeeManagementSystem = new EmployeeManagement();
        PayrollManagement payRollManagementSystem = new PayrollManagement();
        ProjectManagement projectManagementSystem = new ProjectManagement();
        CustomerManagement customerManagementSystem = new CustomerManagement();
        SalesMangement salesManagementSystem = new SalesMangement();
        InventoryManagement inventoryManagementSystem = new InventoryManagement();
        ReportGeneration reportGenerationSystem = new ReportGeneration();
        DatabaseOperations databaseOperationsSystem = new DatabaseOperations();
        FileHandling fileHandlingSystem = new FileHandling();
        UtilityMethods utilityMethods = new UtilityMethods();

        employeeManagementSystem.addEmployee("John Doe", 101, "Engineering");
        employeeManagementSystem.updateEmployee(101, "Jonathan Doe");
        employeeManagementSystem.removeEmployee(101);

        payRollManagementSystem.processPayroll(102, 75000.50);
        payRollManagementSystem.generatePayrollReport();

        projectManagementSystem.assignProject(102, "AI Development");
        projectManagementSystem.completeProject(102, "AI Development");
        projectManagementSystem.generateProjectStatusReport("AI Development");

        customerManagementSystem.addCustomer("Alice Smith", "alice@example.com");
        customerManagementSystem.updateCustomer(201, "alice.smith@example.com");
        customerManagementSystem.sendPromotionalEmail(201, "50% Off Sale!");
        customerManagementSystem.removeCustomer(201);

        salesManagementSystem.recordSale(202, 1500.75);
        salesManagementSystem.generateSalesReport();

        inventoryManagementSystem.addInventoryItem("Laptop", 50);
        inventoryManagementSystem.updateInventoryItemQuantity("Laptop", 45);
        inventoryManagementSystem.generateInventoryReport();
        inventoryManagementSystem.removeInventoryItem("Laptop");

        reportGenerationSystem.generateCompanyWideReport();

        databaseOperationsSystem.connectToDatabase();
        databaseOperationsSystem.saveDataToDatabase("Sample data");
        databaseOperationsSystem.loadDataFromDatabase();
        databaseOperationsSystem.disconnectFromDatabase();

        fileHandlingSystem.saveReportToFile("Annual Report", "reports/annual_report.txt");
        fileHandlingSystem.loadReportFromFile("reports/annual_report.txt");

        utilityMethods.sendEmail("admin@example.com", "System Update", "The system will undergo maintenance tonight.");
        utilityMethods.logEvent("System maintenance scheduled.");
        utilityMethods.sendSystemNotification("Reminder: Maintenance scheduled at 10 PM.");
        utilityMethods.printDocument("Company Policy Document");

        utilityMethods.shutdownSystem();
	}

}
