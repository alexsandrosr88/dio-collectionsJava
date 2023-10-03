package atividadesComMap.atividade2;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavras;

    public Dicionario() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavras.put(palavra,definicao);
    }

    public void removerPalavra(String palavra){
        if(!palavras.isEmpty()){
            palavras.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(palavras);
    }

    public String pesquisarPorPalavra(String palavra){
        if(!palavras.isEmpty()){
            return palavras.get(palavra);
        }
        return null;
    }

    public static void main(String[] args){
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Java", "Java é uma linguagem de programação orientada a objetos" +
                " desenvolvida na década de 90 por uma equipe de programadores chefiada por James Gosling, " +
                "na empresa Sun Microsystems, que em 2008 foi adquirido pela empresa Oracle Corporation.");

        dicionario.adicionarPalavra("Python", "Python é uma linguagem de programação de alto nível," +
                " interpretada de script, imperativa, orientada a objetos, funcional, de tipagem dinâmica e forte. " +
                "Foi lançada por Guido van Rossum em 1991.");

        dicionario.adicionarPalavra("C#", "C# é uma linguagem de programação, multiparadigma, de " +
                "tipagem forte, desenvolvida pela Microsoft como parte da plataforma .NET. A sua sintaxe orientada a" +
                " objetos foi baseada no C++ mas inclui muitas influências de outras linguagens de programação," +
                " como Object Pascal e, principalmente, Java.");

        dicionario.exibirPalavras();

        System.out.println("\n-----------------------------------------\n");
        System.out.println("Pesquisa pela palavra Python");

        System.out.println(dicionario.pesquisarPorPalavra("Python"));


        System.out.println("\n-----------------------------------------\n");

        System.out.println("Removido a palavra Python\n");
        dicionario.removerPalavra("Python");

        dicionario.exibirPalavras();

    }
}
