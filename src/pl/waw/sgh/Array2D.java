package pl.waw.sgh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {
        int[][] arr2d = new int[5][5];
        //int rowsum = 0;
        //int totalsum = 0;
        //int colsum = 0;
        //int totalcolsum = 0;
        //test

        arr2d[0][0] = 1;
        arr2d[0][2] = 4;
        arr2d[1][1] = 2;
        arr2d[2][0] = 9;
        arr2d[3][2] = 5;
        arr2d[4][3] = 6;
        arr2d[2][4] = 7;
        arr2d[4][4] = 7;

        //System.out.println(Arrays.deepToString(arr2d));


        System.out.println();

        int totalsum = 0;
        for (int i = 0; i < arr2d.length; i++) {
            int rowsum = 0;
            for (int k = 0; k < arr2d[i].length; k++) {
                rowsum += arr2d[i][k];
            }
            System.out.println("The total sum in row " + (i + 1) + " is " + rowsum + ".");

            totalsum += rowsum;
        }
        System.out.println("The total sum in the array is " + totalsum + ".");

        int totalcolsum = 0;
        for (int i = 0; i < arr2d.length; i++) {
            int colsum = 0;
            for (int k = 0; k < arr2d[i].length; k++) {
                colsum += arr2d[k][i];
            }
            System.out.println(colsum);

            totalcolsum += colsum;
        }
        System.out.println(totalcolsum);

        for (int i = 0; i < arr2d.length; i++) {
            System.out.println(Arrays.toString(arr2d[i]) + totalcolsum);
        }
    }
}
