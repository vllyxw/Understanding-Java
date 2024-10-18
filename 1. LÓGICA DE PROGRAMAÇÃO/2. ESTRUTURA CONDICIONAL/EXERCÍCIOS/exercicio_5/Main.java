import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Cachorro Quente = R$ 4,00 \n" + "2 - X-Salada = R$ 4,50 \n" + "3 - X-Bacon = R$ 5,00 \n" + "4 - Torrada Simples R$ 2,00 \n" + "5 - Refrigerante = R$ 1,50 \n");
        System.out.printf("Escolha o código do item: ");
        int codigo = scanner.nextInt();

        System.out.printf("A quantidade desse item: ");
        int quantidade = scanner.nextInt();

        if (codigo == 1) {
            float preco = (float) 4.00 * quantidade;

            System.out.printf("Total do Cachorro Quente fica: %.2f", preco);
        } else if (codigo == 2) {
            float preco = (float) 4.50 * quantidade;

            System.out.printf("Total do X-Salada fica: %.2f", preco);
        } else if (codigo == 3) {
            float preco = (float) 5.00 * quantidade;

            System.out.printf("Total do X-Bacon fica: %.2f", preco);
        } else if (codigo == 4) {
            float preco = (float) 2.00 * quantidade;

            System.out.printf("Total da Torrada Simples fica: %.2f", preco);
        } else if (codigo == 5) {
            float preco = (float) 1.50 * quantidade;

            System.out.printf("Total do Refrigerante fica: %.2f", preco);
        } else {
            System.out.printf("Digite um valor válido");
        }

        scanner.close();
    }

}
