import java.util.Scanner;

public class surveyResultArray2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] surveyData = new int[10][6];
        for (int i = 0; i < 10; i++) {
            System.out.println("\nResponden " + (i+1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j+1)+": ");
                surveyData[i][j]=input.nextInt();
                   
            }
             
            
        }
        System.out.println();
        System.out.println("Survey Result: ");
            for (int j = 0; j < 10; j++) {
                System.out.println("Responden " + (j+1));
                for (int j2 = 0; j2 < 6; j2++) {
                    System.out.print( "\nPertanyaan " + (j2+1)+": " + surveyData[j] [j2]+ " ");
                }
            }
        
    }
}