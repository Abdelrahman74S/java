import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter text: ");
        String text = scanner.nextLine(); // Read the entered text

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt(); // Read the entered number

        // Print the text and the number
        System.out.println("Text: " + text);
        System.out.println("Number: " + number);

        scanner.close(); // Close the scanner
    }
}
