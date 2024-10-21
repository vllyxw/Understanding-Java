import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Cálculo de áreas \n");
        System.out.printf("a. Área Retângulo \n");
        System.out.printf("b. Área Triângulo \n");
        System.out.printf("c. Área do Círculo \n");
        System.out.printf("d. Área do Quadrado \n");
        System.out.printf("e. Área do Trapézio \n");
        System.out.printf("f. Sair \n");

        System.out.printf("Selecione uma opção: ");
        char opcao = scanner.next().charAt(0);

        double altura, base, raio, lado;
        double pi = 3.14159;
        double lmaior, lmenor;

        switch (opcao) {
            case 'a':
                System.out.printf("Digite a altura: ");
                altura = scanner.nextDouble();
                System.out.printf("Digite o comprimento: ");
                base = scanner.nextDouble();
                
                double retangulo = base * altura;

                System.out.printf("A área do retângulo é: %.2f", retangulo);
                break;
            case 'b':
                System.out.printf("Digite a altura: ");
                altura = scanner.nextDouble();
                System.out.printf("Digite o comprimento: ");
                base = scanner.nextDouble();

                double triangulo = base * altura / 2;

                System.out.printf("A área do triângulo é: %.2f", triangulo);
                break;
            case 'c': 
                System.out.printf("Digite o valor do raio: ");
                raio = scanner.nextDouble();

                double circulo = 2 * pi * raio * raio;

                System.out.printf("A área do círculo é: %.2f", circulo);
                break;
            case 'd':
                System.out.printf("Digite o valor do lado: ");
                lado = scanner.nextDouble();

                double quadrado = lado * lado;

                System.out.printf("A área do quadrado é: %.2f", quadrado);
                break;
            case 'e': 
                System.out.printf("Digite o valor do lado maior: ");
                lmaior = scanner.nextDouble();

                System.out.printf("Digite o valor do lado menor: ");
                lmenor = scanner.nextDouble();

                System.out.printf("Digite a altura: ");
                altura = scanner.nextDouble();
                
                double trapezio = (lmaior + lmenor) * altura / 2;

                System.out.printf("A área do trapézio é: %.2f", trapezio);
                break;
            case 'f':
                System.out.printf("Tchau!");
                break;
            default: 
                System.out.printf("Digite um valor válido");
                break;
        }

        scanner.close();
    }

}
