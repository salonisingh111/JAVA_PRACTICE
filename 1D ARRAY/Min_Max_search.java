
import java.util.*;

public class Min_Max_search{
    public static void main(String[] args) {
        
        System.out.println("enter your size of the array");
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt(); 

        System.out.println("enter you array elements");
        int numbers[]=new int[size];

        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("this is your maximum number of the array: "+max);

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println("this is your minimum number of the array: "+min);
        sc.close();
    }
}