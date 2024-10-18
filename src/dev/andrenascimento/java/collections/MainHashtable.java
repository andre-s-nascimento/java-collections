package dev.andrenascimento.java.collections;

import java.util.*;

import dev.andrenascimento.java.collections.models.Pessoa;

public class MainHashtable {
    public static void main(String[] args) {
        Hashtable<String,Pessoa> tabelaPessoas = new Hashtable<String, Pessoa>();
        tabelaPessoas.put("legal", new Pessoa(1, "André 01"));
        System.out.println(tabelaPessoas);
        tabelaPessoas.put("chato", new Pessoa(1, "André 01"));
        System.out.println(tabelaPessoas);
        System.out.println(tabelaPessoas.get("legal"));
        tabelaPessoas.put("legal", new Pessoa(3, "André 03"));
        System.out.println(tabelaPessoas.get("legal"));
        System.out.println(tabelaPessoas.put("bla", new Pessoa(4, "André 04")));

        //iteração
        // Fail-Fast Iterator
        // Iterator<String> iteratorChaves = tabelaPessoas.keySet().iterator();
        // tabelaPessoas.remove("legal");
        // while (iteratorChaves.hasNext()) {
        //     String chave = iteratorChaves.next();
        //     System.out.println(" - " + tabelaPessoas.get(chave).toString());
        // }

        // non Fail-Fast Iterator
        Enumeration<String> chaves = tabelaPessoas.keys();
        tabelaPessoas.remove("legal");
        while (chaves.hasMoreElements()) {
            String chave = chaves.nextElement();
            System.out.println(" - " + tabelaPessoas.get(chave).toString());
        }

        // Pessoa p = null;

        // if(tabelaPessoas.containsKey("legal")){
        //     p = tabelaPessoas.get("legal");
        // } else {
        //     p = new Pessoa(-1, "Não Existe");
        // }

        // System.out.println(p);

        Pessoa p = tabelaPessoas.getOrDefault("legal", new Pessoa(-1, "Não Existe"));
        System.out.println(p);

        // if(!tabelaPessoas.containsKey("legal")){
        //     tabelaPessoas.put("legal", new Pessoa('1', "Andre 111"));
        // }

        tabelaPessoas.putIfAbsent("legal", new Pessoa(1, "Andre 111"));
        System.out.println(tabelaPessoas);

        tabelaPessoas.forEach((chave, valor)-> {
            System.out.println(String.format("[%s] %s", chave, valor.toString()));
        });
    }
}
