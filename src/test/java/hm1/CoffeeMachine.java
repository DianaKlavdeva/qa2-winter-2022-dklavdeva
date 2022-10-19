package hm1;

public class CoffeeMachine {
    //-------------ATTRIBUTES-----------
    private String brand;
    private String colour;
    private String finishing;
    private int inputPower;
    private char energyClass;
    private double waterContainerCapacity;
    private boolean aromaFunction;

    //---------------GETTERS/SETTERS-----------

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFinishing() {
        return finishing;
    }

    public void setFinishing(String finishing) {
        this.finishing = finishing;
    }

    public int getInputPower() {
        return inputPower;
    }

    public void setInputPower(int inputPower) {
        this.inputPower = inputPower;
    }

    public char getEnergyClass() {
        return energyClass;
    }

    public void setEnergyClass(char energyClass) {
        this.energyClass = energyClass;
    }

    public double getWaterContainerCapacity() {
        return waterContainerCapacity;
    }

    public void setWaterContainerCapacity(double waterContainerCapacity) {
        this.waterContainerCapacity = waterContainerCapacity;
    }

    public boolean isAromaFunction() {
        return aromaFunction;
    }

    public void setAromaFunction(boolean aromaFunction) {
        this.aromaFunction = aromaFunction;
    }
}
