

public class FrequencyCounting {
    public static void main(String[] args) {
        int numbers[]={5, 1, 5, 3, 5, 2};

        int count=0;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==5){
                count++;
            }
        }
        System.out.println(count);
    }    
}