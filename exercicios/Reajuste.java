import java.util.Scanner;

public class Reajuste {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Digite o salário do funcionário R$: ");
    double salario = scanner.nextDouble();

    double aumento = salario * 0.15;

    double novoSalario = salario + aumento;

    System.out.println("O funcionário com o reajuste passará a receber: R$ " + novoSalario);

    scanner.close();
  }
}
