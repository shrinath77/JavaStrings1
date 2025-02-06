package stringmanuplation;

public class CountWords
{
    public static void main(String[] args) {
        String str = "Shrinath               ";
        int Count =str.trim().length();
        System.out.println(Count);

    }

}
//for counting words in string we have to use the length() function and
//fore the remove the spaces from the string we have to use the trim() function