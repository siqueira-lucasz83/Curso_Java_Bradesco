import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial);

        int opcao;

        do {
            System.out.println("\n===== MENU CONTA BANCÁRIA =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar dinheiro");
            System.out.println("4. Sacar dinheiro");
            System.out.println("5. Pagar boleto");
            System.out.println("6. Verificar uso do cheque especial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> conta.consultarSaldo();
                case 2 -> conta.consultarChequeEspecial();
                case 3 -> {
                    System.out.print("Valor do depósito: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                }
                case 4 -> {
                    System.out.print("Valor do saque: ");
                    double valor = sc.nextDouble();
                    conta.sacar(valor);
                }
                case 5 -> {
                    System.out.print("Valor do boleto: ");
                    double valor = sc.nextDouble();
                    conta.pagarBoleto(valor);
                }
                case 6 -> conta.verificarUsoChequeEspecial();
                case 0 -> System.out.println("Encerrando o sistema...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
