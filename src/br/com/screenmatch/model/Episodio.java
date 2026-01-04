package br.com.screenmatch.model;

import br.com.screenmatch.calculos.CalculaEstrelas;

import static java.lang.Math.random;

public class Episodio implements CalculaEstrelas {

    @Override
    public double getCalculaEstrelas() {
        return random() * 5;
    }

    private int numero;
    private String nome;
    private Serie serie;




    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}
