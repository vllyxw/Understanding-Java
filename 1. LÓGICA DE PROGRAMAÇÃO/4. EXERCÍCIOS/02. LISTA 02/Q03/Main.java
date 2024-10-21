import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.printf("Este número é par");
        } else {
            System.out.printf("Este número é ímpar");
        }

        scanner.close();
    }

}
