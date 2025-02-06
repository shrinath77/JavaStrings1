package stringmanuplation;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int count = 0;
        int ocount=0;
        String name = str.toLowerCase();
        for (int i = 0; i <= name.length() - 1; i++) {
            if (name.charAt(i) == 'a' ||
                    name.charAt(i) == 'e' ||
                    name.charAt(i) == 'i' ||
                    name.charAt(i) == 'o' ||
                    name.charAt(i) == 'u') {
                count++;
            }
            else {
                ocount ++;

            }


        }
        System.out.println("Vowel count is "+count);
        System.out.println("other count is "+ocount);


    }

}


