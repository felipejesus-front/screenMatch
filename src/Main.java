import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.model.Filme;
import br.com.screenmatch.model.Serie;
import br.com.screenmatch.model.Titulo;
import br.com.screenmatch.model.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.IOException;
import java.lang.reflect.Array;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).
                create();
        Scanner leitura = new Scanner(System.in);
        String apiKey = System.getenv("OMDB_API_KEY");

        if (apiKey == null) {
            throw new IllegalStateException("OMDB_API_KEY não configurada, adicione uma variável de ambiente com sua chave da API do OMDB.");
        }

        System.out.println("Digite o nome do filme ou série que deseja buscar:");
        String busca = leitura.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey="+ apiKey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(java.net.URI.create(endereco))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

//        Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        TituloOMDB meuTituloOMDB = gson.fromJson(json, TituloOMDB.class);


        Titulo meuTitulo = new Titulo(meuTituloOMDB);

        System.out.println(meuTitulo);









        CalculadoraDeTempo calcula = new CalculadoraDeTempo();

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        ArrayList<Titulo> listaTitulos = new ArrayList<>();

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

        listaTitulos.add(meuFilme);

        listaTitulos.add(minhaSerie);

        System.out.println(listaTitulos);

        System.out.println("Tempo total da sua lista: " + calcula.getTempoTotal() + " minutos");
    }
}