package com.production.tce1.Problema1;

public class Navio{

    protected String nome;
    protected String anoConstruido;


    public Navio(String nome, String anoConstruido) {
        this.nome = nome;
        this.anoConstruido = anoConstruido;
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno(){
        return anoConstruido;
    }

    public void setAno(String ano){
        this.anoConstruido = ano;
    }

    public String toString() {
        return "Nome: "+ getNome() + " || Ano: " + getAno();
    }
}