package biblioteca;
import biblioteca.ItemBiblioteca;

public class Revista extends ItemBiblioteca {

    private int edicao;

    public Revista(int id, String titulo, int edicao){
        super(id,titulo);
        this.edicao = edicao;
    }

    public int getEdicao(){
        return edicao;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso;
    }
}
