package web.model;

public class Car {
    private String model;

    private String body;

    private String fuel;

    public Car(String model, String body, String fuel){
        this.model = model;
        this.body = body;
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
