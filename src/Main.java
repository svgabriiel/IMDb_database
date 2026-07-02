import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<TitleBasic> titles = TitleBasicLoader.load("DatabaseTeste/title.basics.sample.tsv");
            System.out.println("Registros carregados: " + titles.size());

            System.out.println("\n--- Primeiros 5 registros ---");
            for (int i = 0; i < 5 && i < titles.size(); i++) {
                System.out.println(titles.get(i));
            }

            long movies = titles.stream().filter(t -> "movie".equals(t.getTitleType())).count();
            long shorts = titles.stream().filter(t -> "short".equals(t.getTitleType())).count();
            System.out.println("\nFilmes: " + movies + ", Curtas: " + shorts);

        } catch (IOException e) {
            System.err.println("Erro ao carregar o arquivo: " + e.getMessage());
        }
    }
}
