package hm1;

public class Carpet {
    //-------------ATTRIBUTES-----------
    private String form;
    private String colour;
    private double length;
    private double width;
    private double pileThickness;
    private boolean professionalCleaning;
    private double price;

    //---------------GETTERS/SETTERS-----------

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
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

    public double getPileThickness() {
        return pileThickness;
    }

    public void setPileThickness(double pileThickness) {
        this.pileThickness = pileThickness;
    }

    public boolean isProfessionalCleaning() {
        return professionalCleaning;
    }

    public void setProfessionalCleaning(boolean professionalCleaning) {
        this.professionalCleaning = professionalCleaning;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
