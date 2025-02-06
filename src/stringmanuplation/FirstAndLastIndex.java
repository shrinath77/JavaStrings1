package stringmanuplation;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        String ss = "HelloMyNameIsShrinath";


        int FirstIndex = ss.indexOf("l");
        System.out.println(FirstIndex);    //Finding the charter index\

        int LastIndex = ss.lastIndexOf("l");
        System.out.println(LastIndex);               //finding the last occourance charatrer index


    }
}
