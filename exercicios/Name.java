import java.util.Scanner;

public class Name {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Hi! What's your name?");
    String name = scanner.nextLine();

    System.out.printf("Welcome, %s%n", name);

    scanner.close();
  }
}
