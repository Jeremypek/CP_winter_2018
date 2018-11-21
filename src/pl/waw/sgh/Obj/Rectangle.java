package pl.waw.sgh.Obj;

public class Rectangle {

    //in order: public, null operator: (omit anything) within the same package,
    // protected: visable for me and my children only
    // private

    private double parA = 0;
    private double parB = 0;

    public Rectangle(double parA, double parB) {
        setParams(parA, parB);

    }

    void setParams(double parA, double b) {  //parA here is DIFFERENT from the paraA in purple colour
        this.parA = parA;  //note the difference in colour
        parB = b; // this is only necessary if you have a global variable with the same name
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
