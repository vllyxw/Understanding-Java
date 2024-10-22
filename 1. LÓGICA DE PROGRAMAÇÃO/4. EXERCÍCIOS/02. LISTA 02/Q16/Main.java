import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a temperatura do forno: ");
        int temperatura = scanner.nextInt();

        if (temperatura <= 500) {
            System.out.println("Temperatura Inválida");
        } else if (temperatura < 700) {
            System.out.println("Aquecimento ligado em 100%");
        } else if (temperatura < 735) {
            System.out.println("Aquecimento ligado em 50%");
        } else if (temperatura >= 735 && temperatura < 780)  {
            System.out.println("Aquecimento desligado");
        } else if (temperatura > 780) {
            System.out.println("SUPERAQUECIMENTO");
        } else {
            System.out.println("valor inválido");
        }

        scanner.close();
    }

}
