import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            int impar = num - 1;
            System.out.printf("Este número foi transformado em ímpar %d", impar);
        } else {
            int par = num + 1;
            System.out.printf("Este número foi transformado em par %d", par);
        }

        scanner.close();
    }

}
