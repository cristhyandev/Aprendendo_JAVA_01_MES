import java.util.Scanner;
import java.util.ArrayList;
import market.Produto;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Criei a lista
        ArrayList<Produto> produtos = new ArrayList<>();

        int contador = 1;



         String escolha= "";
         while (!escolha.equals("e")){
             System.out.println("\n -MENU-");
             System.out.println("a. Cadastrar Novo Produto");
             System.out.println("b. Consultar Estoque (Listar todos)");
             System.out.println("c. Alterar Preço de um Produto");
             System.out.println("d. Dar Baixa/ Remover Produto");
             System.out.println("e. Sair do Sistema");
             escolha = leitor.next();

             leitor.nextLine();

             if (escolha.equals("a")){
                 System.out.print("Informe o nome do produto: ");
                 String nomeProduto = leitor.nextLine();

                 System.out.print("Informe a quantidade do produto: ");
                 int quantidadeProduto = leitor.nextInt();

                 System.out.print("Informe o preço inicial do produto: R$");
                 double precoProduto = leitor.nextDouble();

                 // Encapsulei as informações do produto que esta sendo registrado
                 Produto item = new Produto(contador,nomeProduto,quantidadeProduto,precoProduto);

                 //Adicionei a lista o produto e sua informações
                 produtos.add(item);

                 System.out.println("Produto Cadastrado com Sucesso");
                 contador++;

             }
             else if (escolha.equals("b")){
                 System.out.println("||||| Lista de Produtos: |||||\n");

                 // Percorri a lista para mostrar as informações de todos os itens registrados
                 for (int j =0; j<produtos.size(); j++){
                     System.out.print(produtos.get(j).getCodigo()+ "- ");
                     System.out.print(produtos.get(j).getNome() + ", ");
                     if (produtos.get(j).getQuantidadeInicial() == 0){
                         System.out.print("Estoque vazio, ");
                     }
                     else {
                         System.out.print(produtos.get(j).getQuantidadeInicial()+ "und, ");
                     }
                     System.out.print("R$" + produtos.get(j).getPreco()+ ", ");
                     System.out.println("Valor total: R$" + produtos.get(j).getValorTotal());
                 }

             }
             else if (escolha.equals("c")){
                 System.out.print("Informe o código do produto que deseja alterar o preço: ");
                    int codigoPrecoalterar = leitor.nextInt();

                    // Pecorri a lista pra encontrar o código compátivel com o código informado peloi usuario
                    boolean encontradoPreco = false;
                 for (int k=0; k<produtos.size(); k++) {

                     if (produtos.get(k).getCodigo() == codigoPrecoalterar) {
                         System.out.println("Deseja relmente alterar o preço do: " + produtos.get(k).getNome() +", Valor atual: " +produtos.get(k).getPreco());
                         System.out.print("1. Confirmar 2. Cancelar? ");
                         int confirmacao =  leitor.nextInt();

                         //Apos encontrar o código compativel com o solicitado pelo usuário
                         //Solicitei  o novo preço e enviei pra Classe para realizar a alteração com base na condições
                         if (confirmacao == 1) {
                            System.out.println("Informe novo preço do produto:");
                            double novoValor = leitor.nextDouble();
                             produtos.get(k).setPreco(novoValor);
                             encontradoPreco = true;
                             break;
                         }
                         else if (confirmacao == 2){
                            System.out.println("Operação cancelada");
                         }

                         else {
                             System.out.println("Comando Inválido!");
                         }
                     }
                 }
                 if (!encontradoPreco){
                     System.out.println("Código não encontrado");
                 }

             }

             // Pecorri a lista para procurar o item informado pelo usuário
             else if (escolha.equals("d")){
                 System.out.println("Infome código do produto a ser Removido:");
                 int codigoRemovido = leitor.nextInt();
                 boolean encontrado = false;
                 for (int i=0; i<produtos.size(); i++) {

                     //utilizei uma função do arraylist list.remove para remover o item se encontrado
                     if (produtos.get(i).getCodigo() == codigoRemovido) {
                         produtos.remove(i);
                         encontrado = true;
                         System.out.println("Produto removido com sucesso");
                         break;
                     }
                 }
                    if (!encontrado){
                     System.out.println("Código não encontrado");
                     }

             }

             else if (escolha.equals("e")){
                 System.out.println("Encerrando programa! Até logo.");
             }

             else {
                 System.out.println("Comando Inválido! Tente novamente!");
             }

         }

    leitor.close();

    }
}