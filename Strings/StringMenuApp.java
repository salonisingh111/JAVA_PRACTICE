import java.util.*;

public class StringMenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Reverse String");
            System.out.println("2. Count Vowels");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // fix input issue

            if (choice == 4) {
                System.out.println("Program Ended");
                break;
            }

            System.out.print("Enter text: ");
            String str = sc.nextLine();

            if (choice == 1) {
                String rev = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    rev = rev + str.charAt(i);
                }
                System.out.println("Reversed: " + rev);

            } else if (choice == 2) {
                int count = 0;
                str = str.toLowerCase();

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        count++;
                    }
                }
                System.out.println("Vowels: " + count);

            } else if (choice == 3) {
                System.out.println("Uppercase: " + str.toUpperCase());

            } else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}