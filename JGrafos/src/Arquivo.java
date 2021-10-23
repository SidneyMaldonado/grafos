import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arquivo {

    public String pastaBase;

    public Arquivo(String pasta){
        this.pastaBase = pasta;
    }
    public List<String> lerArquivo(String nome){

        // compor o nome arquivo
        String arquivo = pastaBase + nome;
        List<String> conteudo = new ArrayList<>();

        // ler o arquivo
        try {
            FileReader file = new FileReader(arquivo);
            Scanner entrada = new Scanner(file);
            while (entrada.hasNext()){
                conteudo.add(entrada.nextLine());
            }
            entrada.close();
            return conteudo;
        } catch (Exception e){
            return null;
        }
    }

}
