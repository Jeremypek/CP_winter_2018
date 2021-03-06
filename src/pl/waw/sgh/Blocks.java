package pl.waw.sgh;

public class Blocks {

    // the widest visibility - everywhere
    //public static int i0 = 5;
    // for static variables behaves like public
    //
    //no visibility operator - package wide visibility
    //static int i0 =5
    //static int i0 = 5
    //only within this class
    //private stiatic void i0 = 5

    // a constant - final - cannot be changed
    static final String MY_CONSTANT = "some text";
    //later on you type MY_CONSTANT = "another text", it will not change

    public static int i0 = 5;

    public static void main(String[] args) {
        int i1 = 0;
        {
            System.out.println("inside a block i1=" + i1);
            int i2 = 5;
            System.out.println("inside a block i2=" + i2);
            {
                int i3 = 7;
                System.out.println("inside internal block i1=" + i1);
            }

            {
                //System.out.println("inside internal block 2 i1=" + i3);
            }
        }
        System.out.println("outside the block i1" + i1);
        // i2 not visible in the parent block
    }

}
