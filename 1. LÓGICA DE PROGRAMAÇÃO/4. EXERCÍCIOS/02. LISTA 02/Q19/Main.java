import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o ano: ");
        int ano = scanner.nextInt();

        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if (bissexto) {
            System.out.printf("O ano %d é bissexto", ano);
        } else {
            System.out.printf("O ano %d não é bissexto", ano);
        }

        scanner.close();
    }

}
