import java.util.Scanner;
import calculadora.Desconto;

public class main2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o valor do produto? ");
        double valor = leitor.nextDouble();
        System.out.println("Qual o a % de desconto? ");
        double porcentagem = leitor.nextDouble();

        Desconto des= new Desconto();
        des.valorProduto=  valor;
        des.porcentagemDesconto = porcentagem;
        double valorfinal = des.calcularValorFinal();



        System.out.println("O valor do produto com desconto é: R$" + valorfinal);


    }

    }
