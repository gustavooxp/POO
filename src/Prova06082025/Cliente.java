package Prova06082025;

public class Cliente {

    String nome;
    String cpf;
    String cnpj;

    public Cliente(String nome, String cpf, String cnpj) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String toString() {
        return "Dados da Conta:\n\n Nome: " + nome + "\nCPF: " + cpf + "\nCNPJ: " + cnpj;
    }

}
