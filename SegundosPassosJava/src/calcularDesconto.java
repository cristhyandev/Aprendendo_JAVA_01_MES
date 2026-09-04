package calculadora;

public class calcularDesconto{

    public double acao(double valor, double desconto) {
        double resultado = valor - (valor * (desconto/100));
        return resultado;
    }
}
