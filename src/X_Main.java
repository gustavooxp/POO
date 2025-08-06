public class X_Main {
    public static void main(String[] args) {


        X_Funcionario funcionario;

        funcionario = new X_Funcionario("Gustavo", 1500);



        String dados_funcionario = funcionario.toString();

        System.out.println(dados_funcionario);
    }
}
