package dev.andrenascimento.java.collections;

import java.util.PriorityQueue;
import java.util.Queue;

import dev.andrenascimento.java.collections.models.Pessoa;

public class MainQueue {
    public static void main(String[] args) {
        Queue<Pessoa> queue = new PriorityQueue<Pessoa>(
            (p1, p2) -> {
                return (p1.getNome().compareTo(p2.getNome()));
            }
        );
        // a listagem dá uma ordem arbitrária, mas ao recuperar está certo

        queue.add(new Pessoa(3, "André 03"));
        queue.add(new Pessoa(1, "Pedro 01"));
        queue.add(new Pessoa(2, "Márcio 02"));
        //add return boolean or a Exception
        
        queue.offer(new Pessoa(4, "André 04"));
        //queue return a boolean 

        while ( !queue.isEmpty()) {
            Pessoa p = queue.poll();
            System.out.println(p);
            
        }

        System.out.println(queue);
    }
}
