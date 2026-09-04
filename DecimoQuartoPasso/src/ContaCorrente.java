package financeiro;


public class ContaCorrente implements Tributavel {

    private double saldo;

   public ContaCorrente(double saldo) {
       this.saldo = saldo;
   }

    @Override
    public double calcularImposto() {
       double valorImposto = saldo*0.01;
        System.out.print("O valor do imposto do saldo é: ");
        return valorImposto;
    }


}
