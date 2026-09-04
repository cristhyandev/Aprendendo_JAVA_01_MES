import calculadora.calcularDesconto;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        calcularDesconto des = new calcularDesconto();

        System.out.println("Qual o valor do produto? ");
        double valor = leitor.nextDouble();
        System.out.println("Qual o a % de desconto? ");
        double desconto = leitor.nextDouble();
        double valorfinal = des.acao(valor, desconto);

        System.out.println("O valor do produto com desconto é: R$" + valorfinal);

    }
}

