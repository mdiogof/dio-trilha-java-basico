public class Familia extends Inteiro{
    public static double getValor(int pessoas) {
        if (pessoas < 3) {
            return valor * pessoas;
        } else {
            return valor * pessoas * 0.95;
        }
    }
}
