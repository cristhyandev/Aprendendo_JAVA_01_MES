package biblioteca;
import java.util.ArrayList;
import biblioteca.ItemBiblioteca;
import biblioteca.Livro;
import biblioteca.Revista;

public class Biblioteca {

    private ArrayList <ItemBiblioteca> itemBibliotecas = new ArrayList<>();

    public void adicionarItem(ItemBiblioteca item){
        itemBibliotecas.add(item);
    }


    public ItemBiblioteca buscarPorCodigo(int codigo){
        for(ItemBiblioteca item : itemBibliotecas){
            if (item.getId() == codigo){
                return item;
            }
        }
        return null;
    }

    public void emprestarItem(int codigo){

       ItemBiblioteca item = buscarPorCodigo(codigo);

        if (item != null && item.isDisponivel()) {

           System.out.println("Empréstimo realizado.");

           item.emprestar();

       }
       else if (item != null && !item.isDisponivel()){
           System.out.println("Item indisponível.");

       }
       else {
           System.out.println("Código não encontrado.");
       }

    }
    public  void devolverItem (int codigo, int diasAtraso){
        ItemBiblioteca item = buscarPorCodigo(codigo);
        if (item != null && item.isDisponivel()) {
            System.out.println("Item não está emprestado");
        }
        else if (item != null && !item.isDisponivel()){
            System.out.println("Multa por atraso no valor de: R$" + item.calcularMulta(diasAtraso));
            item.devolver();
            System.out.println("Item devolvido com sucesso");
        }
        else {
            System.out.println("Código não existe");
        }


    }

    public void listarItens(){
        if(itemBibliotecas.isEmpty()) {
            System.out.println("Lista de itens vazia!");
            return;
        }

            for (ItemBiblioteca ib : itemBibliotecas) {
                System.out.print(ib.getId() + "- " + ib.getTitulo() + ", ");
                if (ib instanceof Livro livrin){
                    System.out.print("Autor: " + livrin.getAutor()+", ");
                }
                if(ib instanceof Revista revista){
                    System.out.print("Edição: " + revista.getEdicao()+ ", ");
                }
                if (ib.isDisponivel() == true) {
                    System.out.println("Disponível");
                } else {
                    System.out.println("Indisponível");
                }
            }

    }
}
