import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.printf("Tendo os seguintes turnos: \n");
        System.out.printf("[M] - Matutino \n");
        System.out.printf("[V] - Vespetino \n");
        System.out.printf("[N] - Noturno \n");
        System.out.printf("Digite a inicial do turno em qual você estuda: ");
        char turno = scanner.next().charAt(0);

        switch (turno) {
            case 'M': 
                System.out.println("Bom dia!");
                break;
            case 'V':
                System.out.println("Boa tarde!");
                break;
            case 'N':
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor inválido!");
                break;
        }

        scanner.close();
    }

}
