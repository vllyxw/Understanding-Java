import java.util.Scanner;

public class questao10 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int vlrDia = 25;
    int diasTrabalhados;
    double salario;

    System.out.println("Digite os dias trabalhados:");
    diasTrabalhados = sc.nextInt();

    salario = vlrDia * diasTrabalhados;

    double desconto = salario * 0.08;
    double total = salario - desconto;

    System.out.printf("Seu salário líquido é: %.2f", total);

}
}
