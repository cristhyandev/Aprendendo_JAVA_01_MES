import java.util.Scanner;
import financeiro.Tributavel;
import financeiro.ContaCorrente;
import financeiro.SeguroDeVida;

public class Main {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);


    System.out.print("Informe Valor na conta: ");
    double valor = leitor.nextDouble();

    System.out.print("Informe taxa do valor de vida: ");
    double taxaSeguro = leitor.nextDouble();

        ContaCorrente cc = new ContaCorrente(valor);
        SeguroDeVida sv = new SeguroDeVida(taxaSeguro);

       System.out.println(cc.calcularImposto());
       System.out.println(sv.calcularImposto());


    }
}