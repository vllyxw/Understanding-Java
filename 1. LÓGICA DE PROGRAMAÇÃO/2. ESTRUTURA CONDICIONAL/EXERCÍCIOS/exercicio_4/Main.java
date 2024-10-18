import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora inicial do jogo:");
        int hrInicio = scanner.nextInt();

        System.out.println("Digite a hora final do jogo:");
        int hrFinal = scanner.nextInt();

        int duracao;

        if (hrInicio < hrFinal) {
            duracao = hrFinal - hrInicio;

            System.out.println("O jogo durou " + duracao + " horas");
        } else {
            duracao = 24 - hrInicio + hrFinal;

            System.out.println("O jogo durou " + duracao +" horas");
        }

        scanner.close();
    }

}
