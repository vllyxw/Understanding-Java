import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Fórmula de Bhaskara \n");

        System.out.printf("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.printf("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.printf("Digite o valor de C: ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;
        

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("As raízes da equação são: x1 = %.2f e x2 = %.2f%n", x1, x2);
        } else if (delta == 0) {
            double x = (-b) / (2 * a);
            System.out.printf("A raiz da equação é: x = %.2f%n", x);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }

        scanner.close();
    }

}
