public class Alimentacao implements Calculadora{
    @Override
    public double calcularImposto(double valor) {
        return valor*0.01;
    }
}
