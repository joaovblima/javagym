import java.util.Scanner;

public class CalculosSimples {
  public static void main ( String [] args) {
    Scanner scanner = new Scanner ( System.in);

    System.out.println("Digite um numero: ");
    int numero = scanner.nextInt();

    int dobro = numero * 2;
    int triplo = numero  *3;
       
    System.out.println("Seu numero é: " + numero);
    System.out.println("O dobro é: " + dobro);
    System.out.println("O triplo é: " + triplo);
    
    scanner.close();
  }
}
