import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.printf("Digite o lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.printf("Digite o lado 3: ");
        double lado3 = scanner.nextDouble();

        if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
            System.out.println("O triângulo é equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("O triângulo é isósceles");
        } else if (lado1 != lado2 || lado2 != lado3 || lado1 != lado3) {
            System.out.println("O triângulo é escaleno");
        } else {
            System.out.println("Valor inávlido");
        }

        scanner.close();
    }

}
