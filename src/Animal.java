public abstract class Animal {
    String nome;
    String especie;
    String som;

    public void emite_som() {
    }

    @Override //sobrescrever o metodo ja existente
    public String toString() {
        return "Animal[nome=" + nome + "\nespecie=" + especie;
    }
}
