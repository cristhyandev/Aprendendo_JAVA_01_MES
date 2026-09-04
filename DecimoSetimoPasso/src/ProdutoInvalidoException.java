package market;

public class ProdutoInvalidoException extends RuntimeException {
    public ProdutoInvalidoException(String menssagem) {
        super(menssagem);
    }
}
