package dev.andrenascimento.java.collections.desafios.parte02;

import java.util.*;

public class Aula04_Teste01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Informe seu código aqui
        Map<Integer, Produto> estoque = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer k1, Integer k2) {
                if (k1 % 2 == 1 && k2 % 2 == 1) {
                    return k2.compareTo(k1);
                } else if (k1 % 2 == 0 && k2 % 2 == 0) {
                    return k1.compareTo(k2);
                } else {
                    return k1 % 2 != 0 ? -1 : 1;
                }
            }
        });

        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().split(" ");
            if (input.length != 3)
                break;
            int chave = Integer.parseInt(input[0]);
            String nome = input[1];
            double preco = Double.parseDouble(input[2]);
            estoque.put(chave, new Produto(nome, preco));
        }

        sc.close();

        /*
         * TreeMap<Integer, Produto> estoque = new TreeMap<Integer, Produto>(new
         * Comparator<Integer>() {
         * 
         * @Override
         * public int compare(Integer i1, Integer i2) {
         * if(i1 % 2 == 0)
         * {
         * if (i1 < i2)
         * return -1;
         * else if (i1 == i2)
         * return 0;
         * return 1;
         * }
         * else
         * {
         * if (i1 < i2)
         * return 1;
         * else if (i1 == i2)
         * return 0;
         * return -1;
         * }
         * }
         * 
         * });
         * 
         * int count = 0;
         * while(sc.hasNext()){
         * estoque.put(sc.nextInt(), new Produto(sc.next(), sc.nextDouble()));
         * }
         * 
         */
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return String.format("%s - R$%5.2f", nome, preco);
    }
}