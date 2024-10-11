import java.util.Scanner;

public class questao13 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1, num2;
    float num3;

    System.out.println("Digite o primeiro numero:");
    num1 = sc.nextInt();

    System.out.println("Digite o segundo numero:");
    num2 = sc.nextInt();

    System.out.println("Digite o terceiro numero:");
    num3 = sc.nextFloat();

    double A = (num1*2) * (num2/2);
    double B = (num1*3) + (num3*3);
    double C = Math.pow(num3, 3.0); 

    System.out.printf("A: %.0f \n", A);
    System.out.printf("B: %.0f \n", B);
    System.out.printf("C: %.0f \n", C);
}
}
