import java.util.Scanner;
import estoque.Produto;

public class Main {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    Produto estoque = new Produto();

    System.out.print("Digite o nome do produto:");
    String produto = leitor.next();

    System.out.print("Digite preço unitário do produto:");
    double preco = leitor.nextDouble();

    System.out.print("Digite quantidade inicial em estoque:");
    int quantidade = leitor.nextInt();

    estoque.quantidadeEmEstoque = quantidade;
    estoque.nome= produto;
    estoque.preco = preco;

    String escolha="";

    while (!escolha.equals("d")){
        System.out.println("\n===== MENU =====");
        System.out.println("ESCOLHA SUA AÇÃO:");
        System.out.println("a. Dar entrada no estoque(comprar mais unidades)");
        System.out.println("b. Dar baixa no estoque (vender unidades)");
        System.out.println("c. Ver detalhes do produto");
        System.out.println("d. Sair ");
        System.out.println("================");
        escolha = leitor.next();

        if(escolha.equals("a")){
            System.out.println(" Digite a quantidade adquirida: ");
            int quantidadeadquirida = leitor.nextInt();
            estoque.adicionarEstoque(quantidadeadquirida);

            System.out.println("Quantidade atualizada!");
        }
        else if (escolha.equals("b")) {
            System.out.println(" Digite a quantidade vendida: ");
            int quantidadevendida = leitor.nextInt();
            estoque.removerEstoque(quantidadevendida);
        }
        else if (escolha.equals("c")) {
            estoque.exibirInformacoes();
        }
        else if (escolha.equals("d")) {
            System.out.println("Encerrando o programa, Até logo!");

        }
        else{
            System.out.println("Opção Inválida! Tente novamente.");
        }
    }


leitor.close();
    }
}