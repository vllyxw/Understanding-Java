import java.util.Scanner;

public class questao12 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a temperatura em Celsius:");
    double C = sc.nextDouble();

    double F = (9.0 / 5.0) * C + 32;

    System.out.printf("A temperatura em Farenheit é: %.1f", F);
}
}
