public class Torneo {


    public Torneo(String nome, int ao, int rg, int w, int uso,
                     double pTerra, double pErba, double pCemento) {

    }

    public Torneo(String nome, double pTerra, double pErba, double pCemento) {
        this(nome, 0, 0, 0, 0, pTerra, pErba, pCemento);
    }

}
