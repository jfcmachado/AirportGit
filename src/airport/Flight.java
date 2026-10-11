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

    public int getFlightId(){ return flightId;}

    public LocalDateTime getDepartureTime(){ return departureTime;}

    public String getBoardingGate(){return boardingGate;}

    public Aircraft getAircraft(){ return aircraft;}

    public Airport getDestination(){ return destination;}



}
