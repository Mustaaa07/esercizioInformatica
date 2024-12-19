import static FrontScreen.FrontEnd.*;
public class Scuderia implements Comparable<Scuderia> {
    private String nome;
    private Pilota nPilota;
    private Integer tempoGiro;
    private int nAuto;

    public Scuderia(String nome, Pilota nPilota, int nAuto) {
        this.nome = nome;
        this.nPilota = nPilota;
        this.nAuto = nAuto;
    }

    public String getNome() {
        return nome;
    }

    public Pilota getnPilota() {
        return nPilota;
    }

    public int getTempoGiro() {
        return tempoGiro;
    }

    public void setTempoGiro(int tempoGiro) {
        this.tempoGiro = tempoGiro;
    }

    public int getnAuto() {
        return nAuto;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Pilota: %s Tempo giro: %d Numero auto: %d", nome, nPilota.getNome(), tempoGiro, nAuto);
    }

    @Override
    public int compareTo(Scuderia s) {
        return this.tempoGiro.compareTo(s.getTempoGiro());
    }
}
