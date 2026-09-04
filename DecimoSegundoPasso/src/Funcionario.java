package rh;
import rh.Gerente;
import rh.Gerenciadora;
import rh.Desenvolvedor;

public class Funcionario{

    private int id;
    private String nome;
    private double salarioBase;

    public Funcionario(int id, String nome, double salarioBase){
        this.id= id;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }



}
