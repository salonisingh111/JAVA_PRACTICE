public class SubArrays {
 public static void main(String[] args) {
    int numbers[]={1, 2, 3};

    for(int i=0; i<numbers.length; i++){
        for(int j=i; j<numbers.length; j++){
            for(int k=i; k<=j; k++){
                System.out.print(numbers[k]+" ");
            }
            System.out.println();
        }
    }
 }   
}