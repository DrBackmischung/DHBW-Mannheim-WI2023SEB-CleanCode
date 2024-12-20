package solid.srp.exercise;

public class EmployeeManager extends Manager {
    public void addEmployee(String name, int id, String department) {
        // Logic to add employee
        System.out.println("Added employee: " + name + " to " + department);
    }

    public void removeEmployee(int id) {
        // Logic to remove employee
        System.out.println("Removed employee with ID: " + id);
    }

    public void updateEmployee(int id, String newName) {
        // Logic to update employee details
        System.out.println("Updated employee ID: " + id + " with name: " + newName);
    }
}
