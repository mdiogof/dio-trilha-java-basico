public class Gerente extends Usuario {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public void gerarRelatorioFinanceiro(double valorCaixaTotal) {
        System.out.println("Relatório: valor em caixa geral: R$" + valorCaixaTotal);
    }

    @Override
    public boolean isAdministrador() {
        return true;
    }
}