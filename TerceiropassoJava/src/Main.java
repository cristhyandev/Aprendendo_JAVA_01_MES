import java.util.Scanner;

import geometria.Retangulo;


public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Qual a base do Retângulo? ");
        double b = leitor.nextDouble();
        System.out.printf("Qual a altura do retângulo? ");
        double h = leitor.nextDouble();

        Retangulo ret = new Retangulo();
        ret.altura = h;
        ret.base = b;
        double area = ret.calcularArea();

        System.out.printf(" O valor da área do Retâgulo é "+ area + "m2");
        leitor.close();
    }
}