import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.printf("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.printf("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.printf("Os números em ordem crescent: %d, %d, %d", num1, num2, num3);

        scanner.close();
    }

}
