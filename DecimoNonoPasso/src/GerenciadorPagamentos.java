package sistema;
import java.util.HashMap;
import  java.util.Map;
import java.util.Scanner;

public class GerenciadorPagamentos {

    private Map<Integer, sistema.Transacao> transacoes = new HashMap<>();

    public void adicionar(int codigo, sistema.Transacao transacao){
        transacoes.put(codigo, transacao);
    }

    public sistema.Transacao busca(int codigoBusca){
        if (transacoes.containsKey(codigoBusca)){
            sistema.Transacao buscado = transacoes.get(codigoBusca);
            System.out.println("Pagamento Existe: \n" + buscado.getId()  +
                    "\n Valor inicial: R$" + buscado.getValor() + "\n Forma de pagamento: " +
                     buscado.getFormaPagamento() +"\n Valor final: R$"+
                    buscado.getValorFinal());
            return buscado;
        }
        else {
           throw new sistema.BuscaInvalidaException("Código não existe.");

        }
    }

    public void  remover(int codigoRemover){
       sistema.Transacao encontrado = busca(codigoRemover);
       transacoes.remove(codigoRemover);
       System.out.println("Pagamento de ID:" + encontrado.getId() +" Foi removido com sucesso!");
    }


    public void listar(){
        if (transacoes.isEmpty()){
         System.out.println("Lista Vazia!");
        }
        else {
            transacoes.forEach((id, transacao) -> {
                System.out.println("\n"+id);
                System.out.println("Valor original: " + transacao.getValor());
                System.out.println("Forma: " + transacao.getFormaPagamento());
                System.out.println("Valor final: " + transacao.getValorFinal());
            });
        }
    }

}
