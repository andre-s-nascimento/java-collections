package dev.andrenascimento.java.collections.desafios.parte02;

import java.util.*;

public class Aula02_Teste01 {
    public static void main(String args[]) {
        Set<Carro1> colecao = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            colecao.add(new Carro1(sc.next(), sc.next()));
        }

        System.out.println(colecao.size());

        sc.close();
    }
}

// Informe seu classe aqui
class Carro1  {
    private String marca;
    private String modelo;

    public Carro1 (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
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
        return true;
    }

}
