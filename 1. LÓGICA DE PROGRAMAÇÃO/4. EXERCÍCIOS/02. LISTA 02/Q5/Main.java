import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        float num = scanner.nextFloat();

        if (num == 0.0) {
            System.out.println("Este número é quebrado");
        } else {
            System.out.println("Este número é inteiro");
        }
        scanner.close();

    }

}
