import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Calculadora \n");
        System.out.println("[1] - Adição \n");
        System.out.println("[2] - Subtração \n");
        System.out.println("[3] - Multiplicação \n");
        System.out.println("[4] - Divisão \n");
        System.out.println("[5] - Fim \n");
        System.out.printf("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        System.out.printf("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.printf("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int total;

        switch (opcao) {
            case 1: 
                total = num1 + num2;
                System.out.printf("A adição ficou: %d", total);
                break;
            case 2:
                total = num1 - num2;
                System.out.printf("A subtração ficou: %d", total);
                break;
            case 3:
                total = num1 * num2;
                System.out.printf("A multiplição ficou: %d", total);
                break;
            case 4:
                total = num1 / num2;
                System.out.printf("A divisão ficou: %d", total);
                break;
            case 5: 
                System.out.println("Adeus...");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        scanner.close();
        
    }

}
