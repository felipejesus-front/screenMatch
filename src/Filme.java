import java.util.List;

public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    List<Double> avaliacoes = new java.util.ArrayList<>();
    int totalAvaliacao;
    int duracaoEmMinutos;

    void exibirFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " +  anoDeLancamento);
        System.out.println("Avaliação do filme: " + avaliacoes);
        System.out.println("Total de avaliações: " + totalAvaliacao);
    }

    void avalia(double nota){
        totalAvaliacao++;
        avaliacoes.add(nota);


        double somaAvaliacoes = avaliacoes.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        double media = somaAvaliacoes / totalAvaliacao;
        System.out.println("Avaliação adicionada: " + nota);
        System.out.println("Média de avaliações: " + media);
    }

}