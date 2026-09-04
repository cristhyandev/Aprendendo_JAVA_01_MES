package market;

public class ProdutoPerecivel extends market.Produto{

    private String dataValidade;

    public ProdutoPerecivel(int codigo, String nome, int quantidadeEstoque, double preco, String dataValidade){

        super(codigo, nome, quantidadeEstoque, preco);

        this.dataValidade = dataValidade;

    }
    public String getDataValidade(){
        return dataValidade;
    }

}
