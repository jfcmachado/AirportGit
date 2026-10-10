package airport;

import java.time.LocalDateTime;

public abstract class Flight {
    private int flightId;
    private LocalDateTime departureTime;
    private String boardingGate;

    public Flight(int flightId, LocalDateTime departureTime, String boardingGate){
        this.flightId = flightId;
        this.departureTime = departureTime;
        this.boardingGate = boardingGate;
    }
}
