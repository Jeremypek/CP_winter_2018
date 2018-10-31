package pl.waw.sgh;

public class Bowling {

    public static void main(String[] args) {
        int n = 2;
        int p = 0;
        int k = 0;

        for (p = 0; p <= n; p++) {
            k += p;
        }

        System.out.println("The number of pins needed is " + k + ".");
    }

}
// System.out.println();
//  for (int i = 0; i < 4; i++) {
//   System.out.println("I=" + i);

//   for (int X = 6; X > 1; X--) {
//           System.out.println("x=" + X);
//           if (X == 4) break;
// stop the loop

