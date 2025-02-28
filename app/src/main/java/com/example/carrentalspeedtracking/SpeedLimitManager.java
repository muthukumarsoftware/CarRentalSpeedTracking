package com.example.carrentalspeedtracking;

import java.util.HashMap;
import java.util.Map;

public class SpeedLimitManager {
    private Map<String, Double> customerLimits = new HashMap<>();

    // Set the speed limit for a customer
    public void setSpeedLimit(Customer customer, double limit) {
        customer.setMaxSpeed(limit);
        customerLimits.put(customer.getId(), limit);
    }

    // Get the speed limit for a customer
    public Double getSpeedLimit(String customerId) {
        return customerLimits.get(customerId);
    }

    // Check if the current speed exceeds the limit for a customer
    public boolean isSpeedExceeded(String customerId, double currentSpeed) {
        Double maxSpeed = customerLimits.get(customerId);
        return maxSpeed != null && currentSpeed > maxSpeed;
    }
}

