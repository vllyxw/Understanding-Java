import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.printf("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.printf("O número: %d é maior", num1);
        } else {
            System.out.printf("O número: %d é maior", num2);
        }

        scanner.close();

    }

}
