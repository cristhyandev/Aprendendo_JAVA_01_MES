package market;
import java.util.ArrayList;

public class Produto {

    //Encapsulei as variaveis e coloquei como privadas para não terem acesso no main
    private int codigo;
    private String nome;
    private int quantidadeEstoque;
    private double preco;

    // declarei que o valores informados no main serão atribuidos as variaveis encapsuladas
    public Produto(int codigo, String nome, int quantidadeEstoque, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }


    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public double getPreco(){
        return preco;
    }

    // realizei uma função que me devolvesse o valor do produto total
    public double getValorTotal(){
        double valorTotal = quantidadeEstoque * preco;
        return valorTotal;
    }

    // coloquei condições para alterar o valor
    public void setPreco(double valor){
        if (valor == preco){
            System.out.println("Valor inválido! Preço informado idêntico o anterior: (R$"+ preco +")" );
        }

        else if(valor<=0){
            System.out.println("Preço informado inválido (menor ou igual a 0)");
        }
        else {
            preco = valor;
            System.out.println("Preço alterado com sucesso");
        }
    }


}






