import java.util.Scanner;

public class SomaNumeros {
  public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);

    int somaPares = 0;
    int somaImpares = 0;
    int numeros;


    do {
      System.out.println ("Digite um numero inteiro (ou digite 0 para encerrar): ");
      numeros = scanner.nextInt();

      if (numeros % 2 == 0) {
        somaPares += numeros;
      } else {
        somaImpares += numeros;
      }
   
    } while (numeros !=0 );

    System.out.println("Soma dos numeros pares : " + somaPares);
    System.out.println("Soma dos numeros impares : " + somaImpares);

    
  }
}
