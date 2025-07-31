public class DadosConta {
    private double saldo;
    private double saldoInicial;

    public double getSaldoInicial() {
        return saldoInicial;
    }
    public void setSaldoInicial(double saldo) {
        saldoInicial = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double chequeEspecial() {
        double valor;

        if (saldoInicial <= 500) {
            valor = 50.00;
        } else {
            valor = saldoInicial/2;
        }
        return valor;
    }
}
