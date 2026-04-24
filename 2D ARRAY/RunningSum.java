// public class RunningSum{
//     public static void main(String[] args) {
//         int numbers[]={2,2,2,2};

//         int x=0;

//         for(int i=0; i<numbers.length; i++){
//             x=x+numbers[i];
//             System.out.print(x+" ");
//         }
//     }
// }

import java.util.Scanner;

public class RunningSum{
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();

        System.out.println("enter the array element");
        int numbers[]=new int[size];

        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }

        int x=0;

        for(int i=0; i<numbers.length; i++){
            x=x+numbers[i];
            System.out.print(  x +" ");
        }
    }
}