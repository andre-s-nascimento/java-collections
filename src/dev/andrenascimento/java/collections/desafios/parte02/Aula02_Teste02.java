package dev.andrenascimento.java.collections.desafios.parte02;

import java.util.*;

public class Aula02_Teste02 {
    public static void main(String args[]) {
        Set<Carro> colecao = new TreeSet<>();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            colecao.add(new Carro(sc.next(), sc.next(), sc.nextInt()));
        }

        for (Carro c : colecao)
            System.out.println(c);
        sc.close();
    }
}

// Informe seu classe aqui
class Carro implements Comparable<Carro> {
    String marca;
    String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ano;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carro other = (Carro) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (ano != other.ano)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.marca + " - " + this.modelo + " - " + this.ano;
    }

    @Override
    public int compareTo(Carro o) {
        if (marca.equals(o.getMarca())) {
            if (modelo.equals(o.getModelo())) {
                if (ano == o.getAno())
                    return 0;
                else if (ano < o.getAno())
                    return -1;
                return 1;
            }
            return modelo.compareTo(o.getModelo());
        }

        return marca.compareTo(o.getMarca());
    }

}
