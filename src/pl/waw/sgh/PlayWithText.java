package pl.waw.sgh;

import java.sql.SQLOutput;

public class PlayWithText {

    public static void main(String[] args) {
        String s = "abc";
        String s2 = "def";

        String s3 = s + s2;
        System.out.println(s + s2);

        int slen = s.length();
        //System.out.println(slen);
        System.out.println(s.indexOf("ab"));
        System.out.println(s.charAt(2));

        System.out.println(s3.substring(2));
        System.out.println(s3.substring(1, 4));

        /*
        s.lastIndexOf()
        s.split() can split the string with a delimiter, will result in an array of string splitted into
        s.toLowerCase()
        s.substring()
        */

        String s4 = "ABC";
        //below 2 lines: pick 1 to run to see the difference s4 equal/not equal to s5
        //String s5 = "ABC";
        String s5 = new String("ABC"); //s5: "ABC"

        System.out.println(s4); //s4: "ABC"
        System.out.println(s5);

        if (s4 == s5) {
            System.out.println("s4 and s5 are equal");
        } else {
            System.out.println("s4 and s5 are NOT equal");
        }

        if (s4.equals(s5)) {
            System.out.println("s4 and s5 are equal");
        } else {
            System.out.println("s4 and s5 are NOT equal");
        }


    }
}
