package pl.waw.sgh;

import java.util.Scanner;

public class InputParamScanner {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner()
        System.out.println("This is output");
        System.err.println("This is an error");

        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Please provide your name: \n");
        // \t - tab
        // \n - new line
        // \r\n - Windows CR LF

        // while (scanner.hasNext()) {
        // String name = scanner.next();
        // if (name.equals("exit")) break;
        // System.out.println("Hello " + name);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide your number: \n");

        while (scanner.hasNextInt()) {
            Integer myInt = scanner.nextInt();
            if (myInt.equals(0)) break;
            System.out.println("I got " + myInt);
        }
    }
}
