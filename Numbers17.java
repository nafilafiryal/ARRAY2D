import java.util.Arrays;

public class Numbers17 {
    public static void main(String[] args) {
        int[][] myNumber = new int[3][5];
        for (int i = 0; i < myNumber.length; i++) {
            for (int j = 0; j < myNumber.length; j++) {
                myNumber[i][j]=(i+1)*(j+1);

            }
            for (int j = 0; j < myNumber.length; j++) {
                System.out.println(Arrays.toString(myNumber[i]));
            }
            for (int j = 0; j < myNumber.length; j++) {
                System.out.println("Length of row " + (i+1) + ": " + myNumber[i].length);
            }
        }
    }
}
