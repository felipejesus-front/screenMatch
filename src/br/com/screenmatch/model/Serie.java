package br.com.screenmatch.model;

import br.com.screenmatch.calculos.CalculaEstrelas;

public class Serie extends Titulo  {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean emAndamento;

    public Serie(String nome, int anoDeLancamento,int temporadas,  int episodiosPorTemporada, int minutosPorEpisodio, boolean emAndamento) {
        super(nome, anoDeLancamento);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
        this.emAndamento = emAndamento;

    }


    @Override
    public String toString() {
        return "Série: " + getNome() + " (" + getAnoDeLancamento() + "), " +
                temporadas + " temporadas, " +
                episodiosPorTemporada + " episódios por temporada, " +
                minutosPorEpisodio + " minutos por episódio, " +
                (emAndamento ? "em andamento" : "finalizada");
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isEmAndamento() {
        return emAndamento;
    }

    public void setEmAndamento(boolean emAndamento) {
        this.emAndamento = emAndamento;
    }


}
