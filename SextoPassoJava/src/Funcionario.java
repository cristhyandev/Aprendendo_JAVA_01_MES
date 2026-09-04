package rh;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;

        if (salario>=1412) {
            this.salario = salario;
        }
        else {
            System.out.println("Salário informado menos que o piso. Atualizado automaticamente para: R$1412");
            this.salario= 1412;
        }
    }

    public String getNome(){
        return nome;
    }

    public String getCargo(){
        return cargo;
    }

    public double getSalario(){
        return salario;
    }

    // Função para alterar o nome:
    public void setNome( String nome){
        this.nome = nome;
    }

    //Função para alterar o cargo:
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    // Função para alterar Salário:
    public void setSalario(double salario){

         if (this.salario==salario){
            System.out.println("Salário informado idêntico ao atual (R$"+ this.salario + ") Nenhum ajuste necessário!");
        }

        else if (salario>1412) {
            this.salario = salario;
            System.out.println("Salário atualizado com sucesso! ");
        }


            else {
            System.out.println("Salário menor que o salário minímo, Tente novamente:");
            }
    }

    //Função para exibir os dados do funcionário:
    public void exibirFicha(){
        System.out.println("Nome do funcionário: " +getNome());
        System.out.println("Cargo: " +getCargo());
        System.out.println("Salário Atual: R$" +getSalario() );
    }

    //Função para aumento em porcetagem:
    public void aumentoPercentual(double porcentagem){
        if (porcentagem>0){
            salario = salario + (salario * (porcentagem/100));
            System.out.println("Salário aditivado com sucesso! ");
        }
        else{
            System.out.println("Porcetagem inválida informada: ");
        }
    }





}
