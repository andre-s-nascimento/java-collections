package dev.andrenascimento.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import dev.andrenascimento.java.collections.models.Pessoa;

public class MainSet2 {
    public static void main(String[] args) {
        Set<Pessoa> pessoas = new TreeSet<>();
        // HashSet não garante a ordem
        // LinkedHashSet garante a ordem, mas passando o Comparator
        // TreeSet usa Comparator - muito custoso
        System.out.println(pessoas.add(new Pessoa(1, "Andre 01")));
        System.out.println(pessoas);
        System.out.println(pessoas.add(new Pessoa(2, "Andre 02")));
        System.out.println(pessoas.add(new Pessoa(3, "Andre 03")));
        System.out.println(pessoas.add(new Pessoa(4, "Andre 04")));
        System.out.println(pessoas.add(new Pessoa(5, "Andre 02")));
        System.out.println(pessoas.add(new Pessoa(6, "Andre 03")));
        System.out.println(pessoas.add(new Pessoa(7, "Andre 04")));
        System.out.println(pessoas.add(new Pessoa(8, "Andre 02")));
        System.out.println(pessoas.add(new Pessoa(9, "Andre 03")));
        System.out.println(pessoas.add(new Pessoa(10, "Andre 04")));
        System.out.println(pessoas.add(new Pessoa(11, "Andre 02")));
        System.out.println(pessoas.add(new Pessoa(12, "Andre 03")));
        System.out.println(pessoas.add(new Pessoa(13, "Andre 04")));
        System.out.println(pessoas.add(new Pessoa(14, "Andre 02")));
        System.out.println(pessoas.add(new Pessoa(15, "Andre 03")));
        System.out.println(pessoas.add(new Pessoa(16, "Andre 04")));
        System.out.println(pessoas.add(new Pessoa(17, "Andre 02")));
        System.out.println(pessoas.add(new Pessoa(18, "Andre 03")));
        System.out.println(pessoas.add(new Pessoa(18, "Andre 03")));
        System.out.println(pessoas);

    }
}
