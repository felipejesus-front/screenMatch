package br.com.screenmatch.model;



import br.com.screenmatch.calculos.CalculaEstrelas;

public class Filme extends Titulo {
    private String diretor;

    public Filme() {
        super("filme");
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}