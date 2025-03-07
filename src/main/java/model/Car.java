package web.controller;

public class Car {

    public Car(String model, String number, String color) {
    }
    public Car(){
    }
    private String model;
    private String number;
    private String color;


    public void setCar(String model, String number, String color) {
        this.model = model;
        this.number = number;
        this.color = color;
    }
    public String getCar() {
        return model;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
}
