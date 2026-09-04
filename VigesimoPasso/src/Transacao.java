package sistema;

public class Transacao {

private int cliente_id;
private double valor;
private String formaPagamento;
private double valorFinal;

public Transacao(int cliente_id, double valor, String formaPagamento,double valorFinal){
    this.cliente_id = cliente_id;
    this.valor = valor;
    this.formaPagamento = formaPagamento;
    this.valorFinal = valorFinal;
}

    public int getCliente_id() {
        return cliente_id;
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
