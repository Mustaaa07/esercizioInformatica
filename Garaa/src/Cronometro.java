import java.time.LocalTime;

public class Cronometro {
    private LocalTime startTime;
    private LocalTime endTime;
    private int tempoGiro;

    public Cronometro() {
        setStartTime();
        setEndTime();
    }

    void setStartTime() {
        startTime = LocalTime.now();
    }

    void setEndTime() {
        endTime = LocalTime.now();
    }

    public int getTempoGiro() {
        return tempoGiro;
    }

    void calcolaIntTimer() throws Exception {
        int tempo = 0;
        tempoGiro = this.endTime.toSecondOfDay() - this.startTime.toSecondOfDay();
        if (tempoGiro == 0)
            throw new Exception("Cronometro stop");
        this.tempoGiro = tempo;
    }

    @Override
    public String toString() {
        return String.format("Tempo: %d", tempoGiro);
    }
}