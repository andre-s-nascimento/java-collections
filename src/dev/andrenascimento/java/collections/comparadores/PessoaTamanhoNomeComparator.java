package dev.andrenascimento.java.collections.comparadores;

import java.util.Comparator;

import dev.andrenascimento.java.collections.models.Pessoa;

public class PessoaTamanhoNomeComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        return Integer.compare(o1.getNome().length(), o2.getNome().length());
    }
}
