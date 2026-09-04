import java.util.Scanner;
import java.util.ArrayList;
import leitura.Livro;

public class Main {
    public static void main(String[] args) {
        Scanner leitor =new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        int contadorCodigo = 1;
        String escolha="";

        while (!escolha.equals("n")) {
            System.out.println("\n ===== MENU =====");
            System.out.println("a. Cadastrar novo Livro");
            System.out.println("b. Remover Livro");
            System.out.println("c. Exibir livros na biblioteca");
            System.out.println("n. Encerrar o programa");
            System.out.println("================");
            escolha = leitor.next();

            leitor.nextLine();

            if (escolha.equals("a")){
                System.out.print("Informe nome do livro: ");
                String nome = leitor.nextLine();
                Livro obra = new Livro(contadorCodigo,nome);

                livros.add(obra);

                System.out.println("Livro cadastrado com sucesso");
                contadorCodigo++;

            }
            else if (escolha.equals("b")){


                System.out.print("Informe o código do livro a ser removido: ");
                 int livroRemovido = leitor.nextInt();

                 boolean encontrado = false;
                 for (int i= 0; i< livros.size(); i++){
                     if(livros.get(i).getCodigo() == livroRemovido){
                        livros.remove(i);
                        System.out.println("Livro com código "+ livroRemovido + " removido!" );
                        encontrado =true;
                        break;
                     }
                }
                if (!encontrado){
                    System.out.println("Código não encontrado! ");
                }
            }

            else if (escolha.equals("c")){
                System.out.println("\n === LIVROS NA BIBLIOTECA ===");


                for (Livro l : livros){
                    System.out.print( l.getCodigo() +"- ");
                    System.out.println(l.getNomeLivro());

                }

            }

            else if (escolha.equals("n")){
                System.out.println("Encerrando o programa. Até logo!");
            }

            else {
                System.out.println("Opção inválida, Tente novamente");
            }



        }
    leitor.close();
        }

    }

