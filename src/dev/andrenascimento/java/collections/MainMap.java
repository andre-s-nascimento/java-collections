package dev.andrenascimento.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import dev.andrenascimento.java.collections.models.Pessoa;

public class MainMap {
    public static void main(String[] args) {
        Map<String, Pessoa> mapaPessoas = new HashMap<>();
        System.out.println(mapaPessoas.put("legal", new Pessoa(1, "André 01")));
        System.out.println(mapaPessoas);
        System.out.println(mapaPessoas.put("legal", new Pessoa(2, "André 02")));
        System.out.println(mapaPessoas);
        mapaPessoas.put(null, new Pessoa(-1, "-André 1"));
        System.out.println(mapaPessoas);
        mapaPessoas.put(null, new Pessoa(-2, "-André 2"));
        System.out.println(mapaPessoas);
        mapaPessoas.put("teste", null);
        System.out.println(mapaPessoas);

        //
        System.out.println("*** - LinkedHasMap - ***");
        Map<String, Pessoa> mapaPessoas2 = new LinkedHashMap<>(16, 0.75f, true);
        System.out.println(mapaPessoas2.put("legal", new Pessoa(1, "André 01")));
        System.out.println(mapaPessoas2);
        System.out.println(mapaPessoas2.put("legal", new Pessoa(2, "André 02")));
        System.out.println(mapaPessoas2);
        mapaPessoas2.put(null, new Pessoa(-1, "-André 1"));
        System.out.println(mapaPessoas2);
        mapaPessoas2.put(null, new Pessoa(-2, "-André 2"));
        System.out.println(mapaPessoas2);
        mapaPessoas2.put("teste", null);
        System.out.println(mapaPessoas2);
        Pessoa p = mapaPessoas2.get("legal");
        System.out.println(p);
        System.out.println(mapaPessoas2);

                //
                System.out.println("*** - TreeMap - ***");
                Map<String, Pessoa> mapaPessoas3 = new TreeMap<>();
                System.out.println(mapaPessoas3.put("legal", new Pessoa(1, "André 01")));
                System.out.println(mapaPessoas3);
                System.out.println(mapaPessoas3.put("legal", new Pessoa(2, "André 02")));
                System.out.println(mapaPessoas3);
                // mapaPessoas3.put(null, new Pessoa(-1, "-André 1"));
                // System.out.println(mapaPessoas3);
                // mapaPessoas3.put(null, new Pessoa(-2, "-André 2"));
                // System.out.println(mapaPessoas3);
                mapaPessoas3.put("teste", null);
                System.out.println(mapaPessoas3);
                Pessoa p2 = mapaPessoas3.get("legal");
                System.out.println(p2);
                System.out.println(mapaPessoas3);
                mapaPessoas3.put("a", new Pessoa(100, "André 100"));
                System.out.println(mapaPessoas3);

        

    }
}
