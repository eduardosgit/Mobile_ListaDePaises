package listapaises.eduardo.com;

public class Pais {
    private String nome;
    private int rank;
    private int pop;
    private int bandeira;

    public Pais(String nome, int rank, int pop, int bandeira) {
        this.nome = nome;
        this.rank = rank;
        this.pop = pop;
        this.bandeira = bandeira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public int getBandeira() {
        return bandeira;
    }

    public void setBandeira(int bandeira) {
        this.bandeira = bandeira;
    }
}