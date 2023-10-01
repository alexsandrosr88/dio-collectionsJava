package atividadesComList.atividade6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listNumeros;

    public OrdenacaoNumeros() {
        listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listOrdenadaAsc = new ArrayList<>(listNumeros);
        Collections.sort(listOrdenadaAsc);
        return listOrdenadaAsc;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listOdernadaDesc = new ArrayList<>(listNumeros);
        listOdernadaDesc.sort(Collections.reverseOrder());
        return listOdernadaDesc;
    }

    @Override
    public String toString() {
        return listNumeros.toString();
    }

    public static void main(String[] args){
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(3);

        System.out.println("\nOrdem de inserção");

        System.out.println(numeros);

        System.out.println("-------------------------");

        System.out.println("Ordem de Ascendente");

        System.out.println(numeros.ordenarAscendente());

        System.out.println("-------------------------");

        System.out.println("Ordem de Descendente");

        System.out.println(numeros.ordenarDescendente());
    }
}
