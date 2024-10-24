import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Selecione o grupo de animais: ");

        System.out.printf("Grupo de Animais:");
        System.out.printf("1 - Mamíferos \n");
        System.out.printf("2 - Aves \n");
        System.out.printf("3 - Répteis \n");
        System.out.printf("Escolha o grupo: ");
        int grupo = scanner.nextInt();

        switch (grupo) {
            case 1:
                System.out.printf("1 - Quadrúpede \n");
                System.out.printf("2 - Bípede \n");
                System.out.printf("3 - Voadores \n");
                System.out.printf("4 - Aquáticos \n");
                System.out.printf("Escolha o tipo: ");
                int tipo = scanner.nextInt();

                switch (tipo) {
                    case 1:
                }
        }
    }

}
