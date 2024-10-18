import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Este número é par");
        } else{
            System.out.println("Este número é ímpar");
        }

        scanner.close();
    }
}
