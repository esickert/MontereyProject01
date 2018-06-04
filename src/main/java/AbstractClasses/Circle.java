package AbstractClasses;

public class Circle extends GeometricObject {

    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {  //constructor
        this(radius, "white", false);
    }

    public Circle(double radius, String color, boolean filled) {    //constructor
        super(color, filled);
        this.radius = radius;
    }

    // return radius
    public double getRadius() {
        return radius;
    }

    // set a new radius
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    //implement the findRadius method defined in GeometricObject
    public double findArea() {
        return radius * radius * Math.PI;
    }

    //implement the findParameter method
    public double findParameter() {
        return 2 * radius * Math.PI;
    }

    //Override the toString() method defined in Object class
    public String toString() {
        return"[Circle] radius = "+radius;
    }
}
