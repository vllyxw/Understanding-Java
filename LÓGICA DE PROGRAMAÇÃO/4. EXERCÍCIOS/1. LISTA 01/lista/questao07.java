import java.util.Scanner;

public class questao7 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro numero:");
    int num1 = sc.nextInt();

    System.out.println("Digite o segundo numero:");
    int num2 = sc.nextInt();

    int soma = num1 + num2;

    System.out.printf("A soma dois números é: %d", soma);
}
}
