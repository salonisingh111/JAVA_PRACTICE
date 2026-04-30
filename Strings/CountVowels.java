package Strings;
public class CountVowels {
    public static void main(String[] args) {
        String input="education";
        int count=0;

        for(int i=0; i<input.length(); i++){
             char ch = input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
              System.out.println(count);
    }
}
