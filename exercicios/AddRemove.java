import java.util.Scanner;

public class AddRemove {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite um numero:" );
    int numero = scanner.nextInt();

    int adicionaUm = numero + 1;
    int removeUm = numero -1;

    System.out.printf("O antecessor de %d é %d, e seu sucessor é %d%n", numero, removeUm, adicionaUm);

    scanner.close();
  }
}
