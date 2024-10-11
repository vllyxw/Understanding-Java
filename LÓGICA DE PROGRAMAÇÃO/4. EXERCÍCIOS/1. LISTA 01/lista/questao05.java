import java.util.Scanner;

public class questao05 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double num;

    System.out.println("Digite um numero com 5 casas decimais:");
    num = sc.nextDouble();

    System.out.printf("Numero: %.2f", num);
}
}
