import java.util.Scanner;

public class ProdutoMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto produto1;

        produto1 = new Produto("Leite", 5.78);

        System.out.print("Digite o percentual do desconto: ");
        double percentual = sc.nextDouble();

        double desconto = produto1.getPrecoComDesconto(percentual);

        produto1.preco = produto1.preco - desconto;

        String dados_produto = produto1.toString();
        System.out.println(dados_produto);

    }
}
