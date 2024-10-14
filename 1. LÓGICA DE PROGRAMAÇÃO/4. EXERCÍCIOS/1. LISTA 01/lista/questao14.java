import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas máquinas irão ser compradas? ");
        int maquinas = sc.nextInt();

        int motores = maquinas * 6;

        System.out.printf("Deverão ser comprados %d motores dos seguintes modelos: Motor 20CV, Motor 1CV, Motor 5CV.%n", motores);

        int precoMotor20 = 1500;
        int precoMotor1 = 300 * 2;
        int precoMotor5 = 600 * 3;

        double custoPorMotor = (double) motores * (precoMotor20 + precoMotor1 + precoMotor5);
        double custoPorMaquina = custoPorMotor; 

        double custoTipoMotor20 = (double) precoMotor20 * (motores / 3); 
        double custoTipoMotor1 = (double) precoMotor1 * (motores / 3); 
        double custoTipoMotor5 = (double) precoMotor5 * (motores / 3); 

        double custoTotalCompra = maquinas * custoPorMotor;

        System.out.printf("O custo por máquina ficará: R$ %.2f \n", custoPorMaquina);
        System.out.printf("O custo por tipo de motor: \n");
        System.out.printf("Motor 20CV - R$ %.2f \n", custoTipoMotor20);
        System.out.printf("Motor 1CV - R$ %.2f \n", custoTipoMotor1);
        System.out.printf("Motor 5CV - R$ %.2f \n", custoTipoMotor5);
        System.out.printf("O custo total da compra é: R$ %.2f", custoTotalCompra);
    }
}
