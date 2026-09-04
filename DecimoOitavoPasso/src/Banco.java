
public class Banco {

    // Método que faz o saque e pode lançar um erro
    public static void sacar(double saldo, double valorSaque){
        if (valorSaque > saldo) {
            throw new IllegalArgumentException("Saldo Insuficiente!");

        } else {
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado! Novo saldo: R$ " + saldo);
        }
    }

    public static void main(String[] args) {
        double saldoAtual = 100.0;
        double tentativaDeSaque = 200.0;

        // Tente executar o saque e capture o erro
        try {
            sacar(saldoAtual, tentativaDeSaque);

        } catch (IllegalArgumentException e) {
            // Capture a mensagem da bomba usando e.getMessage() e imprima!
            System.out.println("Erro na transação: " + e.getMessage());
        }
    }
}