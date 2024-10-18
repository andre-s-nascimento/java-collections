package dev.andrenascimento.java.collections.desafios.parte02;

import java.util.*;
import java.util.function.*;

public class Aula03_Teste02 {
    public static void main(String args[]) {
        Hashtable<Integer, Produto> estoque = new Hashtable<Integer, Produto>();
        
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNext()) {
            estoque.put(++count, new Produto(sc.next(), sc.nextDouble()));
        }

        // Lambda para alterar o preço do produto
        BiFunction<Integer, Produto, Produto> funcaoAlterarEstoque = (key, produto) -> {
            produto.setPreco(produto.getPreco() + 15);
            return produto;
        };

        // Lambda para exibir o estoque
        BiConsumer<Integer, Produto> exibirEstoque = (key, produto) -> {
            System.out.printf("[%d] %s - R$%.2f%n", key, produto.getNome(), produto.getPreco());
        };

        // Alterar preços e exibir estoque
        estoque.replaceAll(funcaoAlterarEstoque);
        estoque.forEach(exibirEstoque);

        sc.close();
    }
}

class Produto {
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
}