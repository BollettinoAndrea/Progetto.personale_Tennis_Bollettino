import java.util.ArrayList;
import java.util.Scanner;

public class GestoreTorneo {

    public String sceltaTorneo(Scanner sc) {
        System.out.println("Scegli il torneo da giocare:");
        System.out.println("1 - Australian Open (cemento) ");
        System.out.println("2 - Roland Garros (terra rossa)");
        System.out.println("3 - Wimbledon (erba)");
        System.out.println("4 - US Open (cemento)");
        int scelta = sc.nextInt();

        switch (scelta) {
            case 1: return "Australian Open";
            case 2: return "Roland Garros";
            case 3: return "Wimbledon";
            case 4: return "US Open";
            default:
                System.out.println("Scelta non valida, verrà selezionato di default l'Australian Open");
                return "Australian Open";
        }
    }

    public void visualizzaVincitori(ArrayList<Giocatore> lista, String torneo) {
        System.out.println("Vincitori dello Slam " + torneo + ":");
        for (Giocatore g : lista) {
            int numeroVittorie = 0;
            switch (torneo) {
                case "Australian Open": numeroVittorie = g.getAustralianOpen(); break;
                case "Roland Garros":   numeroVittorie = g.getRolandGarros();   break;
                case "Wimbledon":      numeroVittorie = g.getWimbledon();       break;
                case "US Open":        numeroVittorie = g.getUsOpen();          break;
            }
            if (numeroVittorie > 0) {
                System.out.println(g.getNome() + " - " + numeroVittorie + " titoli");
            }
        }
        System.out.println("--------------------------------------");
    }

    public void inserisciNuoviGiocatori(ArrayList<Giocatore> lista, int quanti, Scanner sc) {
        sc.nextLine();
        for (int i = 0; i < quanti; i++) {
            System.out.println("Inserisci il nome del giocatore n. " + (i+1) + ":");
            String nome = sc.nextLine();

            System.out.println("Inserisci la percentuale di vittoria su Terra rossa (0-100):");
            double pTerra = sc.nextDouble();
            System.out.println("Inserisci la percentuale di vittoria su Erba (0-100):");
            double pErba = sc.nextDouble();
            System.out.println("Inserisci la percentuale di vittoria su Cemento (0-100):");
            double pCemento = sc.nextDouble();
            sc.nextLine();

            Giocatore nuovo = new Giocatore(nome, pTerra, pErba, pCemento);
            lista.add(nuovo);
        }
    }

    public void simulaTorneo(ArrayList<Giocatore> lista, String torneo) {
        ArrayList<Giocatore> partecipanti = new ArrayList<>(lista);

        while (partecipanti.size() > 1) {
            ArrayList<Giocatore> vincitori = new ArrayList<>();

            while (partecipanti.size() > 1) {
                Giocatore g1 = estraiGiocatoreCasuale(partecipanti);
                Giocatore g2 = estraiGiocatoreCasuale(partecipanti);

                Giocatore vincitore = giocaMatch(g1, g2, torneo);
                vincitori.add(vincitore);
            }
            if (partecipanti.size() == 1) {
                vincitori.add(partecipanti.remove(0));
            }

            partecipanti = vincitori;
        }

        Giocatore campione = partecipanti.get(0);
        System.out.println("Il vincitore di " + torneo + " è: " + campione.getNome());

        switch (torneo) {
            case "Australian Open":
                campione.setAustralianOpen(campione.getAustralianOpen() + 1);
                break;
            case "Roland Garros":
                campione.setRolandGarros(campione.getRolandGarros() + 1);
                break;
            case "Wimbledon":
                campione.setWimbledon(campione.getWimbledon() + 1);
                break;
            case "US Open":
                campione.setUsOpen(campione.getUsOpen() + 1);
                break;
        }
    }

    public Giocatore giocaMatch(Giocatore g1, Giocatore g2, String torneo) {
        double p1 = 0, p2 = 0;

        switch (torneo) {
            case "Australian Open": // cemento
            case "US Open": // cemento
                p1 = g1.getPercentCemento();
                p2 = g2.getPercentCemento();
                break;
            case "Roland Garros": // terra
                p1 = g1.getPercentTerra();
                p2 = g2.getPercentTerra();
                break;
            case "Wimbledon": // erba
                p1 = g1.getPercentErba();
                p2 = g2.getPercentErba();
                break;
        }

        double random = Math.random() * (p1 + p2);

        if (random < p1) {
            return g1;
        } else {
            return g2;
        }
    }

    private Giocatore estraiGiocatoreCasuale(ArrayList<Giocatore> lista) {
        int indiceCasuale = (int)(Math.random() * lista.size());
        return lista.remove(indiceCasuale);
    }
}