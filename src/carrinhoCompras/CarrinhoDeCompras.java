package carrinhoCompras;

import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public void adicionarItem(Item item){
        itens.add(item);
    }

    public Item pesquisaItemPorNome(String nome){
        for(Item item : itens){
            if(item.getNome().equals(nome))
                return item;
        }
        return null;
    }
    public void remoteItem(String nome){
        Item item = pesquisaItemPorNome(nome);
        if(item != null){
            itens.remove(item);
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0D;
        for (Item item : itens){
            valorTotal += (item.getPreco() * item.getQuantidade());
        }
        return valorTotal;
    }

    public void exibeItens(){
        for(Item item: itens){
            System.out.println(item);
        }
    }
}
