package com.production.tce1.Problema1;

public class Cliente {
    public static void main(String[] args){
        Navio[] arrayNavio = new Navio[3];

        arrayNavio[0]= new Navio("Titanic", "26-06-1973");
        arrayNavio[1] = new Cruzeiro("Astros", "19-02-2003", 10000);
        arrayNavio[2] = new Cargueiro("Royal Fortune", "27-07-1986", 600000);
  
        for (Navio navio : arrayNavio) {
            System.out.println(navio.toString());
        }
    }
}

