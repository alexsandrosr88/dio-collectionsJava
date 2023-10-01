package atividadesComSet.atividade2;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private final Set<String> listaPalavras;

    public ConjuntoPalavrasUnicas() {
        listaPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        listaPalavras.add(palavra);
    }

    public void removePalavra(String palavra){
        for (String p : listaPalavras){
            if(p.equalsIgnoreCase(palavra)){
                listaPalavras.remove(p);
            }
        }
    }
    public boolean verificarPalavra(String palavra){
        for (String p : listaPalavras){
            if(p.equalsIgnoreCase(palavra)){
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas(){
        for (String p : listaPalavras){
            System.out.println(p);
        }
    }

    @Override
    public String toString() {
        return listaPalavras.toString();
    }

    public static void main(String[] args){
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("Chuchu com melancia");
        palavrasUnicas.adicionarPalavra("Ninja da Programação");
        palavrasUnicas.adicionarPalavra("Java 17");

        System.out.println("\n"+palavrasUnicas);

        System.out.println("\n------------------");

        palavrasUnicas.removePalavra("Chuchu com melancia");

        System.out.println("\n"+palavrasUnicas);

        System.out.println("\n------------------");

        System.out.println(palavrasUnicas.verificarPalavra("Java 17"));


    }
}
