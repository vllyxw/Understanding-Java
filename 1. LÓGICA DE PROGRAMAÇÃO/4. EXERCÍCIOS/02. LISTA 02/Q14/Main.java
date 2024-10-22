import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("DIgite um número de 1 a 7: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Você digitou número 1, número correspondente a Domingo");
                break;
            case 2:
                System.out.println("Você digitou número 2, número correspondente a Segunda-Feira");
                break;
            case 3:
                System.out.println("Você digitou número 3, número correspondente a Terça-Feira");
                break;
            case 4:
                System.out.println("Você digitou número 4, número correspondente a Quarta-Feira");
                break;
            case 5:
                System.out.println("Você digitou número 5, número correspondente a Quinta-Feira");
                break;
            case 6: 
                System.out.println("Você digitou número 6, número correspondente a Sexta-Feira");
                break;
            case 7:
                System.out.println("Você digitou número 7, número correspondente a Sábado");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }

        scanner.close();
    }

}
