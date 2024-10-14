package dev.andrenascimento.java.collections.desafios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Teste4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Lista<Integer> lista = new Lista<Integer>(); 
        for (int i = 0; i < n; i++) {
            int valor = scan.nextInt();
            lista.inserir(valor);
        }
        
        for(int valor : lista){
            System.out.print(valor + " ");
        }

        scan.close();
    }
}



//informe sua classe aqui.
class Lista<T> implements Iterable<T>{
    private ArrayList<T> list;
    
    public Lista(){
        list = new ArrayList<T>();
    }
    
    public void inserir(T item){
        list.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
