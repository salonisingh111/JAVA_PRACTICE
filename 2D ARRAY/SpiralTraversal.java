import java.util.*;

public class SpiralTraversal {
    public static void main(String[] args) {

        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        while(top <= bottom && left <= right){

            // 1. top row (left → right)
            for(int j = left; j <= right; j++){
                System.out.print(arr[top][j] + " ");
            }
            top++;

            // 2. right column (top → bottom)
            for(int i = top; i <= bottom; i++){
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // 3. bottom row (right → left)
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }

            // 4. left column (bottom → top)
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}