

//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i]==5){
//                 System.out.println(i);
//                 break;
//             }
//         }
//     }
// }

// import java.util.Scanner;

// public class FindingIndexNo {
//     public static void main(String[] args) {
//         System.out.println("enter size of array");
//         Scanner sc=new Scanner(System.in);

//         int size=sc.nextInt();

//         System.out.println("enter you array element");
//         int numbers[]=new int[size];

//         for(int i=0; i<size; i++){
//             numbers[i]=sc.nextInt();
//         }

//         System.out.println("enter the number you want to find");
//         int x=sc.nextInt();
        
//         for(int i=0; i<numbers.length; i++){
//             if(numbers[i]==x){
//                 System.out.println(x+" number is on index "+i);
//                 break;
//             }
//         }
//     }
// }

import java.util.Scanner;

public class  FindingIndexNo{
    public static void main(String[] args) {
        System.out.println("enter the size of your array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        System.out.println("enter your array element");
        int numbers[]=new int[size];
        boolean found=false;

        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("enter the number you want to find");
        int x=sc.nextInt();

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.print(x+" is found at index "+i);
                found=true;
            }
        }
       if(!found){
        System.out.println("dosent exit");
       }
       sc.close();
    }
}