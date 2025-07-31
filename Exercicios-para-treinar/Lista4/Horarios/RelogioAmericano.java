public class RelogioAmericano extends Relogio {
    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void setRelogio(Relogio r) {
        if (r.getHora() >= 1 && r.getHora() <= 12) {
            this.hora = r.getHora();
            this.minuto = r.getMinuto();
            this.segundo = r.getSegundo();
        } else {
            System.out.println("Hora inválida para relógio americano.");
        }
    }
}
