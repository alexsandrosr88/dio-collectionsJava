package atividadesComMap.atividade5;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventos.put(data,new Evento(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> map = new TreeMap<>(eventos);
        System.out.println(map);
    }

    public Map<LocalDate,Evento> obterProximoEvento(){
        LocalDate dataMaisRecente = LocalDate.EPOCH;
        Map<LocalDate, Evento> eventoMaisProximo = new HashMap<>();

        for(Map.Entry<LocalDate, Evento> e : eventos.entrySet()){
            if(e.getKey().isAfter(dataMaisRecente)){
                dataMaisRecente = e.getKey();
                eventoMaisProximo = Map.of(e.getKey(), e.getValue());
            }
        }

        return eventoMaisProximo;
    }
    public static void main(String[] args){
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2023,10,3),"Evento1","Teste1");
        agenda.adicionarEvento(LocalDate.of(2023,7,2),"Evento2","Teste2");
        agenda.adicionarEvento(LocalDate.of(2023,8,14),"Evento3","Teste3");
        agenda.adicionarEvento(LocalDate.of(2023,1,1),"Evento4","Teste4");

        System.out.println();

        agenda.exibirAgenda();

        System.out.println("\n-------------------------\n");

        System.out.println("Evento com data mais próxima:");
        System.out.println(agenda.obterProximoEvento());
    }
}
