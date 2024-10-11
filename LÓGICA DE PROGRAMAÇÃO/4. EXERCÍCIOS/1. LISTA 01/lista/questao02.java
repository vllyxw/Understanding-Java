import java.util.Scanner;

public class questao2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;

    System.out.println("Digite um número:");
    num = sc.nextInt();

    System.out.printf("O número informado foi: %d", num);

    sc.close();
}
}
