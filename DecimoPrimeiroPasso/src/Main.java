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

            if ("a".equalsIgnoreCase(escolha)) {


                System.out.print("Informe o nome do produto: ");
                String nomeProduto = leitor.nextLine();

                System.out.print("Informe a quantidade do produto: ");
                int quantidadeProduto = leitor.nextInt();

                System.out.print("Informe o preço inicial do produto: R$");
                double precoProduto = leitor.nextDouble();

                System.out.println("Produto perecível? Y- sim  N- não");
                String perecivel = leitor.next();

                while (!"Y".equalsIgnoreCase(perecivel) && !"N".equalsIgnoreCase(perecivel)) {
                    System.out.println("Comando Inválido. Digite apenas Y ou N. ");
                    System.out.println("Produto perecível? (Y/N)");
                    perecivel = leitor.next();
                }
                if ("Y".equalsIgnoreCase(perecivel)) {
                    System.out.println("Informe Data de Validade: ");
                    String validadeProduto = leitor.next();

                    // Encapsulei as informações do produto que esta sendo registrado
                    market.ProdutoPerecivel item2 = new market.ProdutoPerecivel(contador, nomeProduto, quantidadeProduto, precoProduto, validadeProduto);
                    //Adicionei a lista o produto e sua informações
                    produtos.add(item2);
                    System.out.println("Produto Perecível cadastrado com Sucesso");
                    contador++;
                } else if ("N".equalsIgnoreCase(perecivel)) {
                    Produto item = new Produto(contador, nomeProduto, quantidadeProduto, precoProduto);
                    produtos.add(item);
                    System.out.println("Produto não Perecível Cadastrado com Sucesso");;
                    contador++;
                }
            }


            else if ("b".equalsIgnoreCase(escolha)){

                System.out.println("||||| Lista de Produtos:  |||||\n");

                // Percorri a lista para mostrar as informações de todos os itens registrados
                for (Produto produto: produtos) {


                        System.out.print(produto.getCodigo() + "- ");
                        System.out.print(produto.getNome() + ", ");
                        if (produto.getQuantidadeEstoque() == 0) {
                            System.out.print("Estoque vazio, ");
                        } else {
                            System.out.print(produto.getQuantidadeEstoque() + "und, ");
                        }
                        System.out.print("R$" + produto.getPreco() + ", ");
                    if (produto instanceof market.ProdutoPerecivel perecivel) {
                        System.out.print("Data de validade: " + perecivel.getDataValidade() + ", ");
                    }
                        System.out.println("Valor total: R$" + produto.getValorTotal());

                }
            }
            else if ("c".equalsIgnoreCase(escolha)){

                System.out.print("Informe o código do produto que deseja alterar o preço: ");
                int codigoPrecoalterar = leitor.nextInt();

                // Pecorri a lista pra encontrar o código compátivel com o código informado peloi usuario
                boolean encontradoPreco = false;
                for (Produto produto : produtos) {

                    if (produto.getCodigo() == codigoPrecoalterar) {
                        encontradoPreco = true;
                        System.out.println("Deseja relmente alterar o preço do: " + produto.getNome() +", Valor atual: R$" +produto.getPreco());
                        System.out.print("1. Confirmar 2. Cancelar? ");
                        int confirmacao =  leitor.nextInt();



                        //Apos encontrar o código compativel com o solicitado pelo usuário
                        //Solicitei  o novo preço e enviei pra Classe para realizar a alteração com base na condições
                        if (confirmacao == 1) {
                            System.out.println("Informe novo preço do produto:");
                            double novoValor = leitor.nextDouble();
                            produto.setPreco(novoValor);
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
            else if ("d".equalsIgnoreCase(escolha)){
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

            else if ("e".equalsIgnoreCase(escolha)){
                System.out.println("Encerrando programa! Até logo.");
            }

            else {
                System.out.println("Comando Inválido! Tente novamente!");
            }

        }

        leitor.close();

    }
}