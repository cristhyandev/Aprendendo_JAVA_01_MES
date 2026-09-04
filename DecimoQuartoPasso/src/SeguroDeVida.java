package financeiro;


public class SeguroDeVida implements Tributavel {
    private double taxaFixa;

    public SeguroDeVida (double taxaFixa){
        this.taxaFixa = taxaFixa;
    }

    @Override
    public double calcularImposto() {
        System.out.print("o valor da taxa fixa é: ");
        return taxaFixa;
    }

}
