package listadetarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    List<listadetarefas.Tarefa> lista;

    public ListaTarefas() {
        lista = new ArrayList<>();
    }

    public void acionarTarefa(String descricao){
        lista.add(new listadetarefas.Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        listadetarefas.Tarefa tarefaR;
        for(listadetarefas.Tarefa tarefa : lista){
                if(tarefa.getDescricao().equals(descricao)){
                    tarefaR = tarefa;
                    lista.remove(tarefaR);
                    break;
                }
        }
    }
    public int obterNumeroTotalTarefas(){
        return lista.size();
    }

    public void obterDescricoesTarefas(){
        for (listadetarefas.Tarefa tarefa : lista){
            System.out.println(tarefa.getDescricao());
        }
    }
}
