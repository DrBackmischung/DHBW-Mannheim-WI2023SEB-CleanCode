package solid.srp.exercise;

public class DatabaseManager extends Manager {
    public void connectToDatabase() {
        // Logic to connect to database
        System.out.println("Connected to database.");
    }

    public void disconnectFromDatabase() {
        // Logic to disconnect from database
        System.out.println("Disconnected from database.");
    }

    public void saveDataToDatabase(String data) {
        // Logic to save data to the database
        System.out.println("Saved data to the database: " + data);
    }

    public void loadDataFromDatabase() {
        // Logic to load data from the database
        System.out.println("Loaded data from the database.");
    }
}
