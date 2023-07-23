import java.util.Scanner;

public class AnoBissextos {
  public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);

    
    System.out.println("Digite um ano: ");
    int anoTeste = scanner.nextInt();

    boolean bissexto = (anoTeste % 400 == 0) || (anoTeste % 4 == 0 && anoTeste %100 != 0); 

    if (bissexto) {
      System.out.println(anoTeste + " é um ano bissexto");
    } else {
      System.out.println(anoTeste + " não é um ano bissexto");
    }
  }
}
