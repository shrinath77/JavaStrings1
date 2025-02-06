package stringmanuplation;

import java.util.Arrays;

public class ToCharArray {
    public static void main(String[] args) {




//        String str = "Shrinath";
//        char [] ch = str.toCharArray();
//        System.out.println(Arrays.toString(ch));



       // String S = "Shrinath Sampat Kadam";
       // char [] ch = S.toCharArray();
       // System.out.println(Arrays.toString(ch));

       // String Str = "Shrinath, suraj , chaitanya , nishnat";
        //String[] name = Str.split(",");
     //   System.out.println(Arrays.toString(name));


        ///  when you have to convert and splite the stirg use the split() method
        ///  when you have to convert string to char u have to use tocharArray() method


        String name = "banana , apple , orange ";
        String[] str = name.split(",");
        System.out.println(Arrays.toString(str));

        String surname = "Kadam";
        char[] sname = surname.toCharArray();
        System.out.println(Arrays.toString(sname));

        //when you have to convert the String to char we have to use the Array to
        //String method
        //first we have to covert and store intto charter array.
        //then we have to print by using the arrays to string method
    }
}
