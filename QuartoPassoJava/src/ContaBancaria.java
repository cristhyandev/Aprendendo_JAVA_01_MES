package financeiro;

public class ContaBancaria{

    public String titular;
    public double saldo;

    public void depositar(double valor){
        saldo = saldo+ valor;
    }

    public void sacar(double saque) {
        saldo = saldo - saque;
    }

    public double exibirSaldo(){

        return saldo;
    }



}
