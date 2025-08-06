import java.util.Scanner;

public class LampadaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a voltagem da Lampada: ");
        int voltagem = sc.nextInt();

        System.out.print("Digite a potencia da Lampada: ");
        int potencia = sc.nextInt();

        System.out.print("Digite a cor da Lampada: ");
        String cor = sc.next();

        System.out.print("Digite a luminosidade da Lampada: ");
        int luminosidade = sc.nextInt();


        Lampada lampada;

        lampada = new Lampada(voltagem, potencia, cor, luminosidade);

        String dadosLampada = lampada.toString();
        System.out.println(dadosLampada);

        Led led = new Led();
    }
}
