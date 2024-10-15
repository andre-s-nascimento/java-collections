package dev.andrenascimento.java.collections.desafios;

import java.util.*;
import java.lang.reflect.*;

public class Aula06_Teste01 {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            Queue<String> fila = new ArrayDeque<String>();

            for (String car : input.split(""))
                if (car != "\n")
                    fila.add(car);

            System.out.println(analisaFila(fila) ? "Balanceada" : "Não balanceada");
        }
        sc.close();
    }

    public static boolean analisaFila(Queue<String> fila) {
        if (fila != null) {
            String caractere = fila.poll();
            int parentese = 0;
            int chave = 0;
            int colchete = 0;
            while (caractere != null) {
                switch (caractere) {
                    case "(":
                        parentese++;
                        break;
                    case ")":
                        if (parentese == 0)
                            return false;
                        else
                            parentese--;
                        break;
                    case "[":
                        colchete++;
                        break;
                    case "]":
                        if (colchete == 0)
                            return false;
                        else
                            colchete--;
                        break;
                    case "{":
                        chave++;
                        break;
                    case "}":
                        if (chave == 0)
                            return false;
                        else
                            chave--;
                        break;
                    default:
                        return false;
                }

                caractere = fila.poll();
            }
            if (chave == 0 && parentese == 0 && colchete == 0)
                return true;
            else
                return false;
        }

        return false;
    }

}