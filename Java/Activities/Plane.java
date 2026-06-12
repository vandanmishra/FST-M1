package com.activities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {

    // Private variables (Encapsulation)
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;

    // Constructor
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    // Add passenger
    public void addPassenger(String name) {
        if (passengers.size() < maxPassengers) {
            passengers.add(name);
            System.out.println(name + " boarded successfully.");
        } else {
            System.out.println("Plane is full!");
        }
    }

    // Get passengers
    public List<String> getPassengers() {
        return passengers;
    }

    // Takeoff method
    public void takeOff() {
        lastTimeTookOff = new Date();
        System.out.println("Plane took off at: " + lastTimeTookOff);
    }

    // Landing method
    public void land() {
        lastTimeLanded = new Date();
        System.out.println("Plane landed at: " + lastTimeLanded);
    }

    // Getters
    public int getMaxPassengers() {
        return maxPassengers;
    }

    public Date getLastTimeTookOff() {
        return lastTimeTookOff;
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }
}


