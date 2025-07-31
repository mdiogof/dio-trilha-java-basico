public class RelogioBrasileiro extends Relogio {
    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void setRelogio(Relogio r) {
        if (r.getHora() >= 0 && r.getHora() <= 23) {
            this.hora = r.getHora();
            this.minuto = r.getMinuto();
            this.segundo = r.getSegundo();
        } else {
            System.out.println("Hora inválida para relógio brasileiro.");
        }
    }
}
