import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.printf("Digite a senha: ");
        int senha = scanner.nextInt();

        while (senha == 3300) {
            System.out.println("Acesso permitido");
        }

        System.out.println("Senha inválida");

        scanner.close();
    }

}
