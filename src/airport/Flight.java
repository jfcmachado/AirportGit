package airport;

import java.time.LocalDateTime;

public abstract class Flight {
    private int flightId;
    private LocalDateTime departureTime;
    private String boardingGate;
    private Aircraft aircraft;
    private Airport destination;

    public abstract double cost();

    public Flight(int flightId, LocalDateTime departureTime, String boardingGate, Aircraft aircraft, Airport destination){
        this.flightId = flightId;
        this.departureTime = departureTime;
        this.boardingGate = boardingGate;
        this.aircraft = aircraft;
        this.destination = destination;
    }

    public void setFlightId(int flightId){
        this.flightId = flightId;
    }

    public int getFlightId(){ return flightId;}

    public void setDepartureTime(LocalDateTime departureTime){
        this.departureTime = departureTime;
    }

    public LocalDateTime getDepartureTime(){ return departureTime;}

    public void setBoardingGate(String boardingGate){
        this.boardingGate = boardingGate;
    }

    public String getBoardingGate(){return boardingGate;}

    public void setAircraft(Aircraft aircraft){
        this.aircraft = aircraft;
    }

    public Aircraft getAircraft(){ return aircraft;}

    public void setDestination(Airport destination){
        this.destination = destination;
    }

    public Airport getDestination(){ return destination;}



}
