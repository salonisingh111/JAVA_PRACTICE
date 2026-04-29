package Strings;
public class CountCharacterFrequency {
    public static void main(String[] args) {
        String Input= "hello";

        int count=0; 
        for(int i=0; i<Input.length(); i++){
            if(Input.charAt(i)=='l'){
                count++;
            }
        }
        System.out.println(count);
    }
}
