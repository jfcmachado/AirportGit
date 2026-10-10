package airport;

public class Airline {
    private String name;
    private double profitRate;
    private double costByClient;

    public Airline(String name, double profitRate, double costByClient){
        this.name = name;
        this.profitRate = profitRate;
        this.costByClient = costByClient;
    }

    public String getName(){
        return this.name;
    }

    public double getProfitRate(){
        return this.profitRate;
    }

    public double getCostByClient(){
        return this.costByClient;
    }
}
