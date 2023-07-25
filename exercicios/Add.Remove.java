import java.util.Scanner;

public class AddRemove {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Enter a number: ");
    int number = scanner.nextInt();

    int addOne += number;
    int removeOne -= number;

    System.out.printf("Sucessor is %d, and predecessor is %d.", addOne, removeOne);

    scanner.close();
  }
}
