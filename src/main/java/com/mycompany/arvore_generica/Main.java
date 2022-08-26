/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvore_generica;

/**
 *
 * @author vinyj
 */
public class Main {
    public static void main(String[] args) {
        No noRaiz = new No(8);
        No no4 = new No(4);
        No no2 = new No(2);
        No no9 = new No(9);
        No no1 = new No(1);
        No no6 = new No(6);
        No no7 = new No(7);
        No no5 = new No(5);
        
        noRaiz.adicionarFilhoAoNo(no4);
        noRaiz.adicionarFilhoAoNo(no2);
        noRaiz.adicionarFilhoAoNo(no9);
        noRaiz.adicionarFilhoAoNo(no1);
        
        no4.adicionarFilhoAoNo(no6);
        no4.adicionarFilhoAoNo(no7);
        
        no9.adicionarFilhoAoNo(no5);

        Arvore arvore = new Arvore(noRaiz);
        
        System.out.println("Altura do nó:");
        
        System.out.println("Altura da árvore:");
        
        System.out.println("Profundidade do nó:");
        
        System.out.println("Profundidade da árvore:");
        
        System.out.println("Grau do nó:");
        
        System.out.println("Grau da árvore:");
        
        System.out.println("Elementos: ");
        arvore.getElementos();
        
        System.out.println("Nós folhas:");
        arvore.getNoFolha();
        
        System.out.println("Nós Internos:");
        arvore.getNoInterno();
        
        System.out.println("Árvore Genérica:");
        arvore.printArvore(noRaiz);
        



    }
        
    }

