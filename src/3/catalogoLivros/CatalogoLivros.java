package catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<catalogoLivros.Livro> livros;

    public CatalogoLivros() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new catalogoLivros.Livro(titulo, autor, anoPublicacao));
    }

    public List<catalogoLivros.Livro> pesquisarPorAutor(String autor){
        List<catalogoLivros.Livro> list = new ArrayList<>();

        for (catalogoLivros.Livro livro : livros){
            if(livro.getAutor().equals(autor)){
                list.add(livro);
            }
        }
        return list;
    }

    public List<catalogoLivros.Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<catalogoLivros.Livro> list = new ArrayList<>();

        for (catalogoLivros.Livro livro : livros){
            if(livro.getAnoPublicacao() >= anoFinal && livro.getAnoPublicacao() <= anoFinal){
                livros.add(livro);
            }
        }
        return list;
    }

    public catalogoLivros.Livro pesquisarPorTitulo(String titulo){
        for(catalogoLivros.Livro livro : livros){
            if(livro.getTitulo().equals(titulo))
                return livro;
        }
        return null;
    }
}
