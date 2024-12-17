import java.util.ArrayList;

public class Gara {

    private String nome;
    private String nazione;
    private ArrayList<Scuderia> griglia = new ArrayList<>();
    private Cronometro cronometro;
    private String vincitore;
    private int numeroSquadra;

    public Gara(String nome, String nazione) {
        this.nome = nome;
        this.nazione = nazione;
    }

    public String getNome() {
        return nome;
    }

    public String getNazione() {
        return nazione;
    }

    public ArrayList<Scuderia> getGriglia() {
        return griglia;
    }

    public String getVincitore() {
        return vincitore;
    }

    public void setCronometro(Cronometro cronometro) {
        this.cronometro = cronometro;
    }

}
