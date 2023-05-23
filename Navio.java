public class Navio{

    protected String nome;
    protected String anoConstruido;


    public Navio(String nome, String anoConstruido) {
        this.nome = nome;
        this.anoConstruido = anoConstruido;
    }
    
    public String getNavio(){
        return anoConstruido;
    }

    public void setNavio(String nome){
        this.nome = nome;
    }

    public String toString() {
        return "Nome: "+ nome + " || Ano: " + anoConstruido;
    }
}