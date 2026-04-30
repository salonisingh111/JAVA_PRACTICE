package Strings;
// Count length of string without using .length() directly in print

public class CountLengthOfString {
    public static void main(String[] args) {
        String input="hello";

        int count=0; 

        for(int i=0; i<input.length(); i++){
            count++;
        }
        System.out.println(count);
    }
}
