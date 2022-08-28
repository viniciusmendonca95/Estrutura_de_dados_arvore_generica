/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvore_generica;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vinyj
 */
public class No {
    private int valor;
    private List<No> filhos;
    private int nivel;

    public No(int valor) {
        this.valor = valor;
        this.filhos = new ArrayList<>();
    }

    public void adicionarFilhoAoNo(No no) {
        no.nivel = nivel + 1;
        filhos.add(no);
    }

    public int getValorNo() {
        return valor;
    }

    public List<No> getFilhosNo() {
        return filhos;
    }

    public int getNivelNo() {
        return nivel;
    }

    public int getGrau() {
        return filhos.size();
    }

    public No getNo(int noProcurado) {
        if (noProcurado == valor) {
            return this;
        }
        for (No filho : filhos) {
            No no = filho.getNo(noProcurado);
            if (no != null) {
                return no;
            }
        }
        return null;
    }
}
