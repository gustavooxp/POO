import java.util.Scanner;

public class PessoaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa gustavo = new Pessoa();
        System.out.println("Digite seu nome: ");
        gustavo.setNome(sc.next());
        System.out.println("Digite sua idade: ");
        gustavo.setIdade(sc.nextInt());

        System.out.println("Nome: "+ gustavo.getNome());
        System.out.println("Idade: "+ gustavo.getIdade());
    }
}
