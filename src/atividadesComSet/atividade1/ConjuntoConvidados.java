package atividadesComSet.atividade1;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> listaConvidados;

    public ConjuntoConvidados() {
        listaConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        listaConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado d : listaConvidados){
            if(d.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = d;
            }
        }
        listaConvidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return listaConvidados.size();
    }

    public void exibirConvidados(){
        for (Convidado d : listaConvidados){
            System.out.println(d);
        }
    }
    public static void main(String[] args){
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Convidado1", 1);
        convidados.adicionarConvidado("Convidado2", 2);
        convidados.adicionarConvidado("Convidado3", 3);
        convidados.adicionarConvidado("Convidado4", 4);
        convidados.adicionarConvidado("Convidado5", 5);

        System.out.println("\nLista de convidados");
        convidados.exibirConvidados();

        System.out.println("\n-----------------------------\n");
        System.out.println("Removendo convidado por código do convite");
        convidados.removerConvidadoPorCodigoConvite(2);

        System.out.println("\nLista de convidados, pós alteração");
        convidados.exibirConvidados();

        System.out.println("\n-----------------------------\n");
        System.out.println("Quantidade de convidados: "+convidados.contarConvidados());

    }
}
