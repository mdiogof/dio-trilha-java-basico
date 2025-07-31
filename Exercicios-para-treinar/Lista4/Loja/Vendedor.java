public class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
        this.quantidadeVendas = 0;
    }

    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println("Venda registrada.");
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    @Override
    public boolean isAdministrador() {
        return false;
    }
}