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
        for(Convidado d : listaConvidados){
            if(d.getCodigoConvite() == codigoConvite){
                listaConvidados.remove(d);
            }
        }
    }

    public int contarConvidados(){
        return listaConvidados.size();
    }

    public void exibirConvidados(){
        for (Convidado d : listaConvidados){
            System.out.println(d);
        }
    }
}
