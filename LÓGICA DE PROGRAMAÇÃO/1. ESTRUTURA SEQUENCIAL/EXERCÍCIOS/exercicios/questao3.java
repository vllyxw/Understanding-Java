package exercicios;

import java.util.Scanner;

public class questao3 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int A, B, C, D;
      int DIFERENCA;

      System.out.println("Digite o primeiro valor: ");
      A = sc.nextInt();

      System.out.println("Digite o segundo valor: ");
      B = sc.nextInt();

      System.out.println("Digite o terceiro valor: ");
      C = sc.nextInt();

      System.out.println("Digite o quarto valor: ");
      D = sc.nextInt();

      DIFERENCA = (A * B) - (C * D);

      System.out.println("A diferença entre os valores A e B dos valores C e D é: " + DIFERENCA);

      sc.close();
  }
}
