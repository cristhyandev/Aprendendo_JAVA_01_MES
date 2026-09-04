package market;

public class ProdutoNaoEncontradoException extends RuntimeException {
    public ProdutoNaoEncontradoException(String menssagem) {
        super(menssagem);
    }
}
