public class Cruzeiro extends Navio{

    private int numeroMaxPassageiros;

    public Cruzeiro(String nome, String anoConstruido, int numeroMaxPassageiros) {
        super(nome, anoConstruido);
        this.numeroMaxPassageiros = numeroMaxPassageiros;
    }

    public int getNumeroMaxPassageiros() {
        return numeroMaxPassageiros;
    }

    public void setNumeroMaxPassageiros(int numeroMaxPassageiros) {
        this.numeroMaxPassageiros = numeroMaxPassageiros;
    }


    public String toString(){
        return "Nome: "+ nome + " || Capacidade Passageiros: " + numeroMaxPassageiros;
    }
}
