package br.com.screenmatch.model;



import br.com.screenmatch.calculos.CalculaEstrelas;

public class Filme extends Titulo {
    private String diretor;

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, String diretor) {
        super(nome, anoDeLancamento);
        setDuracaoEmMinutos(duracaoEmMinutos);
        this.diretor = diretor;
    }


    @Override
    public String toString() {
        return "Filme: " + getNome() + " (" + getAnoDeLancamento() + "), dirigido por " + diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}