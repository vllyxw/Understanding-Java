import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o preço de custo produtivo do produto: ");
        double precoCusto = scanner.nextDouble();

        System.out.printf("Código de origem: \n");
        System.out.printf("1 - Sul \n");
        System.out.printf("2 - Norte \n");
        System.out.printf("3 - Sudeste \n");
        System.out.printf("4 - Nordeste \n");
        System.out.printf("5 - Centro-Oeste \n");

        System.out.printf("Digite o código de origem: ");
        int origem = scanner.nextInt();

        String uf;
        double precoVenda, total;

        switch (origem) {
            case 1: 
                System.out.printf("Digite a UF do estado: ");
                uf = scanner.next();

                if (uf.equalsIgnoreCase("PR")) {
                    int aliPr = 18;
                    precoVenda = (aliPr / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("SC")) {
                    int aliSc = 17;
                    precoVenda = (aliSc / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("RS")) {
                    int aliRs = 18;
                    precoVenda = (aliRs / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else {
                    System.out.println("Valor inválido");
                }
                break;
            case 2:
                System.out.printf("Digite a UF do estado: ");
                uf = scanner.next();

                if (uf.equalsIgnoreCase("AC")) {
                    int aliAc = 17;
                    precoVenda = (aliAc / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("AM")) {
                    int aliAm = 18;
                    precoVenda = (aliAm / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("AP")){
                    int aliAp = 18;
                    precoVenda = (aliAp / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("RR")){
                    int aliRr = 17;
                    precoVenda = (aliRr / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("RO")) {
                    int aliRo = 17;
                    precoVenda = (aliRo / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("PA")) {
                    int aliPa = 17;
                    precoVenda = (aliPa / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("TO")) {
                    int aliTo = 18;
                    precoVenda = (aliTo / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else {
                    System.out.println("Valor inválido");
                }
                break;
            case 3:
                System.out.printf("Digite a UF do estado: ");
                uf = scanner.next();

                if (uf.equalsIgnoreCase("SP")) {
                    int aliSp = 18;
                    precoVenda = (aliSp / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("RJ")) {
                    int aliRj = 20;
                    precoVenda = (aliRj / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("MG")) {
                    int aliMg = 18;
                    precoVenda = (aliMg / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("ES")) {
                    int aliEs = 17;
                    precoVenda = (aliEs / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else {
                    System.out.println("Valor inválido");
                }
                break;
            case 4:
                System.out.printf("Digite a UF do estado: ");
                uf = scanner.next();

                if (uf.equalsIgnoreCase("BA")) {
                    int aliBa = 18;
                    precoVenda = (aliBa / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("SE")) {
                    int aliSe = 18;
                    precoVenda = (aliSe / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("AL")) {
                    int aliAl = 18;
                    precoVenda = (aliAl / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("PE")) {
                    int aliPe = 18;
                    precoVenda = (aliPe / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("PB")) {
                    int aliPb = 18;
                    precoVenda = (aliPb / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("RN")) {
                    int aliRn = 18;
                    precoVenda = (aliRn / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("CE")) {
                    int aliCe = 18;
                    precoVenda = (aliCe / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("MA")) {
                    int aliMa = 18;
                    precoVenda = (aliMa / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("PI")) {
                    int aliPi = 18;
                    precoVenda = (aliPi / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else {
                    System.out.println("Valor inválido");
                }
                break;
            case 5:
                System.out.printf("Digite a UF do estado: ");
                uf = scanner.next();

                if (uf.equalsIgnoreCase("DF")) {
                    int aliDf = 18;
                    precoVenda = (aliDf / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("GO")) {
                    int aliGo = 17;
                    precoVenda = (aliGo / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("MT")) {
                    int aliMt = 17;
                    precoVenda = (aliMt / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else if (uf.equalsIgnoreCase("MS")) {
                    int aliMs = 17;
                    precoVenda = (aliMs / 100.0) * precoCusto;
                    total = precoCusto + precoVenda;
                    System.out.printf("Preço de venda do seu produto: %.2f", total);
                } else {
                    System.out.println("Valor inválido");
                }
                break;
            default:
                System.out.println("Produto importado");
                break;
        }

        scanner.close();

    }

}
