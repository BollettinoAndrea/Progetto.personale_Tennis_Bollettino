import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestoreTorneo gestore = new GestoreTorneo();

            ArrayList<Giocatore> listaGiocatori = creaGiocatoriDiBase();

            String torneo = gestore.sceltaTorneo(sc);

            gestore.visualizzaVincitori(listaGiocatori, torneo);

            gestore.inserisciNuoviGiocatori(listaGiocatori, 0, sc);

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
        base.add(new Giocatore("Andy Murray", 0, 0, 2, 1, 76, 80, 77)); //giocatore 14
        base.add(new Giocatore("Juan Martìn Del Potro", 0, 0, 0, 1, 70, 70, 72)); //giocatore 15
        base.add(new Giocatore("Fabio Fognini", 0, 0, 0, 0, 54, 33, 45)); //giocatore 16
        base.add(new Giocatore("Adriano Panatta", 0, 1, 0, 0, 65, 50, 55)); //giocatore 17
        base.add(new Giocatore("Dominic Thiem", 0, 0, 0, 1, 76, 50, 65)); //giocatore 18
        base.add(new Giocatore("Mattia Arnaldi", 0, 0, 0, 0, 65, 50, 60)); //giocatore 19
        base.add(new Giocatore("Lorenzo Sonego", 0, 0, 0, 0, 100, 100, 100)); //giocatore 20
        base.add(new Giocatore("David Ferrer", 0, 0, 0, 0, 76, 60, 70)); //giocatore 21
        base.add(new Giocatore("Ben Shelton", 0, 0, 0, 0, 65, 50, 60)); //giocatore 22
        base.add(new Giocatore("Alex De Minaur", 0, 0, 0, 0, 70, 75, 80)); //giocatore 23
        base.add(new Giocatore("Rod Laver", 3, 2, 4, 2, 75, 85, 80)); //giocatore 24
        base.add(new Giocatore("Jimmy Connors", 0, 0, 2, 5, 70, 84, 82)); //giocatore 25
        base.add(new Giocatore("Stefan Edberg", 2, 0, 2, 2, 65, 85, 80)); //giocatore 26
        base.add(new Giocatore("Ivan Lendl", 2, 3, 0, 3, 81, 65, 85)); //giocatore 27
        base.add(new Giocatore("Boris Becker", 2, 0, 3, 1, 55, 85, 75)); //giocatore 28
        base.add(new Giocatore("Guillermo Vilas", 2, 1, 0, 1, 85, 60, 70)); //giocatore 29
        base.add(new Giocatore("ken Rosewall", 4, 2, 0, 2, 75, 85, 78)); //giocatore 30
        base.add(new Giocatore("Mats Wilander", 3, 3, 0, 1, 80, 70, 85)); //giocatore 31
        base.add(new Giocatore("Andrea Bollettino", 0, 0, 0, 0, 99, 99, 99)); //giocatore 32
        return base;
    }
}
