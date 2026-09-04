import java.util.Scanner;
import rh.Funcionario;


public class Main {
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);

    System.out.print("Informe o nome do Funcionário: ");
    String colaborador = leitor.nextLine();

    System.out.print("Informe seu cargo: ");
    String funcao = leitor.nextLine();

    System.out.print("Informe o salário: ");
    double valor = leitor.nextDouble();

    Funcionario ficha = new Funcionario(colaborador, funcao, valor);

    String escolha = "";

    while (!escolha.equals("e")){
        System.out.println("===== MENU =====");
        System.out.println("a. Promover Colaborador");
        System.out.println("b. Aplicar Aumento Percentual");
        System.out.println("c. Ajuste Salarial Direto");
        System.out.println("d. Exibir Ficha Atualizada");
        System.out.println("e. Encerrar o programa");
        System.out.println("================");
        escolha = leitor.next();

        leitor.nextLine(); // Limpar BUFFER
        
        if (escolha.equals("a")){
            System.out.println("Escreva o novo cargo à ser atribuído:" );
            String novoCargo = leitor.nextLine();
            ficha.setCargo(novoCargo);
            System.out.println("Cargo atualizado com sucesso! ");
        }

        else if (escolha.equals("b")) {
            System.out.println("Digite porcetagem a ser aditivada: ");
            double novaPorcentagem = leitor.nextDouble();
            ficha.aumentoPercentual(novaPorcentagem);

        }

        else if (escolha.equals("c")) {
            System.out.println("Informe novo salário: (Atualização apenas para maiores de uma salário minímo (1412)");
            double novoSalario = leitor.nextDouble();
            ficha.setSalario(novoSalario);
        }

        else if (escolha.equals("d")) {
            ficha.exibirFicha();
        }


        else if (escolha.equals("e")) {
            System.out.println("Encerrando o programa, até logo!");
        }

        else {
            System.out.println("Opção Inválida! Tente novamente: ");
        }

    }

leitor.close();
    }
}