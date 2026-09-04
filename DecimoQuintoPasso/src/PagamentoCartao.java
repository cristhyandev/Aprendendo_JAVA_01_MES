package conta;
public class PagamentoCartao implements conta.Pagamento {

    @Override
    public void pagar(double valor) {
        double valorFinal = valor + (valor*0.02);
        System.out.println("O total a pagar será: R$"+valorFinal);

    }
}
