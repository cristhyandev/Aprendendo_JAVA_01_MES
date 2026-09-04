package sistema;

public class PagamentoCartao implements sistema.Pagamento{

 public PagamentoCartao(){
 }

    @Override
    public double calcular(double valor) {
        if (valor <= 0) {
            throw new sistema.PagamentoInvalidoExpection("Erro: o valor do pagamento deve ser maior que zero");
        } else {
            return valor = valor + (valor * 0.02);

        }
    }
}
