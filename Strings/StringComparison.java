package Strings;

public class StringComparison {
    public static void main(String[] args) {
        String name1="Tony";
        String name2="Tony";

        // compare to chechk
        // String 1 > String 2 = +ve value
        // String 1 = String 2 = 0
        // String 1 < String 2 =-ve value

        // in Hello and wello wello is larger string becuase of W, W is greater 

        if(name1.compareTo(name2)==0){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }


    }
}
