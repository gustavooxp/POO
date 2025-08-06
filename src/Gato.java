public class Gato extends Animal{

    @Override
    public void emite_som() {
        System.out.println("Miaaaau");
    }

        public Gato(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
        }

}
