
import java.util.*;
public class ArrayTraversal2d {
    public static void main(String[] args){
         System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
    
        int rows=sc.nextInt();
        int cols=sc.nextInt();

            System.out.println("enter the array element");

        int arr[][]=new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
               System.out.print(arr[i][j]+" ");
            }
              System.out.println();
        }
    }
}