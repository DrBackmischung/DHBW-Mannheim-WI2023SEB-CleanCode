package solid.srp.exercise;

public class InventoryManager extends Manager {
    public void addInventoryItem(String item, int quantity) {
        // Logic to add item to inventory
        System.out.println("Added " + quantity + " units of " + item + " to inventory.");
    }

    public void removeInventoryItem(String item) {
        // Logic to remove item from inventory
        System.out.println("Removed " + item + " from inventory.");
    }

    public void updateInventoryItemQuantity(String item, int quantity) {
        // Logic to update inventory
        System.out.println("Updated inventory of " + item + " to " + quantity + " units.");
    }

    public void generateInventoryReport() {
        // Logic to generate inventory report
        System.out.println("Generated inventory report.");
    }
}
