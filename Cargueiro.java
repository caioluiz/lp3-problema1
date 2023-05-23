public class Cargueiro extends Navio{

    private int capacidadeCarga;
    
    public Cargueiro(String nome, String anoConstruido, int capacidadeCarga) {
        super(nome, anoConstruido);
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String toString(){
        return "Nome: "+ nome + "  || Capacidada Carga: " + capacidadeCarga;
    }
    
}
