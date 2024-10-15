package dev.andrenascimento.java.collections.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Aula04_Teste01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Jogador[] jogador = new Jogador[n];
        Comparador comparador = new Comparador();

        for (int i = 0; i < n; i++) {
            jogador[i] = new Jogador(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(jogador, comparador);
        for (int i = 0; i < jogador.length; i++) {
            System.out.printf("%s %s\n", jogador[i].nome, jogador[i].placar);
        }
    }
}

// Defina sua classe aqui

class Comparador implements Comparator<Jogador> {

    @Override
    public int compare(Jogador a, Jogador b) {
        // Primeiro, compara os placares em ordem decrescente
        int resultado = Integer.compare(b.placar, a.placar);

        // Se os placares forem iguais, compara os nomes em ordem alfabética
        if (resultado == 0) {
            resultado = a.nome.compareTo(b.nome);
        }

        return resultado;
    }
}

class Jogador {
    String nome;
    int placar;

    Jogador(String nome, int placar) {
        this.nome = nome;
        this.placar = placar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPlacar() {
        return placar;
    }

    public void setPlacar(int placar) {
        this.placar = placar;
    }
}