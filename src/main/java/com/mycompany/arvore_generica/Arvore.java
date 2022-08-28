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
public class Arvore {
    private No noRaiz;
    private List<No> elementos;

    public Arvore(No no) {
        this.noRaiz = no;
        this.elementos = new ArrayList<>();
    }

    public No getNoRaiz() {
        return noRaiz;
    }

    public No getNo(int valor) {
        return noRaiz.getNo(valor);
    }

    public List<No> geraElementos(No noRaiz) {
        if (noRaiz.getNivelNo() == 0) {
            elementos.add(noRaiz);
        }

        if (noRaiz.getFilhosNo().size() > 0) {
            for (No noFilho : noRaiz.getFilhosNo()) {
                elementos.add(noFilho);
                geraElementos(noFilho);
            }
        }

        return this.elementos;
    }

    public void getElementos() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        for (No elemento : elementos) {
            System.out.print(elemento.getValorNo() + ", ");
        }
        System.out.println();
    }

    public void getNoFolha() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        List<No> nosFolhas = new ArrayList<>();

        for (No elemento : elementos) {
            if (elemento.getFilhosNo().size() == 0) {
                nosFolhas.add(elemento);
            }
        }

        for (No noFolha : nosFolhas) {
            System.out.print(noFolha.getValorNo() + ", ");
        }
        System.out.println();

    }

    public void getNoInterno() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        List<No> nosInternos = new ArrayList<No>();

        for (No elemento : elementos) {
            if (elemento.getFilhosNo().size() != 0) {
                nosInternos.add(elemento);
            }
        }

        for (No noInterno : nosInternos) {
            System.out.print(noInterno.getValorNo() + ", ");
        }
        System.out.println();
    }

    public void getAlturaArvore() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        int altura = 0;

        for (No elemento : elementos) {
            if (elemento.getNivelNo() > altura) {
                altura = elemento.getNivelNo();
            }
        }

        System.out.println(altura);
    }

    public void getAlturaNo() {
        elementos.clear();
        elementos = geraElementos(noRaiz);

        for (No elemento : elementos) {
            System.out.println("Nó " + elemento.getValorNo() + " tem altura " + elemento.getNivelNo());
        }
    }

    public void printArvore(No no) {
        if (no.getNivelNo() == 0) {
            System.out.println(no.getValorNo());
        }
        if (no.getFilhosNo().size() > 0) {
            for (No noFilho : no.getFilhosNo()) {
                String spaces = "";
                for (int i = 0; i < noFilho.getNivelNo(); i++) {
                    spaces += "  ";
                }
                System.out.println(spaces + noFilho.getValorNo());
                printArvore(noFilho);
            }
        }

    }
}
