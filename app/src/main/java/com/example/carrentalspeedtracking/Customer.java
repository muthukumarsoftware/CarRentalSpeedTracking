package com.example.carrentalspeedtracking;

public class Customer {
    private String id;
    private String name;
    private double maxSpeed; // Maximum speed allowed for this customer

    // Constructor
    public Customer(String id, String name, double maxSpeed) {
        this.id = id;
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

