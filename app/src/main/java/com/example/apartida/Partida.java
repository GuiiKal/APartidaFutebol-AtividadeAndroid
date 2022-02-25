package com.example.apartida;

public class Partida {
    private int placarTimeA, placarTimeB, publico;
    private String data;

    //contrutor
    public Partida(int placarTimeA, int placarTimeB, int publico, String data) {
        this.placarTimeA = placarTimeA;
        this.placarTimeB = placarTimeB;
        this.publico = publico;
        this.data = data;
    }

    //getters
   public int getPlacarTimeA() {
        return placarTimeA;
    }

    public int getPlacarTimeB() {
        return placarTimeB;
    }

    public int getPublico() {
        return publico;
    }

    public String getData() {
        return data;
    }

    //método
    public String mostrarDadosPartida(){
        return "Placar: " + getPlacarTimeA() + " X " + getPlacarTimeB() +  "\nPúblico: " + getPublico() + "\nData: " + getData() ;
    }
}
