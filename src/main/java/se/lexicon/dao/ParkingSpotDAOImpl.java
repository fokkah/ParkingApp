package se.lexicon.dao;

import se.lexicon.dao.sequencer.ParkingSpotSequencer;
import se.lexicon.model.ParkingSpot;

import java.util.ArrayList;

public class ParkingSpotDAOImpl implements ParkingSpotDAO {

    ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();


    @Override
    public ParkingSpot create(ParkingSpot parkingSpot) {
        if (parkingSpot == null) {
            throw new IllegalArgumentException("Parkingspot needs a number");
        }
            parkingSpot.setSpotNumber(ParkingSpotSequencer.nextParkingNr());
            parkingSpots.add(parkingSpot);

        return parkingSpot;
    }

    @Override
    public ParkingSpot findBySpotNumber(int spotNumber) {
        for (ParkingSpot parkingspot : parkingSpots)

        if (parkingspot.getSpotNumber() == spotNumber){
            return parkingspot;
        }
            throw new IllegalArgumentException("No parkingspot with that ID");
    }
}




