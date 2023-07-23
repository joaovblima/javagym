import java.util.Scanner;

public class CalculadoraDeImc {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite seu peso: ");
    int peso = scanner.nextInt();

    System.out.println("Digite sua altura: ");
    double altura = scanner.nextDouble();

    double imc = peso / (altura * altura);
    
    System.out.println("Seu imc é de: " + imc);

    if (imc <20.7) {
      System.out.println("Abaixo do peso.");
    } else if (imc >= 20.8 && imc < 26.4) {
      System.out.println("No peso ideal.");
    } else if (imc >= 26.5 && imc >= 27.8) {
      System.out.println("Um pouco acima do peso.");
    } else if (imc >=27.9 && imc <=31.1) {
      System.out.println("Acima do peso ideal");
    } else{
      System.out.println("Obeso");
    }
  }
}
