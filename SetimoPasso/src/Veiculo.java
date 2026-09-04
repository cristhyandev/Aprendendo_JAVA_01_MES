package gestao;


public class Veiculo {
    private String modelo;
    private double diaria;
    private String status;

    public  Veiculo(String modelo, double diaria) {
    this.modelo = modelo;
    this.diaria = diaria;
    this.status = "Disponível";
    }


    public void  retirarVeiculo(){
        if (this.status.equals("Disponível")){
            this.status = "Indisponível";
            System.out.println("Veículo retirado com Sucesso!");
        }
        else{
            System.out.println("Veículo indisponível");
        }
    }

    public void devolverVeiculo(int dias){
        if (this.status.equals("Indisponível")){
            double valorAluguel = this.diaria * dias;
            System.out.println("Valor do aluguel do veículo R$" +valorAluguel);
            this.status= "Disponível";
        }
        else {
            System.out.println("Não é possível devolver, veículo não alugado");
        }

    }

    public void exibirFicha(){
            System.out.println("Modelo do veículo: " + modelo);
            System.out.println( "Valor da diária: "+ diaria);
            System.out.println("Status do Veículo: "+status);
    }

    public void ajustarDiaria(double diaria) {
        if (diaria == this.diaria) {
                System.out.println("Não foi possível alterar, valor informado idêntico ao atual (R$" + this.diaria +")");
        }
        else if(diaria>0){
            this.diaria = diaria;
            System.out.println("Diária ajustada com sucesso");
        }
        else {
            System.out.println("Valores menores de 0 são inválidos, diária não atualizada!");
        }
    }

}
