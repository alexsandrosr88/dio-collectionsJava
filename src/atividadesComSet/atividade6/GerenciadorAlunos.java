package atividadesComSet.atividade6;

import java.util.*;

public class GerenciadorAlunos {

    private Set<Aluno> listaAlunos;

    public GerenciadorAlunos() {
        listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota){
        listaAlunos.add(new Aluno(nome,matricula,nota));
    }

    private Aluno pesquisarAlunoPorMatricula(long matricula){
        for (Aluno a : listaAlunos){
            if(a.getMatricula() == matricula)
                return a;
        }
        return null;
    }
    public void removerAluno(long matricula){
        Aluno aluno = pesquisarAlunoPorMatricula(matricula);

        if (aluno != null){
            listaAlunos.remove(aluno);
        }
    }

    public void exibirAlunosPorNome(){
        List<Aluno> list = new ArrayList<>(listaAlunos);
        Collections.sort(list);

        for (Aluno a : list){
            System.out.println(a);
        }

    }
    public void exibirAlunosPorNota(){
        List<Aluno> list = new ArrayList<>(listaAlunos);
        list.sort(new AlunoOrdenadoPorNota());

        for (Aluno a : list){
            System.out.println(a);
        }

    }
    public void exibirAlunos(){
        for (Aluno a : listaAlunos){
            System.out.println(a);
        }
    }
    public static void main(String[] args){

        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Fulano1",1L, 8.2);
        alunos.adicionarAluno("Fulano2",2L, 8.0);
        alunos.adicionarAluno("Fulano3",3L, 7.0);
        alunos.adicionarAluno("Fulano4",4L, 6.0);
        alunos.adicionarAluno("Fulano5",5L, 7.7);

        System.out.println();

        alunos.exibirAlunos();

        System.out.println("\n-----------------------\n");
        System.out.println("Alunos ordenados por nome");
        alunos.exibirAlunosPorNome();

        System.out.println("\n-----------------------\n");
        System.out.println("Alunos ordenados por nota");
        alunos.exibirAlunosPorNota();
    }

}
