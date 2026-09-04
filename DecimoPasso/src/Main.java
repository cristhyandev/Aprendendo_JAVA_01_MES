import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String escolha="";
        int idade = 0;

        while (idade<=0){

        try {
            System.out.print("Informe sua idade: ");
            idade = leitor.nextInt();
            System.out.println("Idade cadastrada: " +idade);
            break;
        }catch (Exception e){
            System.out.println("Erro: Você precisa digitar apenas números!");
            leitor.nextLine();
        }

        }
    }
}