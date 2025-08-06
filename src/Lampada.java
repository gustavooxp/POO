public class Lampada {
    int voltagem;
    int potencia;
    String cor;
    int luminosidade;

    public void acender() {
        System.out.println("Lampada acesa");
    }

    public void apagar() {
        System.out.println("Lampada apagada");
    }

    public void aquecer() {
        System.out.println("Lampada aquece");
    }

    public void iluminar() {
        System.out.println("Lampada ilumina");
    }

//    metodo padrao sem argumentos
    public Lampada() {}

//    metodo construtor de uma classe com argumentos

    public Lampada(int voltagem, int potencia, String cor, int luminosidade) {
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.cor = cor;
        this.luminosidade = luminosidade;
    }

    @Override // metodo pra sobrescrever o metodo ja existente (imprimir)
    public String toString() {
        return "Lampada: [voltagem=" + voltagem + ", potencia=" + potencia + ", cor=" + cor + ", luminosidade=" + luminosidade + "]";
    }

}
