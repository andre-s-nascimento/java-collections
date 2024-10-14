package dev.andrenascimento.java.collections;

import java.util.LinkedList;
import java.util.List;

import dev.andrenascimento.java.collections.models.Pessoa;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(new Pessoa(1, "André 1"));
        pessoas.add(new Pessoa(2, "André 2"));
        pessoas.add(new Pessoa(3, "André 3"));

        pessoas.remove(new Pessoa(1, "André 1"));

        System.out.println(pessoas.contains(new Pessoa(2, "André 2")));

        System.out.println(pessoas);

        // System.out.println("Com For: ");

        // for (int i = 0; i < pessoas.size(); i++) {
        // Pessoa p = pessoas.get(i);
        // System.out.println(p);
        // }

        //System.out.println("Com iterator: ");
        // Iterator<Pessoa> iteratorPessoa = pessoas.iterator();
        // while (iteratorPessoa.hasNext()) {
        // Pessoa p = iteratorPessoa.next();
        // if (p.getId() == 1) {
        // //pessoas.remove(p);
        // iteratorPessoa.remove();
        // }
        // System.out.println(p);
        // }
        //pessoas.removeIf(p -> p.getId() == 1);
        //System.out.println(pessoas);

        // For-Each
        // System.out.println("Com For-Each: ");
        // for (Pessoa p: pessoas) {
        // System.out.println(p);
        // }

        System.out.println("FIM!");

    }
}
