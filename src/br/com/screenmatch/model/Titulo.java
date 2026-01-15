package br.com.screenmatch.model;

import br.com.screenmatch.calculos.CalculaEstrelas;
import br.com.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Titulo implements CalculaEstrelas {

    @SerializedName("Title")
    String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    @SerializedName("")
    private boolean incluidoNoPlano;
    private final List<Double> avaliacoes = new ArrayList<Double>();
    private int totalAvaliacao;
    private int duracaoEmMinutos;
    private double mediaAvaliacao;
    private String tituloTipo;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOMDB meuTituloOMDB) {
        this.nome = meuTituloOMDB.title();

        if (meuTituloOMDB.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Ano com mais de 4 caracteres: " + meuTituloOMDB.year());
        }
        this.anoDeLancamento = Integer.parseInt(meuTituloOMDB.year());
        this.duracaoEmMinutos = meuTituloOMDB.runtime().isBlank() ? 0 : Integer.parseInt(meuTituloOMDB.runtime().replace(" min", ""));
    }

    @Override
    public double getCalculaEstrelas() {
        return getMediaAvaliacao() / 2;
    }

    public void exibirFichaTecnica(){
        System.out.println("-----------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " +  anoDeLancamento);
        System.out.println("Avaliação do filme: " + avaliacoes);
        System.out.println("Total de avaliações: " + totalAvaliacao);
        System.out.println("Média de avaliação: " + mediaAvaliacao);
        System.out.println("-----------------------------------");
    }

    public void avalia(double nota){
        totalAvaliacao++;
        avaliacoes.add(nota);

        double somaAvaliacoes = avaliacoes.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        this.mediaAvaliacao = somaAvaliacoes / totalAvaliacao;

    }

    @Override
    public String toString() {
        return "Titulo{" +
                "anoDeLancamento=" + anoDeLancamento +
                ", nome='" + nome + '\'' +
                "duracaoEmMinutos=" + duracaoEmMinutos + '\'' +
                '}';
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

    public String getTituloTipo() {
        return tituloTipo;
    }

    public void setTituloTipo(String tituloTipo) {
        this.tituloTipo = tituloTipo;
    }

}
