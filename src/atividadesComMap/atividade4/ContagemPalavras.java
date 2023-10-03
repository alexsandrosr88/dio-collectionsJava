package atividadesComMap.atividade4;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(palavras);
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente() {
        int qtd = 0;
        Map<String, Integer> palavra = new HashMap<>();
        for (Map.Entry<String, Integer> p : palavras.entrySet()) {
            if (p.getValue() > qtd) {
                qtd = p.getValue();
                palavra = Map.of(p.getKey(), p.getValue());
            }
        }
        return palavra;
    }

    public static void main(String[] args) {

        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Palavra1", 10);
        contagemPalavras.adicionarPalavra("Palavra2", 20);
        contagemPalavras.adicionarPalavra("Palavra3", 15);
        contagemPalavras.adicionarPalavra("Palavra4", 8);
        contagemPalavras.adicionarPalavra("Palavra5", 4);

        System.out.println();
        contagemPalavras.exibirContagemPalavras();

        System.out.println("\n-----------------------------\n");

        System.out.println("Removido a Palavra4\n");
        contagemPalavras.removerPalavra("Palavra4");

        contagemPalavras.exibirContagemPalavras();

        System.out.println("\n-----------------------------\n");


        System.out.println("A palavra mais frequente é:");
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
