import java.util.Scanner;

public class Descontos {
  public static void main ( String[] args ) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Qual o preço do produto: ");
    double preco = scanner.nextDouble();

    double desconto = preco * 0.05;
    double valorNovo = preco - desconto;

    System.out.println("Com o desconto de 5% seu produto passou a ser: " + valorNovo);
  
    scanner.close();
  }
}
