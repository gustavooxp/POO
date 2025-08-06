public class AnimalMain {
    public static void main(String[] args) {

        Cachorro cachorro;
        cachorro = new Cachorro("Lulu", "Viralata");
        String dados_cachorro = cachorro.toString();
        System.out.println(dados_cachorro );


        cachorro.emite_som();

        Gato gato;
        gato = new Gato("Luna", "Cinza");
        String dados_gato = gato.toString();
        System.out.println("\n" + dados_gato);

        gato.emite_som();

    }
}
