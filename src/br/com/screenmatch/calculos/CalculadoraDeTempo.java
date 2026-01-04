package br.com.screenmatch.calculos;

import br.com.screenmatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;


    public void somaTempo(Titulo titulo){
        if (titulo.getDuracaoEmMinutos() > 0){
            this.tempoTotal += titulo.getDuracaoEmMinutos();
        }
    }


    public int getTempoTotal() {
        return tempoTotal;
    }
}
