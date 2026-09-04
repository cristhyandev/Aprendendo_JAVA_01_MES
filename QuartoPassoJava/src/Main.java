import java.util.Scanner;
import financeiro.ContaBancaria;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe seu Nome:");
        String nome = leitor.nextLine();

        System.out.print("Informe seu saldo bancário atual:");
        double sss = leitor.nextDouble();

        ContaBancaria conta = new ContaBancaria();
        conta.saldo = sss;
        conta.titular = nome;


        String escolha ="";

        while(!escolha.equals("d")) {
            System.out.println("\n--- MEUNU DE AÇÕES ---");
            System.out.println("Selecione sua ação: ");
            System.out.println("a. Depositar ");
            System.out.println("b. Sacar ");
            System.out.println("c. Ver saldo ");
            System.out.println("d. Sair ");
            System.out.println("========================");
            escolha = leitor.next();


            if (escolha.equals("a")) {
                System.out.print("Digite valor a ser depositado: ");
                double deposito = leitor.nextDouble();
                conta.depositar(deposito);


            } else if (escolha.equals("b")) {
                System.out.println("Qual o valor deseja sacar?");
                double saque = leitor.nextDouble();

                if(conta.saldo<saque){
                    System.out.println("Saldo Insuficiente!");
                }
                else {
                    conta.sacar(saque);
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Saldo atualizado: R$"+conta.exibirSaldo());
                }

            } else if (escolha.equals("c")) {
                System.out.println("Sr(a). " + nome);
                System.out.println("Seu saldo é: R$" + conta.exibirSaldo());

            } else if (escolha.equals("d")) {
                System.out.println("Encerrando o programa, Até logo!");
            }
              else{
                  System.out.println("Opção Inválida! Tente novamente.");
            }
        }
        leitor.close();
        }
    }
