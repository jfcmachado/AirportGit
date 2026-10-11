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

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
