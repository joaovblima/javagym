import java.util.Scanner;

public class CalculadoraIndiceMassaCorporal {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite seu peso em KG: ");
    int peso = scanner.nextInt();

    System.out.println("Digite sua altura: ");
    double altura = scanner.nextDouble();

    double imc = peso / (altura * altura);
    
      
    if (imc < 18.5) {
      System.out.println("Abaixo do peso ideal.");
    }

    System.out.println("Fim do programa.");
  }

}
