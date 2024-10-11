package exercicios;

import java.util.Scanner;

public class questao5 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int p1, nump1, p2, nump2;
    float vlrp1, vlrp2, total1, total2, total;

    System.out.println("Digite o código da peça 1:");
    p1 = sc.nextInt();

    System.out.println("Digite o número de peças:");
    nump1 = sc.nextInt();

    System.out.println("Digite o valor unitário da peça:");
    vlrp1 = sc.nextFloat();

    System.out.println("Digite o código da peça 2: ");
    p2 = sc.nextInt();

    System.out.println("Digite o número de peças:");
    nump2 = sc.nextInt();

    System.out.println("Digite o valor unitário da peça:");
    vlrp2 = sc.nextFloat();

    total1 = nump1 * vlrp1;

    total2 = nump2 * vlrp2;

    total = total1 + total2;

    System.out.printf("O total a pagar é R$%.2f %n ", total);

    sc.close();
}
}
