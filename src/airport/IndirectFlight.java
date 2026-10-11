package airport;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class IndirectFlight extends Flight{
    private double refuelingFee;
    private List<Stopover> stopovers = new ArrayList<>();

    public IndirectFlight(int flightId, LocalDateTime departureTime, String boardingGate, Aircraft aircraft, Airport destination){
        super(flightId, departureTime, boardingGate, aircraft, destination);
    }

    public double cost(){
        return 0.0;
    }

    public double getRefuelingFee(){return refuelingFee;}

    public List<Stopover> getStopovers(){return stopovers;}



}
