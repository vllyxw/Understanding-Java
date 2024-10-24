import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Selecione o grupo de animais: \n");
        System.out.printf("1 - Mamíferos \n");
        System.out.printf("2 - Aves \n");
        System.out.printf("3 - Répteis \n");
        System.out.printf("Escolha o grupo: ");
        int grupo = scanner.nextInt();

        switch (grupo) {
            case 1:
                System.out.printf("1 - Quadrúpede \n");
                System.out.printf("2 - Bípede \n");
                System.out.printf("3 - Voadores \n");
                System.out.printf("4 - Aquáticos \n");
                System.out.printf("Escolha o tipo: ");
                int tipo = scanner.nextInt();

                switch (tipo) {
                    case 1:
                        System.out.printf("1 - Carnívoro \n");
                        System.out.printf("2 - Herbívoro \n");
                        int escolha1 = scanner.nextInt();

                        if (escolha1 == 1) {
                            System.out.printf("Leão");
                        } else if (escolha1 == 2) {
                            System.out.printf("Cavalo");
                        } else {
                            System.out.printf("Valor inválido");
                        }
                        break;
                    case 2: 
                        System.out.printf("1 - Onívoro \n");
                        System.out.printf("2 - Frutífero \n");
                        int escolha2 = scanner.nextInt();

                        if (escolha2 == 1) {
                            System.out.printf("Homem");
                        } else if (escolha2 == 2) {
                            System.out.printf("Macaco");
                        } else {
                            System.out.printf("Valor Inválido");
                        }
                        break;
                    case 3:
                        System.out.printf("Morcego");
                        break;
                    case 4:
                        System.out.printf("Baleia");
                        break;
                    default:
                        System.out.printf("Valor inválido");
                        break;
                }
                break;
                
            case 2: 
                System.out.printf("1 - Não voadoras \n");
                System.out.printf("2 - Nadadoras \n");
                System.out.printf("3 - de Rapina \n");
                int aves = scanner.nextInt();

                if (aves == 1) {
                    System.out.printf("1 - Tropical \n");
                    System.out.printf("2 - Polar \n");
                    int polaridade = scanner.nextInt();

                    if(polaridade == 1) {
                        System.out.printf("Avestruz");
                    } else if (polaridade == 2) {
                        System.out.printf("Pinguim");
                    } else {
                        System.out.printf("Valor inválido");
                    }
                }else if (aves == 2) {
                    System.out.printf("Pato");
                } else if (aves == 3) {
                    System.out.printf("Águia");
                } else {
                    System.out.printf("Valor inválido");
                }
                break;
            case 3:
                System.out.printf("1 - Com casco \n");
                System.out.printf("2 - Carnívoros \n");
                System.out.printf("3 - Sem patas \n");
                System.out.printf("Escolha a opção: ");
                int repteis = scanner.nextInt();

                if (repteis == 1) {
                    System.out.printf("Tartaruga");
                } else if (repteis == 2) {
                    System.out.printf("Crocodilo");
                } else if (repteis == 3) {
                    System.out.printf("Cobra");
                } else {
                    System.out.printf("Valor inválido");
                }
                break;
            default:
                System.out.printf("Valor Inválido");
                break;
        }
    }

}
