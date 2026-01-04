package br.com.screenmatch.model;

import java.util.ArrayList;
import java.util.List;

public class Titulo {

    String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private final List<Double> avaliacoes = new ArrayList<Double>();
    private int totalAvaliacao;
    private int duracaoEmMinutos;
    private double mediaAvaliacao;

    public void exibirFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " +  anoDeLancamento);
        System.out.println("Avaliação do filme: " + avaliacoes);
        System.out.println("Total de avaliações: " + totalAvaliacao);
        System.out.println("Média de avaliação: " + mediaAvaliacao);
    }

    public void avalia(double nota){
        totalAvaliacao++;
        avaliacoes.add(nota);

        double somaAvaliacoes = avaliacoes.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        this.mediaAvaliacao = somaAvaliacoes / totalAvaliacao;

    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public List<Double> getAvaliacoes() {
        return avaliacoes;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double getMediaAvaliacao() {
        return mediaAvaliacao;
    }

    public void setMediaAvaliacao(double mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
