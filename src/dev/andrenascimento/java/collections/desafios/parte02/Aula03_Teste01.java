package dev.andrenascimento.java.collections.desafios.parte02;

import java.util.*;
import java.lang.reflect.*;

public class Aula03_Teste01 {
    public static void main(String args[]) {
        for(Method declaredMethod : Aula03_Teste01.class.getDeclaredMethods()) {
            Class<?>[] exceptionTypes = declaredMethod.getExceptionTypes();
            if(exceptionTypes.length > 0) {
                System.out.println("Não deveria, mas implementei no método:");
                for (Class<?> exception: exceptionTypes){
                    System.out.println(exception);
                }
            }
        }
        
        Hashtable<String, String> dicionario = new Hashtable<String, String>();
        dicionario.put("gato", "é um mamífero carnívoro da família dos felídeos ");
        dicionario.put("cachorro", "é um mamífero carnívoro da família dos canídeos");
        
        Iterator<String> it = dicionario.keySet().iterator();
        
        try {
            geraExcecao(dicionario);
            
            while (it.hasNext()) {
                String chave = it.next();
                System.out.println(chave + " - " + dicionario.get(chave));
            }
            
        } catch(Exception ex) {
            System.out.println(ex.getClass().getName());
        }
    }
    
    // Definindo o método que gera a exceção
    public static void geraExcecao(Dictionary<String, String> dicionario) {
        // Adiciona um novo elemento enquanto itera sobre as chaves
        Enumeration<String> chaves = dicionario.keys();
        while (chaves.hasMoreElements()) {
            String chave = chaves.nextElement();
            // Modifica o dicionário
            dicionario.put("novo", "um novo valor");
        }
    }

        
    // public static void geraExcecao(Dictionary<String, String> dicionario)
    // {
    //     dicionario.remove("cachorro");
    //     //Ou dicionario.remove("gato");
    // }
}