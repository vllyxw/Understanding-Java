import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 1000; i++) {
            if (num % 2 != 0) {
                System.out.printf("%d", i);
            } 
        }

        scanner.close();

    }

}
