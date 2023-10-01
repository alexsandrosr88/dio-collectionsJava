package atividadesComSet.atividade4;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private final Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public Tarefa pesquisarTarefa(String descricao){
        for (Tarefa f : listaTarefas){
            if(f.getDescricao().equalsIgnoreCase(descricao)){
                return f;
            }
        }
        return null;
    }
    public void removerTarefa(String descricao){
        Tarefa tarefa = pesquisarTarefa(descricao);

        if(tarefa != null){
            listaTarefas.remove(tarefa);
        }
    }

    public void exibirTarefas(){
        for (Tarefa f : listaTarefas){
            System.out.println(f);
        }
    }

    public int contarTarefas(){
        return listaTarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa f : listaTarefas){
            if(f.isConcluida()){
                tarefasConcluidas.add(f);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa f : listaTarefas){
            if(!f.isConcluida()){
                tarefasPendentes.add(f);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        Tarefa tarefa = pesquisarTarefa(descricao);

        if(tarefa != null){
            tarefa.setConcluida(true);
        }
    }
    public void marcarTarefaPendente(String descricao){
        Tarefa tarefa = pesquisarTarefa(descricao);

        if(tarefa != null){
            tarefa.setConcluida(false);
        }
    }

    public void limparListaTarefas(){
        listaTarefas.clear();
    }

    public static void main(String[] args){
        ListaTarefas tarefas = new ListaTarefas();

        System.out.println("\nTodas as tarefas:");
        tarefas.adicionarTarefa("Tarefa1");
        tarefas.adicionarTarefa("Tarefa2");
        tarefas.adicionarTarefa("Tarefa3");
        tarefas.adicionarTarefa("Tarefa4");
        tarefas.adicionarTarefa("Tarefa5");

        tarefas.exibirTarefas();

        tarefas.marcarTarefaConcluida("Tarefa3");
        tarefas.marcarTarefaConcluida("Tarefa4");

        System.out.println("\n---------------------------\n");
        System.out.println("Tarefas concluídas:");


        for(Tarefa f : tarefas.obterTarefasConcluidas()){
            System.out.println(f);
        }

        System.out.println("\n---------------------------\n");
        System.out.println("Tarefas pendentes:");
        for(Tarefa f : tarefas.obterTarefasPendentes()){
            System.out.println(f);
        }
        System.out.println("\n---------------------------\n");

        System.out.println("Contador de tarefas: "+tarefas.contarTarefas());

        System.out.println("\n---------------------------\n");
        System.out.println("Limpar lista de tarefas:");

        tarefas.limparListaTarefas();

        System.out.println("\n---------------------------\n");
        System.out.println("Contador de tarefas: "+tarefas.contarTarefas());
    }
}