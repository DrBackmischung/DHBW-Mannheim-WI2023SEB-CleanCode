package solid.srp.exercise;

public class UtilityMethods {
    // Utility methods (really starting to bloat the class)
    public void sendEmail(String emailAddress, String subject, String message) {
        // Logic to send email
        System.out.println("Sent email to " + emailAddress + " with subject: " + subject);
    }

    public void logEvent(String event) {
        // Logic to log an event
        System.out.println("Logged event: " + event);
    }

    public void sendSystemNotification(String notification) {
        // Logic to send system notification
        System.out.println("Sent system notification: " + notification);
    }

    public void printDocument(String document) {
        // Logic to print a document
        System.out.println("Printed document: " + document);
    }

    public void shutdownSystem() {
        // Logic to shut down system
        System.out.println("System shutting down.");
    }
}
