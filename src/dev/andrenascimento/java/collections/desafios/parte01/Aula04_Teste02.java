package dev.andrenascimento.java.collections.desafios.parte01;

import java.util.*;

public class Aula04_Teste02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Jogador[] jogadores = new Jogador[n];

        for (int i = 0; i < n; i++) {
            jogadores[i] = new Jogador(scan.next(), scan.nextInt());
        }
        scan.close();

        /*
        ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>(Arrays.asList(jogadores));
        listaJogadores.sort((o1, o2) -> {
            if (o1.placar == o2.placar) {
                return o1.nome.compareTo(o2.nome);
            }
            if (o1.placar > o2.placar) {
                return -1;
            }
            return 1;
        });
         */

        ArrayList<Jogador> listaJogadores = new ArrayList<>(Arrays.asList(jogadores));

        listaJogadores.sort((j1, j2) -> {
            int resultado = Integer.compare(j2.placar, j1.placar);

            if (resultado == 0) {
                resultado = j1.nome.compareTo(j2.nome);
            }
            return resultado;
        });

        for (Jogador jogador : listaJogadores)
            System.out.printf("%s %s\n", jogador.nome, jogador.placar);
    }
}

final class Jogador {
    String nome;
    int placar;

    Jogador(String nome, int placar) {
        this.nome = nome;
        this.placar = placar;
    }
}
