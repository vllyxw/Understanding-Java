import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite seu salário: ");
        double salario = scanner.nextDouble();

        if (salario <= 2000.00) {
            System.out.printf("Seu salario é: %.2f \n", salario, "Portantosua saída é Isenta");
        } else if (salario <= 3000.00) {
            double desconto = salario * 0.18 + 1000.0 * 0.08;
            System.out.printf("Seu salario é: %.2f \n", desconto, "Portanto sua saída será descontada 8%");
        } else if (salario <= 4500.0) { 
			double desconto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("Seu salario é: %.2f \n", desconto, "Portanto sua saída será descontada 18%");
		} else {
			double desconto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("Seu salario é: %.2f \n", desconto, "Portanto sua saída será descontada 28%");
		}
		
		scanner.close();
    }

}
