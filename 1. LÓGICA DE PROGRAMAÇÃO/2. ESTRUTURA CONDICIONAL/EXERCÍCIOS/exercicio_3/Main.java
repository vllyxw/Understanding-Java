import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int A = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int B = scanner.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        scanner.close();
    }

}
