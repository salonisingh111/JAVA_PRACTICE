
import java.util.*;

public class indexFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your size of the input ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("now enter your input");

        for(int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("enter the input you want to find");
        int x = sc.nextInt();

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("number is found at index " + i);
            }
            sc.close();
        }
    }
}