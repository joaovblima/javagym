import java.util.Scanner;

public class Media {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite a primeira nota: ");
    double primeiraNota = scanner.nextDouble();

    System.out.println("Digite a segunda nota: ");
    double segundaNota = scanner.nextDouble();

    double mediaNotas = (primeiraNota + segundaNota) / 2;

    System.out.println("A media entre as notas é de : " + mediaNotas);
    
    scanner.close();
  }
}
