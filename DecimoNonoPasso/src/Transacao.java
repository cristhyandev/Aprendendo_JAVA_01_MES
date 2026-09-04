package sistema;

public class Transacao {

private int id;
private double valor;
private String formaPagamento;
private double valorFinal;

public Transacao(int id, double valor, String formaPagamento,double valorFinal){
    this.id =id;
    this.valor = valor;
    this.formaPagamento = formaPagamento;
    this.valorFinal = valorFinal;
}

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }


    public String getFormaPagamento() {
        return formaPagamento;
    }

    public double getValorFinal() {
        return valorFinal;
    }
}
