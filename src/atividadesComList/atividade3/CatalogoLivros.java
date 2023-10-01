package atividadesComList.atividade3;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> list = new ArrayList<>();

        for (Livro livro : livros){
            if(livro.getAutor().equals(autor)){
                list.add(livro);
            }
        }
        return list;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> list = new ArrayList<>();

        for (Livro livro : livros){
            if(livro.getAnoPublicacao() >= anoFinal && livro.getAnoPublicacao() <= anoFinal){
                livros.add(livro);
            }
        }
        return list;
    }

    public Livro pesquisarPorTitulo(String titulo){
        for(Livro livro : livros){
            if(livro.getTitulo().equals(titulo))
                return livro;
        }
        return null;
    }
}
