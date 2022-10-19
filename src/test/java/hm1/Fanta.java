package hm1;

public class Fanta {
    //-------------ATTRIBUTES-----------
    private String taste;
    private String colour;
    private double volume;
    private double price;
    private boolean zeroSugar;
    private int barcode;

    //---------------GETTERS/SETTERS-----------

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isZeroSugar() {
        return zeroSugar;
    }

    public void setZeroSugar(boolean zeroSugar) {
        this.zeroSugar = zeroSugar;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }
}
