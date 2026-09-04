import java.util.Scanner;

import sign_in.Usuario;
import sign_in.Login;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Login entrar=null;
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. CADASTRO");
            System.out.println("2. LOGIN ");
            System.out.println("3. FECHAR");
            escolha= leitor.nextInt();

            if (escolha == 1) {
                try {
                    System.out.print("Informe o nome de usuário: ");
                    String usuario = leitor.next();

                    System.out.print("Senha: ");
                    String password = leitor.next();
                    entrar = new Usuario(usuario, password);

                } catch (Exception e) {
                    System.out.println("Erro: não funcionou");
                    leitor.nextLine();
                    continue;
                }
            }
                else if (escolha == 2) {
                    if (entrar ==null){
                        System.out.println("Nenhum usuário cadastrado até o momento");
                    }
                    else {
                        System.out.print("Informe seu usuário: ");
                        String testeUsuario = leitor.next();
                        System.out.print("Informe sua senha: ");
                        String testePassword = leitor.next();

                       String resultado = entrar.acessar(testeUsuario, testePassword);
                       System.out.println(resultado);
                    }
                }

                else if (escolha == 3){
                    System.out.println("Sistema Encerrando, Até logo!");

                }
                else {
                    System.out.println("Comando Inválido!");

            }
        }
        leitor.close();
    }
}