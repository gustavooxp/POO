public class Produto {

    String nome;
    double preco;

    public double getPrecoComDesconto(double percentual) {
        return (preco * (percentual / 100));
    }

    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return "Produto com desconto;\n" + nome + "\nPreço: R$" + preco;
    }

}
