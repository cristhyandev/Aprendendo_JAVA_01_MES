package rh;
import rh.Gerente;
import rh.Gerenciadora;
import rh.Funcionario;

public class Desenvolvedor extends Funcionario{

    private String linguagemDominada;

    public Desenvolvedor(int id, String nome, double salarioBase, String linguagemDominada){

        super(id, nome, salarioBase);

        this.linguagemDominada = linguagemDominada;

    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() +1000;
    }


    public String getLinguagemDominada() {
        return linguagemDominada;
    }

}
