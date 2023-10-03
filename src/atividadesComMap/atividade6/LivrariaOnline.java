package atividadesComMap.atividade6;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    private Map<String, Livro> livros;

    public LivrariaOnline() {
        livros = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livros.put(link,new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        if(!livros.isEmpty()){
            livros.remove(titulo);
        }
    }

    public void exibirLivrosOrdenadosPorPreco(){
        Map<String, Livro> mapOrdenado = new TreeMap<>(livros);
        System.out.println(mapOrdenado);
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosUnicoAutor = new HashMap<>();

        for (Map.Entry<String, Livro> l : livros.entrySet()){
            if(l.getValue().getAutor().equalsIgnoreCase(autor)){
                livrosUnicoAutor.put(l.getKey(),l.getValue());
            }
        }
        return livrosUnicoAutor;
    }

    public Map<String, Livro> obterLivroMaisCaro(){
        Map<String, Livro> livroCaro = new HashMap<>();
        double maiorValor = 0D;

        for (Map.Entry<String, Livro> l : livros.entrySet()){
            if(l.getValue().getPreco() > maiorValor){
                maiorValor = l.getValue().getPreco();
                livroCaro.put(l.getKey(),l.getValue());
            }
        }
        return livroCaro;
    }

    public Map<String, Livro> exibirLivroMaisBarato(){
        Map<String, Livro> livroBarato = new HashMap<>();
        double menorValor = Double.MAX_VALUE;

        for (Map.Entry<String, Livro> l : livros.entrySet()){
            if(l.getValue().getPreco() < menorValor){
                menorValor = l.getValue().getPreco();
                livroBarato.put(l.getKey(),l.getValue());
            }
        }
        return livroBarato;
    }

    public static void main(String[] args){
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://www.amazon.com.br/Java-Efetivo","Java efetivo",
                "Joshua Bloch",117.00);
        livrariaOnline.adicionarLivro("https://www.amazon.com.br/Java","Java: Como Programar","P.J. Deitel",
                365.25);
        livrariaOnline.adicionarLivro("https://www.amazon.com.br/Java-para-Iniciantes-Programas-Rapidamente","Java para Iniciantes",
                "Herbert SchildtHerbert Schildt",99.99);
        livrariaOnline.adicionarLivro("https://www.amazon.com.br/Use-cabe%C3%A7a-Java-Bert-Bates",
                "Use a cabeça! Java","Bert BatesBert Bates",224);
        livrariaOnline.adicionarLivro("https://www.amazon.com.br/gp/product/0596007124",
                "Head First Design Patterns","Bert Bates",697.95);

        livrariaOnline.exibirLivrosOrdenadosPorPreco();
    }
}
