package biblioteca;

public class ItemBiblioteca {

    private int id;
    private String titulo;
    private boolean disponivel ;

    public ItemBiblioteca(int id, String titulo){
        this.id = id;
        this.titulo = titulo;
        disponivel = true;
    }

    public  double calcularMulta(int diasAtraso){
        return 0;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getId() {
        return id;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar(){
        if (disponivel){
            disponivel =false;
        }
    }
    public void devolver(){
        if (!disponivel){
            disponivel = true;
        }
    }
}
