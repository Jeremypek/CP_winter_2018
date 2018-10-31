package pl.waw.sgh;

public class Loop {

    public static void main(String[] args) {

        for (int q = 0; q < 4; q++) ;
        {
            System.out.println("Q=");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println("I=" + i);
        }
        //spot the difference between q and i, do not put ; at the end of the for loop
        System.out.println();
        for (int X = 6; X > 1; X--) {
            if (X == 5) continue;
            // skip the next iteration
            System.out.println("x=" + X);
            if (X == 4) break;
            // stop the loop
        }
        System.out.println();

        int j = 0;
        while (j < 6) {
            System.out.println("J=" + j);
            j++;
        }
        System.out.println();
        int k = 6;
        do {
            System.out.println("K=" + k);
            k--;
        } while (k > 2);
        //the diff between k and j is the k will run first then check the condition
        //so the k will run at least once (try k = 1, which is not more than 2)
        //but the j will check the condition first before running
    }
}
