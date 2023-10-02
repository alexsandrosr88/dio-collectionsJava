package atividadesComSet.atividade5;

import java.util.*;

public class CadastroProdutos {

    private Set<Produto> listaProdutos;

    public CadastroProdutos() {
        listaProdutos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        listaProdutos.add(new Produto(cod, nome, preco, quantidade));
    }

    public void exibirProdutosPorNome(){
       Set<Produto> list = new TreeSet<>(listaProdutos);
        System.out.println(list);
    }

    public void exibirProdutosPorPreco(){
        Set<Produto> list = new TreeSet<>(new ProdutoOrdenadoPorPreco());
        list.addAll(listaProdutos);
        System.out.println(list);
    }
    public static void main(String[] args){
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(1,"Produto1",23.90,10);
        produtos.adicionarProduto(2,"Produto2",24.90,10);
        produtos.adicionarProduto(3,"Produto3",26.90,7);
        produtos.adicionarProduto(4,"Produto4",22.90,8);
        produtos.adicionarProduto(5,"Produto5",21.90,11);

        System.out.println("\nProdutos sem ordem");
        for (Produto p : produtos.listaProdutos){
            System.out.println(p);
        }
        System.out.println("\n---------------");
        System.out.println("\nProdutos ordenados por nome");

        produtos.exibirProdutosPorNome();

        System.out.println("\n---------------\n");
        System.out.println("Produtos ordenados por preço");

        produtos.exibirProdutosPorPreco();
    }
}
