package stringmanuplation;

import java.util.Scanner;

public class CheckStringIsPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");

        String str = sc.nextLine();

        boolean flag = true;

        String str1 = str.toLowerCase();

//        for (int i = 0; i < str1.length() / 2; i++) {
//            if (str1.charAt(i) != str1.charAt(str1.length()-i- 1)) {
//                flag = false;
//                break;
//            }
//
//        }
//        if (flag==true) {
//            System.out.println("Given String is Palindrome");
//        } else {
//            System.out.println("Given String is Not palindrome");
//        }
//        sc.close();

        for (int i=0;i<str1.charAt(i)/2;i++)
        {
            if(str1.charAt(i)!=str1.charAt((str1.length()-i-1)))
            {
                flag=true;
                break;
            }
        }
    }

}

//Stepe 1 Take String input from user
//Step 2 Convert string in to lower case
//divide the string in to two parts by using for loop