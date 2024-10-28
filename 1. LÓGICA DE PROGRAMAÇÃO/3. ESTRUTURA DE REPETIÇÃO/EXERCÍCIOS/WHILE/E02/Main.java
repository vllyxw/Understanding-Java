package E02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a coordenada X: ");
        int x = scanner.nextInt();

        System.out.printf("Digite a coordenada Y: ");
        int y = scanner.nextInt();

        while (x != 0 && y != 0) { 
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }

            System.out.printf("Digite o X: ");
            x = scanner.nextInt();

            System.out.printf("Digite o Y: ");
            y = scanner.nextInt();
        }

        scanner.close();

    }

}
