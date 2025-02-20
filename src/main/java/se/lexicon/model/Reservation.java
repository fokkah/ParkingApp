package se.lexicon.model;




import java.time.LocalDateTime;

public class Reservation {
    // todo: needs completion

    String reservationId;
    LocalDateTime startDateTime;
    LocalDateTime endDateTime;
    Customer rentingCustomer;
    private Enum status; //enum

    // Constructors

    public Reservation(Customer rentingCustomer) {
        this.rentingCustomer = rentingCustomer;
    }

    public Reservation(String reservationId, LocalDateTime startDateTime, LocalDateTime endDateTime, Enum status) {
        //this.reservationId = reservationId;
        //startDateTime = LocalDateTime.now();
        //this.endDateTime = endDateTime;
        //this.status = status;
        setReservationId(reservationId);
        setStartDateTime(startDateTime);
        setEndDateTime(endDateTime);




    }


    //Getters


    public Boolean getStatus() {
        return getStatus();
    }



    public String getReservationId() {
        return reservationId;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }


    //Setter


    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = LocalDateTime.now();
    }


    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
        if (endDateTime.isEqual(LocalDateTime.now()) ) {
            setEndDateTime(LocalDateTime.now());

        }
    }

}
