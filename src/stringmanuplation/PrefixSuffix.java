package stringmanuplation;

public class PrefixSuffix {
    public static void main(String[] args) {

        String P = "unhelpful,remarkable";
      //  String S = "Legaly";

        boolean b = P.startsWith("unhelpful");
       boolean c = P.endsWith("remarkable");
        System.out.println(b);
        System.out.println(c);


        //P.Stratswith And P.endswith used to check the prefix and suffix.
        //ex help prefix is unhelpful un is sufix
        // help suffix is helpful ful ful is

    }
}