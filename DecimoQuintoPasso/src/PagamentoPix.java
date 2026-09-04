package conta;

public class PagamentoPix implements conta.Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("O total a pagar será: R$" + valor);
    }
}
