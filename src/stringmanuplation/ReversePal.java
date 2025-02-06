package stringmanuplation;

import java.util.Scanner;

public class ReversePal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        String str = sc.toLowerCase();

        boolean flag = true;

        for(int i=0;i<=str.length()/2;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
