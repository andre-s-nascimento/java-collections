package dev.andrenascimento.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import dev.andrenascimento.java.collections.models.Pessoa;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Pessoa> pessoas = new LinkedList<>();
        pessoas.add(new Pessoa(1, "André 1"));
        pessoas.add(new Pessoa(2, "André 2"));

        System.out.println("Com For: ");

        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);
            System.out.println(p);
        }

        System.out.println("Com iterator: ");
        Iterator<Pessoa> iteratorPessoa = pessoas.iterator();

        while (iteratorPessoa.hasNext()) {
            Pessoa p = iteratorPessoa.next();
            System.out.println(p);
        }

        System.out.println("FIM!");

    }
}
