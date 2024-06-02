package Tools;

import java.util.Scanner;

public class Utility {
    public static void ClrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Wait(int x) {
        try {
            Thread.sleep(1000 * x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int menu(String[] opzioni, Scanner keyboard) {
        int scelta;

        do {
            ClrScr();
            System.out.println("=== " + opzioni[0] + " ===");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println(opzioni[i]);
            }
            scelta = Integer.parseInt(keyboard.nextLine());
            if (scelta < 1 || scelta > opzioni.length - 1) {
                System.out.println("Valore errato. Riprova");
                Wait(3);
            }
        } while (scelta < 1 || scelta > opzioni.length - 1);

        return scelta;
    }
   /* public static Persona LeggiContatto(boolean telSi, Scanner tastiera) {
        Persona contatto = new Persona();


        System.out.println("Inserici il nome");
        contatto.nome = tastiera.nextLine();
        System.out.println("Inserici il cognome");
        contatto.cognome = tastiera.nextLine();
        if (telSi) {
            System.out.println("Inserici il numero di telefono");
            contatto.numDiTelefono = tastiera.nextLine();
            String[] opzioni = {"TipoAbbonamento", "1-cellulare", "2-abitazione", "3-azienda"};
            int scelta;
            do {
                scelta = menu(opzioni, tastiera);
                switch (scelta) {
                    case 1 -> contatto.tipo = Tipologia.cellulare;
                    case 2 -> contatto.tipo = Tipologia.abitazione;
                    case 3 -> contatto.tipo = Tipologia.azienda;
                }

            } while (scelta > 3 || scelta < 1);
        }

        return contatto;
    }*/
}
