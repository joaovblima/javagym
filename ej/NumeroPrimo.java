import java.util.Scanner;

public class NumeroPrimo {
  public static boolean EhPrimo (int numero) {
    if (numero < 2) {
      return false;
    }
    
    for (int divisor = 2; divisor <= numero * 0.5; divisor++) {
      if (numero % divisor ==0) {
        return false;
      }
    }
    return true;
  }

  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite um numero inteiro: ");
    int numero = scanner.nextInt();

    if(EhPrimo(numero)) {
      System.out.println(numero + " é um numero primo.");
    } else {
      System.out.println(numero + " não é um numero primo");
    }
  }
}
