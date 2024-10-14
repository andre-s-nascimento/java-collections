package dev.andrenascimento.java.collections.desafios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Teste3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Lista<Integer> lista = new Lista<Integer>();
        for (int i = 0; i < n; i++) {
            int valor = scan.nextInt();
            lista.inserir(valor);
        }
        // Informe seu código aqui
        Iterator<Integer> itList = lista.iterator();
        while (itList.hasNext()) {
            Integer i = itList.next();
            System.out.print(i + " ");
        }

        System.out.println();
        scan.close();

        class Lista<T> implements Iterable<T> {
            private ArrayList<T> list;

            public Lista() {
                list = new ArrayList<T>();
            }

            public void inserir(T valor) {
                list.add(valor);
            }

            public Iterator<T> iterator() {
                return list.iterator();
            }
        }
    }
}
