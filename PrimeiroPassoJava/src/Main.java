import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    //b = base
    //h = altura
    //l = lado
    //a = area

            //Cálculo do Triângulo.

            public static void CalcularTriangulo() {
                Scanner leitor = new Scanner(System.in);
                double b=0;
                double h=0;
                double a=0;

                    System.out.println(" Digite a base do Triângulo: ");
            b = leitor.nextDouble();
            System.out.println(" Digite a altura do Triângulo: ");
            h = leitor.nextDouble();
            a = (b * h)/2;

            System.out.println(" A área do triângulo é: " + a +" m2");
        }

     // Cálculo do Quadrado

            public static void CalcularQuadrado() {
                Scanner leitor = new Scanner(System.in);
                double l=0;
                double a=0;

                System.out.println(" Digite o lado do Quadrado: ");
                l = leitor.nextDouble();
                a = l * l;

            System.out.println(" A área do Quadrado é: " + a + " m2");
         }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = 0;
        System.out.println("Deseja calcular 1-Triângulo, 2- Quadrado");
        numero = leitor.nextInt();
        while (numero!=1 && numero!=2) {
            System.out.println("Opção não encontrada! Tente Novamente:");
            numero = leitor.nextInt();
        }
            if (numero == 1) {
                CalcularTriangulo();
            } else if (numero == 2) {
                CalcularQuadrado();
        }
        leitor.close();
    }

}