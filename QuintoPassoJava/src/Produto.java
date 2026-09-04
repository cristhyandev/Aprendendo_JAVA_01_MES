package estoque;

public class Produto {

    public String nome;
    public double preco;
    public int quantidadeEmEstoque;

    public void adicionarEstoque(int qtd){
        quantidadeEmEstoque = quantidadeEmEstoque + qtd;
    }

    public void removerEstoque(int remove){
        if(remove>quantidadeEmEstoque){
             System.out.println("Estoque insuficiente! Disponível apenas: "+ quantidadeEmEstoque+ "unds" );
        }
        else{
            quantidadeEmEstoque= quantidadeEmEstoque - remove;
             System.out.println("Venda/baixa realizada com Sucesso");
        }
    }


    public void exibirInformacoes(){
        double precototal = quantidadeEmEstoque * preco;
        System.out.println("Produto: "+ nome);
         System.out.println("Preço unitário: R$" + preco);
        System.out.println("Estoque : "+ quantidadeEmEstoque + "unds");
         System.out.println("Valor total do estoque R$"+ precototal );
    }
}
