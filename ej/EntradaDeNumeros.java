import java.util.Scanner;

public class EntradaDeNumeros {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);
    int totalNumeros = 0; // variável para soma dos numeros.

    for (int i = 1; i <=10; i++) {
      System.out.print("Digite um numero:");
      int numeros = scanner.nextInt();

      if (numeros%2 != 0) {
        System.out.print("Numero inválido, digite novamente: ");
        numeros = scanner.nextInt();
      }
      
      totalNumeros += numeros;
    }
    
    System.out.printf("A soma total dos numeros foi: %d%n" , totalNumeros);
  
  }
}
