package com.example.carrentalspeedtracking;

public class Main {
    public static void main(String[] args) {
        // Create a customer with a speed limit of 100 km/h
        Customer customer1 = new Customer("123", "John Doe", 100.0);

        // Create instances of SpeedLimitManager and NotificationService
        SpeedLimitManager speedLimitManager = new SpeedLimitManager();
        NotificationService notificationService = new NotificationService();

        // Create a CarRentalService instance
        CarRentalService carRentalService = new CarRentalService(speedLimitManager, notificationService);

        // Set the speed limit for customer1
        speedLimitManager.setSpeedLimit(customer1, 100.0);

        // Track the car's speed and check if it exceeds the limit
        carRentalService.trackCarSpeed(customer1, 120.0); // Exceeds speed
        carRentalService.trackCarSpeed(customer1, 90.0);  // Below speed
    }
}
