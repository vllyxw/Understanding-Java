import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite F se você é mulher e M se você é homem: ");
        char sexo = scanner.next().charAt(0);

        if (sexo == 'F') {
            System.out.printf("Você é do sexo feminino");
        } else if (sexo == 'M') {
            System.out.printf("Você é do sexo masculino");
        } else {
            System.out.printf("Sexo inválido");
        }

        scanner.close();
    }

}
