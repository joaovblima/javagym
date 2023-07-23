import java.util.Scanner;

public class DesafioEntradaDeDados {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.print("Nome: ");
    String nome = scanner.nextLine();

    System.out.print("Valor por hora: R$ ");
    double valorPorHora = scanner.nextDouble();

    System.out.print("Horas trabalhadas: ");
    int horasTrabalhadas = scanner.nextInt();

    System.out.print("Valores descontados: R$ ");
    double valorDosDescontos = scanner.nextDouble();
    
    double salarioBruto = valorPorHora * horasTrabalhadas;
    double totalDevido = salarioBruto - valorDosDescontos; 

    System.out.println("Folha de pagamento: " + nome);
    System.out.printf("%d horas X R$%.2f = %.2f%n" , horasTrabalhadas, valorPorHora,  salarioBruto);
    System.out.printf("Descontos: R$%.2f%n" , valorDosDescontos);
    System.out.printf("Total devido: R$ %.2f%n" , totalDevido);
    
    scanner.close();
  }
}
