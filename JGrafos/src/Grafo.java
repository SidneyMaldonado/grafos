import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Grafo {

    public List<String> arestasSaida;
    public List<String> arestasEntrada;
    public List<String> vertices;


    public Grafo(List<String> conteudo) {

        arestasEntrada = new ArrayList<>();
        arestasSaida = new ArrayList<>();
        vertices = new ArrayList<>();

        lerArestas(conteudo);
        lerVertices(conteudo);

    }

    private void lerVertices(List<String> conteudo) {

        Boolean ativado = false;
        for(String linha: conteudo){

            if (linha.equals("Arestas")){
                ativado = false;
            }
            if (ativado){
                this.vertices.add(linha);
            }
            if (linha.equals("Vertices")){
                ativado = true;
            }

        }
    }

    private void lerArestas(List<String> conteudo) {

        Boolean ativado = false;

        for(String linha: conteudo){
            if (ativado){
                String par[] = linha.split(",");
                arestasSaida.add( par[0]);
                arestasEntrada.add(par[0]);
            }
            if (linha.equals("Arestas")){
                ativado = true;
            }
        }
        return;
    }
}
