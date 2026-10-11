package airport;

public class Stopover {

    private boolean boardingAtStopover;
    private Airport airport;
    private IndirectFlight indirectFlight;

    public Stopover(Airport airport, boolean boardingAtStopover){
        this.airport=airport;
        this.boardingAtStopover=boardingAtStopover;
    }

    public Stopover(Airport airport, IndirectFlight indirectFlight, boolean boardingAtStopover){
        this.airport=airport;
        this.indirectFlight=indirectFlight;
        this.boardingAtStopover=boardingAtStopover;
    }

    public boolean isBoardingAtStopover(){return boardingAtStopover;}

    public Airport getAirport(){return airport;}

    public IndirectFlight getIndirectFlight(){return indirectFlight;}



}
