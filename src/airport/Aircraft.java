package airport;

public class Aircraft {
    private String manufacturer;
    private String model;
    private int capacity;

    public Aircraft(String manufacturer, String model, int capacity){
        this.manufacturer = manufacturer;
        this.model = model;
        this.capacity = capacity;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getModel(){
        return this.model;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
