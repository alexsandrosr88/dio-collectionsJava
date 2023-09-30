package atividade1;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    List<Tarefa> lista;

    public ListaTarefas() {
        lista = new ArrayList<>();
    }

    public void acionarTarefa(String descricao){
        lista.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaR;
        for(Tarefa tarefa : lista){
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
        for (Tarefa tarefa : lista){
            System.out.println(tarefa.getDescricao());
        }
    }
}
