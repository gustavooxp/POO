public class Carro {

    String marca;
    String ano;

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void desligar() {
        System.out.println("Desligando...");
    }

    public void acelerar() {
        System.out.println("Acelerando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }

    public Carro(String marca, String ano){
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro;\nMarca: " + marca + "\nAno: " + ano;
    }
}
