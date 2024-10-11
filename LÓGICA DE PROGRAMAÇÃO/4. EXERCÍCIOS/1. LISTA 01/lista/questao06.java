import java.util.Scanner;

public class questao06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o comprimento do lado do quadrado:");
        double lado = sc.nextDouble();

        double area = lado * lado;

        double total = area * 2;

        System.out.printf("O dobro da área do quadrado %f", total);
    }
}
