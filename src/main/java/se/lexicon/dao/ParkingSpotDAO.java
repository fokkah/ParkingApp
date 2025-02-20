package se.lexicon.dao;

import se.lexicon.model.ParkingSpot;

public interface ParkingSpotDAO {

    ParkingSpot create(ParkingSpot parkingSpot);
    ParkingSpot findBySpotNumber(int spotNumber);
}
