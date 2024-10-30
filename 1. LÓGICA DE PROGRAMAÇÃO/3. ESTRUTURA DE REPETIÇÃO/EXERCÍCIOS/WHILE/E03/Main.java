package E03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Posto de combustível \n");
        System.out.printf("1. Álcool \n");
        System.out.printf("2. Gasolina \n");
        System.out.printf("3. Diesel \n");
        System.out.printf("4. Fim \n");
        System.out.printf("Informe o código que você irá abastecer: ");
        int codigo = scanner.nextInt();

        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;

        while (codigo <= 3) {
            if (codigo == 1) {
                System.out.printf("Álcool: %d \n", cont1);
                System.out.printf("Gasolina: %d \n", cont2);
                System.out.printf("Diesel: %d \n", cont3);

                cont1++;
            } else if (codigo == 2) {
                System.out.printf("Álcool: %d \n", cont1);
                System.out.printf("Gasolina: %d \n", cont2);
                System.out.printf("Diesel: %d \n", cont3);

                cont2++;
            } else if (codigo == 3) {
                System.out.printf("Álcool: %d \n", cont1);
                System.out.printf("Gasolina: %d \n", cont2);
                System.out.printf("Diesel: %d \n", cont3);

                cont3++;
            }

            System.out.printf("Posto de combustível \n");
            System.out.printf("1. Álcool \n");
            System.out.printf("2. Gasolina \n");
            System.out.printf("3. Diesel \n");
            System.out.printf("4. Fim \n");
            System.out.printf("Informe o código que você irá abastecer: ");
            codigo = scanner.nextInt();
        }

        System.out.println("MUITO OBRIGADO");

        scanner.close();
    }

}
