public class PortaMain {
    public static void main(String[] args) {

        Porta porta;

        porta = new Porta();
        porta.material = "Madeira";
        porta.macaneta = "Ferro";
        porta.cor = "Marrom";

        porta.abre();
        porta.fecha();

        Porta pinus;

        pinus = new Porta("Madeira", "ferro", "Branco");

    }
}
