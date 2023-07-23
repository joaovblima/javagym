import java.util.Scanner;

public class SimuladorEmprestimo {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.print("Valor do empréstimo: R$ ");
    double valorEmprestimo = scanner.nextDouble();

    System.out.print("Quantidad de parcelas: R$ ");
    int quantidadeParcelas = scanner.nextInt();

    double taxaJuros; 
    switch (quantidadeParcelas) {
      case 1: 
      case 2:
        taxaJuros = 0.0199;
        break;
      case 3:
        taxaJuros = 0.0299;
        break;
      default: 
        taxaJuros = 0.0399;
        break;
        
    }
    
    double tarifaFixa = (valorEmprestimo >=100) ?  1.50 : 0;
    double totalJuros = valorEmprestimo * (taxaJuros * quantidadeParcelas);
    double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

    System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
    System.out.printf("Total de juros: R$%.2f%n", totalJuros);
    System.out.printf("Custo total: R$%.2f%n", custoTotal);

    //O cliente também informou que a taxa de juros da financeira depende da quantidade de parcelas: 
    //
    //1 ou 2 parcelas: 1.99% ao mes
    //3 parcelas: 2.99% ao mes
    //Outras quantidades de parcelas: 3.99% ao mes
    //
    //alem disso, caso o valor do emprestimo seja maior ou igual a 100, uma tarifa fixa será cobrada 
    //no valor de R$1.50
  }
}
