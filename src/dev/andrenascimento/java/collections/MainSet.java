package dev.andrenascimento.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import dev.andrenascimento.java.collections.models.Pessoa;

public class MainSet {
    public static void main(String[] args) {
        // Set não podem receber elementos duplicados.
        // mas isso depende de uma boa implementação
        // do equals e hashcode
        // Os elementos não ficam em ordem por HashSet
        System.out.println("*** HashSet ***");
        Set<Pessoa> set = new HashSet<>();
        set.add(new Pessoa(1, "André 01"));
        set.add(new Pessoa(2, "André 02"));
        set.add(null);
        System.out.println(set);
        set.add(new Pessoa(1, "André 01"));
        System.out.println(set);
        for (Pessoa p : set) {
            System.out.println(p);

        }
        // hashmap
        //
        // | Chave | Valor |
        // |-------|---------------------------|
        // | 123 | new Pessoa(1, "André 01") |

        // para manter a ordem da inserção usamos o linkedHashSet
        //
        System.out.println("*** LinkedHashSet ***");
        Set<Pessoa> setLinkedHashSet = new LinkedHashSet<>();
        setLinkedHashSet.add(new Pessoa(1, "André 01"));
        setLinkedHashSet.add(new Pessoa(2, "André 02"));
        setLinkedHashSet.add(null);
        System.out.println(setLinkedHashSet);
        setLinkedHashSet.add(new Pessoa(1, "André 01"));
        System.out.println(setLinkedHashSet);
        for (Pessoa p : setLinkedHashSet) {
            System.out.println(p);

        }
        // linkedhashmap
        //
        // | Chave | Valor |
        // |-------|---------------------------|
        // | 123 | new Pessoa(1, "André 01") |

        // para manter a lista sempre ordenada usamos o TreeSet
        // usando o Comparable da classe usada, nesse caso temos
        // a classe Pessoa implementando.
        System.out.println("*** TreeSet ***");
        // não permite nulo
        Set<Pessoa> setTreeSet = new TreeSet<>(); // se eu inserir um Comparable aqui, ele passa por cima da classe
                                                  // Pessoa
        setTreeSet.add(new Pessoa(2, "André 02"));
        setTreeSet.add(new Pessoa(3, "André 03"));
        setTreeSet.add(new Pessoa(1, "André 01"));
        System.out.println(setTreeSet);
        setTreeSet.add(new Pessoa(1, "André 01"));
        System.out.println(setTreeSet);
        for (Pessoa p : setTreeSet) {
            System.out.println(p);

        }
        // linkedhashmap
        //
        // | Chave | Valor |
        // |-------|---------------------------|
        // | 123 | new Pessoa(1, "André 01") |

        System.out.println("*** NavigableSet ***");
        // não permite nulo
        NavigableSet<Pessoa> setNavigableSet = new TreeSet<>(); // se eu inserir um Comparable aqui, ele passa por cima
                                                                // da classe Pessoa
        setNavigableSet.add(new Pessoa(2, "André 02"));
        setNavigableSet.add(new Pessoa(3, "André 03"));
        setNavigableSet.add(new Pessoa(4, "André 04"));
        setNavigableSet.add(new Pessoa(1, "André 01"));
        

        Pessoa teste = setNavigableSet.lower(new Pessoa(2, "André 02"));
        System.out.println(teste);

    }
}
