import java.util.Scanner;

public class ConversorTemperatura {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite a temperatura em °C:");
    double temperatura = scanner.nextDouble();

    double farenheint = (temperatura * 9/5) + 32;

    System.out.printf("A temperatura de %.2f °C, corresponde a %.2f °F%n", temperatura, farenheint);
    
    scanner.close();
  }
}
