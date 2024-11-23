
    import java.util.Scanner;

public class chatgpt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, column;
        String name, next;
        int menuAudience = 0;
        String[][] audience = new String[4][2]; // 4 rows, 2 columns

        while (true) {
            // Show the menu
            System.out.println("\nMenu 1: Input Audience Data" + "\nMenu 2: Show Audience List" + "\nMenu 3: Exit");
            System.out.print("Choose Menu: ");
            menuAudience = input.nextInt();
            input.nextLine(); // Consume newline after nextInt()

            if (menuAudience == 1) {
                // Input Audience Data
                while (true) {
                    System.out.print("Enter a name: ");
                    name = input.nextLine(); // Read name
                    System.out.print("Enter row number (1-4): ");
                    row = input.nextInt(); // Read row
                    System.out.print("Enter column number (1-2): ");
                    column = input.nextInt(); // Read column
                    input.nextLine(); // Consume newline after nextInt()
                    
                    // Check if row and column are within bounds
                    if (row >= 1 && row <= 4 && column >= 1 && column <= 2) {
                        audience[row - 1][column - 1] = name; // Store name at the correct position
                    } else {
                        System.out.println("Invalid row or column number! Please enter a valid number.");
                    }

                    System.out.print("Are there any other audiences to be added? (y/n): ");
                    next = input.nextLine(); // Read user decision to continue
                    if (next.equalsIgnoreCase("n")) {
                        break; // Exit the inner loop
                    }
                }
            } else if (menuAudience == 2) {
                // Show Audience List
                System.out.println("\nAudience List:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (audience[i][j] != null) {
                            System.out.println("Row " + (i + 1) + ", Column " + (j + 1) + ": " + audience[i][j]);
                        }
                    }
                }
            } else if (menuAudience == 3) {
                // Exit the program
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option! Please choose a valid menu option.");
            }
        }
        input.close(); // Close the scanner to avoid resource leaks
    }
}


