import java.util.*;

public class Searchin2DArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        // input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();
        boolean found = false;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(arr[i][j] == target){
                    System.out.println("Found at (" + i + "," + j + ")");
                    found = true;
                    break; // inner loop stop
                }
            }
            if(found) break; // outer loop stop
        }

        if(!found){
            System.out.println("Not Found");
        }
    }
}