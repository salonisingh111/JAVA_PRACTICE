// ALWAYS REMEMBER : Java Strings are Immutable.

package Strings;
public class BasicStringOperation {
    public static void main(String[] args) {
        String firstName="saloni";
        String LastName="Singh";
        String Name=firstName +" " + LastName;

        System.out.println("your name is: "+Name);
        
        System.out.println(Name.length());

        // charAt
        for(int i=0; i<Name.length(); i++){
            System.out.println(Name.charAt(i));
        }
    }
}



// taking input by useer

// package Strings;
// import java.util.Scanner;

// public class BasicStringOperation{
//     public static void main(String[] args) {
//         System.out.println("enter your full name");
//         Scanner sc=new Scanner(System.in);

//         String name=sc.nextLine();

//         System.out.println("your name is "+name);
//     }
// }


// 