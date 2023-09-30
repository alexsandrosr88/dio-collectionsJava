package carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<carrinhoCompras.Item> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(carrinhoCompras.Item item){
        itens.add(item);
    }

    public carrinhoCompras.Item pesquisaItemPorNome(String nome){
        for(carrinhoCompras.Item item : itens){
            if(item.getNome().equals(nome))
                return item;
        }
        return null;
    }
    public void remoteItem(String nome){
        carrinhoCompras.Item item = pesquisaItemPorNome(nome);
        if(item != null){
            itens.remove(item);
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0D;
        for (carrinhoCompras.Item item : itens){
            valorTotal += (item.getPreco() * item.getQuantidade());
        }
        return valorTotal;
    }

    public void exibeItens(){
        for(carrinhoCompras.Item item: itens){
            System.out.println(item);
        }
    }
}
