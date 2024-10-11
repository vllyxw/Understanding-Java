import java.util.Scanner;

public class questao04 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    float metros; 
    float cm;

    System.out.println("Digite quantos metros:");
    metros = sc.nextFloat();

    cm = metros * 100;

    System.out.printf("É equivalente a %.2f cm", cm);
    
    sc.close();
}
}
