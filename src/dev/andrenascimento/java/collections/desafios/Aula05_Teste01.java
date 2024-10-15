package dev.andrenascimento.java.collections.desafios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Aula05_Teste01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = scan.next();
            pair_right[i] = scan.next();
        }

        // Coloque seu código aqui

        Set<String> uniquePairs = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String pair = pair_left[i] + " " + pair_right[i];  // Cria a representação do par
            uniquePairs.add(pair);  // Adiciona o par ao Set
            System.out.println(uniquePairs.size());  // Imprime o tamanho atual do Set
        }

        scan.close();

    }
}