package stringmanuplation;

import java.util.Scanner;

public class StringExample1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
//        System.out.println(sc);//op stored in sc

        String Rev ="";     //took empty string

        for (int i =sc.length()-1;i>=0;i--)
        {
            Rev = Rev+sc.charAt(i);
        }
        if(sc.equals(Rev))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }

        scanner.close();


        }
    }

