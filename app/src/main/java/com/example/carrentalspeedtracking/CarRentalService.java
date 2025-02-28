package com.example.carrentalspeedtracking;

public class CarRentalService {

    private SpeedLimitManager speedLimitManager;
    private NotificationService notificationService;

    // Constructor
    public CarRentalService(SpeedLimitManager speedLimitManager, NotificationService notificationService) {
        this.speedLimitManager = speedLimitManager;
        this.notificationService = notificationService;
    }

    // Track car speed and send notifications if the speed exceeds the limit
    public void trackCarSpeed(Customer customer, double currentSpeed) {
        if (speedLimitManager.isSpeedExceeded(customer.getId(), currentSpeed)) {
            // Send notification if speed exceeds limit
            notificationService.sendFirebaseNotification(customer, "Speed limit exceeded! Your current speed is " + currentSpeed + " km/h.");
        }
    }
}

