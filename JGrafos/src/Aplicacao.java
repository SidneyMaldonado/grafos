import java.util.List;
import java.util.Scanner;

public class Aplicacao {


    public static void main(String[ ] args){

        System.out.println("Aplicação de Teste de Grafos");
        Arquivo arquivo = new Arquivo( "C:\\Grafos\\");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo:");
        String nome = teclado.nextLine();
        List<String> conteudo = arquivo.lerArquivo(nome);

        System.out.println("-----------------------------------");
        for(String linha: conteudo){
            System.out.println(linha);
        }
        System.out.println("------------------------------------");

        Grafo grafo = new Grafo(conteudo);
        System.out.println("-----------------------------------");
        for(String linha: grafo.vertices){
            System.out.println(linha);
        }


        return;
    }



}
