package dev.andrenascimento.java.collections.desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Lê o número total de listas
        int n = scan.nextInt();
        
        // Cria um ArrayList de ArrayLists para armazenar todas as listas
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        
        // Lê cada lista
        for (int i = 0; i < n; i++) {
            int size = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                list.add(scan.nextInt());
            }
            lists.add(list);
        }
        
        // Lê o número de consultas
        int q = scan.nextInt();
        
        // Processa cada consulta
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt() - 1; // Ajusta para índice baseado em 0
            int y = scan.nextInt() - 1; // Ajusta para índice baseado em 0
            
            if (x < lists.size() && y < lists.get(x).size()) {
                System.out.println(lists.get(x).get(y));
            } else {
                System.out.println("ERRO!");
            }
        }
        
        scan.close();
    }
}