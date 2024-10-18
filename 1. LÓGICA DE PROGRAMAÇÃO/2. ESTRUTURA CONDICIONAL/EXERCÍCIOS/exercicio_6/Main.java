import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um valor para saber o intervalo: ");
        int valor = scanner.nextInt();

        if (valor <= 25) {
            System.out.println("O intervalo é: [0,25]");
        } else if (valor <= 50) {
            System.out.println("O intervalo é: [25,50]");
        } else if (valor <= 75) {
            System.out.printf("O intervalo é: [50,75]");
        } else if (valor <= 100) {
            System.out.printf("O intervalo é: [75,100]");
        } else {
            System.out.printf("Valor fora do intervalo");
        }

        scanner.close();
    }

}
