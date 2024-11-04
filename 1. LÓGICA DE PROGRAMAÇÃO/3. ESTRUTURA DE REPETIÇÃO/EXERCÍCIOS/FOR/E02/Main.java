import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int num = scanner.nextInt();

        for (int i = 0; i < 1; i++)
        if (num >= 10 && num <= 20) {
            System.out.println("in");
        } else if (num < 10 && num > 20 ) {
            System.out.println("out");
        }
    }

}
