import java.util.Scanner;

public class ContagemSimples {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);
    int totalNumeros = 0;
    
    while (totalNumeros < 100) { 
      System.out.println("Digite numeros inteiros: ");
      int numeros = scanner.nextInt();
      totalNumeros += numeros;
    
    }
    
    System.out.printf("A soma dos numeros digitados foi de: %d%n", totalNumeros);
    
  }
}
