public class X_Gerente extends X_Funcionario{

    public X_Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibir_salario() {
        System.out.println(salario * 0.4 + salario);
            }
}
