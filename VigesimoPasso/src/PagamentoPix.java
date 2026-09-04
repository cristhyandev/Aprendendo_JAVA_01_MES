package sistema;

public class PagamentoPix implements sistema.Pagamento {

    public PagamentoPix() {

    }
        @Override
        public double calcular ( double valor){
        if (valor<=0){
            throw new sistema.PagamentoInvalidoExpection("Erro: o valor do pagamento deve ser maior que zero");
            }
        else {
            return valor;
        }
        }


}
