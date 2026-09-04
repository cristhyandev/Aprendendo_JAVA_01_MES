import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.InputMismatchException;
import sistema.Pagamento;
import sistema.PagamentoBoleto;
import sistema.PagamentoCartao;
import sistema.PagamentoPix;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Pagamento pagamento;
        sistema.GerenciadorPagamentos gereciador = new sistema.GerenciadorPagamentos();

    int escolha =0;
    int escolhaForma = 0;
    String formaPaga ="";
    int codigo  = 1001;
    double preco = 0;

    while(escolha !=5){
        System.out.println("\n===== PAGAMENTOS =====");
        System.out.println("1. Realizar Pagamento");
        System.out.println("2. Buscar pagamento");
        System.out.println("3. Remover pagamento");
        System.out.println("4. Listar pagamentos");
        System.out.println("5. Sair");

        try {
            escolha = leitor.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Apenas números Aceitos.");
            leitor.nextLine();
            continue;
        }

        if (escolha ==1){
            System.out.println("Escolha a forma de pagamento\n" +
                    "1. Pix\n" +
                    "2. Cartão\n" +
                    "3. Boleto\n");
            try {
                escolhaForma = leitor.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Apenas números!");
                leitor.nextLine();
                continue;
            }

            if (escolhaForma == 1) {
                pagamento = new PagamentoPix();
                formaPaga = "Pix";
            }
            else if (escolhaForma == 2){
                pagamento = new PagamentoCartao();
                formaPaga = "Cartâo";
            }
            else if (escolhaForma == 3){
                pagamento = new PagamentoBoleto();
                formaPaga ="Boleto";
            }
            else {
                System.out.println("ERRO: Opção Inválida");
                continue;
            }
            System.out.print("Informe o valor do pagamento: ");
            try {
                preco = leitor.nextDouble();
               double valorFinal= pagamento.calcular(preco);

                sistema.Transacao transacao = new sistema.Transacao(codigo, preco,formaPaga, valorFinal);
                gereciador.adicionar(codigo, transacao);
                System.out.print("Valor a ser pago é: R$" + valorFinal);
                codigo++;

            }
            catch (sistema.PagamentoInvalidoExpection e){
                System.out.println(e.getMessage());
                leitor.nextLine();
                continue;
            } catch (Exception e) {
                System.out.println("Valor apenas em números");
                leitor.nextLine();
                continue;
            }

        }
        else if (escolha == 2){
            try {
                System.out.print("Informe código do pagamento: ");
                int codigoBusca = leitor.nextInt();
                gereciador.busca(codigoBusca);

            } catch (sistema.BuscaInvalidaException e) {
                System.out.println("ERRO: " + e.getMessage());
                leitor.nextLine();
                continue;
            }
            catch (InputMismatchException e){
                System.out.println("ERRO: Apenas números aceitos");
                leitor.nextLine();
                continue;
            }

    }
        else if (escolha == 3){
            try {
                System.out.print("Digite o código para Remover: ");
                int codigoRemover = leitor.nextInt();
                gereciador.remover(codigoRemover);

            } catch (sistema.BuscaInvalidaException e) {
                System.out.println("ERRO: " + e.getMessage());
                leitor.nextLine();
                continue;
            }
            catch (InputMismatchException e){
                System.out.println("Erro: Apenas números aceitos!");
                leitor.nextLine();
                continue;
            }

        }

        else if (escolha == 4){
            gereciador.listar();
            continue;

        }
        else if (escolha == 5){
            System.out.println("Encerrando o programa! Até logo");
            continue;
        }
        else {
            System.out.println("Comando Inválido");
            continue;
        }
    
    }
leitor.close();
    }
}