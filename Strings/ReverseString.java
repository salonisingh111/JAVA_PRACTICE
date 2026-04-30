package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String input="hello";
       String result="";

        for(int i=input.length()-1; i>=0; i--){
          char ch=input.charAt(i);
          result=result+ch;
        }
        System.out.println(result);
    }
}
