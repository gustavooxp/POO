public class CarroMain {
    public static void main(String[] args) {

        Carro carro;

        carro = new Carro("Volkswagem", "2025");

        String dados_carro = carro.toString();
        System.out.println(dados_carro);
    }
}
