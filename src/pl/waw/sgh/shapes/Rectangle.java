package pl.waw.sgh.shapes;

public class Rectangle extends Shape {

    public Rectangle(double parA, double parB) {
        super(parA, parB);
    }

    double calculateSurface() {
        return parA * parB;
    }

    public void setParB(double parB) {
        this.parB = parB;
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + parA + ", " + parB + "],surf:" + calculateSurface();
    }
}
