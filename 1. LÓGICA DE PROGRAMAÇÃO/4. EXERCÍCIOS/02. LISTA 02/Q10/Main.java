import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a primeira idade: ");
        int idade1 = scanner.nextInt();

        System.out.printf("Digite a segunada idade: ");
        int idade2 = scanner.nextInt();

        System.out.printf("Digite a terceira idade: ");
        int idade3 = scanner.nextInt();

        System.out.printf("Digite a quarta idade: ");
        int idade4 = scanner.nextInt();

        int media = idade1 + idade2 + idade3 + idade4 / 4;

        if (media < 25) {
            System.out.println("Turma Jovam");
        } else if (media > 25 && media < 40) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }

        scanner.close();
    }

}
