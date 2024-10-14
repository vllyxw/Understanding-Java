import java.util.Scanner;

public class questao08 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a primeira nota:");
    float n1 = sc.nextFloat();

    System.out.println("Digite a segunda nota:");
    float n2 = sc.nextFloat();

    System.out.println("Digite a terceira nota:");
    float n3 = sc.nextFloat();

    System.out.println("Digite a quarta nota:");
    float n4 = sc.nextFloat();

    float media = (n1 + n2 + n3 + n4) / 4;

    System.out.printf("Sua média das notas é: %.1f", media);
}
}
