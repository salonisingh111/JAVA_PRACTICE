// Rows ko columns bana dena
// Columns ko rows bana dena

import java.util.*;

public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            {2,4},
            {6,8}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        int trans[][] = new int[cols][rows];

        // transpose banana
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                trans[j][i] = arr[i][j];
            }
        }

        // print transpose
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}