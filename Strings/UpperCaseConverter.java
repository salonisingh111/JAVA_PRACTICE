import java.util.Scanner;

public class UpperCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String str = sc.nextLine();

        System.out.println("Uppercase: " + str.toUpperCase());

        sc.close();
    }
}