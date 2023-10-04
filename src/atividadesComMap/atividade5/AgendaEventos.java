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

    public void obterProximoEvento(){
        LocalDate diaAtual = LocalDate.now();

        Map<LocalDate, Evento> eventoOrdenadoPorData = new TreeMap<>(eventos);

        for(Map.Entry<LocalDate, Evento> e : eventoOrdenadoPorData.entrySet()){

            if(e.getKey().isEqual(diaAtual) || e.getKey().isAfter(diaAtual)){
                System.out.println("O próximo evento: "+ e.getValue() + " acontecerá na data "+ e.getKey());
                break;
            }
        }
    }
    public static void main(String[] args){
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2023,10,3),"Evento1","Atração1");
        agenda.adicionarEvento(LocalDate.of(2023,7,2),"Evento2","Atração2");
        agenda.adicionarEvento(LocalDate.of(2023,8,14),"Evento3","Atração3");
        agenda.adicionarEvento(LocalDate.of(2023,1,1),"Evento4","Atração4");
        agenda.adicionarEvento(LocalDate.of(2023,12,12),"Evento5","Atração5");
        agenda.adicionarEvento(LocalDate.of(2023,10,30),"Evento6","Atração6");

        System.out.println();

        agenda.exibirAgenda();

        System.out.println("\n-------------------------\n");

        System.out.println("Evento com data mais próxima:");
        agenda.obterProximoEvento();
    }
}
