package airport;

import java.time.LocalDateTime;

public class DirectFlight extends Flight{
    public DirectFlight(int flightId, LocalDateTime departureTime, String boardingGate){
        super(flightId, departureTime, boardingGate);
    }

}
