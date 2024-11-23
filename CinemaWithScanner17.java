import java.util.Scanner;

public class CinemaWithScanner17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, column;
        String name, next;
        String[][] audience = new String[4][2];

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
}