public class BancoTerminal {
    public static void main(String[] args) {
        realizarOperacao(25, 18);
        realizarOperacao(15, 22);
    }

    public static void realizarOperacao(double saldo, double valorSolicitado) {
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("Valor solicitado: " + valorSolicitado);

        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println();
    }
}
