import java.util.Scanner;

public class questao11 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a temperatura em Farenheit:");
    int F = sc.nextInt();

    float C = 5 * (F - 32)/ 9;

    System.out.printf("A temperatura em Celsius é %.1f", C);
}
}
