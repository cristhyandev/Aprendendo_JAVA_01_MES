package sistema;

public class PagamentoInvalidoExpection extends RuntimeException {
    public PagamentoInvalidoExpection(String message) {
        super(message);
    }
}
