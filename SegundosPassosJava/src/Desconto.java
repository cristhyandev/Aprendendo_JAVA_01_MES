package calculadora;

public class Desconto{

    public double valorProduto;
    public double porcentagemDesconto;

    public double calcularValorFinal() {
        return valorProduto - (valorProduto * (porcentagemDesconto / 100));

    }
}
