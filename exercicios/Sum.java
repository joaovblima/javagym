import java.util.Scanner;

public class Sum {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Enter a number: ");
    int number1 = scanner.nextInt();

    System.out.println("Enter another number");
    int number2 = scanner.nextInt();

    int sumNumbers = number1 + number2;

    System.out.printf("Result: %d%n", sumNumbers);

    scanner.close();
  }
}
