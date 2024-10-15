package dev.andrenascimento.java.collections.desafios;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Aula05_Teste02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = Integer.valueOf(s.nextLine());
        
        List<String> nomes = new ArrayList<String>();
        
        for (int i = 0; i < t; i++) {
            nomes.add(s.nextLine());
        }
        



        //Coloque seu código aqui

        Set<String> nomesOrdenados = new TreeSet<String>(nomes);

        for (String nomeOrdenado : nomesOrdenados) {
            System.out.println(nomeOrdenado);
        }
        
        s.close();


    }
}