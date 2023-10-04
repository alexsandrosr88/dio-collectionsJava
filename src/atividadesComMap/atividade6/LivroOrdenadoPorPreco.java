package atividadesComMap.atividade6;

import java.util.Comparator;

public class LivroOrdenadoPorPreco implements Comparator<Livro> {
    @Override
    public int compare(Livro l1, Livro l2) {
        return Double.compare(l1.getPreco(), l2.getPreco());
    }
}
