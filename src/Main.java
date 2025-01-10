import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestoreTorneo gestore = new GestoreTorneo();

        ArrayList<Giocatore> listaGiocatori = creaGiocatoriDiBase();

        String torneo = gestore.sceltaTorneo(sc);

        gestore.visualizzaVincitori(listaGiocatori, torneo);

        gestore.inserisciNuoviGiocatori(listaGiocatori, 8, sc);

        gestore.simulaTorneo(listaGiocatori, torneo);

        sc.close();
    }

    private static ArrayList<Giocatore> creaGiocatoriDiBase() {
        ArrayList<Giocatore> base = new ArrayList<>();

        base.add(new Giocatore("Jannik Sinner", 1, 0, 0, 1, 74, 76, 78)); //giocatore 1
        base.add(new Giocatore("Carlos Alcaraz", 0, 1, 2, 1, 86, 90, 80)); //giocatore 2
        base.add(new Giocatore("Danil Medvedev", 0, 0, 0, 1, 50, 65, 80)); //giocatore 3
        base.add(new Giocatore("Stan Wawrinka", 1, 1, 0, 1, 65, 50, 70)); //giocatore 4
        base.add(new Giocatore("Novak Djokovic", 10, 3, 7, 4, 80, 85, 84)); //giocatore 5
        base.add(new Giocatore("Rafa Nadal", 2, 14, 2, 4, 92, 78, 78)); //giocatore 6
        base.add(new Giocatore("Roger Federer", 6, 1, 8, 5, 76, 87, 83)); //giocatore 7
        base.add(new Giocatore("Paolo Canè", 0, 0, 0, 0, 55, 45, 50)); //giocatore 8
        base.add(new Giocatore("Bjorn Borg", 0, 6, 5, 0, 86, 82, 70)); //giocatore 9
        base.add(new Giocatore("Matteo Berrettini", 0, 0, 0, 0, 90, 80, 50)); //giocatore 10
        base.add(new Giocatore("John McEnroe", 0, 0, 3, 4, 70, 86, 82)); //giocatore 11
        base.add(new Giocatore("Pete Sampras", 2, 0, 7, 5, 64, 90, 80)); //giocatore 12
        base.add(new Giocatore("Andre Agassi", 4, 1, 1, 2, 70, 75, 79)); //giocatore 13
        base.add(new Giocatore("Giocatore1", 1, 0, 0, 1, 60, 50, 70)); //giocatore 14
        base.add(new Giocatore("Giocatore1", 1, 0, 0, 1, 60, 50, 70)); //giocatore 15
        base.add(new Giocatore("Giocatore1", 1, 0, 0, 1, 60, 50, 70)); //giocatore 16
        base.add(new Giocatore("Giocatore1", 1, 0, 0, 1, 60, 50, 70)); //giocatore 17
        base.add(new Giocatore("Giocatore1", 1, 0, 0, 1, 60, 50, 70)); //giocatore 18
        base.add(new Giocatore("Giocatore1", 1, 0, 0, 1, 60, 50, 70)); //giocatore 19
        base.add(new Giocatore("Giocatore1", 1, 0, 0, 1, 60, 50, 70)); //giocatore 20
        base.add(new Giocatore("Giocatore1", 1, 0, 0, 1, 60, 50, 70)); //giocatore 21
        base.add(new Giocatore("Giocatore1", 1, 0, 0, 1, 60, 50, 70)); //giocatore 22
        base.add(new Giocatore("Giocatore1", 1, 0, 0, 1, 60, 50, 70)); //giocatore 23
        base.add(new Giocatore("Giocatore1", 1, 0, 0, 1, 60, 50, 70)); //giocatore 24


























        for (int i = 5; i <= 24; i++) {
            base.add(new Giocatore("Giocatore" + i,
                    (int)(Math.random()*2),    // AustralianOpen
                    (int)(Math.random()*2),    // RolandGarros
                    (int)(Math.random()*2),    // Wimbledon
                    (int)(Math.random()*2),    // USOpen
                    Math.random()*100,         // percentTerra
                    Math.random()*100,         // percentErba
                    Math.random()*100));       // percentCemento
        }
        return base;
    }
}