public class Vestuario implements Calculadora{
    @Override
    public double calcularImposto(double valor) {
        return valor*0.025;
    }
}
