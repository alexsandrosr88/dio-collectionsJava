package atividadesComMap.atividade6;

import java.util.Comparator;
import java.util.Map;

public class LivroOrdenadoPorPreco implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return Double.compare(l1.getValue().getPreco(),l2.getValue().getPreco());
    }
}
