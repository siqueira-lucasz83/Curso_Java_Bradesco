public class ContaBancaria {
    // Atributos
    private double saldo;
    private double limiteChequeEspecial;
    private boolean usandoChequeEspecial;

    // Construtor
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;

        if (saldoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = saldoInicial * 0.5;
        }

        this.usandoChequeEspecial = false;
    }

    // Consultar saldo
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    // Consultar limite do cheque especial
    public void consultarChequeEspecial() {
        System.out.println("Limite do cheque especial: R$ " + limiteChequeEspecial);
    }

    // Depositar dinheiro
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }

        if (saldo < 0) {
            double taxa = Math.abs(saldo) * 0.2;
            saldo += valor - taxa;
            System.out.println("Depósito feito, taxa de 20% aplicada por uso do cheque especial.");
        } else {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        }
    }

    // Sacar dinheiro
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            if (saldo < 0) {
                usandoChequeEspecial = true;
            }
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente, mesmo com o cheque especial.");
        }
    }

    // Pagar boleto
    public void pagarBoleto(double valor) {
        System.out.println("Tentando pagar boleto de R$ " + valor);
        sacar(valor);
    }

    // Verificar uso do cheque especial
    public void verificarUsoChequeEspecial() {
        if (saldo < 0) {
            System.out.println("⚠️ Você está usando o cheque especial!");
        } else {
            System.out.println("✅ Você não está usando o cheque especial.");
        }
    }
}
