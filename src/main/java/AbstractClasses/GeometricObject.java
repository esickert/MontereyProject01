package AbstractClasses;

public abstract class GeometricObject {

    String color = "white";
    boolean filled;

    GeometricObject() {
    }

    GeometricObject(String colour, boolean full) {
        this.color = colour;
        this.filled = full;
    }

    //return color
    public String returnColor() {
        return color;
    }

    // set new color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    // get filled value
    public boolean getFilled() {
        return filled;
    }

    //set new filled value
    public void setFilled(boolean newFilled) {
        this.filled = newFilled;
    }

    //abstract method findArea
    public abstract double findArea();

    //abstract method finfParameter
    public abstract double findParameter();

}



