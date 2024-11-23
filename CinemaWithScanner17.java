import java.util.Scanner;

public class CinemaWithScanner17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, column;
        String name, next;
        int menuAudience=0;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("\nMenu 1: Input Audience Data" + "\nMenu 2: Show Audience List" + "\nMenu 3: Exit");
            System.out.print("Choose Menu: ");
            menuAudience = input.nextInt();
            input.nextLine();

            if (menuAudience == 1) {
                while (true) {
                    System.out.print("Enter a name: ");
                    name = input.nextLine();
                    System.out.print("Enter row number: ");
                    row = input.nextInt();
                    System.out.print("Enter column number: ");
                    column = input.nextInt();
                    input.nextLine();
        
                    audience[row-1][column-1]=name;
                    System.out.print("Are there any other audiences to be added? (y/n): ");
                    next = input.nextLine();
        
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                    
                }
            }
            else if (menuAudience == 2) {
                System.out.println("\nAudience List: ");
                for (int j = 0; j < 4; j++) {
                    for (int j2 = 0; j2 < 2; j2++) {
                        if (audience[j][j2] != null) {
                            System.out.println("Row " + (j+1) + ", Column " + (j2+1) + ": " + audience[j][j2]);
                        }
                    }
                }
                

            }
            else if (menuAudience == 3) {
                break;
            }
        }
            

            
        
        
           
        
        

        
    }
}