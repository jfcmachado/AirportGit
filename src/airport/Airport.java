package airport;

public class Airport {
    private String name;
    private String code;

    public Airport(String name, String code){
        this.name = name;
        this.code = code;
    }

    public String getName(){
        return this.name;
    }

    public String getCode(){
        return this.code;
    }
}
