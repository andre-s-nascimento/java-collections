package dev.andrenascimento.java.collections.desafios.parte01;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Aula06_Teste02 {
    
    private final static Scanner scan = new Scanner(System.in);
    private final static Prioridades prioridades = new Prioridades();
    
    public static void main(String[] args) {
        int totalEventos = Integer.parseInt(scan.nextLine());    
        List<String> eventos = new ArrayList<>();
        
        while (totalEventos-- != 0) {
            String evento = scan.nextLine();
            eventos.add(evento);
        }
        
        List<Estudante> estudantes = prioridades.getEstudantes(eventos);
        
        if (estudantes.isEmpty()) {
            System.out.println("VAZIO");
        } else {
            for (Estudante st: estudantes) {
                System.out.println(st.getNome());
            }
        }
    }
}

//Adicione seu código aqui!

class Prioridades
{
    public List<Estudante> getEstudantes(List<String> eventos)
    {
        PriorityQueue<Estudante> queue = new PriorityQueue<Estudante>((s1, s2) -> {
            if (s1.getNota() == s2.getNota()) {
                int comparacao = s1.getNome().compareTo(s2.getNome());
                if(comparacao == 0)
                {
                    if(s1.getID() < s2.getID())
                        return 1;
                    else if (s1.getID() > s2.getID())
                        return -1;
                }
                return comparacao;
            }
            if (s1.getNota() < s2.getNota()) {
                return 1;
            }
            return -1;
        });

        for(String evento : eventos)
        {
            if(evento.contains("ADICIONAR"))
            {
                String[] dados = evento.split(" ");
                queue.offer(new Estudante(Integer.valueOf(dados[3].trim()), dados[1].trim(), Double.valueOf(dados[2].trim())));
            }
            else
            {
                queue.poll();
            } 
        }

        List<Estudante> estudantes = new ArrayList<Estudante>();
        while (!queue.isEmpty())
            estudantes.add(queue.poll());

        return estudantes;
    }
}

class Estudante
{
    int id;
    String nome;
    double nota;

    public Estudante(int id, String nome, double nota)
    {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    } 

    public int getID()
    {
        return id;
    }

    public String getNome()
    {
        return nome;
    }

    public double getNota()
    {
        return nota;
    }

    public String toString()
    {
        return id + " - " + nome + " - " + nota;
    }
}