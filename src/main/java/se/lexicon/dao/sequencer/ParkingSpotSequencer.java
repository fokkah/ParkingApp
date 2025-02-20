package se.lexicon.dao.sequencer;

import se.lexicon.model.ParkingSpot;

public class ParkingSpotSequencer {

    private static int parkinSpotNr;

    public static int nextParkingNr(){

        return parkinSpotNr++;
    }
}
