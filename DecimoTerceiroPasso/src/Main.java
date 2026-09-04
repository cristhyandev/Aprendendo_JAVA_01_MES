import java.util.Scanner;
import biblioteca.Biblioteca;
import biblioteca.ItemBiblioteca;
import biblioteca.Livro;
import biblioteca.Revista;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        var leitor = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();


        int contador= 1;
        int escolha = 0;
        while (escolha != 6){

            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Cadastrar revista");
            System.out.println("3. Listar itens");
            System.out.println("4. Emprestar item");
            System.out.println("5. Devolver item");
            System.out.println("6. Sair\n");
            try {
                escolha = leitor.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números");
                leitor.nextLine();
                continue;
            }

            leitor.nextLine();
            if (escolha == 1){
             try {
                 System.out.print("Informe o título do livro: ");
                 String nome = leitor.nextLine();
                 System.out.print("Informe o autor do livro: ");
                 String escritor = leitor.nextLine();



                 ItemBiblioteca livro = new Livro(contador, nome, escritor);
                 biblioteca.adicionarItem(livro);

                 System.out.println("Livro cadastrado com sucesso!");
                 contador++;
             } catch (Exception e) {
                 System.out.println("Informe as entradas corretamente!");
                 leitor.nextLine();
             }



            }

            else if (escolha == 2){
                try {
                    System.out.print("Informe o título da revista: ");
                    String nome = leitor.nextLine();
                    System.out.print("Informe a edição da revista: ");
                    int edition = leitor.nextInt();



                    ItemBiblioteca revista = new Revista(contador, nome, edition);
                    biblioteca.adicionarItem(revista);

                    System.out.println("Revista cadastrada com sucesso!");
                    contador++;
                } catch (Exception e) {
                    System.out.println("Informe as entradas corretamente!");
                    leitor.nextLine();
                }


            }
            else if(escolha == 3) {
                biblioteca.listarItens();

            }

            else if(escolha == 4){

                try {
                    System.out.print("Informe o código do item que deseja: ");
                    int emprestado = leitor.nextInt();
                    biblioteca.emprestarItem(emprestado);

                }
                catch (Exception e){
                    System.out.println("Informe o código em números.");
                    leitor.nextLine();
                }

                }

            else if (escolha == 5){
                try {
                    System.out.print("Informe o código do livro para devolução: ");
                    int devolverCodigo = leitor.nextInt();

                    System.out.print("Informe quantos dias de atraso: ");
                    int atraso = leitor.nextInt();

                    biblioteca.devolverItem(devolverCodigo, atraso);
                } catch (Exception e) {
                    System.out.println("Informe as entradas corretamente!");
                    leitor.nextLine();
                }
            }
            else if (escolha==6){
                System.out.println("Sistema encerrando. Até logo!");
            }

            else {
                System.out.println("Opção inválida");
            }

        }


    leitor.close();
    }
}