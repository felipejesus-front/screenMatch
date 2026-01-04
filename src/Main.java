import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.model.Filme;
import br.com.screenmatch.model.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalculadoraDeTempo calcula = new CalculadoraDeTempo();
        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        ArrayList<Filme> listaFilmes = new ArrayList<>();
        ArrayList<Serie> listaSeries = new ArrayList<>();

        meuFilme.setNome("Alto da compadecida");
        meuFilme.setDuracaoEmMinutos(30);
        meuFilme.setAnoDeLancamento(2002);

        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.exibirFichaTecnica();
        filtro.filtraPorClassificacao(meuFilme);


        minhaSerie.setNome("Breaking Bad");
        minhaSerie.setTemporadas(5);
        minhaSerie.setEpisodiosPorTemporada(13);
        minhaSerie.setMinutosPorEpisodio(45);
        minhaSerie.setAnoDeLancamento(2002);
        minhaSerie.avalia(10);
        minhaSerie.exibirFichaTecnica();
        filtro.filtraPorClassificacao(minhaSerie);

        calcula.somaTempo(meuFilme);
        calcula.somaTempo(minhaSerie);

        listaFilmes.add(meuFilme);

        listaSeries.add(minhaSerie);

        System.out.println("Tempo total da sua lista: " + calcula.getTempoTotal() + " minutos");

        System.out.println("Filmes na lista: " + listaFilmes.size());
    }
}