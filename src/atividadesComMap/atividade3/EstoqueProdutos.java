package atividadesComMap.atividade3;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> produtos;

    public EstoqueProdutos() {
        produtos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        produtos.put(cod,new Produto(nome,quantidade,preco));
    }

    public void exibirProdutos(){
        System.out.println(produtos);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0D;
        for(Map.Entry<Long, Produto> p : produtos.entrySet()){
            valorTotal += p.getValue().getPreco() * p.getValue().getQuantidade();
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        double maiorPreco = 0D;
        Produto produto = new Produto();
        for (Map.Entry<Long, Produto> p : produtos.entrySet()){
            if(p.getValue().getPreco() > maiorPreco){
                maiorPreco = p.getValue().getPreco();
                produto = p.getValue();
            }
        }
        return produto;
    }

    public Produto obterProdutoMaisBarato(){
        double menorPreco = 10.0;
        Produto produto = new Produto();

        for (Map.Entry<Long, Produto> p : produtos.entrySet()){
            if(p.getValue().getPreco() < menorPreco){
                menorPreco = p.getValue().getPreco();
                produto = p.getValue();
            }
        }
        return produto;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        double maiorTotal = 0D;
        Produto produto = new Produto();

        for(Map.Entry<Long, Produto> p : produtos.entrySet()){
            if((p .getValue().getPreco() * p.getValue().getQuantidade()) > maiorTotal){
                maiorTotal = p .getValue().getPreco() * p.getValue().getQuantidade();
                produto = p.getValue();
            }
        }
        return produto;
    }

    public static void main(String[] args){
        System.out.println();
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L,"Produto1", 10, 8.99);
        estoqueProdutos.adicionarProduto(2L,"Produto2", 8, 9.99);
        estoqueProdutos.adicionarProduto(3L,"Produto3", 20, 10.00);
        estoqueProdutos.adicionarProduto(4L,"Produto4", 11, 5.99);
        estoqueProdutos.adicionarProduto(5L,"Produto5", 5, 1.99);

        estoqueProdutos.exibirProdutos();

        System.out.println("\n--------------------------------\n");
        System.out.println("Valor total do estoque: R$ "+String.format("%.2f",estoqueProdutos.calcularValorTotalEstoque()));

        System.out.println("\n--------------------------------\n");

        System.out.println("O produto mais caro é o:");
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());

        System.out.println("\n--------------------------------\n");

        System.out.println("O produto mais barato é o:");
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());

        System.out.println("\n--------------------------------\n");

        System.out.println("O Produto com maior quantidade em valor total no estoque:");
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
