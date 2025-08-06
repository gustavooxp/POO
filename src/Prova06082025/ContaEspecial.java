package Prova06082025;

public class ContaEspecial extends ContaBancaria{

    double taxaJuros;

    public ContaEspecial(int numero, Cliente cliente, double saldo, double limite, double taxaJuros) {
        super(numero, cliente, saldo, limite);
        this.taxaJuros = taxaJuros;
    }



    public void aplicarJuros() {
        this.taxaJuros = (taxaJuros / 100);
        saldo = saldo + (saldo * taxaJuros);
    }
}
