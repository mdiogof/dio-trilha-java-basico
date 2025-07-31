public abstract class Relogio {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() { return hora; }
    public int getMinuto() { return minuto; }
    public int getSegundo() { return segundo; }

    public void setHora(int hora) { this.hora = hora; }
    public void setMinuto(int minuto) { this.minuto = minuto; }
    public void setSegundo(int segundo) { this.segundo = segundo; }

    public String retornarHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public abstract void setRelogio(Relogio r);
}
