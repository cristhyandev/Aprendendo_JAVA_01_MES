package conta;
public class PagamentoBoleto implements conta.Pagamento {

    @Override
    public void pagar(double valor) {
        double desconto = valor - (valor*0.05);
        System.out.println("O total a pagar será: R$"+desconto);

    }
}
