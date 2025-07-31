public class Atendente extends Usuario {
    private double valorCaixa;
    private boolean caixaFechado = false;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha);
        this.valorCaixa = 0;
    }

    public void receberPagamento(double valor) {
        valorCaixa += valor;
        System.out.println("Pagamento recebido: R$" + valor);
    }

    public void fecharCaixa() {
        System.out.println("Valor total em caixa: R$" + valorCaixa);
        caixaFechado = true;
    }

    public boolean isCaixaFechado() {
        return caixaFechado;
    }

    @Override
    public boolean isAdministrador() {
        return false;
    }
}

