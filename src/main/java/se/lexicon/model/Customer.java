package se.lexicon.model;

import java.util.Objects;
import java.util.regex.Pattern;

public class Customer {
    // Fields
    private Integer id;
    private String name;
    private String phoneNumber;
    private Vehicle vehicle;

    // Constructors

    public Customer(Integer id, String name, String phoneNumber, Vehicle vehicle) {
        this(name, phoneNumber, vehicle);
        this.setId(id);
    }

    public Customer(String name, String phoneNumber, Vehicle vehicle) {
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setVehicle(vehicle);
    }

    // Getters & Setters

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setId(Integer id) {
        Objects.requireNonNull(id, "Customer Id should not be null.");
        this.id = id;
    }

    public void setName(String name) { // null
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name should not be null or empty.");
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) { // 0123456789
        if (phoneNumber == null || phoneNumber.trim().isEmpty())
            throw new IllegalArgumentException("PhoneNumber should not be null or empty.");

        final Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^\\+?[0-9]{10,15}$");
        // ^ start of the string.
        // \\+? Allows an optional + at the beginning
        // [0-9]{10,15} ensures the number contains of 10 to 15 digits.
        // $ end of the string.

        if (!PHONE_NUMBER_PATTERN.matcher(phoneNumber).matches()){
            throw new IllegalArgumentException("Invalid phone number format.");
        }
        this.phoneNumber = phoneNumber;
    }

    public void setVehicle(Vehicle vehicle) {
        Objects.requireNonNull(vehicle, "Vehicle should not be null");
        this.vehicle = vehicle;
    }

    // Add more Methods

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }

}
