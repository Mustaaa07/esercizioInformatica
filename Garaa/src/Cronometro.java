import java.time.LocalTime;
import java.util.Random;
import static FrontScreen.FrontEnd.*;
public class Cronometro {
    private int endTime;
    private int tempoGiro;
    private Random rn;

    public Cronometro() {
        setStartTime();
        setEndTime();
    }

    void setStartTime() {
        int startTime = 0;
    }

    void setEndTime() {
        rn = new Random();
        endTime = rn.nextInt(1, 120);
    }

    public int getTempoGiro() {
        return tempoGiro;
    }

    void calcolaIntTimer() throws Exception {
        int tempo = 0;
        tempoGiro = this.endTime;
        if (tempoGiro == 0)
            throw new Exception("Cronometro stop");
        this.tempoGiro = tempo;
    }

    @Override
    public String toString() {
        return String.format("Tempo: %d", tempoGiro);
    }
}