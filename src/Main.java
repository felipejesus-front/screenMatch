//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "Alto da compadecida";
        meuFilme.duracaoEmMinutos = 30;
        meuFilme.anoDeLancamento = 2002;

        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);
        meuFilme.avalia(7);

        meuFilme.exibirFichaTecnica();
    }
}