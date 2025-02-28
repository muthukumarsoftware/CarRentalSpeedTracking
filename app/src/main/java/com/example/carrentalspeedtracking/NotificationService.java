package com.example.carrentalspeedtracking;

public class NotificationService {

    // Simulate sending notification via Firebase
    public void sendFirebaseNotification(Customer customer, String message) {
        System.out.println("Firebase Notification sent to " + customer.getName() + ": " + message);
    }

    // Placeholder for sending notifications via AWS (to be implemented later)
    public void sendAWSNotification(Customer customer, String message) {
        System.out.println("AWS Notification sent to " + customer.getName() + ": " + message);
    }
}

