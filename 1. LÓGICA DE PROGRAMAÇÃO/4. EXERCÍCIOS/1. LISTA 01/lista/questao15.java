import java.util.Scanner;

public class questao15 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Infome a largura da parede:");
    double largura = scanner.nextDouble();

    System.out.println("Informe a altura da parede:");
    double altura = scanner.nextDouble();

    double parede = largura + altura;
    double lataTinta = 3.60 * parede;
    double tinta = lataTinta/3;
    
    System.out.printf("O consumo será de %.0f latas de tintas", tinta);
}
}
