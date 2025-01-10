public class Giocatore {
    private String nome;
    private int australianOpen;
    private int rolandGarros;
    private int wimbledon;
    private int usOpen;
    private double percentTerra;
    private double percentErba;
    private double percentCemento;

    public Giocatore(String nome, int ao, int rg, int w, int uso,
                     double pTerra, double pErba, double pCemento) {
        this.nome = nome;
        this.australianOpen = ao;
        this.rolandGarros = rg;
        this.wimbledon = w;
        this.usOpen = uso;
        this.percentTerra = pTerra;
        this.percentErba = pErba;
        this.percentCemento = pCemento;
    }

    public Giocatore(String nome, double pTerra, double pErba, double pCemento) {
        this(nome, 0, 0, 0, 0, pTerra, pErba, pCemento);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getAustralianOpen() { return australianOpen; }
    public void setAustralianOpen(int australianOpen) { this.australianOpen = australianOpen; }

    public int getRolandGarros() { return rolandGarros; }
    public void setRolandGarros(int rolandGarros) { this.rolandGarros = rolandGarros; }

    public int getWimbledon() { return wimbledon; }
    public void setWimbledon(int wimbledon) { this.wimbledon = wimbledon; }

    public int getUsOpen() { return usOpen; }
    public void setUsOpen(int usOpen) { this.usOpen = usOpen; }

    public double getPercentTerra() { return percentTerra; }
    public void setPercentTerra(double percentTerra) { this.percentTerra = percentTerra; }

    public double getPercentErba() { return percentErba; }
    public void setPercentErba(double percentErba) { this.percentErba = percentErba; }

    public double getPercentCemento() { return percentCemento; }
    public void setPercentCemento(double percentCemento) { this.percentCemento = percentCemento; }

    @Override
    public String toString() {
        return "Giocatore{" +
                "nome='" + nome + '\'' +
                ", AO=" + australianOpen +
                ", RG=" + rolandGarros +
                ", W=" + wimbledon +
                ", USO=" + usOpen +
                ", %Terra=" + percentTerra +
                ", %Erba=" + percentErba +
                ", %Cemento=" + percentCemento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Giocatore)) return false;
        Giocatore other = (Giocatore) o;
        return this.nome.equalsIgnoreCase(other.nome);
    }

}