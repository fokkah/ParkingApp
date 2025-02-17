package se.lexicon.model;

import java.util.Objects;

public class Vehicle {
    private String plateNumber; // Unique identifier for the vehicle
    private String type;              // Vehicle type (e.g., Car, Motorcycle, Truck)

    public Vehicle(String plateNumber, String type) {
        this.plateNumber = Objects.requireNonNull(plateNumber, "Plate number cannot be null.");
        this.type = Objects.requireNonNull(type, "Vehicle type cannot be null.");
    }

    // Getters and Setters
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = Objects.requireNonNull(plateNumber, "Plate number cannot be null.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = Objects.requireNonNull(type, "Vehicle type cannot be null.");
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "plateNumber='" + plateNumber + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
