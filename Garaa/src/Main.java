import static utility.Tools.*;
import static FrontScreen.FrontEnd.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String[] opzioni={"Gestione Gara", "1-Inserisci Pilota", "2-Visualizza Piloti", "3-Inserisci Scuderia", "4-Visualizza Scuderia", "5-Corri Gara", "6-Finisci Gara", "7-Esci"};
        ArrayList<Pilota> Piloti= new ArrayList<>();
        boolean esci=false;

        do{
            switch(Menu(opzioni,sc))
            {
                case 1 ->
                {
                    Piloti.add(p);
                }
                case 2 ->
                {

                }
                case 3 ->
                {

                    System.out.println("Inserisci scuderia: ");
                    Scuderia s = new Scuderia(sc.nextLine(), p, sc.nextInt());
                }
                case 4 ->
                {

                }
                case 5 ->
                {

                }
                case 6 ->
                {

                }
                case 7 -> {
                    esci = true;
                    System.out.println("Fine del programma.");
                }
            }
        }while(!esci);
    }
    public void visualizzaPilota (ArrayList<Pilota> Piloti)
    {
        Piloti.forEach(pilota -> System.out.println(pilota.toString()));
    }
}