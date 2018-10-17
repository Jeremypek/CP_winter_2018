package pl.waw.sgh;

public class DoubleFloat {

    public static void main(String[] args) {
        Double d1 = 3425d;  //need to add d at the back to state it is a double
        // f for float, L (uppercase) for long
        // only need to indicate for object type, no need for primitive type

        double d2 = 34235;

        System.out.println(d1 * d2);

        float f2 = 534636;
        //d2 = f2;
        float f1 = d1.floatValue();
        d1.intValue();

        // converts primitive to object type. need to do this if havent declare object "Double.valueOf"
        Double d3 = Double.valueOf(d2)


    }
}
