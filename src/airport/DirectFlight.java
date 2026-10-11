package airport;

import java.time.LocalDateTime;

public class DirectFlight extends Flight{


    public DirectFlight(int flightId, LocalDateTime departureTime, String boardingGate, Aircraft aircraft, Airport destination){
        super(flightId, departureTime, boardingGate, aircraft, destination);
    }

    public double cost() {
        return 0.0;
    }


}
