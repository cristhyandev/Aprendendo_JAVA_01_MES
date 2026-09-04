package market;

public class Produto {

    //Encapsulei as variaveis e coloquei como privadas para não terem acesso no main
    private int codigo;
    private String nome;
    private int quantidadeInicial;
    private double preco;

    // declarei que o valores informados no main serão atribuidos as variaveis encapsuladas
    public Produto(int codigo, String nome, int quantidadeInicial, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeInicial = quantidadeInicial;
        this.preco = preco;
    }


    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidadeInicial(){
        return quantidadeInicial;
    }

    public double getPreco(){
        return preco;
    }

    // realizei uma função que me devolvesse o valor do produto total
    public double getValorTotal(){
        double valorTotal = quantidadeInicial * preco;
        return valorTotal;
    }

    // coloquei condições para alterar o valor
    public void setPreco(double valor){
        if (valor == preco){
            System.out.println("Valor inválido! Preço informado idêntico o anterior: ("+ preco +")" );
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


