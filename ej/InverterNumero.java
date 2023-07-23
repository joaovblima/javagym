import java.util.Scanner;

public class InverterNumero {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite um numero qualquer: ");
    int numero = scanner.nextInt();

    int numeroInvertido = 0;

    while (numero != 0) {

      int digito = numero %10;
      numeroInvertido = numeroInvertido * 10 + digito;

      numero/=10;
    }

    System.out.printf("Numero invertido: %d%n", numeroInvertido );
  }
}
