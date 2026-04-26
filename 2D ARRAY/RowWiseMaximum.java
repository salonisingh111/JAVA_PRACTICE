public class RowWiseMaximum {
    public static void main(String[] args) {
        int numbers[][]={
            {1, 8, 3},
            {4, 2, 6},
            {7, 5, 9}
        };

        int rows=numbers.length;
        int cols=numbers[0].length;
        
        for(int i=0; i<rows; i++){

            int max=Integer.MIN_VALUE;

            for(int j=0; j<cols; j++){

                if(numbers[i][j]>max){
                    max=numbers[i][j];
                }
            }
            System.out.println("Row " + i + " max = " + max);
        }
    }
}
