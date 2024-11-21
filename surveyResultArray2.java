import java.util.Scanner;

public class surveyResultArray2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] surveyData = new int[10][6];
        for (int i = 0; i < 10; i++) {
            System.out.println("\nResponden " + (i+1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j+1)+"(1-5): ");
                surveyData[i][j]=input.nextInt();      
            }
        }
        System.out.println();
        System.out.println("Overall Average value: ");
            for (int j = 0; j < 10; j++) {
            int totalSum = 0;
                for (int j2 = 0; j2 < 6; j2++) {
                totalSum += surveyData[j][j2];
                }
                double overallAverage = (double) totalSum / (10*6);
                System.out.print("\n" + overallAverage + " ");
            }
    }
}