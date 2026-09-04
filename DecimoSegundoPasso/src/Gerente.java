package rh;
import rh.Funcionario;
import rh.Gerenciadora;

public class Gerente extends Funcionario {

    private  double bonusGestao;

    public Gerente (int id, String nome, double salarioBase, double bonusGestao){

        super(id, nome, salarioBase);

        this.bonusGestao = bonusGestao;
    }

    public double getBonusGestao(){
        return bonusGestao;
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() + bonusGestao;
    }



}
