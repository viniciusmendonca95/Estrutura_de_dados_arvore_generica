/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvore_generica;

/**
 * @author vinyj
 */
public class Main {
    public static void main(String[] args) {
        //Geração de nós
        No noRaiz = new No(8);
        No no4 = new No(4);
        No no2 = new No(2);
        No no9 = new No(9);
        No no1 = new No(1);
        No no6 = new No(6);
        No no7 = new No(7);
        No no5 = new No(5);

        //Atribuição dos filhos dos nós
        noRaiz.adicionarFilhoAoNo(no4);
        noRaiz.adicionarFilhoAoNo(no2);
        noRaiz.adicionarFilhoAoNo(no9);
        noRaiz.adicionarFilhoAoNo(no1);

        no4.adicionarFilhoAoNo(no6);
        no4.adicionarFilhoAoNo(no7);

        no9.adicionarFilhoAoNo(no5);

        //Criação da árvore
        Arvore arvore = new Arvore(noRaiz);

        //Print das informações sobre a árvore
        System.out.println("\nAltura do nó:");
        arvore.getAlturaNo();

        System.out.println("\nAltura da árvore:");
        arvore.getAlturaArvore();

        System.out.println("\nProfundidade do nó:");
        arvore.getProfundidadeNo();

        System.out.println("\nProfundidade da árvore:");
        arvore.getProfundidadeArvore();

        System.out.println("\nGrau do nó:");
        noRaiz.getGrau();
                
        System.out.println("\nGrau da árvore:");
        arvore.getGrauArvore();
        
        System.out.println("\nElementos: ");
        arvore.getElementos();

        System.out.println("\nNós folhas:");
        arvore.getNoFolha();

        System.out.println("\nNós Internos:");
        arvore.getNoInterno();

        System.out.println("\nÁrvore Genérica:");
        arvore.printArvore(noRaiz);
    }
}

   
