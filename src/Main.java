import br.com.screenmatch.model.Filme;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Alto da compadecida");
        meuFilme.setDuracaoEmMinutos(30);
        meuFilme.setAnoDeLancamento(2002);

        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(7);

        meuFilme.exibirFichaTecnica();
    }
}