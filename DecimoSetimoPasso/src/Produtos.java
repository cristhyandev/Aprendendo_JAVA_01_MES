package market;
import java.util.HashMap;
import java.util.Map;
import market.ProdutoInvalidoException;
import market.ProdutoNaoEncontradoException;

public class Produtos {
    private Map<Integer, String> produtos = new HashMap<>();


public Produtos( ){
}

  public void adicionar(int codigo, String nome) throws ProdutoInvalidoException {
        if (nome.trim().isEmpty()){
            throw  new ProdutoInvalidoException("O nome do produto não pode ser em branco");
    }
      produtos.put(codigo, nome);
  }

  public String busca(int codigoBuscar) {

          if (produtos.containsKey(codigoBuscar)) {
              return produtos.get(codigoBuscar);
          } else {
              throw new ProdutoNaoEncontradoException("Código do produto não encontrado no Banco de Dados");
          }
  }
  public void removerProdutos(int codigoRemover){

        String codigoEncontrado  = busca(codigoRemover);
           produtos.remove(codigoRemover);
           System.out.println(codigoEncontrado + "= Foi removido com sucesso");
}



  public void listar(){
      produtos.forEach((codigo, nome) ->{
         System.out.println(codigo + " -> " + nome);
      });
  }
  public void verificarExistencia (int codigoExiste){
      String codigoEncontrado  = busca(codigoExiste);
      System.out.println("Código existe e representa o produto: " + codigoEncontrado);

  }



}
