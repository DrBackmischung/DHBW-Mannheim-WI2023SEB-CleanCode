package solid.srp.exercise;

public class FileManager extends Manager {
    public void saveReportToFile(String report, String filePath) {
        // Logic to save a report to a file
        System.out.println("Saved report to file: " + filePath);
    }

    public void loadReportFromFile(String filePath) {
        // Logic to load a report from a file
        System.out.println("Loaded report from file: " + filePath);
    }
}
