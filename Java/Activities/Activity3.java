package com.activities;

public class Activity3 {
    public static String adjustDevice(String device, int value) {
        if (device == null) {
            return "Error: Device cannot be null.";
        }
        String status;
        switch (device.toUpperCase()) {
            case "THERMOSTAT" -> {
                if (value >= 40) {
                    status = "[Thermostat] Warning: Temperature high.";
                } else {
                    status = "[Thermostat] Temperature is set to " + value + ".";
                }
            }
            case "LIGHT" -> {
                status = "[Light] Adjusting brightness to " + value + "%.";
            }
            default -> {
                status = "Unknown device: " + device;
            }
        }
        return status;
    }
    
    public static void main(String[] args) {
        System.out.println(adjustDevice("THERMOSTAT", 45));
        System.out.println(adjustDevice("THERMOSTAT", 25));
        System.out.println(adjustDevice("LIGHT", 80));
        System.out.println(adjustDevice(null, 50));
        System.out.println(adjustDevice("FAN", 20));
    }
}