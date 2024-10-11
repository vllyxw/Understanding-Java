import java.util.Scanner;

public class questao9 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite suas horas trabalhadas:");
    int horas = sc.nextInt();

    System.out.println("Digite o valor da hora:");
    float valor = sc.nextFloat();

    float salario = horas * valor;

    System.out.printf("Seu salário é: R$ %.2f", salario);
}
}
