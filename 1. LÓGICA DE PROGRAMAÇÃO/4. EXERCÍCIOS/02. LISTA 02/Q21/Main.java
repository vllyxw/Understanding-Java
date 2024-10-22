import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);

        System.out.printf("Verifique os sintomas e responda as perguntas abaixo \n");
        System.out.printf("Infeccção nos pulmões - [0] - não [1] - sim ");
        int prgt1 = scanner.nextInt();
        System.out.printf("Temperatura - [0] - normal [1] - anormal ");
        int prgt2 = scanner.nextInt();
        System.out.printf("Coriza - [0] - não [1] - sim ");
        int prgt3 = scanner.nextInt();
        System.out.printf("Espirros - [0] - não [1] - sim ");
        int prgt4 = scanner.nextInt();

        if (prgt1 == 1 && prgt2 == 1) {
            System.out.println("Diagnóstico: Pneumonia");
        } else if (prgt1 == 0 && prgt2 == 0 && prgt3 == 1 && prgt4 == 1) {
            System.out.println("Dignóstico: Gripe");
        } else {
            System.out.println("Dignóstico: Resfriado");
        }

        scanner.close();
    }

}
