public class Cultura implements Calculadora{
    @Override
    public double calcularImposto(double valor) {
        return valor*0.04;
    }
}
