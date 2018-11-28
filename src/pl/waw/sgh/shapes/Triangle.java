package pl.waw.sgh.shapes;

public class Triangle extends Shape {
    //parA - side
    //parB - height


    public Triangle(double parA, double parB) {
        super(parA, parB);
    }

    @Override
    public double calculateSurface() {
        return (parA * parB) / 2;
    }
}
