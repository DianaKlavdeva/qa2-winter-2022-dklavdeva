package hm1;

public class Sofa {
    //-------------ATTRIBUTES-----------
    private String colour;
    private String material;
    private double length;
    private double width;
    private boolean corner;
    private String cornerDirection;
    private String manufacturer;
    private double price;

    //---------------GETTERS/SETTERS-----------

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public boolean isCorner() {
        return corner;
    }

    public void setCorner(boolean corner) {
        this.corner = corner;
    }

    public String getCornerDirection() {
        return cornerDirection;
    }

    public void setCornerDirection(String cornerDirection) {
        this.cornerDirection = cornerDirection;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
