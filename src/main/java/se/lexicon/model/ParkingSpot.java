package se.lexicon.model;

import java.util.Objects;

public class ParkingSpot {

    private int spotNumber;
    private boolean occupied;
    private Integer areaCode;
    //private static  int sequencer;


    // Constructors

    public ParkingSpot(int spotNumber, boolean occupied, Integer areaCode) {
        this(spotNumber, areaCode);
        this.occupied = occupied;

    }

    public ParkingSpot(Integer areaCode, int spotNumber) {
        this.areaCode = areaCode;
        this.spotNumber = spotNumber;
    }

    //Getters Setters

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        Objects.requireNonNull(spotNumber, "Parking spot must have a number");
        this.spotNumber = spotNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void occupy () { occupied=true;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
        Objects.requireNonNull(areaCode, "Area must have a number");
    }
}
