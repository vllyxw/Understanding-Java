import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    int num = scanner.nextInt();

    if(num < 0) {
        System.out.println("Este numero é negativo");
    }
    else{
        System.out.println("Este numero é positivo");
    }

    scanner.close();
}
}
