import java.util.Scanner;
import gestao.Veiculo;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        System.out.print("Informe o modelo do Carro: ");
        String tipo = leitor.nextLine();

       double valorDiaria= -1;

        while (valorDiaria <= 0) {
            System.out.print("Informe valor da diária: ");
            valorDiaria = leitor.nextDouble();

            if (valorDiaria <= 0) {
                System.out.println("Valor da Diária não pode ser menor ou igual a 0");
            }
        }


        Veiculo carro = new Veiculo(tipo,valorDiaria);

        String escolha = "";

        while (!escolha.equals("e")){
            System.out.println("===== MENU =====");
            System.out.println("a. Retirar/Alugar Veículo");
            System.out.println("b. Devolver Veículo");
            System.out.println("c. Ajustar Valor da Diária");
            System.out.println("d. Exibir Status/Ficha do Veículo");
            System.out.println("e. Encerrar o programa");
            System.out.println("================");
            escolha = leitor.next();

            if (escolha.equals("a")){
                System.out.println("Veículo Disponível: " +tipo);
                System.out.println("Digite y para confirmar o Aluguel");
                String escolha2 = leitor.next();

                if (escolha2.equals("y")){
                    carro.retirarVeiculo();
                }
                else {
                    System.out.println("Comando Inválido! Veículo não foi alugado.");
                }

            }
            else if (escolha.equals("b")) {
                System.out.println("Quantos dias de uso do veículo? ");
                int dias = leitor.nextInt();
                carro.devolverVeiculo(dias);


            }
            else if (escolha.equals("c")) {
                System.out.println("Informe o valor da nova diária: ");
                double novaDiaria = leitor.nextDouble();
                carro.ajustarDiaria(novaDiaria);
            }
            else if (escolha.equals("d")) {
                carro.exibirFicha();
            }
            else if (escolha.equals("e")) {
                System.out.println("Encerrando programa! Até Logo!");
            }
            else {
                System.out.println("Opção Inválida! Tente novamente:");
            }


        }

        leitor.close();
    }
}