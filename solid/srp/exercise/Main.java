package solid.srp.exercise;

import javax.xml.crypto.Data;

public class Main {

	public static void main(String[] args) {
        Manager managementSystem = new Manager();
        CustomerManager customerManager = new CustomerManager();
        EmployeeManager employeeManager = new EmployeeManager();
        InventoryManager inventoryManager = new InventoryManager();
        PayrollManager payrollManager = new PayrollManager();
        ProjectManager projectManager = new ProjectManager();
        SalesManager salesManager = new SalesManager();
        DatabaseManager databaseManager = new DatabaseManager();
        FileManager fileManager = new FileManager();
        

        employeeManager.addEmployee("John Doe", 101, "Engineering");
        employeeManager.updateEmployee(101, "Jonathan Doe");
        employeeManager.removeEmployee(101);

        payrollManager.processPayroll(102, 75000.50);
        payrollManager.generatePayrollReport();

        projectManager.assignProject(102, "AI Development");
        projectManager.completeProject(102, "AI Development");
        projectManager.generateProjectStatusReport("AI Development");

        customerManager.addCustomer("Alice Smith", "alice@example.com");
        customerManager.updateCustomer(201, "alice.smith@example.com");
        customerManager.sendPromotionalEmail(201, "50% Off Sale!");
        customerManager.removeCustomer(201);

        salesManager.recordSale(202, 1500.75);
        salesManager.generateSalesReport();

        inventoryManager.addInventoryItem("Laptop", 50);
        inventoryManager.updateInventoryItemQuantity("Laptop", 45);
        inventoryManager.generateInventoryReport();
        inventoryManager.removeInventoryItem("Laptop");

        managementSystem.generateCompanyWideReport();

        databaseManager.connectToDatabase();
        databaseManager.saveDataToDatabase("Sample data");
        databaseManager.loadDataFromDatabase();
        databaseManager.disconnectFromDatabase();

        fileManager.saveReportToFile("Annual Report", "reports/annual_report.txt");
        fileManager.loadReportFromFile("reports/annual_report.txt");

        managementSystem.sendEmail("admin@example.com", "System Update", "The system will undergo maintenance tonight.");
        managementSystem.logEvent("System maintenance scheduled.");
        managementSystem.sendSystemNotification("Reminder: Maintenance scheduled at 10 PM.");
        managementSystem.printDocument("Company Policy Document");

        managementSystem.shutdownSystem();
	}

}
