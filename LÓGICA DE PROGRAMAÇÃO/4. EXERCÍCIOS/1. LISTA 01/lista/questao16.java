import java.util.Scanner;

public class questao16 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu salário bruto mensal:");
    double salario = scanner.nextDouble();

    double descontoIr = salario * 0.15;
    double descontoInss = salario * 0.11;
    double descontoSindicato = salario * 0.03;
    double salarioLiquido = salario - (descontoIr + descontoInss + descontoSindicato);

    System.out.printf("Seu salário liquido é: R$ %.2f", salarioLiquido);
}
}
