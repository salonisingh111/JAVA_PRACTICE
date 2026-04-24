
import java.util.*;

public class HighestNoIn2D{
    public static void main(String[] args) {
        System.out.println("enter your 2D array size of rows and column");
        Scanner sc=new Scanner(System.in);

        int rows=sc.nextInt();
        int cols=sc.nextInt();

        System.out.println("enter your array elements");

        int arr[][]=new int[rows][cols];

         int max=Integer.MIN_VALUE;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.print("this is the highest number in row 1 and row 2 :"+max);
        }
        System.out.println();
        sc.close();
    }
}
