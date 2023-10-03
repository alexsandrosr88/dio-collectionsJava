package atividadesComMap.atividade1;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!contatos.isEmpty()){
            contatos.remove(nome);
        }
    }

    public Integer pesquisarPorNome(String nome){
        if(!contatos.isEmpty()){
            return contatos.get(nome);
        }
        return null;
    }
    public void exibirContatos(){
        System.out.println(contatos);
    }
    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Fulano1", 45218868);
        agendaContatos.adicionarContato("Fulano2", 45218526);
        agendaContatos.adicionarContato("Fulano3", 45818769);
        agendaContatos.adicionarContato("Fulano4", 45285841);

        agendaContatos.exibirContatos();

        System.out.println("\n--------------------\n");

        System.out.println("Pesquisa pela contato fulano3 para retornar seu número: ");

        System.out.println(agendaContatos.pesquisarPorNome("Fulano3"));

        System.out.println("\n--------------------\n");

        System.out.println("Removido o contato fulano3\n");

        agendaContatos.removerContato("Fulano3");

        agendaContatos.exibirContatos();

    }
}
