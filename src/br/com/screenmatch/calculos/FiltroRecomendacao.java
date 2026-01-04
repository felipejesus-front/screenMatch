package br.com.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtraPorClassificacao(CalculaEstrelas item){
        double estrelas = item.getCalculaEstrelas();
        if (estrelas >= 4){
            recomendacao = "Muito Bom";
        } else if (estrelas >= 2){
            recomendacao = "Bom";
        } else {
            recomendacao = "Ruim";
        }
        System.out.println("Classificação: " + recomendacao + " (" + estrelas + " estrelas)");
    }
}
