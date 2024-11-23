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
        System.out.println("Survey Result: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i+1));
            for (int j = 0; j < 6; j++) {
                System.out.println("Question " + (j+1) + ": " + surveyData[i][j]);
            }
        }
        System.out.println("\nAverage value per Respondent");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i+1));
            int sum = 0;
            for (int j = 0; j < 6; j++) {
                sum+=surveyData[i][j];

            }
            double averageValue = (double) sum /6;
            System.out.println("Average value respondent " + (i+1) + averageValue);
        }
        

        System.out.println("\nAverage value per Question ");
        for (int i = 0; i < 6; i++) {
            System.out.println("Question " + (i+1));
            int sum =0;
            for (int j = 0; j < 10; j++) {
                sum += surveyData[j][i];
            }
            double averageValue = (double) sum / 10;
            System.out.println("Average value question "+ (i+1) + averageValue);
        }
        

        System.out.println("\nOverall Average value: ");
            for (int j = 0; j < 10; j++) {
            int totalSum = 0;
                for (int j2 = 0; j2 < 6; j2++) {
                totalSum += surveyData[j][j2];
                }
                double overallAverage = (double) totalSum / (10*6);
                System.out.print("\nOverall Average value respondent" + (j+1) + overallAverage + " ");
            }
    }
}