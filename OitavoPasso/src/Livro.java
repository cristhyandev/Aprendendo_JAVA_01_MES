package leitura;

public class Livro {

    private int codigo;
    private String nomeLivro;


    public Livro (int codigo,String nomeLivro){
        this.codigo = codigo;
        this.nomeLivro = nomeLivro;

    }

    public int getCodigo(){
        return codigo;
    }

    public String getNomeLivro(){
        return nomeLivro;
    }
}


