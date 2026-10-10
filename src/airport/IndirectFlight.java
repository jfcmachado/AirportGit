package airport;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class IndirectFlight extends Flight{
    private double refuelingFee;
    private List<Stopover> stopovers = new ArrayList<>();

    public IndirectFlight(int flightId, LocalDateTime departureTime, String boardingGate){
        super(flightId, departureTime, boardingGate);
    }
}
