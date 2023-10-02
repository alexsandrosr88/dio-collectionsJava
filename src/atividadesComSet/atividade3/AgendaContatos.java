package atividadesComSet.atividade3;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> agendaContatos;

    public AgendaContatos() {
        agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        agendaContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        for (Contato c : agendaContatos){
            System.out.println(c);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> list = new HashSet<>();

        for (Contato c : agendaContatos){
            if(c.getNome().startsWith(nome))
                list.add(c);
        }
        return list;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        for (Contato c : agendaContatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
            }
        }
    }
    public static void main(String[] args){
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Fulano1", 455245268);
        agenda.adicionarContato("Fulano2", 454555548);
        agenda.adicionarContato("Fulano3", 456826892);
        agenda.adicionarContato("Fulano4", 456248862);
        agenda.adicionarContato("Fulano4", 456248862);

        System.out.println();
        agenda.exibirContatos();
        System.out.println("\n-------------------------\n");

        System.out.println(agenda.pesquisarPorNome("Fulano4"));

        System.out.println("\n-------------------------\n");

        agenda.atualizarNumeroContato("Fulano4",88884444);

        agenda.exibirContatos();

    }
}
