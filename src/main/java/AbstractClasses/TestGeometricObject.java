package AbstractClasses;

public class TestGeometricObject {
    public static void main(String[] args) {

        GeometricObject geoCircle = new Circle(3);
        displayGeometricObject(geoCircle);
    }

        static void displayGeometricObject(GeometricObject object)  {
            System.out.println("WORKING WITH ABSTRACT CLASSES");
            System.out.println(object.toString());
            System.out.println("The area is " + object.findArea());
            System.out.println("The diameter is " + object.findParameter());
    }

}
