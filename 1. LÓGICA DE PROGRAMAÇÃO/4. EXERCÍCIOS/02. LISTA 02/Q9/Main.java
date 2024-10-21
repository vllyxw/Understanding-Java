import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a primeira nota: ");
        float nota1 = scanner.nextFloat();

        System.out.printf("Digite a segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.printf("Digite a terceira nota: ");
        float nota3 = scanner.nextFloat();

        float total = nota1 + nota2 + nota3 / 3;

        if (total >= 7) {
            System.out.println("Você foi aprovado");
        } else if (total < 7) {
            System.out.println("Você foi reprovado");
        } else if (total == 10) {
            System.out.println("Você foi aprovado com distinção");
        } else {
            System.out.println("Inválido");
        }

        scanner.close();
    }

}
