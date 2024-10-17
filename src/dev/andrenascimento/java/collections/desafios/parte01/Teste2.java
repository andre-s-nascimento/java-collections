package dev.andrenascimento.java.collections.desafios.parte01;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Lê o tamanho inicial da lista
        int n = scan.nextInt();

        // Cria e preenche a lista inicial
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lista.add(scan.nextInt());
        }

        // Lê o número de queries
        int q = scan.nextInt();

        // Processa cada query
        for (int i = 0; i < q; i++) {
            String operation = scan.next();

            if (operation.equals("Inserir")) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                if (x >= 0 && x <= lista.size()) {
                    lista.add(x, y);
                }
            } else if (operation.equals("Deletar")) {
                int x = scan.nextInt();
                if (x >= 0 && x < lista.size()) {
                    lista.remove(x);
                }
            }
        }

        // Imprime a lista resultante
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i < lista.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        scan.close();
    }
}
