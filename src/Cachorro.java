public class Cachorro extends Animal{


    @Override
    public void emite_som() {
        System.out.println("Aau au au au au au");
    }

    public Cachorro(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }
}
