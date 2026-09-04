import java.util.Scanner;
import java.util.InputMismatchException;
import market.Produtos;


public class Main {
    public static void main(String[] args) {

    String nomeProduto = "";
    Scanner leitor = new Scanner(System.in);
    Produtos produtos = new Produtos();
    int escolha = 0;
    produtos.adicionar(1001, "Arroz");
    produtos.adicionar(1002, "Feijão");
    produtos.adicionar(1003, "Café");
    int contador = 1004;
        try {
    while (escolha != 6) {
        System.out.println("\n === MENU ===");
        System.out.println("1. Cadastrar novos produtos");
        System.out.println("2. Busca pelo código");
        System.out.println("3. Verificar se existe");
        System.out.println("4. Remover");
        System.out.println("5. Listar todos");
        System.out.println("6. Sair");

        try {
            escolha = leitor.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Sistema Interativo apenas com Números");
            leitor.nextLine();
            continue;
        }
        leitor.nextLine();
        if (escolha == 1) {
            try {
                System.out.print("Digite nome do produto: ");
                nomeProduto = leitor.nextLine();

                produtos.adicionar(contador, nomeProduto);
                System.out.println("Produto Adicionado com Sucesso!");
                contador++;
            } catch (market.ProdutoInvalidoException pie) {
                System.out.println("Atenção: " + pie.getMessage());
            }

        } else if (escolha == 2) {
            System.out.print("Digite o código a ser procurado: ");
            try {
                int buscaCodigo = leitor.nextInt();
                String nomeEncontrado = produtos.busca(buscaCodigo);
                System.out.println("O nome do produto é: " + nomeEncontrado);

            } catch (InputMismatchException e) {
                System.out.println("Apenas números aceitos");
                leitor.nextLine();
                continue;
            } catch (market.ProdutoNaoEncontradoException pne) {
                System.out.println("Atenção:" + pne.getMessage());
            }

        } else if (escolha == 3) {
            System.out.print("Digite código a ser analisado: ");
            try {
                int codigoAnalisar = leitor.nextInt();
                produtos.verificarExistencia(codigoAnalisar);
            } catch (InputMismatchException e) {
                System.out.println("Apenas números permitidos!");
                leitor.nextLine();
                continue;
            } catch (market.ProdutoNaoEncontradoException pne) {
                System.out.println("Atenção:" + pne.getMessage());
            }

        } else if (escolha == 4) {
            System.out.print("Digite código do produto a ser removido: ");
            try {
                int codigoRemover = leitor.nextInt();
                produtos.removerProdutos(codigoRemover);
            } catch (InputMismatchException e) {
                System.out.println("Apenas números permitidos!");
                leitor.nextLine();
                continue;
            } catch (market.ProdutoNaoEncontradoException pne) {
                System.out.println("Atenção:" + pne.getMessage());
            }

        } else if (escolha == 5) {
            produtos.listar();

        } else if (escolha == 6) {
        } else {
            System.out.println("Comando Inválido!");
        }
    }
}
        finally{
            System.out.println("Encerrando o sistema e limpando a memória");
            leitor.close();
        }
        

    }
}