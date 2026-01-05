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

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        ArrayList<Filme> listaFilmes = new ArrayList<>();
        ArrayList<Serie> listaSeries = new ArrayList<>();

        Filme meuFilme = new Filme("Alto da compadecida", 2002, 30, "Guel Arraes");
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        meuFilme.exibirFichaTecnica();
        filtro.filtraPorClassificacao(meuFilme);


        Serie minhaSerie = new Serie("Breaking Bad", 5, 2008, 13, 45, false);
        minhaSerie.avalia(10);
        minhaSerie.exibirFichaTecnica();
        filtro.filtraPorClassificacao(minhaSerie);

        calcula.somaTempo(meuFilme);
        calcula.somaTempo(minhaSerie);

        listaFilmes.add(meuFilme);

        listaSeries.add(minhaSerie);

        System.out.println(listaFilmes);
        System.out.println(listaSeries);

        System.out.println("Tempo total da sua lista: " + calcula.getTempoTotal() + " minutos");
    }
}