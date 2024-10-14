package exercicios;

import java.util.Scanner;

public class questao4 {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int numero, horas;
     float vlr, salario;

     System.out.println("Digite seu número: ");
     numero = sc.nextInt();

     System.out.println("Digite suas horas trabalhadas: ");
     horas = sc.nextInt();

     System.out.println("Digite o valor da hora: ");
     vlr = sc.nextFloat();

     salario = horas * vlr;

     System.out.println("Número: " + numero);
     System.out.printf("Salário: R$%.2f ", salario);

     sc.close();
 }
}
