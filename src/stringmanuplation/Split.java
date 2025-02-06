package stringmanuplation;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {

//        String Fruit = "Banana,Apple,mosambee";
//
//        String[] fruit = Fruit.split(",");
//
//        System.out.println(Arrays.toString(fruit)); // split function is used to split the string and it is converted in the string

//     String FullNames = "Kadam,patil,shinde,";
//     String [] fullnames = FullNames.split(",");
//
//        System.out.println(Arrays.toString(fullnames));

        //it is basically sting type value is converted in to array
        //first we have to use the squre bracket to string and apply the
        //split method to the  string
        //then by using the Arrays.toString method print the new array.


        //#Example

        String Phones = "Apple , samsung , Motorola,Nokia";
        String[] Mobiles = Phones.split(",");

        System.out.println(Arrays.toString(Mobiles));



        //here are the examples of split the string



//        String names = "Shrinath,suraj,nishant,chaitanaya";
//
//        String[] Name = names.split(",");
//
//        System.out.println(Arrays.toString(Name));






    }
}
