
import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor do empréstimo: R$");
        double valorEmprestimo = scanner.nextDouble();

        System.out.print("Tempo de pagamento (em meses): ");
        int tempoPagamento = scanner.nextInt();

        System.out.print("Taxa de juros: ");
        double taxaJuros = scanner.nextDouble();

        double amortizacao = valorEmprestimo / tempoPagamento;
        double juros = 0;
        double prestacao = 0;
        double saldoDevedor = valorEmprestimo;

        double totalPago = 0.0;
        double totalJuros = 0.0;
        double totalAmortizacao = 0.0;
        for (int i = 1; i <= tempoPagamento; i++) {
            juros = saldoDevedor * taxaJuros / 100;
            prestacao = juros + amortizacao;
            saldoDevedor -= amortizacao;
            
            totalPago += prestacao;
            totalJuros += juros;
            totalAmortizacao += amortizacao;
            System.out.printf("Parcela %d | Juros: %.2f | Prestação %.2f | Salado Devedor %.2f \n", i, juros,
                    amortizacao + juros, saldoDevedor);
        }

        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f |Amortização R$ %.2f \n", totalPago, totalJuros,
                totalAmortizacao);
    }
}
