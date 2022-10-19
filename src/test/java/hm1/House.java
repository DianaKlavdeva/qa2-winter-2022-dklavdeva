package hm1;

public class House {
    //-------------ATTRIBUTES-----------
    private String address;
    private int floor;
    private double height;
    private double length;
    private double width;
    private int apartmentQuantity;
    private int doorQuantity;
    private int windowQuantity;
    private double apartmentPrice;
    private char currencyPrice;

    //---------------GETTERS/SETTERS-----------

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getApartmentQuantity() {
        return apartmentQuantity;
    }

    public void setApartmentQuantity(int apartmentQuantity) {
        this.apartmentQuantity = apartmentQuantity;
    }

    public int getDoorQuantity() {
        return doorQuantity;
    }

    public void setDoorQuantity(int doorQuantity) {
        this.doorQuantity = doorQuantity;
    }

    public int getWindowQuantity() {
        return windowQuantity;
    }

    public void setWindowQuantity(int windowQuantity) {
        this.windowQuantity = windowQuantity;
    }

    public double getApartmentPrice() {
        return apartmentPrice;
    }

    public void setApartmentPrice(double apartmentPrice) {
        this.apartmentPrice = apartmentPrice;
    }

    public char getCurrencyPrice() {
        return currencyPrice;
    }

    public void setCurrencyPrice(char currencyPrice) {
        this.currencyPrice = currencyPrice;
    }
}
