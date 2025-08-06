package Prova06082025;

import java.util.Scanner;

public class ContaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContaEspecial contabancaria1;
        ContaEspecial contabancaria2;
        ContaEspecial contabancaria3;

        contabancaria1 = new ContaEspecial(2207, new Cliente("Gustavo", "12345678900", "147258000198"), 1600, 1400, 5);
        contabancaria2 = new ContaEspecial(2106, new Cliente("Kamila", "98765432100", "369258000147"), 1800, 1500, 6);
        contabancaria3 = new ContaEspecial(007, new Cliente("Filipe", "15975345602", "258369000126"), 27000, 5700, 50);

        contabancaria1.aplicarJuros();
        contabancaria2.aplicarJuros();
        contabancaria3.aplicarJuros();



        System.out.print("Digite o numero da conta: ");
        int numero_conta = sc.nextInt();

        if (numero_conta == 2207) {
            System.out.println("Tipo de conta: " + "Conta Especial" + "\nNumero da conta: " + contabancaria1.numero + "\nNome do cliente: " + contabancaria1.cliente.nome + "\nSaldo: " + contabancaria1.saldo
                    + "\nLimite: " + contabancaria1.limite);
            operacao(contabancaria1);
        } else if (numero_conta == 2106) {
            System.out.println("Tipo de conta: " + "Conta Especial" + "\nNumero da conta: " + contabancaria2.numero + "\nNome do cliente: " + contabancaria2.cliente.nome + "\nSaldo: " + contabancaria2.saldo
                    + "\nLimite: " + contabancaria2.limite);
        } else if (numero_conta == 007) {
            System.out.println("Tipo de conta: " + "Conta Especial" + "\nNumero da conta: " + contabancaria3.numero + "\nNome do cliente: " + contabancaria3.cliente.nome + "\nSaldo: " + contabancaria3.saldo
                    + "\nLimite: " + contabancaria3.limite);
        } else {
            System.out.println("Numero de conta incorreta!");
        }


    }//main
    public static void operacao(ContaBancaria contabancaria) {
        Scanner sc = new Scanner(System.in);


        int operacao = 10;
        while (operacao != 0) {

            System.out.print("\n1:Saque\n2:Deposito\n3:Transferência\n0:Sair\nSelecione: ");
            operacao = sc.nextInt();

            if (operacao == 1) {
                System.out.print("Valor para saque: R$");
                double valor_saque = sc.nextDouble();
                contabancaria.sacar(valor_saque);
                System.out.println("Saldo atual: R$" + contabancaria.getSaldo());
            } else if (operacao == 2) {
                System.out.print("Valor para deposito: R$");
                double valor_deposito = sc.nextDouble();
                contabancaria.depositar(valor_deposito);
                System.out.println("Saldo atual: R$" + contabancaria.getSaldo());
            } else if (operacao == 3) {
                System.out.println("Digite o numero da conta que deseja executar a transferência: ");
                int numero_conta_transferencia = sc.nextInt();
                System.out.print("Valor para transferencia: R$");
                double valor_transferencia = sc.nextDouble();
                contabancaria.depositar(valor_transferencia);
                System.out.println("Saldo atual: R$" + contabancaria.getSaldo());
            } else {
                System.out.println("Obrigado por utilizar o sistema!");
            }

        }
    }
}
