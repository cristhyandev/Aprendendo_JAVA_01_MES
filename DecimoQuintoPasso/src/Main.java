import java.util.Scanner;
import conta.Pagamento;
import conta.PagamentoBoleto;
import conta.PagamentoCartao;
import conta.PagamentoPix;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
      Pagamento pagamento;



      int escolha = 0;
      double pagar;
      while (escolha !=4) {

          System.out.print("\nDigite valor a ser pago: ");
            try {
                pagar = leitor.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Valor digitado deve ser apenas em números");
                leitor.nextLine();
                continue;
            }
          

              System.out.println("Selecione a forma de pagamento: \n1. Pix \n2. Cartão \n3. Boleto \n4. Sair");
              try {
                  escolha = leitor.nextInt();
              } catch (InputMismatchException e) {
                  System.out.println("Apenas números permitidos");
                  leitor.nextLine();
                  continue;
              }
              if (escolha == 1) {
                  pagamento = new PagamentoPix();

              } else if (escolha == 2) {
                  pagamento = new PagamentoCartao();

              } else if (escolha == 3) {
                  pagamento = new PagamentoBoleto();

              } else if (escolha == 4) {
                  System.out.println("Encerrendo o programa. Até logo!");
                  continue;
              } else {
                  System.out.println("Comando inválido. Tente novamente!");
                  continue;
              }

              if (escolha>=1 && escolha <=3){
                  pagamento.pagar(pagar);
              }

      }
        leitor.close();
    }
}