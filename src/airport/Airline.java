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

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setProfitRate(double profitRate){
        this.profitRate = profitRate;
    }

    public double getProfitRate(){
        return this.profitRate;
    }

    public void setCostByClient(double costByClient){
        this.costByClient = costByClient;
    }

    public double getCostByClient(){
        return this.costByClient;
    }
}
