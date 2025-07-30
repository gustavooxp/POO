public class Porta {
    String material;
    String macaneta;
    String cor;

//    metódos ou funções

    public void abre() {
        System.out.println("Porta aberta.");
    }

    public void fecha() {
        System.out.println("Porta fechada.");
    }

//    metodo construtor padrao sem argumentos
    public Porta() {}

//    método construtor de uma classe com argumentos
    public Porta(String material, String macaneta, String cor) {
        this.material = material;
        this.macaneta = macaneta;
        this.cor = cor;
    }

}
