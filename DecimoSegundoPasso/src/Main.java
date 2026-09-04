import java.util.Scanner;
import java.util.ArrayList;
import rh.Desenvolvedor;
import rh.Gerente;
import rh.Gerenciadora;
import rh.Funcionario;

public class Main {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    Gerenciadora gerenciadora = new Gerenciadora();

    int escolha = 0;
    int contador = 1;

    while (escolha != 5 ){
        try {
            System.out.println("\n ==== MENU ====");
            System.out.println("1. Contratar Desenvolvedor");
            System.out.println("2. Contratar Gerente");
            System.out.println("3. Exibir Folha de Pagamento");
            System.out.println("4. Demitir Funcionário");
            System.out.println("5. Sair");
            System.out.println(" ==============");
            escolha = leitor.nextInt();
        }
        catch (Exception e) {
            System.out.println("Utilize as entradas corretas.");
            leitor.nextLine();
        }

        leitor.nextLine();

            if (escolha== 1){

                try {
                    System.out.print("Informe o nome: ");
                    String nomeFuncionario = leitor.nextLine();

                    System.out.print("Informe o Salário Base: R$");
                    double salario = leitor.nextDouble();

                    leitor.nextLine();// Limpar BUFFER

                    System.out.print("Informe a linguagem que domina: ");
                    String linguagemProgramacao = leitor.nextLine();


                    Desenvolvedor d = new Desenvolvedor(contador, nomeFuncionario, salario, linguagemProgramacao);

                    gerenciadora.contratarFuncionario(d);

                    contador++;
                    System.out.println("Desenvolvedor contratado com sucesso! ");
                }
                catch (Exception e) {
                    System.out.println("Utilize as entradas corretas.");
                    leitor.nextLine();
                }


            }
             else if (escolha == 2) {
            try {
                System.out.print("Informe o nome: ");
                String nomeFuncionario = leitor.nextLine();

                System.out.print("Informe o Salário Base: ");
                double salario = leitor.nextDouble();

                System.out.print("Informe o bônus no salário: ");
                double bonusSalario = leitor.nextDouble();


                Gerente g = new Gerente(contador, nomeFuncionario, salario, bonusSalario);

                gerenciadora.contratarFuncionario(g);
                contador++;
                System.out.println("Gerente contratado com sucesso! ");
            }
            catch (Exception e) {
                System.out.println("Utilize as entradas corretas.");
            }


        }
             else if (escolha== 3) {
                 gerenciadora.exibirFolha();

            }
             else if (escolha== 4) {
               try {
                   System.out.println("Digite o código do Funcionário demitido: ");
                   int demitido = leitor.nextInt();
                   gerenciadora.demitirFuncionario(demitido);
               } catch (Exception e) {
                   System.out.println("Apenas Números permitidos");
               }

            }
             else if (escolha == 5) {
                 System.out.println("Sistema Encerrado! Até Logo");
            }
            else {
                System.out.println("Comando Inválido. Tente Novamente!");
            }

    }




    leitor.close();
    }
}