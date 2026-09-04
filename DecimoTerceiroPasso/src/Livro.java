package biblioteca;
import  biblioteca.ItemBiblioteca;

public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(int id, String titulo, String autor){
        super(id, titulo);
        this.autor = autor;
    }
    public String getAutor(){

        return autor;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
       return diasAtraso*2;
    }
}
